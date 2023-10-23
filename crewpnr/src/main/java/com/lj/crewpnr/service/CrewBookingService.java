package com.lj.crewpnr.service;

import com.lj.core.common.util.RandomUtils;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.*;
import com.lj.core.integration.soap.ibs.domain.booking.*;
import com.lj.core.util.LoggerUtils;
import com.lj.crewpnr.common.Constants;
import com.lj.crewpnr.common.Constants.ERROR_CODE;
import com.lj.crewpnr.common.IBSDomainUtils;
import com.lj.crewpnr.common.DateUtils;
import com.lj.crewpnr.mapper.pssdb.CrewBookingMapper;
import com.lj.crewpnr.vo.*;
import com.lj.crewpnr.vo.availability.AvailabilityCriteriaVO;
import com.lj.crewpnr.vo.availability.AvailabilitySearchVO;
import com.lj.crewpnr.vo.availability.PaxCountVO;
import com.lj.crewpnr.vo.booking.ReservationSummaryCriteriaVO;
import com.lj.crewpnr.vo.booking.ReservationSummaryVO;
import com.lj.crewpnr.vo.booking.RetrieveChangeGateVO;
import com.lj.crewpnr.vo.excel.CrewPNRExcelVO;
import com.lj.sso.ssocore.security.SsoAuthenticationToken;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CrewBookingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookingService.class);
    private static final String airlineCode = "LJ";
    @Autowired
    private GetAirAvailability airAvailability;
    @Autowired
    private SaveCreateBooking saveCreateBooking;
    @Autowired
    private RetrieveReservationSummary retrieveReservationSummaryRequest;

    @Autowired
    private SplitReservation splitReservation;
    @Autowired
    private CancelBooking cancelBooking;
    @Autowired
    private SaveModifyBooking saveModifyBooking;
    @Autowired
    private RetrieveBooking retrieveBooking;

    @Autowired
    private CrewBookingMapper crewBookingMapper;

    public ResultMapVO createBookingsAsync(MultipartFile file) {
        String service = "CREATE_BOOKINGS";
        String key = RandomUtils.generate(10);

        final MultipartFile fileFinalized = file;
        new Thread(() -> createBookings(fileFinalized)).start();

        ResultMapVO result = new ResultMapVO();
        result.put("service", service);
        result.put("key", key);
        return result;
    }

    public ResultMapVO createBookings(MultipartFile file){

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        ResultMapVO resultMapVO = new ResultMapVO();

        //엑셀파일 읽기
        List<CrewPNRExcelVO> crewPNRExcelList = this.readExcelFile(file);
//        for(CrewPNRExcelVO crewPNRExcelVO : crewPNRExcelList){
//            if(StringUtils.equals(crewPNRExcelVO.getResult(), "N")){
//                return ResultMapVO.simpleErrorCode(crewPNRExcelVO.getResultMsg());
//            }
//        }
        AvailabilityCriteriaVO criteria = null;

        int failCnt = 0;
        if(crewPNRExcelList != null ) {
            int listCnt = crewPNRExcelList.size();
            for (CrewPNRExcelVO excelVO : crewPNRExcelList) {
                criteria = new AvailabilityCriteriaVO();
                List<AvailabilitySearchVO> availabilitySearches = new ArrayList<>();
                String agencyCd = "";
                String fareClass = "";

                AvailabilitySearchVO availabilitySearch = new AvailabilitySearchVO();
                availabilitySearch.setOrigin(excelVO.getBoardPoint());
                availabilitySearch.setDestination(excelVO.getOffPoint());
                availabilitySearch.setFlightNumber(excelVO.getFltNumber());
                availabilitySearch.setDepartureDate(excelVO.getFlightDate());

                boolean fromKorea = IBSDomainUtils.isDomestic(excelVO.getBoardPoint(), excelVO.getOffPoint());

                if (fromKorea) {
                    if (StringUtils.equals(excelVO.getFareClass(), "PE")) {  //Premium Economy
                        fareClass = "U0";
                    } else {
                        fareClass = "U1";                  //Economy
                    }
                } else {
                    if (StringUtils.equals(excelVO.getFareClass(), "PE")) {
                        fareClass = "C";
                    } else {
                        fareClass = "U3";
                    }
                }
                criteria.setFareClass((fareClass));
                availabilitySearch.setFareClass(fareClass);

                availabilitySearches.add(availabilitySearch);

                criteria.setAvailabilitySearches(availabilitySearches);

                criteria.setPaxCounts(new ArrayList<>());
                PaxCountVO paxCount = new PaxCountVO();
                paxCount.setType(Constants.PAX_TYPE.ADULT);
                paxCount.setSubType("CREW");
                paxCount.setCount(excelVO.getPaxCount());
                criteria.getPaxCounts().add(paxCount);
                criteria.setTripType(Constants.TRIP_TYPE.ONW_WAY);
                criteria.setFareLevel("CR");

                if (StringUtils.equals(excelVO.getMiddleName(), "OOA"))
                    agencyCd = "20024620"; //운항
                else if (StringUtils.equals(excelVO.getMiddleName(), "UFA"))
                    agencyCd = "20024600"; //객실
                else if (StringUtils.equals(excelVO.getMiddleName(), "MCA"))
                    agencyCd = "20024610"; //정비

                criteria.setAgencyCode(agencyCd);
                criteria.setCurrency("KRW");
                criteria.setPointOfPurchase("KR");

                int logSeq = 2;
                ResultMapVO availabilityResult = this.searchAvailabilities(criteria);

                if (ResultMapVO.hasErrors(availabilityResult)) {
                    String errorValue = availabilityResult.getErrorCode();
                    LoggerUtils.e(LOGGER, "AvailabilityService.searchAvailabilities:{} {}:errorCode={}",
                            "", "" + (logSeq++), errorValue);

                    failCnt++;
                    continue;
                }

                BookingChannelType bookingChannelType = new BookingChannelType();
                bookingChannelType.setChannel("PWC");
                bookingChannelType.setChannelType("API");
                bookingChannelType.setLocale("en_US");

                List<FlightSegmentDetailsType> flightSegments = availabilityResult.get("flightSegments", List.class);
                List<FareDetailsForGuestType> faresForGuest = availabilityResult.get("faresForGuest", List.class);
                List<PaxCountType> paxCounts = availabilityResult.get("paxCounts", List.class);

                CreateBookingRQ createBookingRQ = new CreateBookingRQ();
                createBookingRQ.setAirlineCode(airlineCode);
                createBookingRQ.setPointOfSale("KR");
                createBookingRQ.setAgencyCode(agencyCd);
                createBookingRQ.setOriginalAgentID(agencyCd);
                createBookingRQ.setCurrentAgentID(agencyCd);
                createBookingRQ.setBookingChannel(bookingChannelType);

                BookerDetailsType booker = new BookerDetailsType();
                booker.setSurName("진");
                booker.setGivenName("에어");
                createBookingRQ.setBookerDetails(booker);


                PnrContactType pnrContact = new PnrContactType();
                pnrContact.setSurName("진에어");
                AddressType address = new AddressType();
                address.setEmailAddress(excelVO.getEmailAddress());
                address.setSendItineraryToEmailId(false);
                address.setCellNumber(StringUtils.replace(excelVO.getCellNumber(), "-", ""));
                address.setSendItineraryToSMS(false);
                address.setPhoneNumberCountryCode("+82");
                pnrContact.setAddress(address);
                pnrContact.setIsPrefferedContact(true);
                createBookingRQ.getPnrContact().add(pnrContact);

                createBookingRQ.setPnrType(PNRType.NORMAL.name());
                createBookingRQ.setNumberOfSeats(excelVO.getPaxCount());

                List<PaxCountDetailsType> paxCountDetails = new ArrayList<>();
                for (PaxCountType paxCountType : paxCounts) {
                    PaxCountDetailsType paxCountDetail = new PaxCountDetailsType();
                    paxCountDetail.setPaxType(paxCountType.getPaxType());
                    paxCountDetail.setPaxSubType(paxCountType.getPaxSubType());
                    paxCountDetail.setPaxCount(paxCountType.getPaxCount());
                    paxCountDetails.add(paxCountDetail);
                }
                createBookingRQ.getPaxCountDetails().addAll(paxCountDetails);

                ItineraryDetailsType itin = new ItineraryDetailsType();
                itin.getFlightSegmentDetails().addAll(flightSegments);
                createBookingRQ.getItineraryDetails().add(itin);

                FareInfoType fare = new FareInfoType();
                fare.getFareDetailsForGuestType().addAll(faresForGuest);
                createBookingRQ.getFareInfo().add(fare);

                List<GuestRequestDetailsType> guestDetailList = new ArrayList<>();

                List<GuestRequestDetailsType> tempguestDetailList = new ArrayList<>();

                for (int i = 0; i < paxCount.getCount(); i++) {
                    GuestRequestDetailsType guest = new GuestRequestDetailsType();
                    guest.setGuestId(String.valueOf(i + 1));
                    guest.setGivenName(excelVO.getGivenName());
                    guest.setSurName(excelVO.getSurName());
                    guest.setMiddleName(excelVO.getMiddleName());
                    guest.setGuestType(PaxDetailsType.valueOf("ADULT"));
                    guest.setGuestSubType("CREW");
                    guest.setDateOfBirth(DateUtils.xmlGregorianCalendar("1900-01-01", "yyyy-MM-dd"));
                    guest.setNamePrefix(NameTitleType.valueOf(excelVO.getNamePrefix()));
//                    guest.getGender("M");
                    tempguestDetailList.add(guest);
                }
                guestDetailList.addAll(tempguestDetailList);

                createBookingRQ.getGuestDetails().addAll(guestDetailList);
                createBookingRQ.setPnrOnHoldIndicator(false);
                createBookingRQ.setPointOfOrigin("KR");
                createBookingRQ.setCurrency("KRW");


                CreateBookingRS createBookingRS = saveCreateBooking.request(createBookingRQ, property);
                String errors = errors(createBookingRS);
                if (StringUtils.isNotBlank(errors)) {
                    LoggerUtils.e(LOGGER, "CrewBookingAPI#saveCreateBooking.request: errorCode={}", errors);
                    //IBE 에러 로그 저장
                    insertCrewPnrLog(criteria, errors);
                    failCnt++;
                    continue;
                }
                LoggerUtils.i(LOGGER, "CrewBookingService.createBookings: {}:1-", "");
            }

            if(failCnt == 0){
                resultMapVO.put("result","S");
            }
            else{
                if(listCnt == failCnt){
                    resultMapVO.put("result","AF");
                }
                else{
                    resultMapVO.put("result","PF");
                }
            }
        }
        return resultMapVO;
    }

    public ResultMapVO searchAvailabilities(AvailabilityCriteriaVO criteria) {
        if(criteria == null) {
            LoggerUtils.e(LOGGER, "availabilityCriteria is null");
            return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
        } else if(CollectionUtils.isEmpty(criteria.getAvailabilitySearches())) {
            LoggerUtils.e(LOGGER, "availabilityCriteria.availabilitySearches is empty");
            return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
        }

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
        bookingChannelKeyType.setChannel("PWC");
        bookingChannelKeyType.setChannelType("API");
        bookingChannelKeyType.setLocale("en_US");


        //탑승객 수
        List<PaxCountType> paxCounts = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(criteria.getPaxCounts())) {
            for(PaxCountVO paxCount: criteria.getPaxCounts()) {
                PaxCountType paxCountType = new PaxCountType();
                paxCountType.setPaxType(paxCount.getType());
                paxCountType.setPaxSubType(paxCount.getSubType());
                paxCountType.setPaxCount(paxCount.getCount());
                paxCounts.add(paxCountType);
            }
        }

        TripType tripType = TripType.fromValue(criteria.getTripType());

        /** RQ 생성 */
        List<AirAvailabilityRQ> availabilityRQs = new ArrayList<>();
        for(AvailabilitySearchVO search: criteria.getAvailabilitySearches()) {
            AirAvailabilityRQ targetRQ = new AirAvailabilityRQ();
            targetRQ.setAirlineCode(airlineCode);

            targetRQ.setBookingChannel(bookingChannelKeyType);
            targetRQ.getPaxCountDetails().addAll(paxCounts);
            targetRQ.setTripType(tripType);
            targetRQ.setPointOfPurchase(criteria.getPointOfPurchase());
            targetRQ.getFareLevels().add(criteria.getFareLevel());
            targetRQ.setTravelAgencyCode(criteria.getAgencyCode());

            AdvancedSearchType advancedSearch = new AdvancedSearchType();
            advancedSearch.setMaxFareAmount(9900000);
            advancedSearch.setFareClass(search.getFareClass());
            targetRQ.setAdvancedSearches(advancedSearch);

            NearBySearchType targetNearBySearch = new NearBySearchType();
            targetNearBySearch.setOrigin(search.getOrigin());
            targetNearBySearch.setDestination(search.getDestination());
            targetNearBySearch.setTravelDate(DateUtils.xmlGregorianCalendar(search.getDepartureDate(), "yyyy-MM-dd"));
            targetRQ.getAvailabilitySearches().add(targetNearBySearch);

            availabilityRQs.add(targetRQ);
        }
        if(CollectionUtils.isEmpty(availabilityRQs)) {
            return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
        }

        /** RQ 수만큼 avail 조회 */
        List<OriginDestinationInfo> ods = new ArrayList<>();
        for(AirAvailabilityRQ availabilityRQ: availabilityRQs){
            AirAvailabilityRQ anAvailabilityRQ = new AirAvailabilityRQ();
            anAvailabilityRQ.setAirlineCode(availabilityRQ.getAirlineCode());
            anAvailabilityRQ.setBookingChannel(availabilityRQ.getBookingChannel());
            anAvailabilityRQ.setTripType(TripType.OW);
            anAvailabilityRQ.getAvailabilitySearches().addAll(availabilityRQ.getAvailabilitySearches());
            anAvailabilityRQ.setAdvancedSearches(availabilityRQ.getAdvancedSearches());
            anAvailabilityRQ.getFareLevels().addAll(availabilityRQ.getFareLevels());
            anAvailabilityRQ.getPaxCountDetails().addAll(availabilityRQ.getPaxCountDetails());
            anAvailabilityRQ.setPointOfPurchase(availabilityRQ.getPointOfPurchase());
            anAvailabilityRQ.setTravelAgencyCode((availabilityRQ.getTravelAgencyCode()));
            NearBySearchType firstSearch = anAvailabilityRQ.getAvailabilitySearches().get(0);

            NearBySearchType newSearch = new NearBySearchType();
            newSearch.setOrigin(firstSearch.getDestination());
            newSearch.setDestination(firstSearch.getOrigin());

//            boolean fromKorea = IBSDomainUtils.isDomestic(newSearch.getOrigin());
//            Date travelDateOfFirstSearch = DateUtils.date(firstSearch.getTravelDate());
//            if(!criteria.isDomestic() && fromKorea) {//해외출발
//                XMLGregorianCalendar travelDate = DateUtils.xmlGregorianCalendar(DateUtils.max(DateUtils.addDate(travelDateOfFirstSearch, -3), new Date()));
//                newSearch.setTravelDate(travelDate);
//                anAvailabilityRQ.getAvailabilitySearches().add(0, newSearch);
//            } else {//국내출발
//                XMLGregorianCalendar travelDate = DateUtils.xmlGregorianCalendar(DateUtils.addDate(travelDateOfFirstSearch, 3));
//                newSearch.setTravelDate(travelDate);
//                anAvailabilityRQ.getAvailabilitySearches().add(newSearch);
//            }

            AirAvailabilityRS availabilityRS = airAvailability.request(anAvailabilityRQ, property);//Sessions.csid())
            String errors = errors(availabilityRS);
            if(StringUtils.isBlank(errors)) {
                ods.addAll(availabilityRS.getOriginDestinationInfo());
                continue;
            }
            else{
                //IBE 에러 로그 저장
                insertCrewPnrLog(criteria, errors);
            }
            ods = availabilityRS.getOriginDestinationInfo();
        }

        if(CollectionUtils.isEmpty(ods)) {
            return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
        }

        List<FlightSegmentDetailsType> flightSegments = new ArrayList<>();
        List<FareDetailsForGuestType> faresForGuest = new ArrayList<>();
        int index = 1;
        int indexForPricingUnit = 0;
        for(AvailabilitySearchVO search: criteria.getAvailabilitySearches()) {
            if(search.isIgnoreResult()) {
                continue;
            }

            /** od, trip, segment, segment availability */
            OriginDestinationInfo targetOD = null;
            TripInfoType targetTrip = null;
            SegmentInfoType targetSegment = null;
            SegmentAvailabilityType targetSegmentAvailability = null;
            for(OriginDestinationInfo od: ods) {
                if(!StringUtils.equals(search.getOrigin() + "-" + search.getDestination(), od.getOrigin() + "-" + od.getDestination())) {
                    continue;
                }

                for(TripInfoType trip: od.getTripInfo()) {
                    for(SegmentInfoType segment: trip.getSegmentInfo()) {
                        FlightIdentifierInfoType flightIdentifier = segment.getFlightIdentifierInfo();
                        String a = search.getFlightNumber();
                        String b = IBSDomainUtils.flightNumber(flightIdentifier);
                        if(!StringUtils.equals(search.getFlightNumber(), IBSDomainUtils.flightNumber(flightIdentifier))) {
                            continue;
                        }

                        for(SegmentAvailabilityType segmentAvailability: segment.getSegmentAvailability()) {
                            if(StringUtils.equals(search.getFareClass(), segmentAvailability.getBookingClass())) {
                                targetSegmentAvailability = segmentAvailability;
                                break;
                            }
                        }
                        if(targetSegmentAvailability != null) {
                            targetSegment = segment;
                            break;
                        }
                    }
                    if(targetSegment != null) {
                        targetTrip = trip;
                        break;
                    }
                }
                if(targetTrip != null) {
                    targetOD = od;
                    break;
                }
            }
            if(targetOD == null || targetTrip == null || targetSegment == null || targetSegmentAvailability == null) {
                LoggerUtils.e(LOGGER, "targetSegmentAvailability is null, fareClass: {}", criteria.toString());
                continue;
            }

            /** pricing */
            PricingInfoType targetPricing = null;
            for(PricingInfoType pricing: targetOD.getPricingInfo()) {
                if(targetTrip.getTripIndex().longValue() != pricing.getTripRefIndex().longValue()) {
                    continue;
                }

                for(SegmentReferenceInfoType segmentReference: pricing.getSegmentReferenceInfo()) {
                    if(StringUtils.equals(search.getFareClass(), segmentReference.getBookingClass())) {
                        targetPricing = pricing;
                        break;
                    }
                }
                if(targetPricing != null) {
                    break;
                }
            }
            if(targetPricing == null) {
                LoggerUtils.e(LOGGER, "targetPricing is null, tripIndex: {}, fareClass: {}", targetTrip.getTripIndex().longValue(), search.getFareClass());
                return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
            }

            /** 조회 시의 pax type이 모두 존재하는 지 확인 */
            boolean[] hasPaxPricings = new boolean[paxCounts.size()];
            for(int i = 0; i < paxCounts.size(); i++) {
                hasPaxPricings[i] = false;
                PaxCountType paxCount = paxCounts.get(i);
                String paxType = paxCount.getPaxType();
                for(PaxPricingInfoType paxPricing: targetPricing.getPaxPricingInfo()) {
                    if(StringUtils.equals(paxType, paxPricing.getPaxType())) {
                        hasPaxPricings[i] = true;
                        break;
                    }
                }
            }
            for(boolean hasPaxPricing: hasPaxPricings) {
                if(!hasPaxPricing) {
                    LoggerUtils.e(LOGGER, "targetPaxPricing is null");
                    return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
                }
            }

            /** pricing component */
            PricingComponentInfoType targetPricingComponent = null;

            String fareLevel = criteria.getFareLevel();

            for(PricingComponentInfoType pricingComponent: targetPricing.getPricingComponentInfo()) {
                if(StringUtils.equals(fareLevel, pricingComponent.getFareLevel())) {
                    targetPricingComponent = pricingComponent;
                    break;
                }
            }
            if(targetPricingComponent == null) {
                LoggerUtils.e(LOGGER, "targetPricingComponent is null, fareLevel: {}", fareLevel);
                return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
            }

            int pricingUnitID = targetOD.getPricingUnitID();
            long flightSegmentGroupId = index++;
            long segmentId = index++;
            flightSegments.add(IBSDomainUtils.toFlightSegment(flightSegmentGroupId, segmentId, targetSegment, targetSegmentAvailability, targetPricing));

            /** pax type만큼 fare 생성 */
            long fareComponentId = index++;
            for(PaxPricingInfoType paxPricing: targetPricing.getPaxPricingInfo()) {
                faresForGuest.add(IBSDomainUtils.toFareForGuest(segmentId, fareComponentId, pricingUnitID + indexForPricingUnit, targetPricingComponent, paxPricing));
            }
        }

        ResultMapVO result = new ResultMapVO();
        result.put("flightSegments", flightSegments);
        result.put("faresForGuest", faresForGuest);
        result.put("paxCounts", paxCounts);

        return result;
    }

    public ResultMapVO cancelReservation(String pnrNumber) {
        if (StringUtils.isBlank(pnrNumber)) {
            return ResultMapVO.simpleErrorCode("PNR null");
        }

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        BookingChannelType bookingChannelType = new BookingChannelType();
        bookingChannelType.setChannel("PWC");
        bookingChannelType.setChannelType("API");
        bookingChannelType.setLocale("en_US");

        CancelBookingRQ cancelBookingRQ = new CancelBookingRQ();
        cancelBookingRQ.setBookingChannel(bookingChannelType);
        cancelBookingRQ.setAirlineCode(airlineCode);
        cancelBookingRQ.setPnrNumber(pnrNumber);

        CancelBookingRS cancelBookingRS = cancelBooking.request(cancelBookingRQ, property);
        String errors = errors(cancelBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleErrorCode(errors);
        }

        String agencyCode = cancelBookingRS.getAgencyCode();

        SaveModifyBookingRQ saveModifyBookingRQ = new SaveModifyBookingRQ();
        saveModifyBookingRQ.setAirlineCode(cancelBookingRQ.getAirlineCode());
        saveModifyBookingRQ.setBookingChannel(cancelBookingRQ.getBookingChannel());
        saveModifyBookingRQ.setBookerDetails(cancelBookingRS.getBookerDetails());
        saveModifyBookingRQ.setPnrNumber(cancelBookingRQ.getPnrNumber());
        saveModifyBookingRQ.setIsCancelPnr(true);
        saveModifyBookingRQ.setAgencyCode(agencyCode);
        saveModifyBookingRQ.setOriginalAgentID(agencyCode);
        saveModifyBookingRQ.setCurrentAgentID(agencyCode);
        SaveModifyBookingRS saveModifyBookingRS = saveModifyBooking.request(saveModifyBookingRQ, property);
        errors = errors(saveModifyBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleErrorCode(errors);
        }

        return ResultMapVO.simpleResult("message", "SUCCESS");
    }

    public ResultMapVO retrieveBooking(String pnrNumber){
        ResultMapVO result = new ResultMapVO();

        BookingChannelType channel = new BookingChannelType();
        channel.setChannelType("API");
        channel.setChannel("PWC");
        channel.setLocale("en_US");

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        RetrieveBookingRQ retrieveBookingRQ = new RetrieveBookingRQ();
        retrieveBookingRQ.setAirlineCode(airlineCode);
        retrieveBookingRQ.setBookingChannel(channel);
        retrieveBookingRQ.setPnrNumber(pnrNumber);
        RetrieveBookingRS retrieveBookingRS = retrieveBooking.request(retrieveBookingRQ, property);

        String errors = errors(retrieveBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleErrorCode(errors);
        }

        result.put("getGuestDetails", retrieveBookingRS.getGuestDetails());

        return result;
    }

    public ResultMapVO splitPnr(RetrieveChangeGateVO retrieveChangeGateVO){
        ResultMapVO result = new ResultMapVO();
        SplitPnrRQ splitPnrRQ = new SplitPnrRQ();

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
        bookingChannelKeyType.setChannel("PWC");
        bookingChannelKeyType.setChannelType("API");
        bookingChannelKeyType.setLocale("en_US");

        splitPnrRQ.setBookingChannel((bookingChannelKeyType));
        splitPnrRQ.setAirlineCode(airlineCode);
        splitPnrRQ.setPNRNumber(retrieveChangeGateVO.getPnrNumber());
        splitPnrRQ.getPaxIds().addAll(retrieveChangeGateVO.getGuestId());

        SplitPnrRS splitPnrRS = splitReservation.request(splitPnrRQ, property);
        String errors = errors(splitPnrRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleErrorCode(errors);
        }
        result.put("parentPNR", splitPnrRS.getParentPNR());
        result.put("childPNR", splitPnrRS.getChildPNR());

        return result;
    }

    public ResultMapVO getReservationSummary(ReservationSummaryCriteriaVO criteriaVO) {

        // 로그인 유저 정보 취득
        UserInfoVO loginUser = (UserInfoVO) (((SsoAuthenticationToken) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getUserPrincipal()).getPrincipal());

        // 로그인 유저의 부서 확인 후 대응하는 대리점 코드 세팅
        String agencyCode = null;
        if(StringUtils.equals(loginUser.getDepartment(), "1118")) {
            agencyCode = "20024620";
        }

        ResultMapVO resultMapVO = new ResultMapVO();

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");


        BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
        bookingChannelKeyType.setChannel(Constants.IBS_CHANNEL.CHANNEL);
        bookingChannelKeyType.setChannelType(Constants.IBS_CHANNEL.CHANNEL_TYPE);
        bookingChannelKeyType.setLocale(Constants.IBS_CHANNEL.LOCALE);


        RetrieveReservationSummaryRQ req = new RetrieveReservationSummaryRQ();

        req.setFlightStartDate(DateUtils.xmlGregorianCalendar(criteriaVO.getDepStartDate(),"yyyy-MM-dd"));
        req.setFlightEndDate( DateUtils.xmlGregorianCalendar(criteriaVO.getDepEndDate(),"yyyy-MM-dd"));
        req.setAirlineCode(airlineCode);
        req.setBoardPoint(criteriaVO.getStnfrCode());
        req.setOffPoint(criteriaVO.getStntoCode());
        req.setAgencyCode(agencyCode);

        req.setPnrType(PNRType.NORMAL);
        req.setBookingChannel(bookingChannelKeyType);
        req.setActivePnrNumber(100);
        req.setPastPnrNumber(100);
        req.setIsUnFlownPassengersOnly(false);

        RetrieveReservationSummaryRS retrieveReservationSummaryRS = retrieveReservationSummaryRequest.request(req, property);
        String errors = errors(retrieveReservationSummaryRS);
        if (StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#RetrieveReservationSummary.request: errorCode={}", errors);
            resultMapVO.put("Error", errors);
            return resultMapVO;
        }

        List<ReservationSummaryVO> reservationSummaryVOList = new ArrayList<>();
        for (var pnrSummary : retrieveReservationSummaryRS.getPnrSummary()) {
            ReservationSummaryVO reservationSummaryVO = new ReservationSummaryVO();
            reservationSummaryVO.setPNRNumber(pnrSummary.getPnrNumber());

            for (var fltSegment : pnrSummary.getFlightSegmentSummaryDetails()) {
                reservationSummaryVO.setFltnum(fltSegment.getAirlineCode()+ fltSegment.getFlightNumber());

                String depTime = DateUtils.string(fltSegment.getFlightDate(), "dd-MMM-yyyy", "yyyy-MM-dd(E)");

                reservationSummaryVO.setDepDate(depTime);
                reservationSummaryVO.setStnfrCode(fltSegment.getBoardPoint());
                reservationSummaryVO.setStntoCode(fltSegment.getOffPoint());

                XMLGregorianCalendar depDateUtc = fltSegment.getScheduledDepartureDateTime();
                XMLGregorianCalendar arrDateUtc = fltSegment.getScheduledArrivalDateTime();

                String depDateTime = depDateUtc.getHour() + ":" + String.format("%02d", depDateUtc.getMinute());
                String arrDateTime = arrDateUtc.getHour() + ":" + String.format("%02d",arrDateUtc.getMinute());

                reservationSummaryVO.setDepartureDateTime(depDateTime);

                reservationSummaryVO.setArrivalDateTime(arrDateTime);
                reservationSummaryVO.setFareClass(fltSegment.getFareBasis().substring(0, 2));
                reservationSummaryVO.setSegmentStatus(fltSegment.getSegmentStatus());
            }

            int paxCnt = 0;
            for(var pnrDetail: pnrSummary.getPnrGuestSummaryDetails()){
                paxCnt++;
            }

            reservationSummaryVO.setPaxCount(paxCnt);

            reservationSummaryVOList.add(reservationSummaryVO);
        }

        resultMapVO.put("summaryResult", reservationSummaryVOList);
        return resultMapVO;
    }

    public List<CrewPNRExcelVO> readExcelFile(MultipartFile file) {
        List<CrewPNRExcelVO> dataList = new ArrayList<>();

        Workbook workbook = null;
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());

        try {
            //엑셀파일 읽기
            if (extension.equals("xlsx")) {
                workbook = new XSSFWorkbook(file.getInputStream());
            } else if (extension.equals("xls")) {
                workbook = new HSSFWorkbook(file.getInputStream());
            }

            Sheet worksheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = worksheet.iterator();

            String emptyFields = "";
            int rowNo;

            for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
                CrewPNRExcelVO crewPNRExcelVO = new CrewPNRExcelVO();
                Row row = worksheet.getRow(i);
                rowNo = row.getRowNum();

                Iterator<Cell> cellIterator = row.iterator();

                if (rowNo == 0) {
                    continue;
                }

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String cellValue = null;

                    // 타입별 내용 읽기
                    if (cell.getCellType() == CellType.STRING) {
                        cellValue = cell.getStringCellValue();
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        if (DateUtil.isCellDateFormatted(cell)) {
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            cellValue = dateFormat.format(cell.getDateCellValue());
                        } else {
                            cell.setCellType(CellType.NUMERIC);
                            cellValue =String.valueOf((int)cell.getNumericCellValue());
                        }
                    } else if (cell.getCellType() == CellType.BLANK) {
                        cellValue = "";
                    } else {
                    }

                    switch (cell.getColumnIndex()) {
                        case 0: // fltNumber
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "fltNumber";
                            } else {
                                crewPNRExcelVO.setFltNumber(cellValue);
                            }
                            break;
                        case 1: // boardPoint
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "boardPoint";
                            } else {
                                crewPNRExcelVO.setBoardPoint(cellValue);
                            }
                            break;
                        case 2: // offPoint
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "offPoint";
                            } else {
                                crewPNRExcelVO.setOffPoint(cellValue);
                            }
                            break;
                        case 3: // flightDate
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "flightDate";
                            } else {
                                crewPNRExcelVO.setFlightDate(cellValue);
                            }
                            break;
                        case 4: // fareClass
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "fareClass";
                            } else {
                                crewPNRExcelVO.setFareClass(cellValue);
                            }
                            break;
                        case 5: // givenName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "givenName";
                            } else {
                                crewPNRExcelVO.setGivenName(cellValue);
                            }
                            break;
                        case 6: // surName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "surName";
                            } else {
                                crewPNRExcelVO.setSurName(cellValue);
                            }
                            break;
                        case 7: // middleName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "middleName";
                            } else {
                                crewPNRExcelVO.setMiddleName(cellValue);
                            }
                            break;
                        case 8: // namePrefix
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "namePrefix";
                            } else {
                                crewPNRExcelVO.setNamePrefix(cellValue);
                            }
                            break;
                        case 9: // paxCount
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "paxCount";
                            } else {
                                crewPNRExcelVO.setPaxCount(Integer.parseInt(cellValue));
                            }
                            break;
                        case 10: // emailAddress
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "emailAddress";
                            } else {
                                crewPNRExcelVO.setEmailAddress(cellValue);
                            }
                            break;
                        case 11: // cellNumber
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "cellNumber";
                            } else {
                                crewPNRExcelVO.setCellNumber(cellValue);
                            }
                            break;
//                        case 12: // pnrComments
//                            if (StringUtils.isBlank(cellValue)) {
//                                emptyFields += "pnrComments";
//                            } else {
//                                crewPNRExcelVO.setPnrComments(cellValue);
//                            }
//                            break;
                        default:
                            break;
                    }
                    if (!emptyFields.equals("")) {
                        crewPNRExcelVO.setResult("N");
                        crewPNRExcelVO.setResultMsg(i + "행 " + emptyFields + " null" );
//                        dataList.add(crewPNRExcelVO);
//                        return dataList;
                    }
                }

                dataList.add(crewPNRExcelVO);

                emptyFields = "";
            }
        } catch (FileNotFoundException e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("FileNotFoundException", e);
            }
        } catch (IOException e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("IOException", e);
            }
        } finally {
            try {
                if (workbook != null) workbook.close();
            } catch (IOException e) {
            }
        }
        return dataList;
    }

    public int insertCrewPnrLog(AvailabilityCriteriaVO criteria, String errorValue) {
        CrewPnrLogVO crewPnrLogVO = new CrewPnrLogVO();
        crewPnrLogVO.setDepDate(criteria.getAvailabilitySearches().get(0).getDepartureDate().replace("-",""));
        crewPnrLogVO.setFltNum(criteria.getAvailabilitySearches().get(0).getFlightNumber());
        crewPnrLogVO.setStnfrCode(criteria.getAvailabilitySearches().get(0).getOrigin());
        crewPnrLogVO.setStntoCode(criteria.getAvailabilitySearches().get(0).getDestination());
        crewPnrLogVO.setFareClass(criteria.getFareClass());
        crewPnrLogVO.setPaxCnt(criteria.getPaxCounts().get(0).getCount());
        crewPnrLogVO.setErrorValue(errorValue);

        return crewBookingMapper.insertCrewPnrLog(crewPnrLogVO);
    }

    private String errors(Object object) {
        if(object == null) {
            return ERROR_CODE.SERVER_ERROR_OCCURRED;
        }

        String errorCode = IBSDomainUtils.errorCode(object);
//        if(StringUtils.equals(errorCode, "BKG_RETRIEVE_01")) {
//            return "agt.req.msg.no.reservation";
//        } else if(StringUtils.equals(errorCode, "INVENTORY_1020")) {
//            return "agt.req.msg.check.inventory";
//        } else if(StringUtils.equals(errorCode, "WS_851")) {
//            return "agt.req.msg.reservation.cancelled";
//        }

        return IBSDomainUtils.errorMessage(object);
    }
}
