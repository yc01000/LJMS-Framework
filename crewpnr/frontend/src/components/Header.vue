<template>
 <div id="top_area">
    <div class="top_wrap">
      <p class="logo"><a :href="SUPERSYSTEM_URL">JINAIR</a></p>
      <ul class="uti1">
        <li><a>{{userinfo ? userinfo.userName : ''}}</a></li>
        <li><a href="/sso/signout">SIGN OUT</a></li>
      </ul>

      <p class="title_txt">
        승무원 예약
        <select v-if="userinfo? userinfo.superuser : false" v-model="agencyCode" @change="handleAgencyCode">
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
// import useUserinfo from '@/composables/auth-composition';
import { useAuthStore } from '@/store/auth';
import { computed } from 'vue';

export default {
  setup() {
    // const { userinfo } = useUserinfo();
    const auth = useAuthStore();
    console.log(auth.userinfo);
    return {
      SUPERSYSTEM_URL: import.meta.env.VITE_SUPERSYSTEM_URL,
      userinfo: computed(() => auth.userinfo),
      //userinfo: auth.getUserinfo, //getters를 사용하면 되지만 computed가 되지는 않는다.
    };
  },

  data() {
    return {
        agencyCode: '',
        isUser: false,
    };
  },

  methods: {
    handleAgencyCode() {
      cookies.set('agencyCode', this.agencyCode);
    }
  },

  async mounted() {
    console.log('Header.vue mounted!!!');
  }
};
</script>
