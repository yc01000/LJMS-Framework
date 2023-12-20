import moment from "moment";

export const ycUtils = (function() {
    let cnt = 0;
    // private function ...
    return {
        printCount: function(plus){
            cnt += plus;
            console.log('ycUtil cnt', cnt);
        },
        fieldValidation: function (doc, fieldnames, callback) {
            let result = true;
            const elementsWithPrefix = doc.querySelectorAll(`[id^="${fieldnames}"]`);
            elementsWithPrefix.forEach(element => {
                if(element.value === ''){
                    result = false;
                    callback == null ? '': callback(element);//Invalid Field return fn(element)
                }
            });
            return result;
        },
        krFormatDate: function (dateString) {
            return moment(dateString).format('YYYY-MM-DD');
        },
        getDownloadExcelName: function(position, date1, date2, stn, flightNumber){
            const Date1 = moment(date1).format('YYYYMMDD');
            const Date2 = moment(date2).format('YYYYMMDD');
            if(flightNumber !== ''){
                stn = `${flightNumber}`;
            }
            return `${position}_${Date1}-${Date2}_${stn}.xls`;
        },
    }
})();

export const ycObject = {
    //예약조회시 엑셀다운로드로만 사용.
    resTableHeaders: { 
        No: 'id',
        항공편: 'fltnum',
        출발일자: 'depDate',    
        출발지: 'stnfrCode',
        도착지: 'stntoCode',
        출발시간: 'departureDateTime',
        도착시간: 'arrivalDateTime',
        'Fare Class': 'fareClass',
        좌석수: 'paxCount',
        PNR: 'pnrnumber',
        예약상태: 'statusDisplay',
    },
    //예약실패 페이지에서 테이블과 엑셀에 사용.
    failTableHeaders: {
        생성일자: 'rgstDttm',
        출발일자: 'depDate',
        항공편: 'fltNum',
        출발지: 'stnfrCode',
        도착지: 'stntoCode',
        'Fare Class': 'fareClass',
        좌석수: 'paxCnt',
        ErrorValue: 'errorValue',
    },
    // response 테이블에 표시될 상태 값
    statusLabels: [ 
        ["CONFIRMED", "완료"],
        ["WAITLISTED_HL", "대기(HL)"],
        ["WAITLISTED_KL", "대기(KL)"],
        ["NO_OP", "비운항"],
        ["SCHEDULE_CHANGE", "여정 변경"],
        ["TIME_CHANGE", "시간 변경"],
        ["CANCELLED", "취소"]
    ],
     //검색조건 옵션
    statusOptions: [
        { value: "CONFIRMED", label: "완료" },
        { value: "WAITLISTED", label: "대기" },
        { value: "NO_OP", label: "비운항" },
        { value: "SCHEDULE_CHANGE", label: "여정 변경" },
        { value: "TIME_CHANGE", label: "시간 변경" },
        { value: "CANCELLED", label: "취소" }
    ],
     //검색조건 옵션
    classOptions: [
        { value: "E", label: "Economy (U1, U3)" },
        { value: "P", label: "Premium Economy (U0, C)" },
    ],  
     //검색조건 옵션
    paxCntOptions: [1, 2, 3, 4, 5, 6, 7, 8, 9], 
    // (CancelBookin)승객 부분취소 팝업이 필요없는 상태 들..
    isExcept: ['TIME_CHANGE', 'SCHEDULE_CHANGE', 'CANCELLED'], 
};
