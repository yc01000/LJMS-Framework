<template>
    <div class="header_util">
        <p class="sub_title">예약 생성</p>
        <ul class="cont">
            <li><a href="#" class="ico_home">home</a></li>
            <li><a href="#" class="ico_bul">승무원 예약</a></li>
            <li class="select"><a href="#" class="ico_bul">예약 생성</a></li>
        </ul>
    </div>
    <div class="content_wrap">
        <div class="btn_wrap">
            <table>
                <tr>
                    <td style="width: 20%;"></td>
                    <td style="width: 60%;">
                        <div id="filedrop-Gen" class="file-drop filebox" @dragover="onDragover" @drop="handleDrop">
                            <label for="file-Gen">파일 찾기</label>
                            <input id="file-Gen" type="file" @change="handleFileChange" />
                            <span id="text-Gen" style="border:0px; font-size: large; padding: 15px;">
                                {{ this.GenUploadFile === null ? '일반 예약 파일을 이 영역 위에 끌어다 놓으세요' :
                                    this.GenUploadFile.name }}</span>
                        </div>
                    </td>
                    <td style="text-align: center; width: 20%;">
                        <a href="#" @click="uploadFile('Gen')" class="btnTypeD">엑셀 업로드 (PNR 생성 요청)</a>
                    </td>
                </tr>
                <tr style="height: 20px;">
                    <td colspan="3"></td>
                </tr>
                <tr>
                    <td style="width: 20%;"></td>
                    <td style="width: 60%;">
                        <div id="filedrop-Gum" class="file-drop filebox" @dragover="onDragover" @drop="handleDrop">
                            <label for="file-Gum">파일 찾기</label>
                            <input id="file-Gum" type="file" @change="handleFileChange" />
                            <span id="text-Gum" style="border:0px; font-size: large; padding: 15px;">
                                {{ this.GumUploadFile === null ? '괌 예약 파일을 이 영역 위에 끌어다 놓으세요' :
                                    this.GumUploadFile.name }}</span>
                        </div>
                    </td>
                    <td style="text-align: center; width: 20%;">
                        <a href="#" @click="uploadFile('Gum')" class="btnTypeD">엑셀 업로드 (GUM PNR 생성)</a>
                    </td>
                </tr>
                <tr style="height: 40px;">
                    <td colspan="3"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <a href="https://imagesstg.jinair.com/eForm/crewpnr_example.xlsx" class="btnTypeC">엑셀 형식 다운로드</a>
                        &nbsp;
                        <a href="https://imagesstg.jinair.com/eForm/crewpnr_gum_example.xlsx" class="btnTypeC">엑셀 형식
                            다운로드(GUM)</a>
                    </td>
                    <td>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div>
        <MessageBox ref="msg_box" />
    </div>
</template>
  
<script>
import axios from 'axios';
import MessageBox from '@/components/MessageBox.vue';

export default {
    components: {
        MessageBox,
    },
    data() {
        return {
            GenUploadFile: null,
            GumUploadFile: null,
        };
    },
    methods: {
        showMessage(title, msg) {
            this.$refs.msg_box.showPopup(title, msg);
        },
        onDragover(event) {
            event.preventDefault();
        },
        handleDrop(event) {
            event.preventDefault();
            if (event.target.id.split('-')[1] === 'Gen') {
                this.GenUploadFile = event.dataTransfer.files[0];
            }
            else if (event.target.id.split('-')[1] === 'Gum') {
                this.GumUploadFile = event.dataTransfer.files[0];
            }
            console.log("event id:", event);
        },
        handleFileChange(event) {
            if (event.target.id === 'file-Gen') {
                this.GenUploadFile = event.target.files[0];
            }
            else if (event.target.id === 'file-Gum') {
                this.GumUploadFile = event.target.files[0];
            }
            console.log("event id:", event);
        },
        async uploadFile(type) {
            let url = '';
            let uploadfile = null;
            try {
                if (type == 'Gen') {
                    url = 'https://stg-crewpnr.jinair.com/crew/createBookings';
                    uploadfile = this.GenUploadFile;
                }
                else {
                    url = 'https://stg-crewpnr.jinair.com/crew/createBookingsForGum';
                    uploadfile = this.GumUploadFile;
                }
                if(uploadfile == null){
                    this.showMessage('Warning', '선택된 파일이 없습니다.<br>업로드할 파일을 선택해 주세요.');
                    return;
                }
                const formData = new FormData();
                formData.append('file', uploadfile);

                const response = await axios.post(url, formData, {
                    headers: {
                        'Content-Type': 'multipart/form-data',
                    },
                });
                console.log('response:', response);
                this.GenUploadFile = this.GumUploadFile = null;
                if (response.data.result == 'SUCCESS'){
                    this.showMessage('Uploaded', '업로드 완료되었습니다.<br>PNR 생성 완료 후 EMAIL로 안내 됩니다.');
                }
                else{
                    this.showMessage('Error', response.data.error);
                }

            } catch (error) {
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
    height: 30px;
    border: 2px dashed #ccc;
    text-align: left;
    padding: 15px;
    cursor: pointer;
}
</style>