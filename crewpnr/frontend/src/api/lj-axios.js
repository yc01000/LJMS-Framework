import axios from 'axios';
//import store from '@/store';

const instance = axios.create({
    baseURL: import.meta.env.VITE_BACKEND_ENDPOINT //vite 프로젝트에서 동적으로 가져옴.(기존엔 process.env)
});

instance.interceptors.request.use(function (config) {
    // if (store.state.auth.token !== null) {
    //     config['headers'] = {
    //         Authorization: `Bearer ${store.state.auth.token}`
    //     };
    // }

    return config;
});

instance.interceptors.response.use(function (response) {
    if(response.data.error === 'not signed in') {
        window.location.href = response.data.redirect_uri;
        console.log('SSO로 이동합니다.');
    }
    return response;
}, function (error) {
    // if (error.response.status === 422) {
    //     store.commit('error/setValidationError', error.response.data.data);
    // } else {
    //     return Promise.reject(error);
    // }
});

export default instance;