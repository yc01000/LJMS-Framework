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
        searchMvtSkd();
    });
    // 정렬 direction 변경시 호출
    $('.selectsortdir').on('change', function () {
        $('.hsortdir').val($(this).val());
        searchMvtSkd();
    });

    // 테이블 마우스 hover 이벤트
    $('.table_style.typeA tr').each(function () {
        $(this).on('mouseenter focusin', function () {
            $(this).find('td').css({
                'text-decoration': 'underline',
                'color': '#661e43',
                'cursor': 'pointer'
            });
        }).on('mouseleave focusout', function () {
            $(this).find('td').css({
                'text-decoration': 'none',
                'color': '#000',
                'cursor': 'default'
            });
        });
    });
    // 페이징 get 방식을 post 
    $('.paginate a').addClass("post");
    // 페이징 get 방식을 post 
    $("a.post").click(function (e) {
        e.stopPropagation();
        e.preventDefault();
        var href = this.href;
        var parts = href.split('?');
        var url = parts[0];
        var params = parts[1].split('&');
        var pp, inputs = '';
        for (var i = 0, n = params.length; i < n; i++) {
            pp = params[i].split('=');
            inputs += '<input type="hidden" name="' + pp[0] + '" value="' + pp[1] + '" />';
        }
        inputs += '<input type="hidden" name="SortField" value="' + $('#qModel_SortField').val() + '" />';
        inputs += '<input type="hidden" name="SortDirection" value="' + $('#qModel_SortDirection').val() + '" />';
        $("body").append('<form action="' + url + '" method="post" id="poster">' + inputs + '</form>');
        $("#poster").submit();
    });
});
// not null 체크
function isNotNull(str) {
    if (str != null && str != "" && str != "null")
        return true;
    else
        return false;
}
// null 체크
function isNull(str) {
    return !isNotNull(str);
}
// 테이블 row 클릭시 호출되는 이벤트
function callPopup(param) {

    var mvtSkdWrite = $('#mvtSkdWrite').val();
    if (mvtSkdWrite == 'False' || mvtSkdWrite == 'false') {
        alert('MVT 수정/삭제 권한이 없습니다. 관리자에게 문의하세요.');
        return;
    }
    var popupType = "";
    var urlParams = "";
    var alertMsg = "해당 편은 운항이 종료되지 않았습니다.";
    if (param.ACTNID != "CNL" && isNotNull(param.ACTNID)) {

        if (isNotNull(param.DEP_STS) && (param.DEP_STS == 'SCH' || param.DEP_STS == 'EST')) {
            //출발 전
            popupType = "alert";
            alertMsg = "해당 편은 아직 출발하지 않았습니다.";
        }
        else if (isNotNull(param.DEP_STS) && param.DEP_STS == 'ACT' && isNotNull(param.TKOF_T) && isNull(param.LAND_T)) {
            //이륙 후
            popupType = "alert";
            alertMsg = "해당 편은 운항이 종료되지 않았습니다.";
        }
        else if (isNotNull(param.DEP_STS) && param.DEP_STS == 'ACT' && isNotNull(param.TKOF_T) && isNotNull(param.LAND_T) && isNotNull(param.ARV_STS) && param.ARV_STS == 'EST') {
            //착륙 후
            popupType = "alert";
            alertMsg = "해당 편은 운항이 종료되지 않았습니다.";
        }
        else if (isNotNull(param.ACT_DEP_DT) && isNotNull(param.TKOF_T) && isNotNull(param.LAND_T) && isNotNull(param.ACT_ARV_DT)) {
            popupType = "modify";
            urlParams = generateParams(param);
        }
        else if (isNotNull(param.DEP_STS) && param.DEP_STS == 'ACT' && isNull(param.TKOF_T) && isNull(param.LAND_T) ) {
            popupType = "delete";
            urlParams = generateParams(param);
        }
        else if (isNotNull(param.ACT_DEP_DT) && isNotNull(param.TKOF_T) && isNull(param.LAND_T) && isNull(param.ACT_ARV_DT))
            popupType = "alert";
        else if (isNotNull(param.ACT_DEP_DT) && isNotNull(param.TKOF_T) && isNotNull(param.LAND_T) && isNull(param.ACT_ARV_DT))
            popupType = "alert";
    }
    else if (param.ACTNID == "CNL") {
        popupType = "alert";
        alertMsg = "해당 편은 결항 처리 되었습니다.";
    }
    
    if (popupType == "modify")
        showPopupLayer('/MVT/MVTModify?' + urlParams);
    else if (popupType == "delete")
        showPopupLayer('/MVT/RampOutDelete?' + urlParams);
    else if (popupType == "alert")
        showPopupLayer('/Popup/Alert?content=' + escape(alertMsg) + '&returnScript=hidePopupLayer()');
}
// 수정/삭제 팝업의 파라미터 생성
function generateParams(param) {
    var urlParams = "";
    urlParams += ("depDate=" + param.FIRST_LEG_FLT_DT);
    urlParams += ("&flt=" + param.FLT_NUM);
    urlParams += ("&reg=" + param.REGNO);
    urlParams += ("&dep=" + param.STNFR);
    urlParams += ("&arr=" + param.STNTO);
    urlParams += ("&std=" + param.SCH_DEP_DT);
    urlParams += ("&sta=" + param.SCH_ARV_DT);
    urlParams += ("&atd=" + param.ACT_DEP_DT);
    urlParams += ("&ata=" + param.ACT_ARV_DT);
    urlParams += ("&toff=" + param.TKOF_T);
    urlParams += ("&tdown=" + param.LAND_T);
    urlParams += ("&eta=" + param.EST_ARV_DT);
    urlParams += ("&c1=" + param.DEL_RC1);
    urlParams += ("&r1=" + param.DEL_DUR1);
    urlParams += ("&c2=" + param.DEL_RC2);
    urlParams += ("&r2=" + param.DEL_DUR2);
    urlParams += ("&c3=" + param.DEL_RC3);
    urlParams += ("&r3=" + param.DEL_DUR3);
    return urlParams;
}
// 조회 버튼 클릭 이벤트
function searchMvtSkd() {
    if ($('#qModel_datefr').val() == "") {
        alert('필수 입력항목 : DEP DATE 를 입력하세요.');
        return;
    }
    if ($('#qModel_dateto').val() == "") {
        alert('필수 입력항목 : DEP DATE 를 입력하세요.');
        return;
    }

    $('#ajaxform').submit();
}
// 검색 목록 엑셀 다운로드
function fn_ExcelDown() {
    $("#frmExcelDownload #datefr").val($("#ajaxform #qModel_datefr").val());
    $("#frmExcelDownload #dateto").val($("#ajaxform #qModel_dateto").val());
    $("#frmExcelDownload #type").val($("#ajaxform #qModel_type").val());
    $("#frmExcelDownload #stnfr").val($("#ajaxform #qModel_stnfr").val());
    $("#frmExcelDownload #stnto").val($("#ajaxform #qModel_stnto").val());
    $("#frmExcelDownload #intdom").val($("#ajaxform #qModel_intdom").val());
    $("#frmExcelDownload #fltnum").val($("#ajaxform #qModel_fltnum").val());
    $("#frmExcelDownload #SortField").val($("#ajaxform #qModel_SortField").val());
    $("#frmExcelDownload #SortDirection").val($("#ajaxform #qModel_SortDirection").val());

    $("#frmExcelDownload").submit();
}
