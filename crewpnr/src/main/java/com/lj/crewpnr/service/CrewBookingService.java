package com.lj.crewpnr.service;

import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.GetAirAvailability;
import com.lj.core.integration.soap.ibs.api.booking.SaveCreateBooking;
import com.lj.core.integration.soap.ibs.domain.booking.*;
import com.lj.core.util.LoggerUtils;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.common.Constants.ERROR_CODE;
import com.lj.crewpnr.common.IBSDomainUtils;
import com.lj.crewpnr.common.DateUtils;
import com.lj.crewpnr.vo.availability.AvailabilityCriteriaVO;
import com.lj.crewpnr.vo.availability.AvailabilitySearchVO;
import com.lj.crewpnr.vo.CrewPNRExcelVO;
import com.lj.crewpnr.vo.ResultMapVO;
import com.lj.crewpnr.vo.availability.PaxCountVO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
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
    @Value("#{IbsBookingProperties['general.airline.code']}")
    private String airlineCode;
    @Autowired
    private GetAirAvailability airAvailability;
    @Autowired
    private SaveCreateBooking saveCreateBooking;

    public ResultMapVO createBookings(MultipartFile file){

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        ResultMapVO resultMapVO = new ResultMapVO();

        //엑셀파일 읽기
        List<CrewPNRExcelVO> crewPNRExcelList = this.readExcelFile(file);

        AvailabilityCriteriaVO criteria = null;

        List<AvailabilitySearchVO> availabilitySearches = new ArrayList<>();

        for(CrewPNRExcelVO excelVO : crewPNRExcelList){
            criteria = new AvailabilityCriteriaVO();
            String agencyCd = "";

            AvailabilitySearchVO availabilitySearch = new AvailabilitySearchVO();
            availabilitySearch.setOrigin(excelVO.getBoardPoint());
            availabilitySearch.setDestination(excelVO.getOffPoint());
            availabilitySearch.setFlightNumber(excelVO.getFltNumber());
            availabilitySearch.setDepartureDate(excelVO.getFlightDate());
            availabilitySearches.add(availabilitySearch);

            criteria.setAvailabilitySearches(availabilitySearches);

            criteria.setPaxCounts(new ArrayList<>());
            PaxCountVO paxCount = new PaxCountVO();
            paxCount.setType("ADULT");
            paxCount.setSubType("CREW");
            paxCount.setCount(excelVO.getPaxCount());
            criteria.getPaxCounts().add(paxCount);
            criteria.setTripType("OW");
            criteria.setFareLevel("CR");


            criteria.setFareClass(excelVO.getFareClass());

            if(StringUtils.equals(excelVO.getMiddleName(), "OOA"))
                agencyCd = "20024620"; //운항
            else if(StringUtils.equals(excelVO.getMiddleName(), "UFA"))
                agencyCd = "20024600"; //객실
            else if(StringUtils.equals(excelVO.getMiddleName(), "MCA"))
                agencyCd = "20024610"; //정비

            criteria.setAgencyCode(agencyCd);
            criteria.setCurrency("KRW");
            criteria.setPointOfPurchase("KR");

            int logSeq = 2;
            Map<String, String> pnrResultMap = new HashMap<>();
            ResultMapVO availabilityResult = this.searchAvailabilities(criteria);

            if (ResultMapVO.hasErrors(availabilityResult)) {
                LoggerUtils.e(LOGGER, "AvailabilityService.searchAvailabilities:{} {}:errorCode={}",
                        "", "" + (logSeq++), availabilityResult.getErrorCode());
                pnrResultMap.put(excelVO.getFlightDate(), null);
                continue;
            }

            BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
            bookingChannelKeyType.setChannel("PWC");
            bookingChannelKeyType.setChannelType("API");
            bookingChannelKeyType.setLocale("ko_KR");

            List<FlightSegmentDetailsType> flightSegments = availabilityResult.get("flightSegments", List.class);
            List<FareDetailsForGuestType> faresForGuest = availabilityResult.get("faresForGuest", List.class);
            List<PaxCountType> paxCounts = availabilityResult.get("paxCounts", List.class);

            CreateBookingRQ createBookingRQ = new CreateBookingRQ();
            createBookingRQ.setAirlineCode("LJ");
            createBookingRQ.setPointOfSale("KR");
            createBookingRQ.setAgencyCode(agencyCd);
            createBookingRQ.setOriginalAgentID(agencyCd);
            createBookingRQ.setCurrentAgentID(agencyCd);
            createBookingRQ.setBookingChannel(IBSDomainUtils.getBookingChannel(IBSDomainUtils.isDomestic(flightSegments)));

            BookerDetailsType booker = new BookerDetailsType();
            booker.setSurName("에어");
            booker.setGivenName("진");
            createBookingRQ.setBookerDetails(booker);


            PnrContactType pnrContact = new PnrContactType();
            pnrContact.setSurName("진에어");
            AddressType address = new AddressType();
//            address.setAddressType("PAX_HOME_CONTACT");
            address.setEmailAddress(excelVO.getEmailAddress());
            address.setSendItineraryToEmailId(false);
//            address.setSendItineraryToPreferredEmailId(false);
            address.setCellNumber(StringUtils.replace(excelVO.getCellNumber(), "-", ""));
            address.setSendItineraryToSMS(false);
//            address.setSendItineraryToDestSMS(false);
            address.setPhoneNumberCountryCode("+82");
            pnrContact.setAddress(address);
//            pnrContact.setContactType(ContactDetailsType.H);
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

            createBookingRQ.setPnrOnHoldIndicator(true);
            createBookingRQ.setPointOfOrigin("KR");
            createBookingRQ.setCurrency("KRW");


            CreateBookingRS createBookingRS = saveCreateBooking.request(createBookingRQ, property);
            String errors = errors(createBookingRS);
            if (StringUtils.isNotBlank(errors)) {
                LoggerUtils.e(LOGGER, "CrewBookingAPI#saveCreateBooking.request: errorCode={}", errors);
                pnrResultMap.put(excelVO.getFlightDate(), null);
                continue;
            }

            pnrResultMap.put(excelVO.getFlightDate(), createBookingRS.getPnrNumber());

            LoggerUtils.i(LOGGER, "CrewBookingService.createBookings: {}:1-", "");

            ResultMapVO result = new ResultMapVO();
            result.put("pnrResultMap", pnrResultMap);
            return result;
        }
        return resultMapVO;
    }

    public ResultMapVO searchAvailabilities(AvailabilityCriteriaVO criteria) {
        List<PaxCountType> paxCounts = new ArrayList<>();

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

//        BookingChannelType channel = new BookingChannelType();
//        channel.setChannelType("API");
//        channel.setChannel("TWD");
//        channel.setLocale("ko_KR");


        //탑승객 수
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
            targetRQ.setAirlineCode("LJ");

            BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
            bookingChannelKeyType.setChannel("PWC");
            bookingChannelKeyType.setChannelType("API");
            bookingChannelKeyType.setLocale("en_US");

            targetRQ.setBookingChannel(bookingChannelKeyType);
            targetRQ.getPaxCountDetails().addAll(paxCounts);
            targetRQ.setTripType(tripType);
            targetRQ.setPointOfPurchase(criteria.getPointOfPurchase());
            targetRQ.getFareLevels().add(criteria.getFareLevel());
            targetRQ.setTravelAgencyCode(criteria.getAgencyCode());

            AdvancedSearchType advancedSearch = new AdvancedSearchType();
            boolean fromKorea = IBSDomainUtils.isDomestic(search.getOrigin());

            if(fromKorea){
                if(StringUtils.equals(criteria.getFareClass(), "PE")){  //Premium Economy
                    advancedSearch.setFareClass("U0");
                }
                else{
                    advancedSearch.setFareClass("U1");                  //Economy
                }
            }
            else{
                if(StringUtils.equals(criteria.getFareClass(), "PE")){
                    advancedSearch.setFareClass("C");
                }
                else{
                    advancedSearch.setFareClass("U3");
                }
            }

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

        String rs = null;
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

            //boolean fromKorea = IBSDomainUtils.isDomestic(search.getOrigin());
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
                //error value 저장
            }
            rs = WebUtils.toJson(availabilityRS);
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
                            String c = search.getFareClass();
                            String d = segmentAvailability.getBookingClass();
//                            if(StringUtils.equals(search.getFareClass(), segmentAvailability.getBookingClass())) {
                                targetSegmentAvailability = segmentAvailability;
                                break;
//                            }
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
                LoggerUtils.e(LOGGER, "여정변경 승인 에러 - targetSegmentAvailability is null, fareClass: {}", criteria.toString());
                continue;
            }

            /** pricing */
            PricingInfoType targetPricing = null;
            for(PricingInfoType pricing: targetOD.getPricingInfo()) {
                long a =targetTrip.getTripIndex().longValue();
                long b= pricing.getTripRefIndex().longValue();
                if(targetTrip.getTripIndex().longValue() != pricing.getTripRefIndex().longValue()) {
                    continue;
                }

                for(SegmentReferenceInfoType segmentReference: pricing.getSegmentReferenceInfo()) {
//                    if(StringUtils.equals(search.getFareClass(), segmentReference.getBookingClass())) {
                        targetPricing = pricing;
                        break;
//                    }
                }
                if(targetPricing != null) {
                    break;
                }
            }
            if(targetPricing == null) {
                LoggerUtils.e(LOGGER, "여정변경 승인 에러 - targetPricing is null, tripIndex: {}, fareClass: {}", targetTrip.getTripIndex().longValue(), search.getFareClass());
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
                    LoggerUtils.e(LOGGER, "여정변경 승인 에러 - targetPaxPricing is null");
                    return ResultMapVO.simpleErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
                }
            }

            /** pricing component */
            PricingComponentInfoType targetPricingComponent = null;

            String fareLevel = criteria.getFareLevel();

            for(PricingComponentInfoType pricingComponent: targetPricing.getPricingComponentInfo()) {
                String x = fareLevel;
                String y = pricingComponent.getFareLevel();
                if(StringUtils.equals(fareLevel, pricingComponent.getFareLevel())) {
                    targetPricingComponent = pricingComponent;
                    break;
                }
            }
            if(targetPricingComponent == null) {
                LoggerUtils.e(LOGGER, "여정변경 승인 에러 - targetPricingComponent is null, fareLevel: {}", fareLevel);
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

//    public ResultMapVO createBooking(ResultMapVO availabilityResult) {
//        IbsSoapProperty property = new IbsSoapProperty("TEST");
//        property.setUsername("jinair");
//        property.setPassword("jinatiflyapi");
//
//        BookingChannelType channel = new BookingChannelType();
//        channel.setChannelType("API");
//        channel.setChannel("PWC");
//        channel.setLocale("en_US");
//
//        List<FlightSegmentDetailsType> flightSegments = availabilityResult.get("flightSegments", List.class);
//        List<FareDetailsForGuestType> faresForGuest = availabilityResult.get("faresForGuest", List.class);
//        List<PaxCountType> paxCounts = availabilityResult.get("paxCounts", List.class);
//
//        CreateBookingRQ createBookingRQ = new CreateBookingRQ();
//        createBookingRQ.setAirlineCode("LJ");
////        createBookingRQ.setPointOfSale(pointOfPurchase);
//        createBookingRQ.setAgencyCode("20024620"); //운항 Agency Code 객실(stg : 20024600), 정비(stg : 20024610)
//        createBookingRQ.setOriginalAgentID("20024620");
//        createBookingRQ.setCurrentAgentID("20024620");
//        createBookingRQ.setBookingChannel(channel);
//
//        BookerDetailsType booker = new BookerDetailsType();
//        booker.setSurName("에어");
//        booker.setGivenName("진");
//        createBookingRQ.setBookerDetails(booker);
//
//        createBookingRQ.setPnrType(PNRType.NORMAL.name());
//        createBookingRQ.setNumberOfSeats(4);
//
//        List<PaxCountDetailsType> paxCountDetails = new ArrayList<>();
//        for (PaxCountType paxCountType : paxCounts) {
//            PaxCountDetailsType paxCountDetail = new PaxCountDetailsType();
//            paxCountDetail.setPaxType(paxCountType.getPaxType());
//            paxCountDetail.setPaxSubType(paxCountType.getPaxSubType());
//            paxCountDetail.setPaxCount(paxCountType.getPaxCount());
//            paxCountDetails.add(paxCountDetail);
//        }
//        createBookingRQ.getPaxCountDetails().addAll(paxCountDetails);
//
//        ItineraryDetailsType itin = new ItineraryDetailsType();
//        itin.getFlightSegmentDetails().addAll(flightSegments);
//        createBookingRQ.getItineraryDetails().add(itin);
//
//        FareInfoType fare = new FareInfoType();
//        fare.getFareDetailsForGuestType().addAll(faresForGuest);
//        createBookingRQ.getFareInfo().add(fare);
//
//        createBookingRQ.setPnrOnHoldIndicator(true);
////        createBookingRQ.setPointOfOrigin(pointOfPurchase);
//        createBookingRQ.setCurrency("KRW");
//
//        Map<String, String> pnrResultMap = new HashMap<>();
//
//        CreateBookingRS createBookingRS = saveCreateBooking.request(createBookingRQ, property);
//        String errors = errors(createBookingRS);
//        if (StringUtils.isNotBlank(errors)) {
//            LoggerUtils.e(LOGGER, "BookingAPI#saveCreateBooking.request: errorCode={}", errors);
//            pnrResultMap.put("ICN", null);
////            continue;
//        }
//
//        pnrResultMap.put("ICN", createBookingRS.getPnrNumber());
//
//        ResultMapVO result = new ResultMapVO();
//        result.put("pnrResultMap", pnrResultMap);
//        return result;
//    }
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
                        case 12: // pnrComments
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "pnrComments";
                            } else {
                                crewPNRExcelVO.setPnrComments(cellValue);
                            }
                            break;
                        default:
                            break;
                    }
                    if (!emptyFields.equals("")) {
                        crewPNRExcelVO.setResult("N");
                        crewPNRExcelVO.setResultMsg(emptyFields);
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
    private String errors(Object object) {
        if(object == null) {
            return ERROR_CODE.SERVER_ERROR_OCCURRED;
        }

        String errorCode = IBSDomainUtils.errorCode(object);
        if(StringUtils.equals(errorCode, "BKG_RETRIEVE_01")) {
            return "agt.req.msg.no.reservation";
        } else if(StringUtils.equals(errorCode, "INVENTORY_1020")) {
            return "agt.req.msg.check.inventory";
        } else if(StringUtils.equals(errorCode, "WS_851")) {
            return "agt.req.msg.reservation.cancelled";
        }

        return IBSDomainUtils.errorMessage(object);
    }
}
