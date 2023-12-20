// main.js
import { createApp } from 'vue';
import App from './App.vue';
import router from './router/index';
import { createPinia } from 'pinia'
import { useAuthStore } from './store/auth';

const app = createApp(App);
const pinia = createPinia();
app.use(router);
app.use(pinia);

// 'useStore' 함수를 사용하여 스토어 초기화
const auth = useAuthStore();
auth.setUserinfo(); //store.dispatch('auth/setUserinfo');//로그인 이후 처리이지만, sso를 사용하므로 시작시 가져옴.

app.mount('#app');

var params = new URLSearchParams(location.search);
const page = params.get('page') || '/create';
if(!!page) {
    router.push(page);
}
