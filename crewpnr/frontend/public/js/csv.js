$(document).ready(function () {
    // input number만 입력받게 처리
    $('.inputnumber').on("input", function (e) {
        this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');
    });
    $('.inputPort').on("input", function (e) {
        this.value = this.value.replace(/[^a-zA-Z.]/g, '').replace(/(\..*)\./g, '$1');
    });

    // 정렬 field 변경시 호출
    $('.selectsortfield').on('change', function () {
        $('.hsortfield').val($(this).val());
        searchCsvSkd();
    });
    // 정렬 direction 변경시 호출
    $('.selectsortdir').on('change', function () {
        $('.hsortdir').val($(this).val());
        searchCsvSkd();
    });

});
// 조회 버튼 클릭 이벤트
function searchCsvSkd() {
    var validateMsg = isValidateQModel();
    if (validateMsg.length > 0) {
        alert(validateMsg);
        return;
    }
    $('#ajaxform').submit();
}
function isValidateQModel() {
    var rtnStr = "";
    if ($('#qModel_FROM_YYYYMMDD').val() == "") {
        rtnStr = '필수 입력항목 : FROM DATE 를 입력하세요.';
      
    }
    else if ($('#qModel_TO_YYYYMMDD').val() == "") {
        rtnStr = '필수 입력항목 : TO DATE 를 입력하세요.';
        
    }
    else if ($('#qModel_FROM_HHMI').val() == "") {
        rtnStr = '필수 입력항목 : FROM DATE TIME 를 입력하세요.';
    }
    else if ($('#qModel_TO_HHMI').val() == "") {
        rtnStr = '필수 입력항목 : TO DATE TIME 를 입력하세요.';
    }
    else if (!validateDate()) {
        rtnStr = '조회기간은 LOCAL TIME 기준 D-1 ~ D+2를 초과할 수 없습니다.';
        
    }
    return rtnStr;
}
// 검색 목록 엑셀 다운로드
function fn_ExcelDown() {
    var validateMsg = isValidateQModel();
    if (validateMsg.length > 0) {
        alert(validateMsg);
        return;
    }
    $("#frmExcelDownload #TIME_ZONE").val($("#ajaxform #qModel_TIME_ZONE").val());
    $("#frmExcelDownload #FROM_YYYYMMDD").val($("#ajaxform #qModel_FROM_YYYYMMDD").val());
    $("#frmExcelDownload #FROM_HHMI").val($("#ajaxform #qModel_FROM_HHMI").val());
    $("#frmExcelDownload #TO_YYYYMMDD").val($("#ajaxform #qModel_TO_YYYYMMDD").val());
    $("#frmExcelDownload #TO_HHMI").val($("#ajaxform #qModel_TO_HHMI").val());
    $("#frmExcelDownload #REGION_LEG").val($("#ajaxform #qModel_REGION_LEG").val());
    $("#frmExcelDownload #DEP").val($("#ajaxform #qModel_DEP").val());
    $("#frmExcelDownload #ARR").val($("#ajaxform #qModel_ARR").val());
    $("#frmExcelDownload #FLT_NO").val($("#ajaxform #qModel_FLT_NO").val());
    $("#frmExcelDownload #SortField").val($("#ajaxform #qModel_SortField").val());
    $("#frmExcelDownload #SortDirection").val($("#ajaxform #qModel_SortDirection").val());
    $("#frmExcelDownload").submit();
}
function validateDate() {
    var now = new Date();

    var year = now.getFullYear();
    var month = ('0' + (now.getMonth() + 1)).slice(-2);
    var day = ('0' + now.getDate()).slice(-2);

    var today = new Date(year + '-' + month + '-' + day);
    var arrangeDayFrom = new Date(today.setDate(today.getDate() - 1));
    var arrangeDayTo = new Date(today.setDate(today.getDate() + 3));
    var fromDate = new Date($('#qModel_FROM_YYYYMMDD').val());
    var toDate = new Date($('#qModel_TO_YYYYMMDD').val());
    var bValidateDate = true;
    if (fromDate > toDate) {
        // to가 from 보다 작음
        bValidateDate = false;
    }
    else if (arrangeDayFrom > fromDate || arrangeDayTo < fromDate) {
        // 시작날짜 잘못됨.
        bValidateDate = false;
    }
    else if (arrangeDayFrom > toDate || arrangeDayTo < toDate) {
        // 종료날짜 잘못됨 잘못됨.
        bValidateDate = false;
    }

    return bValidateDate;
}