<template>
    <div class="header_util">
        <p class="sub_title">예약 생성</p>
        <ul class="cont">
            <li><a href="#" class="ico_home">home</a></li>
            <li><a href="#" class="ico_bul">승무원 예약</a></li>
            <li class="select"><a href="#" class="ico_bul">예약 생성</a></li>
        </ul>
    </div>
    <div>
        <button @click="showMessageBox">Show Message Box</button>
    </div>
    <div class="tab02_wrap" ref="tabWrap">
        <ul class="tab_ul02">
            <li v-for="(tab, index) in tabs" :key="index" :class="{ 'on': activeTab === index }" class="tab_li02"
                style="cursor: pointer;">
                <a @click="changeTab(index)">{{ tab }}</a>
            </li>
        </ul>
        <div class="tab_box">
            <div class="tabcon" id="tabcon-0" :class="{ 'on': activeTab === 0 }">
                <div class="wh_wrap">
                    <div id="filedrop-Gen" class="file-drop filebox" @dragover="onDragover" @drop="handleDrop">
                        <label for="file-Gen">파일 찾기</label>
                        <input id="file-Gen" type="file" @change="handleFileChange" /><br>
                        <span id="text-Gen" style="border:0px; font-size: large; padding: 15px;">
                            <p>-- 또는 --</p><br>
                            {{ this.uploadProps.get('Gen').file.length === 0 ? '일반 예약 파일을 여기로 드래그해 주세요.' :
                                this.uploadProps.get('Gen').file.name }}
                        </span>
                    </div>
                </div>
                <div class="btn_wrap right">
                    <a href="https://imagesstg.jinair.com/eForm/crewpnr_example.xlsx" class="btnTypeC">엑셀 형식
                        다운로드</a>
                    &nbsp;
                    <a href="#" @click="uploadFile('Gen')" class="btnTypeA">엑셀 업로드 (PNR 생성 요청)</a>
                </div>
            </div>

            <div class="tabcon" id="tabcon-1" :class="{ 'on': activeTab === 1 }">
                <div class="wh_wrap">
                    <div id="filedrop-Gum" class="file-drop filebox" @dragover="onDragover" @drop="handleDrop">
                        <label for="file-Gum">파일 찾기</label>
                        <input id="file-Gum" type="file" @change="handleFileChange" /><br>
                        <span id="text-Gum" style="border:0px; font-size: large; padding: 15px;">
                            <p>-- 또는 --</p><br>
                            {{ this.uploadProps.get('Gum').file.length === 0 ? '괌 예약 파일을 여기로 드래그해 주세요.' :
                                this.uploadProps.get('Gum').file.name }}
                        </span>
                    </div>
                </div>
                <div class="btn_wrap right">
                    <a href="https://imagesstg.jinair.com/eForm/crewpnr_gum_example.xlsx" class="btnTypeC">엑셀 형식
                        다운로드(GUM)</a>
                    &nbsp;
                    <a href="#" @click="uploadFile('Gum')" class="btnTypeA">엑셀 업로드 (GUM PNR 생성)</a>
                </div>
            </div>
        </div>
    </div>
    <div>
        <MessageBox ref="msg_box" />
    </div>
</template>

<script>
//import axios from 'axios';
import MessageBox from '@/components/MessageBox.vue';
import requests from '../functions/requests';

export default {
    components: {
        MessageBox,
    },
    data() {
        return {
            sampleFile: import.meta.env.VITE_ASSETS_ENDPOINT + '/eForm/crewpnr_example.xlsx',
            sampleFileGUM: import.meta.env.VITE_ASSETS_ENDPOINT + '/eForm/crewpnr_gum_example.xlsx',
            GenUploadFile: null,
            GumUploadFile: null,
            uploadProps: new Map([
                ['Gen', { url: '/crew/createBookings', file: [] }],
                ['Gum', { url: '/crew/createBookingsForGum', file: [] }],
            ]),
            tabs: ["일반 PNR 요청", "GUM PNR 요청"], // 탭의 제목들
            activeTab: 0, // 초기에 활성화된 탭의 인덱스
        };
    },
    mounted() {

    },
    methods: {
        changeTab(index) {
            this.activeTab = index;
            // ref를 사용하여 요소에 접근
            const tabWrap = this.$refs.tabWrap;
            const target = `#tabcon-${index}`;
            // querySelectorAll 대신에 간단한 forEach 반복문 사용
            tabWrap.querySelectorAll('.tabcon').forEach((tabcon) => tabcon.style.display = 'none');
            tabWrap.querySelector(target).style.display = 'block';
        },
        showMessage(title, msg) {
            this.$refs.msg_box.showPopup(title, msg);
        },
        onDragover(event) {
            event.preventDefault();
        },
        handleDrop(event) {
            event.preventDefault();
            this.handleFileChange(event);
        },
        handleFileChange(event) {
            console.log(event);
            const upload = this.uploadProps.get(event.target.id.split('-')[1]);
            upload.file = (event.type === 'drop') ? event.dataTransfer.files[0] : event.target.files[0];
        },
        async uploadFile(type) { // type: Gen-일반, Gum-괌
            const upload = this.uploadProps.get(type);
            try {
                if (upload.file.length == 0) {
                    this.showMessage('Warning', '선택된 파일이 없습니다.<br>업로드할 파일을 선택해 주세요.');
                    return;
                }
                const formData = new FormData();
                formData.append('file', upload.file);

                const response = await requests.post(upload.url, {
                    headers: { 'Content-Type': 'multipart/form-data' },
                    body: formData
                });
                console.log('response:', response);
                upload.file = []; //파일 비우기
                if (response.result == 'SUCCESS') {
                    this.showMessage('Uploaded', '업로드 완료되었습니다.<br>PNR 생성 완료 후 EMAIL로 안내 됩니다.');
                }
                else {
                    this.showMessage('Error', response.error);
                }

                document.getElementById('file-Gen').value = '';
                document.getElementById('file-Gum').value = '';
            } catch (error) {
                upload.file = [];
                console.error(error);
                this.showMessage('Error', error);
            }
        },
    },
};
</script>
 
<style scoped>
.file-drop {
    width: 95%;
    height: 160px;
    border: 3px dashed #ccc;
    text-align: center !important;
    padding: 40px;

}</style>