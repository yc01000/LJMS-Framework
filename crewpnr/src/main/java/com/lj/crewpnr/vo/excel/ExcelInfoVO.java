package com.lj.crewpnr.vo.excel;

import java.util.List;

public class ExcelInfoVO {
    private String fileName;
    private String sheetName;
    private List<String> headerNames;
    private List<String> fieldNames;

    private String	exceptFields;
    private List<String> exceptFieldList;
    private List<Object>	rowData;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public List<String> getHeaderNames() {
        return headerNames;
    }

    public void setHeaderNames(List<String> headerNames) {
        this.headerNames = headerNames;
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String getExceptFields() {
        return exceptFields;
    }

    public void setExceptFields(String exceptFields) {
        this.exceptFields = exceptFields;
    }

    public List<String> getExceptFieldList() {
        return exceptFieldList;
    }

    public void setExceptFieldList(List<String> exceptFieldList) {
        this.exceptFieldList = exceptFieldList;
    }

    public List<Object> getRowData() {
        return rowData;
    }

    public void setRowData(List<Object> rowData) {
        this.rowData = rowData;
    }
}
