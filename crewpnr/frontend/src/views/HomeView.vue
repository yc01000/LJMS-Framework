<template>
  <div class="header_util">
    <p class="sub_title">예약 생성</p>
    <ul class="cont">
      <li><a href="#" class="ico_home">home</a></li>
      <li><a href="#" class="ico_bul">승무원 예약</a></li>
      <li class="select"><a href="#" class="ico_bul">예약 생성</a></li>
    </ul>
  </div>

  <div class="btn_wrap">
    <a href="#" onclick="CariOutUpload();" class="btnTypeA">엑셀 파일 업로드 (PNR 생성 요청)</a>
    <a href="#" class="btnTypeC" onclick="fn_ExcelDown()">엑셀 형식 다운로드</a>
    <a href="#" class="btnTypeC" onclick="fn_ExcelDown()">엑셀 형식 다운로드 (GUM)</a>
  </div>
</template>
