<script setup>
</script>

<template>
 <div id="top_area">
    <div class="top_wrap">
      <p class="logo"><a href="https://stg-opsportal.jinair.com/">JINAIR1111111111111111</a></p>
      <ul class="uti1">
        <li><a href="#">고영준</a></li>
        <li><a href="#" onclick="return Logout();">SIGN OUT </a></li>
      </ul>

      <p class="title_txt">승무원 예약</p>
      <div class="m_menu">
        <a href="https://stg-opsportal.jinair.com/" class="Admin">
          <p class="portal">PORTAL</p>
        </a>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

const DEFAULT_OPTS = {
  endpoint: import.meta.env.VITE_BACKEND_ENDPOINT,
  responseContentType: 'json'
};

const requests = {
  get(url, opts) {
    return new Promise(async (resolve, reject) => {
      if(!url) {
        throw new Error('url은 필수입니다.');
      }
      if(url.indexOf('http') !== -1) {
        throw new Error('도메인을 제외한 경로만 입력해 주세요.');
      }

      const response = await axios.get(`${DEFAULT_OPTS.endpoint}${url}`);
      if(response.data.error === 'not signed in') {
        window.location.href = response.data.redirect_uri;
        console.log('SSO로 이동합니다.');
        reject(response.data);
        return;
      }
      resolve(response.data);
    });
  }
};

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
    getCookie(name) {
      const cookies = document.cookie.split(';').map(cookie => cookie.trim());
      for(const cookie of cookies) {
        const [cookieName, cookieValue] = cookie.split('=');
        if (cookieName === name) {
          return cookieValue;
        }
      }
      return null;
    },

    setCookie(name, value) {
      const expirationDate = new Date();
      expirationDate.setFullYear(expirationDate.getFullYear() + 1);

      document.cookie = `${name}=${value}; expires=${expirationDate.toUTCString()}`;
    },

    handleAgencyCode() {
      this.setCookie('agencyCode', this.agencyCode);
    }
  },

  async mounted() {
    this.userinfo = await this.$getUserinfo();
    window.header = this;
  }
};
</script>
