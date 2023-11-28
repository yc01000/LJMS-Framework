package com.lj.crewpnr.service;

import com.google.gson.Gson;
import com.lj.core.commoncode.vo.CodeInfoVO;
import com.lj.core.util.RandomUtils;
import com.lj.core.commoncode.handler.CodeHandler;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.*;
import com.lj.core.integration.soap.ibs.domain.booking.*;
import com.lj.core.mail.service.MailService;
import com.lj.core.mail.vo.MailInfoVO;
import com.lj.core.util.LoggerUtils;
import com.lj.crewpnr.common.Constants;
import com.lj.crewpnr.common.Constants.ERROR_CODE;
import com.lj.crewpnr.common.IBSDomainUtils;
import com.lj.core.util.DateUtils;
import com.lj.crewpnr.mapper.pssdb.CrewBookingMapper;
import com.lj.crewpnr.vo.*;
import com.lj.crewpnr.vo.availability.AvailabilityCriteriaVO;
import com.lj.crewpnr.vo.availability.AvailabilitySearchVO;
import com.lj.crewpnr.vo.availability.PaxCountVO;
import com.lj.crewpnr.vo.booking.ReservationSummaryCriteriaVO;
import com.lj.crewpnr.vo.booking.ReservationSummaryVO;
import com.lj.crewpnr.vo.booking.RetrieveChangeGateVO;
import com.lj.crewpnr.vo.excel.CrewPNRExcelVO;
import com.lj.sso.ssocore.model.UserInfoVO;
import com.lj.sso.ssocore.util.PrincipalUtils;
import jakarta.servlet.http.Cookie;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
public class CrewBookingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrewBookingService.class);
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

    @Autowired
    private AcceptSc acceptSc;

    @Autowired
    private RejectSc rejectSc;

    @Autowired
    private AcceptWl acceptWl;
    @Autowired
    private CodeHandler codeHandler;

    @Autowired
    private MailService mailService;

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    private static final Map<String, String> CABIN_CLASS_MAP = new HashMap<>() {
        {
            put("C", "P");
            put("U0", "P");
            put("U1", "E");
            put("U3", "E");
        }
    };

    private static final Map<String, String> CABIN_CLASS_DISPLAY_MAP = new HashMap<>() {
        {
            put("C", "Premium Economy");
            put("U0", "Premium Economy");
            put("U1", "Economy");
            put("U3", "Economy");
        }
    };

    public ResultMapVO createBookingsAsync(List<CrewPNRExcelVO> crewPNRExcelList) {
        ResultMapVO result = new ResultMapVO();

        try{
            String service = "CREATE_BOOKINGS";
            String key = RandomUtils.generate(10);

            final CreateBookingsFormVO form = new CreateBookingsFormVO();
            form.setCrewPNRExcelList(crewPNRExcelList);
            form.setLoginUser(PrincipalUtils.user());
            form.setAgencyCode(getAgencyCode());

            //로그인 유저의 부서 코드로 agency Code 세팅
            String agencyCode = null;
            try {
                agencyCode = codeHandler.getCodeInfo("CMM209", form.getLoginUser().getDepartment()).getAddInfo1();
                form.setAgencyCode(agencyCode);
            } catch (Exception e) {
                return ResultMapVO.simpleError("there is no agency code. please check the common code CMM209");
            }

            new Thread(() -> createBookings(form)).start();

//            result.put("service", service);
//            result.put("key", key);
            result.put("result", "SUCCESS");
        }
        catch(Exception ex){
            result = new ResultMapVO();
            result.put("result", ex);
        }
        return result;
    }

    public ResultMapVO createBookings(CreateBookingsFormVO form) {
        ResultMapVO resultMapVO = new ResultMapVO();

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        String agencyCode = form.getAgencyCode();

        var crewPNRExcelList = form.getCrewPNRExcelList();

        AvailabilityCriteriaVO criteria = null;

        int failCnt = 0;
        if(crewPNRExcelList != null ) {
            // 시작 시각
            Date dateStart = new Date();

            int listCnt = crewPNRExcelList.size();
            for (CrewPNRExcelVO excelVO : crewPNRExcelList) {
                try {

                    criteria = new AvailabilityCriteriaVO();
                    List<AvailabilitySearchVO> availabilitySearches = new ArrayList<>();
//                    String agencyCd = "";
                    String fareClass = "";
                    String middleName = "";

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
                    paxCount.setCount(excelVO.getPaxinfoList().size());
                    criteria.getPaxCounts().add(paxCount);
                    criteria.setTripType(Constants.TRIP_TYPE.ONW_WAY);
                    criteria.setFareLevel("CR");

                    if (StringUtils.equals(agencyCode, "20024620"))
                        middleName = "OOA"; //운항
                    else if (StringUtils.equals(excelVO.getMiddleName(), "20024600"))
                        middleName = "UFA"; //객실
                    else if (StringUtils.equals(excelVO.getMiddleName(), "20024610"))
                        middleName = "MCA"; //정비

                    criteria.setAgencyCode(agencyCode);
                    criteria.setCurrency("KRW");
                    criteria.setPointOfPurchase("KR");

                    //최대 9명까지 pnr 생성 가능
                    if(excelVO.getPaxinfoList().size() > 9){
                        failCnt++;
                        insertCrewPnrLog(criteria, "createBookings: {pnr max 9}");
                        continue;
                    }

                    int logSeq = 2;
                    ResultMapVO availabilityResult = this.searchAvailabilities(criteria);

                    if (ResultMapVO.hasErrors(availabilityResult)) {
                        String errorValue = availabilityResult.getError();
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
                    createBookingRQ.setAgencyCode(agencyCode);
                    createBookingRQ.setOriginalAgentID(agencyCode);
                    createBookingRQ.setCurrentAgentID(agencyCode);
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
                    createBookingRQ.setNumberOfSeats(excelVO.getPaxinfoList().size());

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
                        guest.setGivenName(excelVO.getPaxinfoList().get(i).getGivenName());
                        guest.setSurName(excelVO.getPaxinfoList().get(i).getSurName());
                        guest.setMiddleName(middleName);
                        guest.setGuestType(PaxDetailsType.valueOf("ADULT"));
                        guest.setGuestSubType("CREW");
                        guest.setDateOfBirth(DateUtils.xmlGregorianCalendar("1900-01-01", "yyyy-MM-dd"));
                        guest.setNamePrefix(NameTitleType.valueOf(excelVO.getPaxinfoList().get(i).getNamePrefix()));
                        guest.setGender(GenderDetailsType.valueOf(excelVO.getPaxinfoList().get(i).getGender()));
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

                        //만석인 경우 segmentStatus 변경하여 createbooking 재호출
                        if(errors.contains("BKG_BOE_1628")){
                            itin = new ItineraryDetailsType();
                            for(FlightSegmentDetailsType seg : flightSegments){
                                seg.setSegmentStatus(ReservationStatusDetailsType.valueOf("WAITLISTED"));
                                itin.getFlightSegmentDetails().add(seg);
                            }

                            createBookingRQ.getItineraryDetails().set(0,itin);

                            createBookingRS = saveCreateBooking.request(createBookingRQ, property);
                            String reErrors = errors(createBookingRS);
                            if (StringUtils.isNotBlank(reErrors)) {
                                //IBE 에러 로그 저장
                                insertCrewPnrLog(criteria, reErrors);
                                failCnt++;
                                continue;
                            }
                        }
                        else{
                            //IBE 에러 로그 저장
                            insertCrewPnrLog(criteria, errors);
                            failCnt++;
                            continue;
                        }
                    }
                    LoggerUtils.i(LOGGER, "CrewBookingService.createBookings: {}:1-", "");
                } catch (Exception e) {
                    insertCrewPnrLog(criteria, e.toString());
                    failCnt++;
                }
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

            Date dateEnd = new Date();

            try {
                CreateBookingsResultVO createBookingsResult = new CreateBookingsResultVO();
                createBookingsResult.setAllCount(listCnt);
                createBookingsResult.setSuccessCount(listCnt - failCnt);
                createBookingsResult.setFailureCount(failCnt);
                createBookingsResult.setDateStart(DateUtils.string(dateStart, "yyyy-MM-dd HH:mm:ss"));
                createBookingsResult.setDateEnd(DateUtils.string(dateEnd, "yyyy-MM-dd HH:mm:ss"));
                createBookingsResult.setElapsedTime(dateEnd.getTime() - dateStart.getTime());
                String q = URLEncoder.encode(Base64.getEncoder().encodeToString(new Gson().toJson(createBookingsResult).getBytes(StandardCharsets.UTF_8)));
                String url = String.format("%s%s?q=%s", serverEndpoint, "/mail/createBookingsResult", q);

                MailInfoVO mailInfoVO = new MailInfoVO();
                mailInfoVO.setMailContentsType(MailInfoVO.MailContentType.URL);
                mailInfoVO.setTaskId(74);
                mailInfoVO.setReceiverEmail(form.getLoginUser().getEmail());
                mailInfoVO.setReceiverName(form.getLoginUser().getUserName());
                mailInfoVO.setMailTitle("CREW PNR 생성 완료 (" + DateUtils.string(dateEnd, "yyyy-MM-dd HH:mm") + ")");
                mailInfoVO.setMailContents(url);
                mailInfoVO.setReceiverId("SYSTEM");
                mailInfoVO.setSenderEmail("noreply@jinair.com");
                mailInfoVO.setSenderName("승무원 예약 시스템");
                mailService.send(mailInfoVO);
            } catch (Exception e) {
                LoggerUtils.e(LOGGER, "{}", ExceptionUtils.getStackTrace(e));
            }
        }
        return resultMapVO;
    }

    public ResultMapVO searchAvailabilities(AvailabilityCriteriaVO criteria) {
        if(criteria == null) {
            LoggerUtils.e(LOGGER, "availabilityCriteria is null");
            return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
        } else if(CollectionUtils.isEmpty(criteria.getAvailabilitySearches())) {
            LoggerUtils.e(LOGGER, "availabilityCriteria.availabilitySearches is empty");
            return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
            return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
            return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
                insertCrewPnrLog(criteria, "Availability: {no flight data}");
                return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
                return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
                    return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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
                return ResultMapVO.simpleError(ERROR_CODE.SERVER_ERROR_OCCURRED);
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

    public ResultMapVO cancelReservations(String pnrNumber) {
        if (StringUtils.isBlank(pnrNumber)) {
            return ResultMapVO.simpleError("PNR null");
        }

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
            LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
            return ResultMapVO.simpleError(errors);
        }

        //WK/SC, WL/SC
        //TK/TC, TL/TC
        final var STATUSES_REJECT_NEEDED = Arrays.asList(
                ReservationStatusDetailsType.TIME_CHANGE,
                ReservationStatusDetailsType.SCHEDULE_CHANGE);
        boolean needRejectFirst = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().stream()
                .anyMatch(t -> STATUSES_REJECT_NEEDED.contains(t.getSegmentStatus()));
        if(needRejectFirst) {
            final var STATUSES_WILL_BE_REJECTED = Arrays.asList(
                    ReservationStatusDetailsType.WAS_CONFIRMED,
                    ReservationStatusDetailsType.WAS_WAITLISTED,
                    ReservationStatusDetailsType.TIME_CHANGE_FROM_CONFIRMED,
                    ReservationStatusDetailsType.TIME_CHANGE_FROM_WAITLIST);

            final var flightSegmentWillBeRejected = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().stream()
                    .filter(t -> STATUSES_WILL_BE_REJECTED.contains(t.getSegmentStatus()))
                    .findFirst()
                    .orElse(null);

            ItineraryChangeType itineraryChange = new ItineraryChangeType();
            SegmentChangeType segmentChange = new SegmentChangeType();
            segmentChange.setPnrActionType(PnrActionType.REJECT_SC);
            segmentChange.getOldSegmentId().add(Long.parseLong(flightSegmentWillBeRejected.getSegmentId()));
            itineraryChange.getSegmentChangeType().add(segmentChange);

            RejectScRQ rejectScRQ = new RejectScRQ();
            rejectScRQ.setBookingChannel(retrieveBookingRQ.getBookingChannel());
            rejectScRQ.setPnrNumber(retrieveBookingRS.getPNRNumber());
            rejectScRQ.setAirlineCode(retrieveBookingRS.getAirlineCode());
            rejectScRQ.setAgencyCode(retrieveBookingRS.getAgencyCode());
            rejectScRQ.setCurrentAgentID(retrieveBookingRS.getCurrentAgentID());
            rejectScRQ.setIPAddress("127.0.0.1");
            rejectScRQ.getItineraryChangeType().add(itineraryChange);
            RejectScRS rejectScRS = rejectSc.request(rejectScRQ, property);

            errors = errors(rejectScRS);
            if (StringUtils.isNotBlank(errors)) {
                LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
                return ResultMapVO.simpleError(errors);
            }
        }

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
        errors = errors(cancelBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleError(errors);
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
            return ResultMapVO.simpleError(errors);
        }

        return ResultMapVO.simpleResult("result", "SUCCESS");
    }

    public ResultMapVO cancelReservations(List<String> pnrNumbers) {
        int allCount = 0;
        int successCount = 0;
        for(String pnrNumber: pnrNumbers) {
            allCount++;
            if(!ResultMapVO.hasErrors(cancelReservations(pnrNumber))) {
                successCount++;
            }
        }
        String result = "총 %d건 중 %d건 성공, %d건 실패".formatted(allCount, successCount, (allCount - successCount));
        return ResultMapVO.simpleResult("result", result);
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
            return ResultMapVO.simpleError(errors);
        }

        result.put("getGuestDetails", retrieveBookingRS.getGuestDetails());

        return ResultMapVO.simpleResult("result", retrieveBookingRS.getGuestDetails());
    }

    public ResultMapVO splitPnr(RetrieveChangeGateVO retrieveChangeGateVO){
//        ResultMapVO result = new ResultMapVO();
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
            return ResultMapVO.simpleError(errors);
        }
//        result.put("parentPNR", splitPnrRS.getParentPNR());
//        result.put("childPNR", splitPnrRS.getChildPNR());

        // 탑승객 분리와 동시에 Child PNR 취소 - CancelBooking
        CancelBookingRQ cancelBookingRQ = new CancelBookingRQ();
        cancelBookingRQ.setAirlineCode(airlineCode);
        cancelBookingRQ.setBookingChannel(IBSDomainUtils.bookingChannel("PWC"));
        cancelBookingRQ.setPnrNumber(splitPnrRS.getChildPNR());
        CancelBookingRS cancelBookingRS = cancelBooking.request(cancelBookingRQ, property);
        errors = errors(cancelBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleError(errors);
        }

        // 탑승객 분리와 동시에 Child PNR 취소 - SaveModifyBooking
        SaveModifyBookingRQ saveModifyBookingRQ = new SaveModifyBookingRQ();
        saveModifyBookingRQ.setAirlineCode(cancelBookingRQ.getAirlineCode());
        saveModifyBookingRQ.setBookingChannel(cancelBookingRQ.getBookingChannel());
        saveModifyBookingRQ.setBookerDetails(cancelBookingRS.getBookerDetails());
        saveModifyBookingRQ.setPnrNumber(cancelBookingRQ.getPnrNumber());
        saveModifyBookingRQ.setIsCancelPnr(true);
        saveModifyBookingRQ.setAgencyCode(cancelBookingRS.getAgencyCode());
        saveModifyBookingRQ.setOriginalAgentID(cancelBookingRS.getAgencyCode());
        saveModifyBookingRQ.setCurrentAgentID(cancelBookingRS.getAgencyCode());
        SaveModifyBookingRS saveModifyBookingRS = saveModifyBooking.request(saveModifyBookingRQ, property);
        errors = errors(saveModifyBookingRS);
        if (StringUtils.isNotBlank(errors)) {
            return ResultMapVO.simpleError(errors);
        }

//        result.put("message", "SUCCESS");
//        return result;
        return ResultMapVO.simpleResult("result", "SUCCESS");
    }

    public ResultMapVO getReservationSummary(ReservationSummaryCriteriaVO criteriaVO) {
        //로그인 유저의 부서 코드로 agency Code 세팅
        String agencyCode = getAgencyCode();

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
        bookingChannelKeyType.setChannel(Constants.IBS_CHANNEL.CHANNEL);
        bookingChannelKeyType.setChannelType(Constants.IBS_CHANNEL.CHANNEL_TYPE);
        bookingChannelKeyType.setLocale(Constants.IBS_CHANNEL.LOCALE);

        RetrieveReservationSummaryRQ req = new RetrieveReservationSummaryRQ();

        req.setCarrierCode("LJ");
        if(StringUtils.isNotEmpty(criteriaVO.getFltNum())) {
            String flightNumber = null;
            String flightSuffix = null;
            if(StringUtils.isNumeric(criteriaVO.getFltNum())) {
                flightNumber = criteriaVO.getFltNum();
            } else {
                flightSuffix = criteriaVO.getFltNum().substring(criteriaVO.getFltNum().length() - 2);
                flightNumber = StringUtils.replace(criteriaVO.getFltNum(), flightSuffix, "");
            }

            req.setFlightNumber(Integer.valueOf(flightNumber));
            req.setFlightSuffix(flightSuffix);
        }
        if(StringUtils.isNotEmpty(criteriaVO.getStnfrCode()) && StringUtils.isNotEmpty(criteriaVO.getStntoCode())){
            req.setBoardPoint(criteriaVO.getStnfrCode());
            req.setOffPoint(criteriaVO.getStntoCode());
        }

        req.setFlightStartDate(DateUtils.xmlGregorianCalendar(criteriaVO.getDepStartDate(),"yyyy-MM-dd"));
        req.setFlightEndDate( DateUtils.xmlGregorianCalendar(criteriaVO.getDepEndDate(),"yyyy-MM-dd"));
        req.setAirlineCode(airlineCode);

        req.setAgencyCode(agencyCode);

        req.setPnrType(PNRType.NORMAL);
        req.setBookingChannel(bookingChannelKeyType);
        req.setActivePnrNumber(100);
        req.setPastPnrNumber(100);
        req.setIsUnFlownPassengersOnly(false);
        req.setIsCancelledRequired(true);

        RetrieveReservationSummaryRS retrieveReservationSummaryRS = retrieveReservationSummaryRequest.request(req, property);
        String errors = errors(retrieveReservationSummaryRS);
        if (StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#RetrieveReservationSummary.request: errorCode={}", errors);
            return ResultMapVO.simpleError(errors);
        }

        List<ReservationSummaryVO> reservationSummaryVOList = new ArrayList<>();
        List<PnrSummary> summaries = new ArrayList<>();

        // 지난 예약 포함
        summaries.addAll(retrieveReservationSummaryRS.getPnrSummary());
        summaries.addAll(retrieveReservationSummaryRS.getPnrSummaryPast());

        /**
         * CONFIRMED
         * WAITLISTED
         * CONFIRMED_FROM_WAITLIST
         * CANCELLED
         * "TIME_CHANGE + TIME_CHANGE_FROM_CONFIRMED
         * ==> TKTC 상태"
         * "TIME_CHANGE + TIME_CHANGE_FROM_WAITLIST
         * ==> TLTK 상태"
         * "SCHEDULE_CHANGE +  WAS_CONFIRMED
         * ==> WKSC 상태"
         * "SCHEDULE_CHANGE +  WAITLISTED
         * ==> WLSC 상태"
         * WAS_CONFIRMED
         * WAS_WAITLISTED
         */
        final List<String> ENABLED_STATUSES = Arrays.asList(
                "HOLDING_SOLD",
                "STANDBY",
                "CONFIRMED",
                "CANCELLED",
                "TIME_CHANGE",
                "TIME_CHANGE_FROM_CONFIRMED",
                "TIME_CHANGE_FROM_WAITLIST",
                "TIME_CHANGE_FROM_STANDBY",
                "EARLY_SHOW",
                "LATE_SHOW",
                "WAS_STANDBY",
                "SCHEDULE_CHANGE",
                "CONFIRMED_FROM_WAITLIST",
                "WAS_CONFIRMED",
                "WAS_WAITLISTED",
                "WAITLISTED",
                "UNABLE_CLOSED",
                "NO_ACTION_TAKEN",
                "UNABLE_FLIGHT_NON_OPERATING",
                "HOLDING_NEEDED",
                "TP_CONFIRMED",
                "WAS_REQUESTED",
                "REQUESTED",
                "WAS_HOLDING_NEEDED",
                "CONFIRMEDVERBALLY",
                "TIME_CHANGE_FROM_HOLDING_NEEDED",
                "WAS_TP_CONFIRMED",
                "CANCELLEDVERBALLY"
/*
//                "HOLDING_SOLD",
//                "STANDBY",
                "CONFIRMED",
                "CANCELLED",
                "TIME_CHANGE",
//                "TIME_CHANGE_FROM_CONFIRMED",
//                "TIME_CHANGE_FROM_WAITLIST",
//                "TIME_CHANGE_FROM_STANDBY",
//                "EARLY_SHOW",
//                "LATE_SHOW",
//                "WAS_STANDBY",
                "SCHEDULE_CHANGE",
                "CONFIRMED_FROM_WAITLIST",
                "WAS_CONFIRMED",
                "WAS_WAITLISTED",
                "WAITLISTED"
//                "UNABLE_CLOSED",
//                "NO_ACTION_TAKEN",
//                "UNABLE_FLIGHT_NON_OPERATING",
//                "HOLDING_NEEDED",
//                "TP_CONFIRMED",
//                "WAS_REQUESTED",
//                "REQUESTED",
//                "WAS_HOLDING_NEEDED",
//                "CONFIRMEDVERBALLY",
//                "TIME_CHANGE_FROM_HOLDING_NEEDED",
//                "WAS_TP_CONFIRMED",
//                "CANCELLEDVERBALLY"
 */
                );

        /**
         * 완료: CONFIRMED
         * 대기: WAITLISTED
         * 비운항: NO_OP
         * 여정 변경: SCHEDULE_CHANGE
         * 시간 변경: TIME_CHANGE
         * 취소: CANCELLED
         */
        final Map<String, String> STATUS_MAP = new HashMap<>() {
            {
                put("CONFIRMED", "CONFIRMED");
                put("WAITLISTED", "WAITLISTED_HL");
                put("CONFIRMED_FROM_WAITLIST", "WAITLISTED_KL");
                put("CANCELLED", "CANCELLED");
                put("TIME_CHANGE", "TIME_CHANGE");
                put("TIME_CHANGE_FROM_CONFIRMED", "TIME_CHANGE");
                put("SCHEDULE_CHANGE", "SCHEDULE_CHANGE");
                put("WAS_CONFIRMED", "NO_OP");
                put("WAS_WAITLISTED", "NO_OP");
            }
        };

        final Map<String, String> STATUS_DISPLAY_MAP = new HashMap<>() {
            {
                put("CONFIRMED", "완료");
                put("WAITLISTED", "대기(HL)");
                put("WAITLISTED_KL", "대기(KL)");
                put("CANCELLED", "취소");
                put("TIME_CHANGE", "시간 변경");
                put("SCHEDULE_CHANGE", "여정 변경");
                put("NO_OP", "비운항");
            }
        };

        String critSegStatus = criteriaVO.getSegmentStatus();
        String critFareClass = criteriaVO.getFareClass();
        String critPaxCnt = criteriaVO.getPaxCount();
        int critDepStartDate = Integer.parseInt(criteriaVO.getDepStartDate().replace("-",""));
        int critDepEndDate = Integer.parseInt(criteriaVO.getDepEndDate().replace("-",""));

        for (var pnrSummary : summaries) {
            ReservationSummaryVO reservationSummaryVO = new ReservationSummaryVO();
            int paxCnt = pnrSummary.getPnrGuestSummaryDetails().size();
            String pnrStatus = pnrSummary.getPnrStatus();

            FlightSegmentSummaryDetails targetFltSegment = null;
            String fltSegFareClass = null;

            // status별 우선순위가 있기 때문에 status for loop를 바깥으로 구성
            for (var segmentStatus : ENABLED_STATUSES) {
                for (var fltSegment : pnrSummary.getFlightSegmentSummaryDetails()) {
                    // Segment Status에 따른 검색 결과 제어
                    if (StringUtils.equals(pnrStatus, "CANCELLED")) {
                        targetFltSegment = fltSegment;
                        break;
                    } else {
                        if (!StringUtils.equals(fltSegment.getSegmentStatus(), segmentStatus)) {
                            continue;
                        }
                    }

                    targetFltSegment = fltSegment;
                    break;
                }

                if(targetFltSegment != null) break;
            }

            //segmentStatus, fareClass, paxCount 조회 조건 필터링
            if (null != critSegStatus && !critSegStatus.isEmpty()) {
                if (!StringUtils.equals(targetFltSegment.getSegmentStatus(), critSegStatus)) {
                    continue;
                }
            }

            // Filtering with Cabin Class
            String cabinClass = null;
            String rsFareClass = targetFltSegment.getFareBasis();
            if(StringUtils.isNotBlank(rsFareClass)) {
                boolean fromKorea = IBSDomainUtils.isDomestic(criteriaVO.getStnfrCode(), criteriaVO.getStntoCode());
                if (fromKorea)
                    fltSegFareClass = rsFareClass.substring(0, 2);
                else
                    fltSegFareClass = StringUtils.equals(rsFareClass, "CID00C1") ? "C" : "U3";

                if(StringUtils.isNotBlank(criteriaVO.getCabinClass())) {
                    cabinClass = CABIN_CLASS_MAP.get(fltSegFareClass);
                    if (!StringUtils.equalsIgnoreCase(criteriaVO.getCabinClass(), cabinClass)) {
                        continue;
                    }
                }
            }

            // Filtering with Pax Count
            if (null != critPaxCnt && !critPaxCnt.isEmpty()) {
                if (paxCnt != Integer.parseInt(critPaxCnt)) {
                    continue;
                }
            }

            //예약 일자를 변경해도 최초 예약 일자로 조회하면 해당 PNR 표출되는 문제 > IBS에서 내려준 출발일자가 검색조건 기간내 포함되면 리스트에 추가
            int rsDepTime =  Integer.parseInt(DateUtils.string(targetFltSegment.getFlightDate(), "dd-MMM-yyyy", "yyyyMMdd"));
            if (rsDepTime < critDepStartDate || rsDepTime > critDepEndDate) {
                continue;
            }

            reservationSummaryVO.setPNRNumber(pnrSummary.getPnrNumber());
            reservationSummaryVO.setFltnum(targetFltSegment.getAirlineCode()+ targetFltSegment.getFlightNumber());

            String depTime = DateUtils.string(targetFltSegment.getFlightDate(), "dd-MMM-yyyy", "yyyy-MM-dd(E)");

            reservationSummaryVO.setDepDate(depTime);
            reservationSummaryVO.setStnfrCode(targetFltSegment.getBoardPoint());
            reservationSummaryVO.setStntoCode(targetFltSegment.getOffPoint());

            XMLGregorianCalendar depDateUtc = targetFltSegment.getScheduledDepartureDateTime();
            XMLGregorianCalendar arrDateUtc = targetFltSegment.getScheduledArrivalDateTime();

            String depDateTime = depDateUtc.getHour() + ":" + String.format("%02d", depDateUtc.getMinute());
            String arrDateTime = arrDateUtc.getHour() + ":" + String.format("%02d",arrDateUtc.getMinute());

            reservationSummaryVO.setDepartureDateTime(depDateTime);

            reservationSummaryVO.setArrivalDateTime(arrDateTime);
            reservationSummaryVO.setFareClass(fltSegFareClass);
            reservationSummaryVO.setSegmentStatus(targetFltSegment.getSegmentStatus());
            reservationSummaryVO.setPnrStatus(pnrStatus);
            reservationSummaryVO.setPaxCount(paxCnt);

            // status
            reservationSummaryVO.setStatus(STATUS_MAP.get(targetFltSegment.getSegmentStatus()));
            reservationSummaryVO.setStatusDisplay(STATUS_DISPLAY_MAP.get(reservationSummaryVO.getStatus()));

            reservationSummaryVO.setCabinClassDisplay(CABIN_CLASS_DISPLAY_MAP.get(cabinClass));

            reservationSummaryVOList.add(reservationSummaryVO);
        }
        if(CollectionUtils.isEmpty(reservationSummaryVOList)) {
            LoggerUtils.e(LOGGER, "RetrieveReservationSummary 결과는 있지만, 모두 제거됨: errorCode={}");
            return ResultMapVO.simpleError("조회된 예약 내역이 없습니다.");
        }

        reservationSummaryVOList.sort(Comparator.comparing(ReservationSummaryVO::getDepDate));

        return ResultMapVO.simpleResult("result", reservationSummaryVOList);
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
        if(StringUtils.equals(errorCode, "WS_1007")) {
            return "조회된 예약 내역이 없습니다.";
        }
//        if(StringUtils.equals(errorCode, "BKG_RETRIEVE_01")) {
//            return "agt.req.msg.no.reservation";
//        } else if(StringUtils.equals(errorCode, "INVENTORY_1020")) {
//            return "agt.req.msg.check.inventory";
//        } else if(StringUtils.equals(errorCode, "WS_851")) {
//            return "agt.req.msg.reservation.cancelled";
//        }

        return IBSDomainUtils.errorMessage(object);
    }

    public ResultMapVO acceptSchedule(String pnrNumber) {
        /*
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	<SOAP-ENV:Header/>
	<SOAP-ENV:Body>
		<ns3:AcceptScRQ xmlns:ns3="http://www.ibsplc.com/iRes/simpleTypes/">
			<AirlineCode>LJ</AirlineCode>
			<BookingChannel>
				<ChannelType>API</ChannelType>
				<Channel>CWI</Channel>
				<Locale>ko_KR</Locale>
			</BookingChannel>
			<ItineraryChangeType>
				<SegmentChangeType>
					<PnrActionType>ACCEPT_TC</PnrActionType>
					<OldSegmentId>500</OldSegmentId>
				</SegmentChangeType>
			</ItineraryChangeType>
			<IPAddress>211.107.79.112</IPAddress>
			<PnrNumber>C3B22X</PnrNumber>
		</ns3:AcceptScRQ>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<ns2:AcceptScRS xmlns:ns2="http://www.ibsplc.com/iRes/simpleTypes/">
			<AirlineCode>LJ</AirlineCode>
			<Status>STATUS_OK</Status>
		</ns2:AcceptScRS>
	</soap:Body>
</soap:Envelope>
         */

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

        // 대체될 Seg Status 목록
        final var STATUSES_WILL_BE_REPLACING = Arrays.asList(
                ReservationStatusDetailsType.TIME_CHANGE,
                ReservationStatusDetailsType.SCHEDULE_CHANGE);

        final var flightSegment = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().stream()
                .filter(t -> STATUSES_WILL_BE_REPLACING.contains(t.getSegmentStatus()))
                .findFirst()
                .orElse(null);
        if(flightSegment == null) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", "There's no segment to accept");
            return ResultMapVO.simpleError("There's no segment to accept");
        }

        PnrActionType action = null;
        if(ReservationStatusDetailsType.TIME_CHANGE.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_TC;
        } else if(ReservationStatusDetailsType.SCHEDULE_CHANGE.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_SC;
        } else if(ReservationStatusDetailsType.WAITLISTED.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_WL;
        }

        final var STATUSES_WILL_BE_REPLACED = Arrays.asList(
                ReservationStatusDetailsType.TIME_CHANGE_FROM_CONFIRMED,
                ReservationStatusDetailsType.TIME_CHANGE_FROM_WAITLIST,
                ReservationStatusDetailsType.WAS_CONFIRMED);

        final String oldSegmentId = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().stream()
                .filter(t -> STATUSES_WILL_BE_REPLACED.contains(t.getSegmentStatus()))
                .findFirst()
                .orElse(new FlightSegmentDetailsType())
                .getSegmentId();
        if(StringUtils.isBlank(oldSegmentId)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", "There's no segment to be replaced");
            return ResultMapVO.simpleError("There's no segment to be replaced");
        }

        ItineraryChangeType itineraryChange = new ItineraryChangeType();
        SegmentChangeType segmentChange = new SegmentChangeType();
        segmentChange.setPnrActionType(action);
        segmentChange.getOldSegmentId().add(Long.parseLong(oldSegmentId));
        itineraryChange.getSegmentChangeType().add(segmentChange);

        String errors = null;
        if(!PnrActionType.ACCEPT_WL.equals(action)) {
            AcceptScRQ acceptScRQ = new AcceptScRQ();
            acceptScRQ.setBookingChannel(retrieveBookingRQ.getBookingChannel());
            acceptScRQ.setPnrNumber(retrieveBookingRS.getPNRNumber());
            acceptScRQ.setAirlineCode(retrieveBookingRS.getAirlineCode());
            acceptScRQ.setAgencyCode(retrieveBookingRS.getAgencyCode());
            acceptScRQ.setCurrentAgentID(retrieveBookingRS.getCurrentAgentID());
            acceptScRQ.setIPAddress("127.0.0.1");
            acceptScRQ.getItineraryChangeType().add(itineraryChange);
            AcceptScRS acceptScRS = acceptSc.request(acceptScRQ, property);
            errors = errors(acceptScRS);
        } else {
            AcceptWlRQ acceptWlRQ = new AcceptWlRQ();
            acceptWlRQ.setBookingChannel(retrieveBookingRQ.getBookingChannel());
            acceptWlRQ.setPnrNumber(retrieveBookingRS.getPNRNumber());
            acceptWlRQ.setAirlineCode(retrieveBookingRS.getAirlineCode());
            acceptWlRQ.setAgencyCode(retrieveBookingRS.getAgencyCode());
            acceptWlRQ.setCurrentAgentID(retrieveBookingRS.getCurrentAgentID());
            acceptWlRQ.setIPAddress("127.0.0.1");
            acceptWlRQ.getItineraryChangeType().add(itineraryChange);
            AcceptWlRS acceptWlRS = acceptWl.request(acceptWlRQ, property);
            errors = errors(acceptWlRS);
        }
        if(StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", errors);
            return ResultMapVO.simpleError(errors);
        }

        return ResultMapVO.simpleResult("result", "SUCCESS");
    }

    public ResultMapVO rejectSchedule(String pnrNumber) {
        /*
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	<SOAP-ENV:Header/>
	<SOAP-ENV:Body>
		<ns3:RejectScRQ xmlns:ns3="http://www.ibsplc.com/iRes/simpleTypes/">
			<AirlineCode>LJ</AirlineCode>
			<BookingChannel>
				<ChannelType>API</ChannelType>
				<Channel>CWI</Channel>
				<Locale>ko_KR</Locale>
			</BookingChannel>
			<ItineraryChangeType>
				<SegmentChangeType>
					<PnrActionType>REJECT_SC</PnrActionType>
					<OldSegmentId>500</OldSegmentId>
				</SegmentChangeType>
			</ItineraryChangeType>
			<IPAddress>218.146.223.106</IPAddress>
			<PnrNumber>B2H7PR</PnrNumber>
		</ns3:RejectScRQ>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<ns2:RejectScRS
			xmlns:ns2="http://www.ibsplc.com/iRes/simpleTypes/">
			<AirlineCode>LJ</AirlineCode>
			<Status>STATUS_OK</Status>
		</ns2:RejectScRS>
	</soap:Body>
</soap:Envelope>
         */

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

        FlightSegmentDetailsType flightSegment = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().get(0);
        Long oldSegmentId = Long.parseLong(flightSegment.getSegmentId());

        ItineraryChangeType itineraryChange = new ItineraryChangeType();
        SegmentChangeType segmentChange = new SegmentChangeType();
        segmentChange.setPnrActionType(PnrActionType.REJECT_SC);
        segmentChange.getOldSegmentId().add(oldSegmentId);
        itineraryChange.getSegmentChangeType().add(segmentChange);

        RejectScRQ rejectScRQ = new RejectScRQ();
        rejectScRQ.setBookingChannel(retrieveBookingRQ.getBookingChannel());
        rejectScRQ.setPnrNumber(retrieveBookingRS.getPNRNumber());
        rejectScRQ.setAirlineCode(retrieveBookingRS.getAirlineCode());
        rejectScRQ.setAgencyCode(retrieveBookingRS.getAgencyCode());
        rejectScRQ.setCurrentAgentID(retrieveBookingRS.getCurrentAgentID());
        rejectScRQ.setIPAddress("127.0.0.1");
        rejectScRQ.getItineraryChangeType().add(itineraryChange);
        RejectScRS rejectScRS = rejectSc.request(rejectScRQ, property);

        String errors = errors(rejectScRS);
        if(StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
            return ResultMapVO.simpleError(errors);
        }

        return ResultMapVO.simpleResult("result", "SUCCESS");
    }

    public ResultMapVO acceptWaitlisted(String pnrNumber) {
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

        FlightSegmentDetailsType flightSegment = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().get(0);
        Long oldSegmentId = Long.parseLong(flightSegment.getSegmentId());

        ItineraryChangeType itineraryChange = new ItineraryChangeType();
        SegmentChangeType segmentChange = new SegmentChangeType();
        segmentChange.setPnrActionType(PnrActionType.ACCEPT_WL);
        segmentChange.getOldSegmentId().add(oldSegmentId);
        itineraryChange.getSegmentChangeType().add(segmentChange);

        AcceptWlRQ acceptWlRQ = new AcceptWlRQ();
        acceptWlRQ.setBookingChannel(retrieveBookingRQ.getBookingChannel());
        acceptWlRQ.setPnrNumber(retrieveBookingRS.getPNRNumber());
        acceptWlRQ.setAirlineCode(retrieveBookingRS.getAirlineCode());
        acceptWlRQ.setAgencyCode(retrieveBookingRS.getAgencyCode());
        acceptWlRQ.setCurrentAgentID(retrieveBookingRS.getCurrentAgentID());
        acceptWlRQ.setIPAddress("127.0.0.1");
        acceptWlRQ.getItineraryChangeType().add(itineraryChange);
        AcceptWlRS acceptWlRS = acceptWl.request(acceptWlRQ, property);

        String errors = errors(acceptWlRS);
        if(StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", errors);
            return ResultMapVO.simpleError(errors);
        }

        return ResultMapVO.simpleResult("result", "SUCCESS");
    }

    public ResultMapVO getCrewBookingFailLogs(CrewPNRLogCriteriaVO criteriaVO) {
        List<CrewPnrLogVO> list = crewBookingMapper.getCreateBookingFailLog(criteriaVO);
        if(CollectionUtils.isEmpty(list)) {
            return ResultMapVO.simpleResult("error", "조회된 예약 내역이 없습니다.");
        }
        list.forEach(t -> t.setCabinClassDisplay(CABIN_CLASS_DISPLAY_MAP.get(t.getFareClass())));

        return ResultMapVO.simpleResult("result", list);
    }

    private String getAgencyCode() {
        UserInfoVO loginUser = PrincipalUtils.user();
        CodeInfoVO codeInfoVO = null;
        String agencyCode = null;

        codeInfoVO = codeHandler.getCodeInfo("CMM209", loginUser.getDepartment());
        if(codeInfoVO == null) {
            agencyCode = codeInfoVO.getAddInfo1();
        }

        if(StringUtils.isBlank(agencyCode)) {
            Cookie cookie = Arrays.stream(((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getCookies())
                    .filter(t -> StringUtils.equals(t.getName(), "agencyCode"))
                    .findFirst()
                    .orElse(null);
            if(cookie != null) {
                agencyCode = cookie.getValue();
            }
        }

        return agencyCode;
    }
}
