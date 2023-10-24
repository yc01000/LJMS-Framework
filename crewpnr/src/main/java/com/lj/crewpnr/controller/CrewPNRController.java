package com.lj.crewpnr.controller;

import com.lj.core.integration.soap.ibs.api.booking.GetAirAvailability;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.mapper.pssdb.CrewBookingMapper;
import com.lj.crewpnr.service.CrewBookingService;
import com.lj.crewpnr.vo.*;
import com.lj.crewpnr.vo.booking.ReservationSummaryCriteriaVO;
import com.lj.crewpnr.vo.booking.ReservationSummaryVO;
import com.lj.crewpnr.vo.booking.RetrieveChangeGateVO;
//import com.lj.crewpnr.vo.excel.CreateListExcel;
import com.lj.crewpnr.vo.excel.ExcelInfoVO;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CrewPNRController {
    @Autowired
    private CrewBookingService crewBookingService;
    @Autowired
    private CrewBookingMapper crewBookingMapper;
    @Resource(name="GetAirAvailability")
    private GetAirAvailability airAvailability;

    @RequestMapping("/crew/createBookings")
    public String createBookings(@RequestParam("file") MultipartFile file) throws Exception {
        ResultMapVO resultMapVO = crewBookingService.createBookingsAsync(file);
//        ResultMapVO resultMapVO = crewBookingService.createBookings(file);
        return WebUtils.toJson(resultMapVO);
    }

    @RequestMapping("/crew/createBookingsForGum")
    public String createBookingsForGUM(@RequestParam("file") MultipartFile file) throws Exception {
        ResultMapVO resultMapVO = crewBookingService.createBookingsForGumAsync(file);
        //ResultMapVO resultMapVO = crewBookingService.createBookingsForGum(file);
        return WebUtils.toJson(resultMapVO);
    }

    @RequestMapping("/crew/getReservationSummary")
    public String getReservationSummary(@RequestBody ReservationSummaryCriteriaVO criteriaVO) throws Exception {
//        criteriaVO.setDepStartDate("2023-09-05");
//        criteriaVO.setDepEndDate("2023-09-27");
//        criteriaVO.setStnfrCode("GMP");
//        criteriaVO.setStntoCode("CJU");
        ResultMapVO reservationSummaryList = crewBookingService.getReservationSummary(criteriaVO);
        return WebUtils.toJson(reservationSummaryList);
    }

    @RequestMapping("/crew/retrieveBooking")
    public String retrieveBooking(String pnrNumber) throws Exception {
        ResultMapVO result = crewBookingService.retrieveBooking(pnrNumber);
        return WebUtils.toJson(result);
    }


    @RequestMapping("/crew/cancelReservation")
    public String cancelReservation(String pnrNumber) throws Exception {
        ResultMapVO result = crewBookingService.cancelReservation(pnrNumber);
        return WebUtils.toJson(result);
    }

    @RequestMapping("/crew/splitPnr")
    public String splitPnr(@RequestBody RetrieveChangeGateVO retrieveChangeGateVO) throws Exception {
        ResultMapVO result = crewBookingService.splitPnr(retrieveChangeGateVO);
        return WebUtils.toJson(result);
    }
    @RequestMapping("/crew/getCreateBookingFailLog")
    public String getCreatePNRHistory(@RequestBody CrewPNRLogCriteriaVO criteriaVO) throws Exception {

//        criteriaVO.setStnfrCode("GMP");
//        criteriaVO.setStntoCode("CJU");
//        criteriaVO.setBrdStrtDt("20230904");
//        criteriaVO.setBrdEndDt("20230904");
//        criteriaVO.setFareClass("U1");
//        criteriaVO.setPaxCount(5);

        return WebUtils.toJson(crewBookingMapper.getCreateBookingFailLog(criteriaVO));
    }

    @RequestMapping("/crew/getSummaryListExcel")
    public void retrieveSummaryListExcelDown(HttpServletRequest request, HttpServletResponse response, @RequestBody ReservationSummaryCriteriaVO criteriaVO) throws Exception{

        //Workbook workbook = new XSSFWorkbook();
//        criteriaVO.setDepStartDate("2023-09-05");
//        criteriaVO.setDepEndDate("2023-09-27");
//        criteriaVO.setStnfrCode("GMP");
//        criteriaVO.setStntoCode("CJU");

        ExcelInfoVO excelInfoVO = new ExcelInfoVO();
        String nowDateStr = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss"));
        String fileName = "retrieveSummaryList_" + nowDateStr;

        ResultMapVO summaryResult = crewBookingService.getReservationSummary(criteriaVO);
        List<ReservationSummaryVO> summaryList = summaryResult.get("summaryResult", List.class);
        List<String> headerNames = new ArrayList<>();
        headerNames.add("No");
        headerNames.add("항공편");
        headerNames.add("출발일자");
        headerNames.add("출발지");
        headerNames.add("도착지");
        headerNames.add("출발시간");
        headerNames.add("도착시간");
        headerNames.add("Class");
        headerNames.add("좌석수");
        headerNames.add("PNR");
        headerNames.add("SEGMENT STS");
//        headerNames.add("예약상태");
        excelInfoVO.setHeaderNames(headerNames);


        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8")+".xlsx");

        ByteArrayInputStream stream = createListToExcel(headerNames, summaryList);
        IOUtils.copy(stream, response.getOutputStream());
    }

    public static ByteArrayInputStream createListToExcel(List<String> excelHeader, List<ReservationSummaryVO> summaryList) throws Exception{
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row row;
        Cell cell;
        int rowNo = 0;

        int headerSize = excelHeader.size();

        // 테이블 헤더 스타일 설정
        CellStyle headStyle = workbook.createCellStyle();
        // 경계선 설정
        headStyle.setBorderTop(BorderStyle.THIN);
        headStyle.setBorderBottom(BorderStyle.THIN);
        headStyle.setBorderLeft(BorderStyle.THIN);
        headStyle.setBorderRight(BorderStyle.THIN);
        // 색상
        headStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.YELLOW.getIndex());
        headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        // 헤더 가운데 정렬
        headStyle.setAlignment(HorizontalAlignment.CENTER);

        // 헤더 생성
        row = sheet.createRow(rowNo++);
        for (int i = 0; i < headerSize; i++) {
            cell = row.createCell(i);
            cell.setCellStyle(headStyle);
            cell.setCellValue(excelHeader.get(i));
        }

        // 내용 생성
        for (int j = 0; j < summaryList.size(); j++) {
            Row dataRow = sheet.createRow(j + 1);
            dataRow.createCell(0).setCellValue(j+1);
            dataRow.createCell(1).setCellValue(summaryList.get(j).getFltnum());
            dataRow.createCell(2).setCellValue(summaryList.get(j).getDepDate());
            dataRow.createCell(3).setCellValue(summaryList.get(j).getStnfrCode());
            dataRow.createCell(4).setCellValue(summaryList.get(j).getStntoCode());
            dataRow.createCell(5).setCellValue(summaryList.get(j).getDepartureDateTime());
            dataRow.createCell(6).setCellValue(summaryList.get(j).getArrivalDateTime());
            dataRow.createCell(7).setCellValue(summaryList.get(j).getFareClass());
            dataRow.createCell(8).setCellValue(summaryList.get(j).getPaxCount());
            dataRow.createCell(9).setCellValue(summaryList.get(j).getPNRNumber());
            dataRow.createCell(10).setCellValue(summaryList.get(j).getSegmentStatus());
        }

        // Making size of column auto resize to fit with data
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);
        sheet.autoSizeColumn(3);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        workbook.write(outputStream);
        return new ByteArrayInputStream(outputStream.toByteArray());
    }

    @RequestMapping("/crew/acceptSchedule")
    public String acceptSchedule(@RequestBody RetrieveChangeGateVO gate) throws Exception {
        return WebUtils.toJson(crewBookingService.acceptSchedule(gate.getPnrNumber()));
    }

    @RequestMapping("/crew/rejectSchedule")
    public String rejectSchedule(@RequestBody RetrieveChangeGateVO gate) throws Exception {
        return WebUtils.toJson(crewBookingService.rejectSchedule(gate.getPnrNumber()));
    }

    @RequestMapping("/crew/acceptWaitlisted")
    public String acceptWaitlisted(@RequestBody RetrieveChangeGateVO gate) throws Exception {
        return WebUtils.toJson(crewBookingService.acceptWaitlisted(gate.getPnrNumber()));
    }
}
