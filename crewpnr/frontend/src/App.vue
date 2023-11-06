<script setup>
import { RouterView } from 'vue-router'
import Header from './components/Header.vue'
import Navbar from './components/Navbar.vue'
import Footer from './components/Footer.vue'
</script>

<template>
  <Header />

  <div id="container" class="container body-content">
    <Navbar />

    <div class="content_wrap">
      <RouterView />
    </div>
  </div>

  <Footer />
</template>

<script>
export default {
    data() {
        return {
            userinfo: {}
        };
    },

    mounted() {
      fetch('https://stg-crewpnr.jinair.com/user/userinfo')
        .then((response) => response.json())
        .then((data) => {
          if(!data || !data.userName || data.userName === 'No SSO Mode') {
            console.log('No SSO Mode입니다. SSO 로그인 페이지로 이동되지 않습니다.');
            return;
          }
          this.userinfo = data;
        })
        .catch(() => {
          this.userinfo = {
            'userName': 'ANONYMOUS'
          };
          console.log(this.userinfo);
        });
    }
};
</script>
