import { login, getUserinfo } from '@/api/user';
import cookies from '@/functions/cookies';

export default {
    namespaced: true, // 네임스페이스 활성화

    state: {
        token: null,
        userinfo: null,
    },
    mutations: {
        setToken(state, token) {
            state.token = token;
        },
        setUserinfo(state, userinfo) {
            state.userinfo = userinfo;
            console.log('state.userinfo.userName:', state.userinfo.userName);
            state.userinfo.superuser = userinfo.department.indexOf('14') === 0 || userinfo.department.indexOf('31') === 0 || userinfo.department === 'LJ994';
            state.userinfo.agencyCode = cookies.get('agencyCode') || '';
        }
    },
    actions: {
        async login(context, { userId, password }) {
            try {
                const response = await login(userId, password);

                if (response.status === 200) {
                    context.commit('setToken', response.data.token);
                }
            } catch (e) {
                alert('아이디 혹은 비밀번호를 확인해주세요.');
            }
        },

        async setUserinfo(context) {
            try {
                const response = await getUserinfo();
                if (response.status === 200) {
                    context.commit('setUserinfo', response.data.result);
                }
            } catch (e) {
                console.log('setUserinfo error:', e);
                alert('로그인이 필요합니다.');
            }
        },
    }
}