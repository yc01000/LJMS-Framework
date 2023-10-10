/**
 * alert, confirm 재정의
 * 
 * @since 2017.07.28
 * @author jhbang
 */
var btnStyles = {
	btnNone: 0,
	btnOk: 1,
	btnYes: 2,
	btnNo: 4,
	btnCancel: 8
};

var msgLayerPopup = {
	btnStyle: btnStyles.btnNone,
	result: true,
	_showMsgLayer: function (msg, btnStyle, type) {
		this.btnStyle = btnStyles.btnOk | btnStyle;

		if (('alert' != type) && ('confirm' != type)) {
			this.btnStyle = btnStyle;
		}

		var title = this._getTitle(type);
		var defer = $.Deferred();

		var html =
			'<div id="dialogMessage" title="' + title + '">'
			+ ' <div id="popWrap" style="width:100%;">'
			+ '  <div id="popCont" style="width:100%; padding:0;">'
			+ '   <div class="width_popup">'
			+ '    <p class="p_txt">' + msg + '</p>'
			+ '   </div>'
			+ '  </div>'
			+ ' </div>'
			+ '</div>';

		$('#ui_dialog').html(html);

		$("#dialogMessage").dialog({
			resizable: false,
			width: 500,
			modal: true,
			dialogClass: 'no-close',
			buttons: [
				{
					text: $.i18n ? $.i18n.prop('cmm.msg.btn.confirm') : 'Ok',
					id: 'btnDlgOk',
					click: function () {
						defer.resolve('ok');
						$(this).dialog("close");
					}
				},
				{
					text: $.i18n ? $.i18n.prop('cmm.msg.btn.yes') : 'Yes',
					id: 'btnDlgYes',
					click: function () {
						defer.resolve('yes');
						$(this).dialog("close");
					}
				},
				{
					text: $.i18n ? $.i18n.prop('cmm.msg.btn.no') : 'No',
					id: 'btnDlgNo',
					click: function () {
						defer.resolve('no');
						$(this).dialog("close");
					}
				},
				{
					text: $.i18n ? $.i18n.prop('cmm.msg.btn.cancel') : 'Cancel',
					id: 'btnDlgCancel',
					click: function () {
						defer.resolve('cancel');
						$(this).dialog("close");
					}
				}
			],
			open: function (event, ui) {
				$('.ui-dialog-buttonpane').find('button#btnDlgOk').addClass('buttonTypeGD');
				$('.ui-dialog-buttonpane').find('button#btnDlgYes').addClass('buttonTypeGD');
				$('.ui-dialog-buttonpane').find('button#btnDlgNo').addClass('buttonTypeGE');
				$('.ui-dialog-buttonpane').find('button#btnDlgCancel').addClass('buttonTypeGE');

				if (!(msgLayerPopup.btnStyle & btnStyles.btnOk)) {
					$('#btnDlgOk').css('display', 'none');
				}

				if (!(msgLayerPopup.btnStyle & btnStyles.btnYes)) {
					$('#btnDlgYes').css('display', 'none');
				}

				if (!(msgLayerPopup.btnStyle & btnStyles.btnNo)) {
					$('#btnDlgNo').css('display', 'none');
				}

				if (!(msgLayerPopup.btnStyle & btnStyles.btnCancel)) {
					$('#btnDlgCancel').css('display', 'none');
				}

				var isFirst = true;
				$('.ui-dialog-buttonpane').find('button').each(function (idx, elm) {
					if (('none' != $(this).css('display')) && isFirst) {
						$(this).focus();
						isFirst = false;
					}
				});
			},
			beforeClose: function (event, ui) {
				if ('pending' == defer.state()) {
					defer.resolve('cancel');
				}

				if (event.preventDefault) {
					event.preventDefault();
				} else {
					event.returnValue = false;
				}

				if (event.stopPropagation) {
					event.stopPropagation();
				} else {
					event.cancelBubble = true;
				}

				$(this).dialog("destroy");
				$(this).clearQueue();
				$('#ui_dialog').html('');
			}
		});

		return defer.promise();
	},
	_getTitle: function (type) {
		var title = '';

		if ('alert' == type) {
			title = 'Alert';
		} else if ('confirm' == type) {
			title = 'Confirm';
		} else {
			title = type;
		}

		return title;
	},
};

// window.alert 재정의
window.alert = function (msg) {
	var defer = $.Deferred();

	msgLayerPopup._showMsgLayer(msg, btnStyles.btnOk, 'alert').then(function (result) {
		defer.resolve(result);
	});

	return defer.promise();
};

// window.confirm 재정의
window.confirm = function (msg, callbackFnc) {
	var btnStyle = btnStyles.btnOk | btnStyles.btnCancel;
	var defer = $.Deferred();
	msgLayerPopup._showMsgLayer(msg, btnStyle, 'confirm').then(function (result) {
		defer.resolve(result);
	});
	defer.done(callbackFnc);
	return defer.promise();
};
//function fn3(n) {
//	console.log('fn3');
//	console.log(n);
//}