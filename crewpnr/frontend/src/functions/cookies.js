
const cookies = {
  get(name) {
    const cookies = document.cookie.split(';').map(cookie => cookie.trim());
    for(const cookie of cookies) {
        const [cookieName, cookieValue] = cookie.split('=');
        if (cookieName === name) {
        return cookieValue;
        }
    }
    return null;
  },

  set(name, value) {
    const expirationDate = new Date();
    expirationDate.setFullYear(expirationDate.getFullYear() + 1);

    document.cookie = `${name}=${value}; expires=${expirationDate.toUTCString()}`;
  }
};

export default cookies;
