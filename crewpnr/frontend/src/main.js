import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import requests from './functions/requests';
import cookies from './functions/cookies';

const app = createApp(App)
app.use(router)

app.config.globalProperties.$getUserinfo = async () => {
    return new Promise((resolve) => {
        if(!!app.config.globalProperties._userinfo) {
            return resolve(app.config.globalProperties._userinfo);
        }

        const data = requests.get('/user/userinfo').then((data) => {
            let userinfo = data.result;
            if(!userinfo) {
              return;
            }

            userinfo.superuser = userinfo.department.indexOf('14') === 0 || userinfo.department.indexOf('31') === 0 || userinfo.department === 'LJ994';
            if(true) {
                userinfo.agencyCode = cookies.get('agencyCode') || '';
            }

            app.config.globalProperties._userinfo = data.result;

            resolve(app.config.globalProperties._userinfo);
        });
    });
};

app.mount('#app')

var params = new URLSearchParams(location.search);
const page = params.get('page') || '/create';
if(!!page) {
    router.push(page);
}
