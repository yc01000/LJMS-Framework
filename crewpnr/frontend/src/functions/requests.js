import axios from 'axios';

// requests 모듈화 예정
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
        resolve(response.data);
        return;
      }
      resolve(response.data);
    });
  },

  post(url, opts) {
    return new Promise(async (resolve, reject) => {
      if(!url) {
        throw new Error('url은 필수입니다.');
      }
      if(url.indexOf('http') !== -1) {
        throw new Error('도메인을 제외한 경로만 입력해 주세요.');
      }

      const response = await axios.post(`${DEFAULT_OPTS.endpoint}${url}`, opts.body, {headers: opts.headers});
      if(response.data.error === 'not signed in') {
        window.location.href = response.data.redirect_uri;
        console.log('SSO로 이동합니다.');
        resolve(response.data);
        return;
      }
      resolve(response.data);
    });
  }
};

export default requests;
