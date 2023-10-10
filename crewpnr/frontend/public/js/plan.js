$(document).ready(function () {
    $(".search_form input").on("keyup", function (key) {
        if (key.keyCode == 13) {
            //  enter key 를 입력하면 form 의 data-ajax-update  값을 읽어서 replace 후 search함수 이름을 조합해 실행.
            var viewNm = $(".search_form").attr("data-ajax-update");
            viewNm = viewNm.replace('#dv', 'search');
            viewNm = viewNm.replace('List', '');
            var funcNm = viewNm;	//실행할 함수 문자열 
            if (typeof (window[funcNm]) == "function") {
                var execFunc = (new Function("return " + funcNm))();
                execFunc();
            } 
        }
    });

    $("#hiddenFile").change(function () {
        var filePath = $("#hiddenFile").val();
        if (filePath !== "") {
            var file = filePath.substring(filePath.lastIndexOf("\\")).replace("\\", "");
            var fileExtension = file.split(/[. ]+/).pop().toLowerCase();
            if (!(fileExtension === "xls" || fileExtension === "xlsx")) {
                alert("엑셀 파일이어야 합니다.");
                $("#hiddenFile").val("");
                return false;
            }
            var hiddenClearFnc = function () {
                console.log('hiddenClearFnc');
                var agent = navigator.userAgent.toLowerCase();
                if ((navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1)) {
                    // ie 일때 input[type=file] init.
                    $("#hiddenFile").replaceWith($("#hiddenFile").clone(true));
                } else {
                    //other browser 일때 input[type=file] init.
                    $("#hiddenFile").val("");
                }
            };
            var actionValue = $('#frmExcelUpload').attr('action');
            $("body").css("cursor", "progress");
            $.ajax({
                type: "POST",
                data: new FormData($('#frmExcelUpload')[0]),
                cache: false,
                contentType: false,
                processData: false,
                url: actionValue,
                success: function (data) {
                    $("#hiddenFile").val("");
                    if (data.Message == "") {
                        alert(data.Result + "건이 저장되었습니다.");
                        if (actionValue.includes("Payload"))
                            searchPayload();
                        else
                            searchCityPair();
                    }
                    else {
                        alert(data.Message + " \n " + data.Result + " \n 저장이 실패하였습니다. \n새로고침후 해당 업로드 파일을 다시한번 확인후 시도해 주세요.\n같은 문제가 계속 진행된다면 관리자에게 문의해 주세요");
                    }
                },
                error: function (xhr, status, error) {
                    console.log(xhr);
                    console.log(status);
                    console.log(error);
                    alert("저장이 실패하였습니다. \n새로고침후 해당 업로드 파일을 다시한번 확인후 시도해 주세요.\n같은 문제가 계속 진행된다면 관리자에게 문의해 주세요");
                },
                complete: function () {
                    hiddenClearFnc();
                    $("body").css("cursor", "default");
                }
            });
        }
        return false;
    });




    $("#hiddenCariOutFile").change(function () {
        var filePath = $("#hiddenCariOutFile").val();
        if (filePath !== "") {
            var file = filePath.substring(filePath.lastIndexOf("\\")).replace("\\", "");
            var fileExtension = file.split(/[. ]+/).pop().toLowerCase();
            if (!(fileExtension === "txt")) {
                alert("txt 파일이어야 합니다.");
                $("#hiddenCariOutFile").val("");
                return false;
            }
            var hiddenClearFnc = function () {
                console.log('hiddenClearFnc');
                var agent = navigator.userAgent.toLowerCase();
                if ((navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1)) {
                    // ie 일때 input[type=file] init.
                    $("#hiddenCariOutFile").replaceWith($("#hiddenCariOutFile").clone(true));
                } else {
                    //other browser 일때 input[type=file] init.
                    $("#hiddenCariOutFile").val("");
                }
            };
            var msgPrefix = "[STG] ";
            var actionValue = $('#frmCariOutUpload').attr('action');
            if ($("#hiddenIsPrd").val() == "Y") {
                msgPrefix = "[LIVE] ";
                actionValue = actionValue + "PRD";
            } 
            $("body").css("cursor", "progress");
            $.ajax({
                type: "POST",
                data: new FormData($('#frmCariOutUpload')[0]),
                cache: false,
                contentType: false,
                processData: false,
                url: actionValue,
                success: function (data) {
                    $("#hiddenCariOutFile").val("");
                    if (data.Message == "") {
                        if (data.Result == 0)
                            alert(msgPrefix+"중복 데이터가 존재하는지 확인하세요.");
                        else
                            alert(data.Result + "건이 저장되었습니다.");
                        //if (actionValue.includes("Payload"))
                        //    searchPayload();
                        //else
                        //    searchCityPair();
                    }
                    else {
                        alert( msgPrefix + data.Message + " \n " + data.Result + " \n 저장이 실패하였습니다. \n새로고침후 해당 업로드 파일을 다시한번 확인후 시도해 주세요.\n같은 문제가 계속 진행된다면 관리자에게 문의해 주세요");
                    }
                },
                error: function (xhr, status, error) {
                    console.log(xhr);
                    console.log(status);
                    console.log(error);
                    alert(msgPrefix + "저장이 실패하였습니다. \n새로고침후 해당 업로드 파일을 다시한번 확인후 시도해 주세요.\n같은 문제가 계속 진행된다면 관리자에게 문의해 주세요");
                },
                complete: function () {
                    hiddenClearFnc();
                    $("body").css("cursor", "default");
                }
            });
        }
        return false;
    });
});

///// [S] MultiMtow 
// 조회 버튼 클릭 이벤트
function searchMultiMtow(actyp) {
    if (actyp != "")
        $('#qModel_ACTYP option[value=' + actyp+']').attr('selected', 'selected');
    
    $('#ajaxform').submit();
}

function MergeMultiMtow(pSeq) {
    showPopupLayer('/Plan/MultiMtowMergePopup?seq='+pSeq);
}

// 정렬 클릭
function mtowListSortRule(obj, key, cond) {
    $('#qModel_SortField').val(key);
    $('#qModel_SortDirection').val(cond);
    searchMultiMtow("");
}

function DeleteMultiMtow() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    showPopupLayer('/Popup/Confirm2?content=' + escape("Suffix, City Pair 데이터도 함께 삭제됩니다.\n그래도 삭제하시겠습니까?") + '&returnScript=rtnDeleteMultiMtow()');
}
function rtnDeleteMultiMtow() {
    hidePopupLayer();
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });
    
    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteMultiMtowAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchMultiMtow("");
        }
    }); 
}

///// [E] MultiMtow 

///// [S] SOW
// 조회 버튼 클릭 이벤트
function searchSow(actyp) {
    if (actyp != "")
        $('#qModel_ACTYP option[value=' + actyp + ']').attr('selected', 'selected');

    $('#ajaxform').submit();
}

function MergeSow(pSeq) {
    showPopupLayer('/Plan/SowMergePopup?seq=' + pSeq);
}

// 정렬 클릭
function sowListSortRule(obj, key, cond) {
    $('#qModel_SortField').val(key);
    $('#qModel_SortDirection').val(cond);
    searchSow("");
}
// 삭제클릭
function DeleteSow() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    showPopupLayer('/Popup/Confirm2?content=' + escape("Suffix, City Pair 데이터도 함께 삭제됩니다.\n그래도 삭제하시겠습니까?") + '&returnScript=rtnDeleteSow()');
}
// 삭제 팝업 OK 클릭
function rtnDeleteSow() {
    hidePopupLayer();
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteSowAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchSow("");
        }
    });
}
///// [E] SOW

///// [S] SUFFIX
// 조회 버튼 클릭 이벤트
function searchSuffix(actyp) {
    if (actyp != "")
        $('#qModel_ACTYP option[value=' + actyp + ']').attr('selected', 'selected');

    $('#ajaxform').submit();
}

function MergeSuffix(pSeq) {
    showPopupLayer('/Plan/SuffixMergePopup?seq=' + pSeq);
}

// 정렬 클릭
function suffixListSortRule(obj, key, cond) {
    $('#qModel_SortField').val(key);
    $('#qModel_SortDirection').val(cond);
    searchSuffix("");
}

// 삭제클릭
function DeleteSuffix() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    rtnDeleteSuffix();
}
// 삭제 ajax 호출 
function rtnDeleteSuffix() {
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteSuffixAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchSuffix("");
        }
    });
}
///// [E] SUFFIX


///// [S] CityPair
// 조회 버튼 클릭 이벤트
function searchCityPair(actyp, dep, arr) {
    if (actyp != undefined && actyp != "")
        $('#qModel_ACTYP option[value=' + actyp + ']').attr('selected', 'selected');

    if (dep != undefined && dep != "")
        $('#qModel_DEP').val(dep);
    if (arr != undefined && arr != "")
        $('#qModel_ARR').val(arr);

    $('#ajaxform').submit();
}

function MergeCityPair(pSeq) {
    showPopupLayer('/Plan/CityPairMergePopup?seq=' + pSeq);
}

// 정렬 클릭
function cityPairListSortRule(obj, key, cond) {
    $('#qModel_SortField').val(key);
    $('#qModel_SortDirection').val(cond);
    searchCityPair("", "", "");
}


// 삭제클릭
function DeleteCityPair() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    rtnDeleteCityPair();
}
// 삭제 ajax 호출 
function rtnDeleteCityPair() {
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteCityPairAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchCityPair("", "", "");
        }
    });
}
// 엑셀 업로드
function ExcelUploadCityPair() {
    showPopupLayer('/Popup/Confirm2?content=' + escape("엑셀 파일 업로드시 기존에 등록된 City Pair 데이터가 모두 삭제후 업로드됩니다. 그래도 진행하시겠습니까?") + '&returnScript=rtnExcelUploadCityPair()');
}
// 엑셀 ajax 호출 
function rtnExcelUploadCityPair() {
    hidePopupLayer();
    $("#hiddenFile").click();
}

///// [E] CityPair

///// [S] Desk
// 조회 버튼 클릭 이벤트
function searchDesk() {
    location.reload();
}
function MergeDesk(pSeq) {
    showPopupLayer('/Plan/DeskMergePopup?seq=' + pSeq);
}

// 삭제클릭
function DeleteDesk() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    rtnDeleteDesk();
}
// 삭제 ajax 호출 
function rtnDeleteDesk() {
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteDeskAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchDesk();
        }
    });
}
///// [E] DESK

///// [S] payload
// 조회 버튼 클릭 이벤트
function searchPayload() {
    $('#ajaxform').submit();
}

function MergePayload(pSeq) {
    showPopupLayer('/Plan/PayloadMergePopup?seq=' + pSeq);
}

// 삭제클릭
function DeletePayload() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    rtnDeletePayload();
}
// 삭제 ajax 호출 
function rtnDeletePayload() {
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeletePayloadAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchPayload("");
        }
    });
}

// 엑셀 업로드
function ExcelUploadPayload() {
    showPopupLayer('/Popup/Confirm2?content=' + escape("엑셀 파일 업로드시 기존에 등록된 Payload 데이터가 모두 삭제후 업로드됩니다. 그래도 진행하시겠습니까?") + '&returnScript=rtnExcelUploadPayload()');
}
// 엑셀 ajax 호출 
function rtnExcelUploadPayload() {
    hidePopupLayer();
    $("#hiddenFile").click();
}

///// [E] payload


///// [S] REG SOW
// 조회 버튼 클릭 이벤트
function searchRegSow(actyp) {
    if (actyp != undefined && actyp != "")
        $('#qModel_ACTYP option[value=' + actyp + ']').attr('selected', 'selected');

    $('#ajaxform').submit();
}

function MergeRegSow(pSeq) {
    showPopupLayer('/Plan/RegSowMergePopup?seq=' + pSeq);
}

// 정렬 클릭
function regSowListSortRule(obj, key, cond) {
    $('#qModel_SortField').val(key);
    $('#qModel_SortDirection').val(cond);
    searchRegSow("");
}

// 삭제클릭
function DeleteRegSow() {
    if ($('.table_style input[type="checkbox"]:checked').length == 0) {
        alert('삭제할 데이터가 없습니다.');
        return;
    }
    rtnDeleteRegSow();
}
// 삭제 ajax 호출 
function rtnDeleteRegSow() {
    var selected = new Array();
    $('.table_style input[type="checkbox"]:checked').each(function () {
        selected.push($(this).attr('data-seq'));
    });

    $.ajax({
        dataType: "json",
        contentType: 'application/json',
        type: 'POST',
        url: '/Plan/DeleteRegSowAjax',
        data: JSON.stringify({ 'deleteList': selected }),
        success: function (data) {
            alert('정상 삭제되었습니다.');
        },
        failure: function (response) {
            alert('삭제 실패하였습니다. 다시 시도해주세요.');
        }, complete: function () {
            searchCityPair("", "", "");
        }
    });
}
// 엑셀 업로드
function ExcelUploadRegSow() {
    showPopupLayer('/Popup/Confirm2?content=' + escape("엑셀 파일 업로드시 기존에 등록된 기번별 SOW 데이터가 모두 삭제후 업로드됩니다. 그래도 진행하시겠습니까?") + '&returnScript=rtnExcelUploadRegSow()');
}
// 엑셀 ajax 호출 
function rtnExcelUploadRegSow() {
    hidePopupLayer();
    $("#hiddenFile").click();
}

///// [E] REG SOW


// CARU OUT 업로드
function CariOutUpload() {
    showPopupLayer('/Popup/Confirm2?content=' + escape("[STG] CARI-OUT을 업로드하시겠습니까?") + '&returnScript=rtnCariOutUpload(false)');
}
// CARU OUT 업로드
function CariOutUploadLive() {
    showPopupLayer('/Popup/Confirm2?content=' + escape("[LIVE] CARI-OUT을 라이브에 업로드하시겠습니까?") + '&returnScript=rtnCariOutUpload(true)');
}
// CARU OUT ajax 호출
function rtnCariOutUpload(isPrd) {
    hidePopupLayer();
    if (isPrd)
        $("#hiddenIsPrd").val("Y");
    else
        $("#hiddenIsPrd").val("N");

    $("#hiddenCariOutFile").click();
}


