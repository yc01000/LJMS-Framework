<script setup>
import { RouterLink } from 'vue-router'
</script>

<template>
  <!--왼쪽 고정메뉴 펼침-->
  <div class="gnb_area" style="left: -240px;">
    <div class="gnb_inner">
      <div class="nav_header"> <a href="#" class="pin"></a> <i></i> <a href="#" class="close_nav"></a></div>
      <div class="menu">
        <ul>
          <li class="m"><a href="/MVT/MvtSkd" class="sub" title="MVT관리 (KE BASE)"> <i class="fa fa-road"></i>
              <p>MVT관리 (KE BASE11111111111111111111111111111111111111111111)</p>
            </a></li>
          <li class="m" id="menu_1"><a href="javascript:showSubMenu('menu_1')" class="sub" title="FLT PLAN DATA"> <i
                class="fa fa-plane"></i>
              <p>FLT PLAN DATA</p>
            </a><a href="javascript://" class="arrow">arrow</a>
            <ul class="mList">
              <li class="mn"><a href="/CSV/CsvSkd"> CSV 관리</a></li>
            </ul>
          </li>
          <li class="m" id="menu_2"><a href="javascript:showSubMenu('menu_2')" class="sub" title="PLAN DATA 관리"> <i
                class="fa fa-calendar"></i>
              <p>PLAN DATA 관리</p>
            </a><a href="javascript://" class="arrow">arrow</a>
            <ul class="mList">
              <li class="mn"><a href="/Plan/MultiMtow"> Multi–MTOW</a></li>
              <li class="mn"><a href="/Plan/SOW"> SOW</a></li>
              <li class="mn"><a href="/Plan/Suffix"> Suffix</a></li>
              <li class="mn"><a href="/Plan/CityPair"> City Pair</a></li>
              <li class="mn"><a href="/Plan/Desk"> Desk 관리</a></li>
              <li class="mn"><a href="/Plan/Payload"> Payload</a></li>
              <li class="mn"><a href="/Plan/RegSow"> 기번별 SOW</a></li>
            </ul>
          </li>
          <li class="m"><a href="/Plan/Test" class="sub" title="CARI OUT UPLOAD"> <i class="fa fa-road"></i>
              <p>CARI OUT UPLOAD</p>
            </a></li>
        </ul>
      </div>
    </div>
  </div>
  <!--//왼쪽 고정메뉴 펼침-->

  <div class="gnb_area_close" style="left: 0px;">
      <div class="nav_header"><a href="#" class="open_nav"></a></div>
      <div class="menu">
        <ul id="closeMenu">
          <li class="m"><RouterLink to="/" class="sub" title="PLAN DATA 관리"><i class="fa fa-road"></i></RouterLink></li>
          <li class="m"><RouterLink to="/reservations" class="sub" title="PLAN DATA 관리"><i class="fa fa-road"></i></RouterLink></li>
          <li class="m"><RouterLink to="/failhistories" class="sub" title="PLAN DATA 관리"><i class="fa fa-road"></i></RouterLink></li>
        </ul>
      </div>
    </div>
</template>
