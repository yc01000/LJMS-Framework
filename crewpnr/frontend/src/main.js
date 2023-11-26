import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

const app = createApp(App)
app.use(router)
app.mount('#app')

var params = new URLSearchParams(location.search);
const page = params.get('page') || '/create';
if(!!page) {
    router.push(page);
}
