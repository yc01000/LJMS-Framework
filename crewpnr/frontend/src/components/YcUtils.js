export const ycUtils = (function() {
    // attributey
    var userInfo = {};
    
    // private function ...
    return {
        init: function (obj) {
            this.userInfo = obj.userInfo;
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
            const year = dateString.substring(0, 4);
            const month = dateString.substring(4, 6);
            const day = dateString.substring(6, 8);
            return `${year}-${month}-${day}`;
        },
    }
})();

export const ycObject = {
    //예약조회시 엑셀다운로드로만 사용. status가 테이블에는 미표시나, items에서는 값이 있어야함.
    resTableHeaders: { 
        No: 'id',
        항공편: 'fltnum',
        출발일자: 'depDate',
        출발지: 'stnfrCode',
        도착지: 'stntoCode',
        출발시간: 'departureDateTime',
        도착시간: 'arrivalDateTime',
        Class: 'fareClass',
        좌석수: 'paxCount',
        예약상태: 'status',
        예약결과: 'statusDisplay',
        PNR: 'pnrnumber'
    },
    //예약실패 페이지에서 테이블과 엑셀에 사용.
    failTableHeaders: {
        생성일자: 'rgstDttm',
        출발일자: 'depDate',
        항공편: 'fltNum',
        출발지: 'stnfrCode',
        도착지: 'stntoCode',
        Class: 'fareClass',
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
        { value: "E", label: "Economy" },
        { value: "P", label: "Premium Economy" },
    ],  
     //검색조건 옵션
    paxCntOptions: [1, 2, 3, 4, 5, 6, 7, 8, 9], 
    // (CancelBookin)승객 부분취소 팝업이 필요없는 상태 들..
    isExcept: ['TIME_CHANGE', 'SCHEDULE_CHANGE', 'CANCELLED'], 
};
