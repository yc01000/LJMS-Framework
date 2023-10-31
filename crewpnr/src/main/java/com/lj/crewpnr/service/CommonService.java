package com.lj.crewpnr.service;

import com.lj.crewpnr.vo.excel.CrewPNRExcelVO;
import com.lj.crewpnr.vo.excel.PaxInfoVO;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CommonService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookingService.class);

    public List<CrewPNRExcelVO> readExcelFile(MultipartFile file, String fileType){
        CrewPNRExcelVO crewPNRExcelVO = new CrewPNRExcelVO();
        List<CrewPNRExcelVO> crewPNRExcelList = new ArrayList<>();

        //엑셀파일 읽기(일반/괌 분기)
        if(StringUtils.equals(fileType,"CMM")){
            List<CrewPNRExcelVO> crewPNRExcelTempList = this.readCmmExcelFile(file);

            List<PaxInfoVO> paxInfoList = new ArrayList<>();
            PaxInfoVO paxInfoVO = new PaxInfoVO();

            for (CrewPNRExcelVO crewVO : crewPNRExcelTempList) {
                crewPNRExcelVO.setFltNumber(crewVO.getFltNumber());
                crewPNRExcelVO.setBoardPoint(crewVO.getBoardPoint());
                crewPNRExcelVO.setOffPoint(crewVO.getOffPoint());
                crewPNRExcelVO.setFlightDate(crewVO.getFlightDate());
                crewPNRExcelVO.setFareClass(crewVO.getFareClass());

                for (int i = 0; i < crewVO.getPaxCount(); i++) {
                    paxInfoVO.setMiddleName(crewVO.getMiddleName());
                    paxInfoVO.setGivenName(crewVO.getGivenName());
                    paxInfoVO.setSurName(crewVO.getSurName());
                    paxInfoVO.setNamePrefix(crewVO.getNamePrefix());
                    paxInfoVO.setGender("M");
                    paxInfoList.add(paxInfoVO);
                }
                crewPNRExcelVO.setPaxinfoList(paxInfoList);
                crewPNRExcelList.add(crewPNRExcelVO);
            }
        }
        else{ //괌
            List<CrewPNRExcelVO> crewPNRExcelGumTempList = this.readGumExcelFile(file);

            //엑셀에서 읽은 데이터를 crewPNRExcelGumTempList에 담고 그 중 같은 groupSeq 별로 승객 묶어서 crewPNRExcelGumList 에 add
            List<PaxInfoVO> gumPaxInfoList = new ArrayList<>();

            int gumListCnt = crewPNRExcelGumTempList.size();
            int previousSeq = crewPNRExcelGumTempList.get(0).getGroupSeq();
            for (int i = 0; i < gumListCnt; i++) {
                PaxInfoVO paxInfoVO = new PaxInfoVO();

                //groupSeq 가 이전과 다를 경우, 새로운 groupSeq 로 간주하여 이전 데이터를 List에 담고 초기화
                if (previousSeq != crewPNRExcelGumTempList.get(i).getGroupSeq()) {

                    crewPNRExcelVO.setPaxinfoList(gumPaxInfoList);
                    crewPNRExcelList.add(crewPNRExcelVO);

                    crewPNRExcelVO = new CrewPNRExcelVO();
                    gumPaxInfoList = new ArrayList<>();
                }

                previousSeq = crewPNRExcelGumTempList.get(i).getGroupSeq();
                crewPNRExcelVO.setGroupSeq(crewPNRExcelGumTempList.get(i).getGroupSeq());
                crewPNRExcelVO.setFltNumber(crewPNRExcelGumTempList.get(i).getFltNumber());
                crewPNRExcelVO.setBoardPoint(crewPNRExcelGumTempList.get(i).getBoardPoint());
                crewPNRExcelVO.setOffPoint(crewPNRExcelGumTempList.get(i).getOffPoint());
                crewPNRExcelVO.setFlightDate(crewPNRExcelGumTempList.get(i).getFlightDate());
                crewPNRExcelVO.setFareClass(crewPNRExcelGumTempList.get(i).getFareClass());

                paxInfoVO.setMiddleName(crewPNRExcelGumTempList.get(i).getMiddleName());
                paxInfoVO.setGivenName(crewPNRExcelGumTempList.get(i).getGivenName());
                paxInfoVO.setSurName(crewPNRExcelGumTempList.get(i).getSurName());
                paxInfoVO.setNamePrefix(crewPNRExcelGumTempList.get(i).getNamePrefix());
                paxInfoVO.setGender(crewPNRExcelGumTempList.get(i).getGender());
                gumPaxInfoList.add(paxInfoVO);

                //마지막 index 일 경우 add 하고 종료
                if (i == gumListCnt - 1) {
                    crewPNRExcelVO.setPaxinfoList(gumPaxInfoList);
                    crewPNRExcelList.add(crewPNRExcelVO);
                }
            }
        }
        return crewPNRExcelList;
    }

    public List<CrewPNRExcelVO> readCmmExcelFile(MultipartFile file) {
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
                        case 7: // namePrefix
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "namePrefix";
                            } else {
                                crewPNRExcelVO.setNamePrefix(cellValue);
                            }
                            break;
                        case 8: // paxCount
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "paxCount";
                            } else {
                                crewPNRExcelVO.setPaxCount(Integer.parseInt(cellValue));
                            }
                            break;
                        case 9: // emailAddress
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "emailAddress";
                            } else {
                                crewPNRExcelVO.setEmailAddress(cellValue);
                            }
                            break;
                        case 10: // cellNumber
                            if (StringUtils.isBlank(cellValue)) {
                                emptyFields += "cellNumber";
                            } else {
                                crewPNRExcelVO.setCellNumber(cellValue);
                            }
                            break;
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

    public List<CrewPNRExcelVO> readGumExcelFile(MultipartFile file) {
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
                CrewPNRExcelVO crewPNRExcelGUMVO = new CrewPNRExcelVO();
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
}