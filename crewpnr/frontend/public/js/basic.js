var	console	= window.console || {log:function(){}};
$(document).ready(function () {

	if (getCookie("mvtLeftMenu") == "Y") {
		$('.gnb_area_close').animate({ 'left': '-40px' }, 200);
		$('.gnb_area').animate({ 'left': '0' }, 200);
		$('body').addClass('m_fixed');
			setCookie("mvtLeftMenu", "Y", 1);
		$('.scr_h').width($(window).width() - 310);
	}
	// input number만 입력받게 처리
	$('.inputnumber').on("input", function (e) {
		this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');
	});
	$('.inputPort').on("input", function (e) {
		this.value = this.value.replace(/[^a-zA-Z.]/g, '').replace(/(\..*)\./g, '$1');
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
function setCookie(name, value, expiredays) {
	var todayDate = new Date();
	todayDate.setDate(todayDate.getDate() + expiredays);
	document.cookie = name + "=" + escape(value) + "; path=/; expires=" + todayDate.toGMTString() + ";"
}
function getCookie(name) {
	var nameOfCookie = name + "=";
	var x = 0;
	while (x <= document.cookie.length) {
		var y = (x + nameOfCookie.length);
		if (document.cookie.substring(x, y) == nameOfCookie) {
			if ((endOfCookie = document.cookie.indexOf(";", y)) == -1) endOfCookie = document.cookie.length;
			return unescape(document.cookie.substring(y, endOfCookie));
		}
		x = document.cookie.indexOf(" ", x) + 1;
		if (x == 0) break;
	}
	return "";
}


$(function () {
	$("body").append("<div class='bg_dim'></div><div id='ui_dialog'></div>");

	// popLayer 예외처리 (팝업 사이즈 - 가로 기준 1400px 이상인 경우)
	if ( $( '#popWrap' ).hasClass( 'popException' ) ) {
		$( '.popLayer', window.parent.document ).addClass( 'popLayerCatch' );
	}

	// 탭
	$('li[class^="tab_li"] a').click(function(){
		var target = $(this).attr('href');
		$(this).parent().siblings().removeClass('on');
		$(this).parent().addClass('on');
		$(this).parents('.tab_wrap').find('.tabcon').hide();
		$(this).parents('.tab02_wrap').find('.tabcon').hide();
		$(target).show();
		tbWidthChk ()
		setPopup(113, 1);//Tab click시 팝업 사이즈 조정 callcenter
		return false
	})

	//radio 버튼 탭
	$('.radio_tab input[type="radio"]').click(function(){
		var target = $(this).attr('data-target');
		$('.tab_wrap_radio').find('.tabcon').removeClass('on').hide();
		$(target).addClass('on').show();
		tbWidthChk ()
	})

	//radio 버튼 탭
	$('.radio_tab input[type="radio"]').click(function(){
		var target = $(this).attr('data-target');
		$('.tab_wrap_radio').find('.tabcon00').removeClass('on').hide();
		$(target).addClass('on').show();
		tbWidthChk ()
	})
	// $('.radio_tab input[type="radio"]').click(function(){
	// 	var target = $(this).attr('data-target');
	// 	$(this).parents('tr').siblings('.temp_cont').hide();
	// 	$(target).show();
	// })

	$('.utill li.l_open a').click(function(){
		if($(this).parent().hasClass('open')){
			$(this).parent().removeClass('open')
		}else{
			$(this).parent().addClass('open')
		}

	})

	//
	$('#popCont .click_G').click(function(){
		var target = $(this).attr('href');
		$('#popCont').find('.click').removeClass('on').hide();
		$(target).addClass('on').show();
		tbWidthChk ()
	})


	// datepicker
	/* 2018-08-29 수정 */
	$('.btn_calendar').each(function() {
		var $datepicker = $(this);
		if($datepicker.hasClass('month3')) {
			$datepicker.datepicker({
				dateFormat: "yy-mm-dd" ,
				showMonthAfterYear: true,
				dayNamesMin: ['Sun' , 'Mon', 'Tue' ,'Wed', 'Thu', 'Fri', 'Sat'],
				showButtonPanel: true,
				closeText: 'close',
				numberOfMonths: [3,1],
				beforeShow : function(){
					$('#ui-datepicker-div').addClass('month3')
				},
				onClose : function(){
				}
			});
		} else if($datepicker.hasClass('before')) {
			$datepicker.datepicker({
				dateFormat: "yy-mm-dd",
				maxDate: 0,
				showMonthAfterYear: true,
				changeYear: true,
				dayNamesMin: ['Sun' , 'Mon', 'Tue' ,'Wed', 'Thu', 'Fri', 'Sat'],
				showButtonPanel: true,
				closeText: 'close',
				yearRange: '-100:+0'
			});
		} else if($datepicker.hasClass('after')) {
			$datepicker.datepicker({
				dateFormat: "yy-mm-dd",
				minDate: 0,
				showMonthAfterYear: true,
				changeYear: true,
				dayNamesMin: ['Sun' , 'Mon', 'Tue' ,'Wed', 'Thu', 'Fri', 'Sat'],
				showButtonPanel: true,
				closeText: 'close',
				yearRange: '-0:+10'
			});
		} else {
			$datepicker.datepicker({
				dateFormat: "yy-mm-dd",
				showMonthAfterYear: true,
				changeYear: true,
				dayNamesMin: ['Sun' , 'Mon', 'Tue' ,'Wed', 'Thu', 'Fri', 'Sat'],
				showButtonPanel: true,
				closeText: 'close'
			});
		}
	});
	/* // 2018-08-29 수정 */

	// 마우스 오버시 레이어

	/*
	$('.m_code_box').hide();
	$('.code_tb').find('tr').click(function(){
		$('.m_code_box').fadeIn();
	})

	$('.tr_detail_view').hide();
	$('.code_tb').find('tr').click(function(){
		$('.tr_detail_view').fadeIn();
	})

    $('.more').on("click",function(){
		$('.cover').slideToggle("fast");
	})**/

	 $('.filter .more').click(function(){
		if($(this).parents('.filter').hasClass('show')){
			$(this).parents('.filter').removeClass('show')
			$('.cover').slideUp(100);
		}else{
			$(this).parents('.filter').addClass('show');
			$('.cover').slideDown(100);
		}
		return false
	})


$('.pageBtn').click(function(){
		$(this).siblings('.page_pop').show();
	})
	$('.clse').click(function(){
		$(this).parents('.page_pop').hide();
	})


	$('.Admin').mouseenter(function(){
		$(this).siblings('.admin_menu').show();
	})

	$('.m_menu').mouseleave(function(){
		$(this).find('.admin_menu').hide();
	})

	$('.po_lang').click(function(){
		$(this).children('.po_lang_select').show();
	})
	$('.po_lang').mouseleave(function(){
		$(this).children('.po_lang_select').hide();
	})

// gnb
	$('.open_nav').click(function(){
		$('.gnb_area_close').animate({'left' : '-40px'},200)
		$('.gnb_area').animate({'left' : '0'},200)
		return false
	})
	$('.gnb_area').mouseleave(function(){
		$('.gnb_area_close').animate({'left' : '0'},200)
		$('.gnb_area').animate({'left' : '-240px'},200)
		return false
	})
	$('.close_nav').click(function(){
		$('.gnb_area_close').animate({'left' : '0'},200)
		$('.gnb_area').animate({'left' : '-240px'},200)
		$('body').removeClass('m_fixed')
		$('.scr_h').width('auto')
		return false
	})
	$('.gnb_area .m').children('a').click(function(){
		if($(this).parent().hasClass('select')){
			$(this).parent().removeClass('select')
		}else{
			$(this).parent().siblings().removeClass('select')
			$(this).parent().addClass('select')
		}
		//return false
	})

	$('.gnb_area .mn').children('a').click(function(){
		if($(this).parent().hasClass('select')){
			$(this).parent().removeClass('select')
		}else{
			$(this).parent().siblings().removeClass('select')
			$(this).parent().addClass('select')
		}
		//return false
	})

	$('.gnb_area .pin').click(function(){
		if ($('body').hasClass('m_fixed')) {
			//해제
			$('body').removeClass('m_fixed')
			setCookie("mvtLeftMenu", "N", 1);
		} else {
			//고정
			$('body').addClass('m_fixed')
			setCookie("mvtLeftMenu", "Y", 1);
			$('.scr_h').width($(window).width() - 310)
		}
		tbWidthChk ()
	})
	tbWidthChk ()

	$('.template_tb tr').click(function(){
		if($(this).hasClass('on')){
			$(this).next('.view').hide()
			$(this).removeClass('on')
		}else{
			$(this).siblings('.view').hide()
			$(this).siblings().removeClass('on');
			$(this).next('.view').show()
			$(this).addClass('on');
		}
		return false
	})

	$('.filebox').each(function(){
		$(this).find('label').next().on("change", function(){
			var filename = $(this).val().split('/').pop().split('\\').pop();
			$(this).parent().children('input[type="text"]').val(filename)
		})
	})

	// $('.sch_city input').keydown(function(){
	// 	$(this).siblings('.ly_city').show();
	// })
	// $('.sch_city').focusout(function(){
	// 	$(this).children('.ly_city').hide();
	// })

	// 프린트
	function openPrintWindow(url, name, specs) {
	    var printWindow = window.open(url, name, specs);
	    var printAndClose = function () {
	      if (printWindow.document.readyState == 'complete') {
	        clearInterval(sched);
	        printWindow.print();
	        printWindow.close();
	     }
    	}
      var sched = setInterval(printAndClose, 200);
   };
   $('.btn_print').on('click',function(e){
   	 var targetUrl = $(this).attr('href');
   	  e.preventDefault();
    openPrintWindow(targetUrl, "to_print", "width=900,height=400,_blank");

   })

	$.ajaxSetup({
		statusCode : {
			401	: function() {
				location.reload();
			},
			403	: function() {
				location.reload();
			}
		}
	});
})



// 스크롤 테이블
function tbWidthChk (){
	$('.sc_table_wrap th').each(function(){
		var thWidth = $(this).width();
		$(this).children().width(thWidth)
	})

}

$(window).resize(function(){
	tbWidthChk ()

})


//가로 스크롤 테이블
  $(function () {
    // divBodyScroll의 스크롤이 동작할때에 함수를 불러옵니다.
    $('.divBodyScroll').scroll(function () {
    // divBodyScroll의 x좌표가 움직인 거리를 가져옵니다.
     var xPoint = $('.divBodyScroll').scrollLeft();

     // 가져온 x좌표를 divHeadScroll에 적용시켜 같이 움직일수 있도록 합니다.
     $('.divHeadScroll').scrollLeft(xPoint);
     });

    // 처음에 divBodyScroll의 세로스크롤 너비를 알수 없기 때문에
    // 스크롤을 우측으로 최대한 움직인 후 버튼을 눌러 두 스크롤의 차이를 찾아서 그 크기 만큼 tblHead의 공백 Column의 width를 지정해줍니다.
    $('.btnCheck').click(function () {
        var headMaximum = $('.divHeadScroll').scrollLeft();
        var bodyMaximum = $('.divBodyScroll').scrollLeft();

         alert('head: ' + headMaximum + '\nbody: ' + bodyMaximum);
    });
});

//스크롤 틀 고정 테이블
$(function () {
	var console = window.console || {log:function(){}};

  $('table.floating-thead>thead').each(function() {
    $(this).after( $(this).clone().hide().css('top',0).css('position','fixed') );
  });

  $(window).scroll(function() {
    $('table.floating-thead').each(function(i) {
      var table = $(this),
        thead = table.find('thead:first'),
        clone = table.find('thead:last'),
        top = table.offset().top,
        bottom = top + table.height() - thead.height(),
		left = table.position().left,
		border = parseInt(thead.find('th:first').css('border-width')),
        scroll = $(window).scrollTop();
      if (isNaN(border)) {
    	  border = 0;
      }
      if( scroll < top || scroll > bottom ) {
        clone.hide();
        return true;
      }
      if( clone.is('visible') ) return true;
      clone.css('left',left).show().find('th').each(function(i) {
    	  console.log(i, thead.find('th').eq(i).width(), border);
        $(this).width( thead.find('th').eq(i).width() + border );
      });
    });
  });
});

//팝업

function hidePopupLayer(layerId, reset){
	top._hidePopupLayer(layerId, reset);
}

function _hidePopupLayer(layerId, reset) {
	if(layerId){
		$("#popLayer" + layerId).empty().remove();
		_popupLayerID = _popupLayerID - 2;
		if(reset){
			_popupLayerID = _popupLayerID + 2;
			POPUP_INIT_ID = _popupLayerID - 2;
		}
	} else {
		if(_popupLayerID != POPUP_INIT_ID + 2){
			$("#popLayer" + _popupLayerID).empty().remove();
			_popupLayerID = _popupLayerID - 2;
		} else {
			$("#popLayer" + _popupLayerID).empty().remove();
			_popupLayerID = _popupLayerID - 2;
		}
	}
	if (0 == $('div[id^="popLayer"]').length) {
		$(".bg_dim").hide();
	}
	$("html").css("overflow", "visible");
}

function showPopupLayer(popSrc){
	top._showPopupLayer(popSrc);
}

var POPUP_INIT_ID = 111;
var _popupLayerID = POPUP_INIT_ID;
function _showPopupLayer(popSrc) {
	_popupLayerID += 2;
	var popTop = $(window).height() / 2 + $(document).scrollTop();
	var popSrcUrl = popSrc;

	if(popSrcUrl.indexOf("?") > 0){
		popSrcUrl += '&layerId='+ _popupLayerID
	}else {
		popSrcUrl += '?layerId='+ _popupLayerID
	}
	$("body").append(
		'<div class="popLayer" id="popLayer' + (_popupLayerID) + '" style="z-index:' + _popupLayerID + ';top:' + popTop + 'px;">'
		+ ' <iframe src="' + popSrcUrl +'" width="100%" height="100%" frameborder="0" allowTransparency="true" scrolling="no" name="frm" id="iframePopLayer' + (_popupLayerID) + '"></iframe>'
		+ ' <p class="close"><a href="#" onclick="hidePopupLayer(' + _popupLayerID + '); return false"><span>닫기</span></a></p>'
		+ '</div>'
	);
	$(".bg_dim").css("height", $(document).height() + "px").show();
	$("#popLayer" + _popupLayerID).show();
	$("html").css("overflow", "hidden");

}

var popMargin;
function setPopup(obj, reset){
	if(!reset){
		popMargin = parseInt(parent.$(".popLayer").css("margin-top"));
	}
	if(!$('#popWrap').children('h1').length > 0){
		$('#popWrap').addClass('no_title')
	}
	parent.$("#popLayer" + obj).css("top", ($(window.parent).height() / 2 + $(window.parent).scrollTop()) +"px");
	parent.$("#popLayer" + obj +", #iframePopLayer" + obj).add($("#popCont")).height("auto");
	if($('#popWrap').hasClass('no_title')){
		parent.$("#popLayer" + obj +", #iframePopLayer" + obj).height($("#popWrap").height() + 67);
	}else{
		parent.$("#popLayer" + obj +", #iframePopLayer" + obj).height($("#popWrap").height() + 7);
	}
	parent.$("#popLayer" + obj).css("margin-top", "-" + $("#popWrap").height()/2 + "px");
	var pWidth = $("#popWrap").width() + 14;
	parent.$("#popLayer" + obj).width(pWidth).css("margin-left", "-" + pWidth/2 + "px");
	var popHeight = $(window.parent).height()-(popMargin*2);
	var titleHeight = $("h1").height()+parseInt($("h1").css("padding-top"))+parseInt($("h1").css("padding-bottom"));
	var contPadding = parseInt($("#popCont").css("padding-top")) + parseInt($("#popCont").css("padding-bottom"));
	if($("#popWrap").height() >= popHeight){ //팝업높이가 부모창 높이보다 길때
		$("#popCont").css("height", (popHeight - titleHeight - contPadding) + "px").css("overflow-y", "scroll").css("padding-right", "0px").css("height", "100vw");
		$("#popCont.callcenter").css("height", (popHeight-titleHeight-contPadding) + "px").css("overflow-y", "scroll").css("padding-right", "0px");//callcenter
		parent.$("#popLayer" + obj +", #iframePopLayer" + obj).height($("#popWrap").height() + 7);
		parent.$("#popLayer" + obj).css("top", ($(window.parent).scrollTop() + 16) + "px").css("margin-top", popMargin + "px");
		if ($(window.parent).scrollTop() + $("#popWrap").height() > parent.$(".bg_dim").height()) { //반투명 BG 높이가 모자를때
			parent.$(".bg_dim").height($(window.parent).scrollTop() + $("#popWrap").height() + 3);
		}
	}
	parent.$("#popLayer" + obj).css("opacity", "1");
}


// 팝업 안에 팝업

function hidePopupLayer2(layerId, reset){
	top._hidePopupLayer2(layerId, reset);
}

function _hidePopupLayer2(layerId, reset) {
	if(layerId){
		$("#popLayer" + layerId).empty().remove();
		_popupLayerID2 = _popupLayerID2 - 2;
		if(reset){
			_popupLayerID2 = _popupLayerID2 + 2;
			POPUP_INIT_ID2 = _popupLayerID2 - 2;
		}
	} else {
		if(_popupLayerID2 != POPUP_INIT_ID2 + 2){
			$("#popLayer" + _popupLayerID2).empty().remove();
			_popupLayerID2 = _popupLayerID2 - 2;
		} else {
			$("#popLayer" + _popupLayerID2).empty().remove();
			_popupLayerID2 = _popupLayerID2 - 2;
		}
	}
}

function showPopupLayer2(popSrc){
	top._showPopupLayer2(popSrc);
}
var POPUP_INIT_ID2 = 0;
var _popupLayerID2 = POPUP_INIT_ID2;
function _showPopupLayer2(popSrc){
	_popupLayerID2 += 2;
	var popSrcUrl = popSrc;
	parent.$("body").append(
		'<div class="popLayer" id="popLayer' + (_popupLayerID2) + '" style="z-index:1000">'
		+ ' <iframe src="' + popSrcUrl +'" width="100%" height="100%" frameborder="0" allowTransparency="true" scrolling="no" id="iframePopLayer' + (_popupLayerID2) + '"></iframe>'
		+ ' <p class="close"><a href="#" onclick="hidePopupLayer2(); return false"><span>닫기</span></a></p>'
		+ '</div>'
	);
	$("#popLayer" + _popupLayerID2).show();
}

function setPopup2(obj, reset){
	parent.parent.$("#popLayer" + obj).css("top", ($(window.parent.parent).height() / 2 + $(window.parent.parent).scrollTop()) +"px");
	parent.parent.$("#popLayer" + obj +", #iframePopLayer" + obj).add($("#popCont")).height("auto");
	if($('#popWrap').hasClass('no_title')){
		parent.$("#popLayer" + obj +", #iframePopLayer" + obj).height($("#popWrap").height() + 67);
	}else{
		parent.$("#popLayer" + obj +", #iframePopLayer" + obj).height($("#popWrap").height() + 7);
	}
	parent.parent.$("#popLayer" + obj).css("margin-top", "-" + $("#popWrap").height()/2 + "px");
	var pWidth;
	var pWidth = $("#popWrap").width() + 14;
	parent.parent.$("#popLayer" + obj).width(pWidth).css("margin-left", "-" + pWidth/2 + "px");
	parent.parent.$("#popLayer" + obj).css("opacity", "1");
}


$(function () {
                // divBodyScroll의 스크롤이 동작할때에 함수를 불러옵니다.
                $('#divBodyScroll2').scroll(function () {
                    // divBodyScroll의 x좌표가 움직인 거리를 가져옵니다.
                    var xPoint = $('#divBodyScroll2').scrollLeft();

                    // 가져온 x좌표를 divHeadScroll에 적용시켜 같이 움직일수 있도록 합니다.
                    $('#divHeadScroll2').scrollLeft(xPoint);
                });

                // 처음에 divBodyScroll의 세로스크롤 너비를 알수 없기 때문에
                // 스크롤을 우측으로 최대한 움직인 후 버튼을 눌러 두 스크롤의 차이를 찾아서 그 크기 만큼 tblHead의 공백 Column의 width를 지정해줍니다.

            });


/* 2018-08-30 추가 */
$( function () {
	$( '.form_select .view' ).on( 'click', function (e) {
		e.preventDefault();

		var _this = $( this ),
			$formParent = _this.closest( '.form_select' );

		$formParent.toggleClass( 'open' );
	});

	$( '.layer_city .close' ).on( 'click', function (e) {
		e.preventDefault();

		var _this = $( this ),
			$formParent = _this.closest( '.form_select' );

		$formParent.removeClass( 'open' );
	});
})
