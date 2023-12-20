import http from '@/api/lj-axios';

export function login(userid, password) {
  return http.post('/login', {
    userid,
    password
  });
};

export function getUserinfo() {
    return http.get('/user/userinfo');
};
