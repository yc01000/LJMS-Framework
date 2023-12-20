import http from './lj-axios';

export async function store(title, content) {
    return http.post('/crew/store', {
        title,
        content
    });
}

export async function failHistory_Search(json) {
    const res = await http.post('/crew/getCreateBookingFailLog', {
        headers: {'Content-Type': 'application/json'},
        body: json
    });
    console.log(res);
    if(res.status === 200){
        console.log(res.data);
        return res.data;
    }
}