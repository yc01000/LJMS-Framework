package com.lj.crewpnr.service;

import com.lj.core.common.util.RandomUtils;
import com.lj.core.commoncode.handler.CodeHandler;
import com.lj.core.commoncode.vo.CodeInfoVO;
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
import com.lj.crewpnr.vo.excel.CrewPNRExcelGumVO;
import com.lj.crewpnr.vo.excel.CrewPNRExcelVO;
import com.lj.crewpnr.vo.excel.PaxInfoVO;
//import com.lj.sso.ssocore.security.vo.UserInfoVO;
//import com.lj.sso.ssocore.util.PrincipalUtils;
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

    @Autowired
    private AcceptSc acceptSc;

    @Autowired
    private RejectSc rejectSc;

    @Autowired
    private AcceptWl acceptWl;
    @Autowired
    private CodeHandler codeHandler;

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

    public ResultMapVO createBookingsForGumAsync(MultipartFile file) {
        String service = "CREATE_BOOKINGS";
        String key = RandomUtils.generate(10);

        final MultipartFile fileFinalized = file;
        new Thread(() -> createBookingsForGum(fileFinalized)).start();

        ResultMapVO result = new ResultMapVO();
        result.put("service", service);
        result.put("key", key);
        return result;
    }

    public ResultMapVO createBookings(MultipartFile file){
        ResultMapVO resultMapVO = new ResultMapVO();

        //로그인 유저의 부서 코드로 agency Code 세팅
        String agencyCode = getAgencyCode();
//        if(agencyCode == null){
//            resultMapVO.put("message", "Agency Code null");
//            return resultMapVO;
//        }

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        List<CrewPNRExcelVO> crewPNRExcelList = null;
        //엑셀파일 읽기
        crewPNRExcelList = this.readExcelFile(file);

        AvailabilityCriteriaVO criteria = null;

        int failCnt = 0;
        if(crewPNRExcelList != null ) {
            int listCnt = crewPNRExcelList.size();
            for (CrewPNRExcelVO excelVO : crewPNRExcelList) {
                try {

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

//                    if (StringUtils.equals(excelVO.getMiddleName(), "OOA"))
//                        agencyCd = "20024620"; //운항
//                    else if (StringUtils.equals(excelVO.getMiddleName(), "UFA"))
//                        agencyCd = "20024600"; //객실
//                    else if (StringUtils.equals(excelVO.getMiddleName(), "MCA"))
//                        agencyCd = "20024610"; //정비

                    criteria.setAgencyCode(agencyCd);
                    criteria.setCurrency("KRW");
                    criteria.setPointOfPurchase("KR");

                    //최대 9명까지 pnr 생성 가능
                    if(excelVO.getPaxCount() > 9){
                        failCnt++;
                        insertCrewPnrLog(criteria, "createBookings: {pnr max 9}");
                        continue;
                    }

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
        }
        return resultMapVO;
    }

    public ResultMapVO createBookingsForGum(MultipartFile file){
        ResultMapVO resultMapVO = new ResultMapVO();

        //로그인 유저의 부서 코드로 agency Code 세팅
        String agencyCode = getAgencyCode();
//        if(agencyCode == null){
//            resultMapVO.put("message", "Agency Code null");
//            return resultMapVO;
//        }

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");


        //엑셀파일 읽기
        List<CrewPNRExcelGumVO> crewPNRExcelGumTempList = this.readGumExcelFile(file);

        //엑셀에서 읽은 데이터를 crewPNRExcelGumTempList에 담고 그 중 같은 groupSeq 별로 승객 묶어서 crewPNRExcelGumList 에 add
        CrewPNRExcelGumVO crewPNRExcelGumVO = new CrewPNRExcelGumVO();
        List<PaxInfoVO> gumPaxInfoList = new ArrayList<>();
        List<CrewPNRExcelGumVO> crewPNRExcelGumList = new ArrayList<>();

        int gumListCnt = crewPNRExcelGumTempList.size();
        int previousSeq = crewPNRExcelGumTempList.get(0).getGroupSeq();
        for (int i = 0; i < gumListCnt; i++) {
            PaxInfoVO paxInfoVO = new PaxInfoVO();

            //groupSeq 가 이전과 다를 경우, 새로운 groupSeq 로 간주하여 이전 데이터를 List에 담고 초기화
            if (previousSeq != crewPNRExcelGumTempList.get(i).getGroupSeq()) {

                crewPNRExcelGumVO.setPaxinfoList(gumPaxInfoList);
                crewPNRExcelGumList.add(crewPNRExcelGumVO);

                crewPNRExcelGumVO = new CrewPNRExcelGumVO();
                gumPaxInfoList = new ArrayList<>();
            }

            previousSeq = crewPNRExcelGumTempList.get(i).getGroupSeq();
            crewPNRExcelGumVO.setGroupSeq(crewPNRExcelGumTempList.get(i).getGroupSeq());
            crewPNRExcelGumVO.setFltNumber(crewPNRExcelGumTempList.get(i).getFltNumber());
            crewPNRExcelGumVO.setBoardPoint(crewPNRExcelGumTempList.get(i).getBoardPoint());
            crewPNRExcelGumVO.setOffPoint(crewPNRExcelGumTempList.get(i).getOffPoint());
            crewPNRExcelGumVO.setFlightDate(crewPNRExcelGumTempList.get(i).getFlightDate());
            crewPNRExcelGumVO.setFareClass(crewPNRExcelGumTempList.get(i).getFareClass());

            paxInfoVO.setMiddleName(crewPNRExcelGumTempList.get(i).getMiddleName());
            paxInfoVO.setGivenName(crewPNRExcelGumTempList.get(i).getGivenName());
            paxInfoVO.setSurName(crewPNRExcelGumTempList.get(i).getSurName());
            paxInfoVO.setNamePrefix(crewPNRExcelGumTempList.get(i).getNamePrefix());
            paxInfoVO.setGender(crewPNRExcelGumTempList.get(i).getGender());
            gumPaxInfoList.add(paxInfoVO);

            //마지막 index 일 경우 add 하고 종료
            if (i == gumListCnt - 1) {
                crewPNRExcelGumVO.setPaxinfoList(gumPaxInfoList);
                crewPNRExcelGumList.add(crewPNRExcelGumVO);
            }
        }


        AvailabilityCriteriaVO criteria = null;

        int failCnt = 0;
        if(!crewPNRExcelGumList.isEmpty()) {
            int listCnt = crewPNRExcelGumList.size();
            for (CrewPNRExcelGumVO excelVO : crewPNRExcelGumList) {
                try {


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
                    paxCount.setCount(excelVO.getPaxinfoList().size());
                    criteria.getPaxCounts().add(paxCount);
                    criteria.setTripType(Constants.TRIP_TYPE.ONW_WAY);
                    criteria.setFareLevel("CR");

//                if (StringUtils.equals(excelVO.getMiddleName(), "OOA"))
//                    agencyCd = "20024620"; //운항
//                else if (StringUtils.equals(excelVO.getMiddleName(), "UFA"))
//                    agencyCd = "20024600"; //객실
//                else //StringUtils.equals(excelVO.getMiddleName(), "MCA")
//                    agencyCd = "20024610"; //정비

                    criteria.setAgencyCode(agencyCd);
                    criteria.setCurrency("KRW");
                    criteria.setPointOfPurchase("KR");

                    if(excelVO.getPaxinfoList().size() > 9){
                        failCnt++;
                        insertCrewPnrLog(criteria, "createBookings: {pnr max 9}");
                        continue;
                    }

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
                        guest.setMiddleName(excelVO.getPaxinfoList().get(i).getMiddleName());
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
                        //IBE 에러 로그 저장
                        insertCrewPnrLog(criteria, errors);
                        failCnt++;
                        continue;
                    }
                    LoggerUtils.i(LOGGER, "CrewBookingService.createBookings: {}:1-", "");
                }catch (Exception e) {
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
            ResultMapVO result = new ResultMapVO();
            LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
            result.put("Error", errors);
            return result;
        }

        //WK/SC, WL/SC
        //TK/TC, TL/TC
        final List<ReservationStatusDetailsType> REJECT_NEEDED_STATUSES = Arrays.asList(
                ReservationStatusDetailsType.WAS_CONFIRMED,
                ReservationStatusDetailsType.WAITLISTED,
                ReservationStatusDetailsType.TIME_CHANGE,
                ReservationStatusDetailsType.TIME_CHANGE_FROM_CONFIRMED,
                ReservationStatusDetailsType.SCHEDULE_CHANGE);
        boolean needRejectFirst = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().stream()
                .anyMatch(t -> REJECT_NEEDED_STATUSES.contains(t.getSegmentStatus()));
        if(needRejectFirst) {
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

            errors = errors(rejectScRS);
            if (StringUtils.isNotBlank(errors)) {
                ResultMapVO result = new ResultMapVO();
                LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
                result.put("Error", errors);
                return result;
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

    public ResultMapVO cancelReservation(List<String> pnrNumbers) {
        List<Object> results = new ArrayList<>();
        for(String pnrNumber: pnrNumbers) {
            results.add(ResultMapVO.getResult(cancelReservation(pnrNumber)));
        }
        return ResultMapVO.simpleResult("results", results);
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
            return ResultMapVO.simpleErrorCode(errors);
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
            return ResultMapVO.simpleErrorCode(errors);
        }

        result.put("message", "SUCCESS");
        return result;
    }

    public ResultMapVO getReservationSummary(ReservationSummaryCriteriaVO criteriaVO) {
        ResultMapVO resultMapVO = new ResultMapVO();

        //로그인 유저의 부서 코드로 agency Code 세팅
        String agencyCode = getAgencyCode();
//        if(agencyCode == null){
//            resultMapVO.put("message", "Agency Code null");
//            return resultMapVO;
//        }

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
        req.setIsCancelledRequired(true);

        RetrieveReservationSummaryRS retrieveReservationSummaryRS = retrieveReservationSummaryRequest.request(req, property);
        String errors = errors(retrieveReservationSummaryRS);
        if (StringUtils.isNotBlank(errors)) {
            LoggerUtils.e(LOGGER, "CrewBookingAPI#RetrieveReservationSummary.request: errorCode={}", errors);
            resultMapVO.put("Error", errors);
            return resultMapVO;
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
                put("WAITLISTED", "WAITLISTED");
                put("CONFIRMED_FROM_WAITLIST", "WAITLISTED");
                put("CANCELLED", "CANCELLED");
                put("TIME_CHANGE", "TIME_CHANGE");
                put("SCHEDULE_CHANGE", "SCHEDULE_CHANGE");
                put("WAS_CONFIRMED", "NO_OP");
                put("WAS_WAITLISTED", "NO_OP");
            }
        };

        final Map<String, String> STATUS_DISPLAY_MAP = new HashMap<>() {
            {
                put("CONFIRMED", "완료");
                put("WAITLISTED", "대기");
                put("CANCELLED", "취소");
                put("TIME_CHANGE", "시간 변경");
                put("SCHEDULE_CHANGE", "여정 변경");
                put("NO_OP", "비운항");
            }
        };

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

            String critSegStatus = criteriaVO.getSegmentStatus();
            String critFareClass = criteriaVO.getFareClass();
            String critPaxCnt = criteriaVO.getPaxCount();

            //segmentStatus, fareClass, paxCount 조회 조건 필터링
            if (null != critSegStatus && !critSegStatus.isEmpty()) {
                if (!StringUtils.equals(targetFltSegment.getSegmentStatus(), critSegStatus)) {
                    continue;
                }
            }

            String rsFareClass = targetFltSegment.getFareBasis();
            if(StringUtils.isNotBlank(rsFareClass)) {
                boolean fromKorea = IBSDomainUtils.isDomestic(criteriaVO.getStnfrCode(), criteriaVO.getStntoCode());
                if (fromKorea)
                    fltSegFareClass = rsFareClass.substring(0, 2);
                else
                    fltSegFareClass = StringUtils.equals(rsFareClass, "CID00C1") ? "C" : "U3";

                if (null != critFareClass && !critFareClass.isEmpty()) {
                    if (!StringUtils.equals(fltSegFareClass, critFareClass)) {
                        continue;
                    }
                }
            }

            if (null != critPaxCnt && !critPaxCnt.isEmpty()) {
                if (paxCnt != Integer.parseInt(critPaxCnt)) {
                    continue;
                }
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

            reservationSummaryVOList.add(reservationSummaryVO);
        }
        reservationSummaryVOList.sort(Comparator.comparing(ReservationSummaryVO::getDepDate));

        resultMapVO.put("summaryResult", reservationSummaryVOList);
        return resultMapVO;
    }

//    public ResultMapVO getReservationSummary(ReservationSummaryCriteriaVO criteriaVO) {
//        ResultMapVO resultMapVO = new ResultMapVO();
//
//        //로그인 유저의 부서 코드로 agency Code 세팅
//        String agencyCode = getAgencyCode();
////        if(agencyCode == null){
////            resultMapVO.put("message", "Agency Code null");
////            return resultMapVO;
////        }
//
//        IbsSoapProperty property = new IbsSoapProperty("TEST");
//        property.setUsername("jinair");
//        property.setPassword("jinatiflyapi");
//
//
//        BookingChannelKeyType bookingChannelKeyType = new BookingChannelKeyType();
//        bookingChannelKeyType.setChannel(Constants.IBS_CHANNEL.CHANNEL);
//        bookingChannelKeyType.setChannelType(Constants.IBS_CHANNEL.CHANNEL_TYPE);
//        bookingChannelKeyType.setLocale(Constants.IBS_CHANNEL.LOCALE);
//
//
//        RetrieveReservationSummaryRQ req = new RetrieveReservationSummaryRQ();
//
//        req.setFlightStartDate(DateUtils.xmlGregorianCalendar(criteriaVO.getDepStartDate(),"yyyy-MM-dd"));
//        req.setFlightEndDate( DateUtils.xmlGregorianCalendar(criteriaVO.getDepEndDate(),"yyyy-MM-dd"));
//        req.setAirlineCode(airlineCode);
//        req.setBoardPoint(criteriaVO.getStnfrCode());
//        req.setOffPoint(criteriaVO.getStntoCode());
//        req.setAgencyCode(agencyCode);
//
//        req.setPnrType(PNRType.NORMAL);
//        req.setBookingChannel(bookingChannelKeyType);
//        req.setActivePnrNumber(100);
//        req.setPastPnrNumber(100);
//        req.setIsUnFlownPassengersOnly(false);
//        req.setIsCancelledRequired(true);
//
//        RetrieveReservationSummaryRS retrieveReservationSummaryRS = retrieveReservationSummaryRequest.request(req, property);
//        String errors = errors(retrieveReservationSummaryRS);
//        if (StringUtils.isNotBlank(errors)) {
//            LoggerUtils.e(LOGGER, "CrewBookingAPI#RetrieveReservationSummary.request: errorCode={}", errors);
//            resultMapVO.put("Error", errors);
//            return resultMapVO;
//        }
//
//        String isFltData = null;
//
//        List<ReservationSummaryVO> reservationSummaryVOList = new ArrayList<>();
//        List<PnrSummary> summaries = new ArrayList<>();
//
//        // 지난 예약 포함
//        summaries.addAll(retrieveReservationSummaryRS.getPnrSummary());
//        summaries.addAll(retrieveReservationSummaryRS.getPnrSummaryPast());
//
//        for (var pnrSummary : summaries) {
//            ReservationSummaryVO reservationSummaryVO = new ReservationSummaryVO();
//            int paxCnt = pnrSummary.getPnrGuestSummaryDetails().size();
//            String pnrStatus = pnrSummary.getPnrStatus();
//
//            //segmentStatus, fareClass, paxCount 조회 조건 필터링
//            for (var fltSegment : pnrSummary.getFlightSegmentSummaryDetails()) {
//                isFltData = "Y";
//                String critSegStatus = criteriaVO.getSegmentStatus();
//                String critFareClass = criteriaVO.getFareClass();
//                String critPaxCnt = criteriaVO.getPaxCount();
//
//                String fltSegFareClass = null;
//                String rsFareClass = fltSegment.getFareBasis();
//                if(StringUtils.isNotBlank(rsFareClass)) {
//                    boolean fromKorea = IBSDomainUtils.isDomestic(criteriaVO.getStnfrCode(), criteriaVO.getStntoCode());
//                    if (fromKorea)
//                        fltSegFareClass = rsFareClass.substring(0, 2);
//                    else
//                        fltSegFareClass = StringUtils.equals(rsFareClass, "CID00C1") ? "C" : "U3";
//
//
//                    if (null != critSegStatus && !critSegStatus.isEmpty()) {
//                        if (!StringUtils.equals(fltSegment.getSegmentStatus(), critSegStatus)) {
//                            isFltData = "N";
//                            continue;
//                        }
//                    }
//                    if (null != critFareClass && !critFareClass.isEmpty()) {
//                        if (!StringUtils.equals(fltSegFareClass, critFareClass)) {
//                            isFltData = "N";
//                            continue;
//                        }
//                    }
//                    if (null != critPaxCnt && !critPaxCnt.isEmpty()) {
//                        if (paxCnt != Integer.parseInt(critPaxCnt)) {
//                            isFltData = "N";
//                            continue;
//                        }
//                    }
//                }
//                reservationSummaryVO.setPNRNumber(pnrSummary.getPnrNumber());
//                reservationSummaryVO.setFltnum(fltSegment.getAirlineCode()+ fltSegment.getFlightNumber());
//
//                String depTime = DateUtils.string(fltSegment.getFlightDate(), "dd-MMM-yyyy", "yyyy-MM-dd(E)");
//
//                reservationSummaryVO.setDepDate(depTime);
//                reservationSummaryVO.setStnfrCode(fltSegment.getBoardPoint());
//                reservationSummaryVO.setStntoCode(fltSegment.getOffPoint());
//
//                XMLGregorianCalendar depDateUtc = fltSegment.getScheduledDepartureDateTime();
//                XMLGregorianCalendar arrDateUtc = fltSegment.getScheduledArrivalDateTime();
//
//                String depDateTime = depDateUtc.getHour() + ":" + String.format("%02d", depDateUtc.getMinute());
//                String arrDateTime = arrDateUtc.getHour() + ":" + String.format("%02d",arrDateUtc.getMinute());
//
//                reservationSummaryVO.setDepartureDateTime(depDateTime);
//
//                reservationSummaryVO.setArrivalDateTime(arrDateTime);
//                reservationSummaryVO.setFareClass(fltSegFareClass);
//                reservationSummaryVO.setSegmentStatus(fltSegment.getSegmentStatus());
//                reservationSummaryVO.setPnrStatus(pnrStatus);
//            }
//            if ("Y".equals(isFltData)) {
//                reservationSummaryVO.setPaxCount(paxCnt);
//                reservationSummaryVOList.add(reservationSummaryVO);
//            }
//        }
//        reservationSummaryVOList.sort(Comparator.comparing(ReservationSummaryVO::getDepDate));
//
//        resultMapVO.put("summaryResult", reservationSummaryVOList);
//        return resultMapVO;
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

    public List<CrewPNRExcelGumVO> readGumExcelFile(MultipartFile file) {
        List<CrewPNRExcelGumVO> dataList = new ArrayList<>();

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
                CrewPNRExcelGumVO crewPNRExcelGUMVO = new CrewPNRExcelGumVO();
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
                        case 0: // groupSeq
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "groupSeq";
                            } else {
                                crewPNRExcelGUMVO.setGroupSeq(Integer.parseInt(cellValue));
                            }
                            break;
                        case 1: // fltNumber
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "fltNumber";
                            } else {
                                crewPNRExcelGUMVO.setFltNumber(cellValue);
                            }
                            break;
                        case 2: // boardPoint
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "boardPoint";
                            } else {
                                crewPNRExcelGUMVO.setBoardPoint(cellValue);
                            }
                            break;
                        case 3: // offPoint
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "offPoint";
                            } else {
                                crewPNRExcelGUMVO.setOffPoint(cellValue);
                            }
                            break;
                        case 4: // flightDate
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "flightDate";
                            } else {
                                crewPNRExcelGUMVO.setFlightDate(cellValue);
                            }
                            break;
                        case 5: // fareClass
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "fareClass";
                            } else {
                                crewPNRExcelGUMVO.setFareClass(cellValue);
                            }
                            break;
                        case 6: // givenName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "givenName";
                            } else {
                                crewPNRExcelGUMVO.setGivenName(cellValue);
                            }
                            break;
                        case 7: // surName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "surName";
                            } else {
                                crewPNRExcelGUMVO.setSurName(cellValue);
                            }
                            break;
                        case 8: // middleName
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "middleName";
                            } else {
                                crewPNRExcelGUMVO.setMiddleName(cellValue);
                            }
                            break;
                        case 9: // namePrefix
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "namePrefix";
                            } else {
                                crewPNRExcelGUMVO.setNamePrefix(cellValue);
                            }
                            break;
                        case 10: // gender
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "gender";
                            } else {
                                crewPNRExcelGUMVO.setGender(cellValue);
                            }
                            break;
                        case 11: // emailAddress
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "emailAddress";
                            } else {
                                crewPNRExcelGUMVO.setEmailAddress(cellValue);
                            }
                            break;
                        case 12: // cellNumber
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "cellNumber";
                            } else {
                                crewPNRExcelGUMVO.setCellNumber(cellValue);
                            }
                            break;
                        default:
                            break;
                    }
                    if (!emptyFields.equals("")) {
                        crewPNRExcelGUMVO.setResult("N");
                        crewPNRExcelGUMVO.setResultMsg(i + "행 " + emptyFields + " null" );
//                        dataList.add(crewPNRExcelGUMVO);
//                        return dataList;
                    }
                }

                dataList.add(crewPNRExcelGUMVO);

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

        FlightSegmentDetailsType flightSegment = retrieveBookingRS.getItinerary().get(0).getFlightSegmentDetails().get(0);
        Long oldSegmentId = Long.parseLong(flightSegment.getSegmentId());
        PnrActionType action = null;
        if(ReservationStatusDetailsType.TIME_CHANGE.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_TC;
        } else if(ReservationStatusDetailsType.SCHEDULE_CHANGE.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_SC;
        } else if(ReservationStatusDetailsType.WAITLISTED.equals(flightSegment.getSegmentStatus())) {
            action = PnrActionType.ACCEPT_WL;
        }

        ItineraryChangeType itineraryChange = new ItineraryChangeType();
        SegmentChangeType segmentChange = new SegmentChangeType();
        segmentChange.setPnrActionType(action);
        segmentChange.getOldSegmentId().add(oldSegmentId);
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
            ResultMapVO result = new ResultMapVO();
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", errors);
            result.put("Error", errors);
            return result;
        }

        return ResultMapVO.simpleResult("message", "SUCCESS");
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
            ResultMapVO result = new ResultMapVO();
            LoggerUtils.e(LOGGER, "CrewBookingAPI#rejectSchedule.request: errorCode={}", errors);
            result.put("Error", errors);
            return result;
        }

        return ResultMapVO.simpleResult("message", "SUCCESS");
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
            ResultMapVO result = new ResultMapVO();
            LoggerUtils.e(LOGGER, "CrewBookingAPI#acceptSchedule.request: errorCode={}", errors);
            result.put("Error", errors);
            return result;
        }

        return ResultMapVO.simpleResult("message", "SUCCESS");
    }

    public String getAgencyCode(){
//        UserInfoVO loginUser = PrincipalUtils.user();
//        CodeInfoVO codeInfoVO = null;
//        String agencyCode = null;
//
//        codeInfoVO = codeHandler.getCodeInfo("CMM209", loginUser.getDepartment());
//
//        if(codeInfoVO != null){
//            agencyCode = codeInfoVO.getAddInfo1();
//        }
        return "20024620";
    }
}
