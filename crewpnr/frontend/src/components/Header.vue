<template>
 <div id="top_area">
    <div class="top_wrap">
      <p class="logo"><a :href="SUPERSYSTEM_URL">JINAIR</a></p>
      <ul class="uti1">
        <li><a>{{userinfo.userName}}</a></li>
        <li><a href="/sso/signout">SIGN OUT</a></li>
      </ul>

      <p class="title_txt">
        승무원 예약
        <select v-if="userinfo.superuser" v-model="agencyCode" @change="handleAgencyCode">
          <option value="">대리점 코드 설정</option>
          <option value="90000100">운항</option>
          <option value="90000200">객실</option>
          <option value="90000300">정비</option>
        </select>
      </p>

      <div class="m_menu">
        <a :href="SUPERSYSTEM_URL" class="Admin"><p class="portal">PORTAL</p></a>
      </div>
    </div>
  </div>
</template>

<script>
import cookies from '@/functions/cookies';

export default {
  setup() {
    return {
      SUPERSYSTEM_URL: import.meta.env.VITE_SUPERSYSTEM_URL
    };
  },

  data() {
    return {
        userinfo: {},
        agencyCode: ''
    };
  },

  methods: {
    handleAgencyCode() {
      cookies.set('agencyCode', this.agencyCode);
    }
  },

  async mounted() {
    this.userinfo = await this.$getUserinfo();
  }
};
</script>
