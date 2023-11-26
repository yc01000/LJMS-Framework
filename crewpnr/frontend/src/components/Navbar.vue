<template>
  <!-- LNB 펼침-->
  <div class="gnb_area" :style="{ left: gnbLeft + 'px' }" @mouseleave="closeSlowly">
    <div class="gnb_inner">
      <div class="nav_header">
        <a href="javascript://" class="pin" @click="toggleFixed"></a>
        <i></i>
        <a href="javascript://" class="close_nav" @click="closeForce"></a>
      </div>
      <div class="menu">
        <ul>
          <li class="m"><RouterLink to="/create" class="sub" title="예약 생성"><i class="fa fa-plane"></i> <p>예약 생성</p></RouterLink></li>
          <li class="m"><RouterLink to="/list" class="sub" title="예약 조회"><i class="fa fa-search"></i> <p>예약 조회</p></RouterLink></li>
          <li class="m"><RouterLink to="/failhistories" class="sub" title="예약 생성 실패 이력 조회"><i class="fa fa-question"></i> <p>예약 생성 실패 이력 조회</p></RouterLink></li>
        </ul>
      </div>
    </div>
  </div>

  <!-- LNB 닫힘 -->
  <div class="gnb_area_close" :style="{ left: gnbCloseLeft + 'px' }">
    <div class="nav_header"><a href="javascript://" class="open_nav" @click="openNav"></a></div>
    <div class="menu">
      <ul id="closeMenu">
        <li class="m"><RouterLink to="/create" class="sub" title="예약 생성"><i class="fa fa-plane"></i></RouterLink></li>
        <li class="m"><RouterLink to="/list" class="sub" title="예약 조회"><i class="fa fa-search"></i></RouterLink></li>
        <li class="m"><RouterLink to="/failhistories" class="sub" title="예약 생성 실패 이력 조회"><i class="fa fa-question"></i></RouterLink></li>
      </ul>
    </div>
  </div>
</template>

<script>
import { RouterLink } from 'vue-router';

export default {
  data() {
    return {
      gnbLeft: -240,
      gnbCloseLeft: 0,
      scrHWidth: 'auto',
      isFixed: false
    };
  },
  methods: {
    closeSlowly() {
      if(this.isFixed) {
        return;
      }

      setTimeout(() => {
        this.closeNav();
      }, 250);
    },
    openNav() {
      this.gnbCloseLeft = -40;
      this.gnbLeft = 0;
    },
    closeForce() {
      this.closeNav();
      window.document.getElementsByTagName('body')[0].classList = '';
    },
    closeNav() {
      this.gnbCloseLeft = 0;
      this.gnbLeft = -240;
      this.isFixed = false;
      this.scrHWidth = 'auto';
    },
    toggleFixed() {
      this.isFixed = !this.isFixed;
      console.log(`this.isFixed: ${this.isFixed}`);
      this.scrHWidth = this.isFixed ? `${window.innerWidth - 310}px` : 'auto';
      window.document.getElementsByTagName('body')[0].classList = this.isFixed ? 'm_fixed' : '';
    }
  }
};
</script>
