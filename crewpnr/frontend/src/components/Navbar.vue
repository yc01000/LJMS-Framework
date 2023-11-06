<script setup>
import { RouterLink } from 'vue-router'
</script>

<template>
  <!--왼쪽 고정메뉴 펼침-->
  <div class="gnb_area" :style="{ left: gnbLeft + 'px' }">
    <div class="gnb_inner">
      <div class="nav_header">
        <a href="#" class="pin"></a>
        <i></i>
        <a href="javascript://" class="close_nav" @click="closeNav"></a>
      </div>
      <div class="menu">
        <ul>
          <li class="m">
            <RouterLink to="/index.html" class="sub" title="예약 생성"><i class="fa fa-road"></i> <p>예약 생성</p></RouterLink>
          </li>
          <li class="m" id="menu_1">
            <RouterLink to="/reservations" class="sub" title="예약 조회"><i class="fa fa-road"></i> <p>예약 조회</p></RouterLink>
          </li>
          <li class="m" id="menu_2">
            <RouterLink to="/failhistories" class="sub" title="예약 생성 실패 이력 조회"><i class="fa fa-road"></i> <p>예약 생성 실패 이력 조회</p></RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </div>
  <!--//왼쪽 고정메뉴 펼침-->

  <div class="gnb_area_close" :style="{ left: gnbCloseLeft + 'px' }">
      <div class="nav_header"><a href="javascript://" class="open_nav" @click="openNav"></a></div>
      <div class="menu">
        <ul id="closeMenu">
          <li class="m"><RouterLink to="/index.html" class="sub" title="예약 생성"><i class="fa fa-road"></i></RouterLink></li>
          <li class="m"><RouterLink to="/reservations" class="sub" title="예약 조회"><i class="fa fa-road"></i></RouterLink></li>
          <li class="m"><RouterLink to="/failhistories" class="sub" title="예약 생성 실패 이력 조회"><i class="fa fa-road"></i></RouterLink></li>
        </ul>
      </div>
    </div>
</template>

<script>
export default {
  data() {
    return {
      gnbLeft: 0,
      gnbCloseLeft: 0,
      scrHWidth: 'auto',
      isFixed: false,
      tableColumns: ['Column 1', 'Column 2', 'Column 3'], // Define your table columns
    };
  },
  methods: {
    openNav() {
      this.gnbCloseLeft = -40;
      this.gnbLeft = 0;
    },
    closeNav() {
      this.gnbCloseLeft = 0;
      this.gnbLeft = -240;
      this.isFixed = false;
      this.scrHWidth = 'auto';
    },
    toggleFixed() {
      this.isFixed = !this.isFixed;
      this.scrHWidth = this.isFixed ? `${window.innerWidth - 310}px` : 'auto';
      this.tbWidthChk();
    },
    tbWidthChk() {
      // Function to update table column widths
      const thElements = document.querySelectorAll('.sc_table_wrap th');
      thElements.forEach((th) => {
        th.style.width = getComputedStyle(th).width;
      });
    },
  },
  mounted() {
    window.addEventListener('resize', this.tbWidthChk);
  },
  beforeUnmount() {
    window.removeEventListener('resize', this.tbWidthChk);
  },
};
</script>
