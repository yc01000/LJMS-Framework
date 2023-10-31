<script setup>
</script>

<template>
 <div id="top_area">
    <div class="top_wrap">
      <p class="logo"><a href="https://stg-opsportal.jinair.com/">JINAIR</a></p>
      <ul class="uti1">
        <li><a>{{userinfo.userName}}</a></li>
        <li><a href="/user/signout">SIGN OUT</a></li>
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
          console.log(data);
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
