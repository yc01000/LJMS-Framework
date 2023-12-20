import { defineStore } from 'pinia';
import { login, getUserinfo } from '@/api/user';
import cookies from '@/functions/cookies';

// pinia 모듈로 사용 각 컴포넌트에서 setup()에 등록해서 바로 사용가능.
export const useAuthStore = defineStore('auth', {
  state: () => ({
    token: null,
    userinfo: null,
  }),
  getters: {
    getUserinfo(state) {
      return state.userinfo;
    },
  },
  actions: {
    async login({ userId, password }) {
      try {
        const response = await login(userId, password);

        if (response.status === 200) {
          this.setToken(response.data.token);
        }
      } catch (e) {
        alert('아이디 혹은 비밀번호를 확인해주세요.');
      }
    },

    async setUserinfo() {
      try {
        const response = await getUserinfo();
        if (response.status === 200) {
          const user = response.data.result;
          this.userinfo = user;
          this.userinfo.superuser =
            user.department.indexOf('14') === 0 ||
            user.department.indexOf('31') === 0 ||
            user.department === 'LJ994';
          this.userinfo.agencyCode = cookies.get('agencyCode') || '';
          console.log('state.userinfo.userName:', this.userinfo.userName);

        }
      } catch (e) {
        console.log('setUserinfo error:', e);
        alert('로그인이 필요합니다.');
      }
    },

    setToken(token) {
      this.token = token;
    },

    setUserinfo1(userinfo) {
      this.userinfo = userinfo;
      console.log('state.userinfo.userName:', this.userinfo.userName);
      this.userinfo.superuser =
        userinfo.department.indexOf('14') === 0 ||
        userinfo.department.indexOf('31') === 0 ||
        userinfo.department === 'LJ994';
      this.userinfo.agencyCode = cookies.get('agencyCode') || '';
    },
  },
});
