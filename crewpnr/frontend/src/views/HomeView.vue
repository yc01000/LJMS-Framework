<template>
  <div class="header_util">
    <p class="sub_title">예약 생성</p>
    <ul class="cont">
      <li><a href="#" class="ico_home">home</a></li>
      <li><a href="#" class="ico_bul">승무원 예약</a></li>
      <li class="select"><a href="#" class="ico_bul">예약 생성</a></li>
    </ul>
  </div>

  <div class="btn_wrap">
    <input type="file" ref="fileInput1" @change="handleFileChange1" />
    <a href="#" @click="uploadFile1" class="btnTypeA">엑셀 업로드 (국내선 PNR 생성 요청)</a>
    <br><br>
    <input type="file" ref="fileInput2" @change="handleFileChange2" />
    <a href="#" @click="uploadFile2" class="btnTypeA">엑셀 업로드 (GUM PNR 생성 요청)</a>
    <br><br>
    <a href="#" class="btnTypeC" @click="downloadExcel">엑셀 형식 다운로드</a>
    <a href="#" class="btnTypeC" @click="downloadExcelGum">엑셀 형식 다운로드 (GUM)</a>
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
      selectedFile1: null,
      selectedFile2: null,
    };
  },
  methods: {
    showMessage(title, msg) {
      this.$refs.msg_box.showPopup(title, msg);
    },
    handleFileChange1(event) {
      this.selectedFile1 = event.target.files[0];
    },
    handleFileChange2(event) {
      this.selectedFile2 = event.target.files[0];
    },
    async uploadFile1() {
      try {
        const formData = new FormData();
        formData.append('file', this.selectedFile1);

        const response = await axios.post('https://stg-crewpnr.jinair.com/crew/createBookings', formData, {
          headers: {
            'Content-Type': 'multipart/form-data',
          },
        });

        if (response.status === 200) {
          this.showMessage('uploaded', '전송이 완료되었습니다.');
        } else {
          this.showMessage('error', '전송이 실패하였습니다.');
        }
      } catch (error) {
        console.error(error);
        this.showMessage('error', error);
      }
    },
    async uploadFile2() {
      try {
        const formData = new FormData();
        formData.append('file', this.selectedFile2);

        const response = await axios.post('https://stg-crewpnr.jinair.com/crew/createBookingsForGum', formData, {
          headers: {
            'Content-Type': 'multipart/form-data',
          },
        });

        if (response.status === 200) {
          this.showMessage('uploaded', '전송이 완료되었습니다.');
        } else {
          this.showMessage('error', '전송이 실패하였습니다.');
        }
      } catch (error) {
        console.error(error);
        this.showMessage('error', error);
      }
    },
    downloadExcel() {
      axios({
        url: 'https://stg-crewpnr.jinair.com/crew/getSummaryListExcel',
        method: 'GET',
        responseType: 'blob', // 엑셀 파일은 바이너리 데이터이므로 responseType을 'blob'으로 설정
      }).then(response => {
        const url = window.URL.createObjectURL(new Blob([response.data]));
        const link = document.createElement('a');
        link.href = url;
        link.setAttribute('download', 'example.xlsx');
        document.body.appendChild(link);
        link.click();
      }).catch((error) => {
        console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
        this.showMessage('error', error);
      });
    },
    downloadExcelGum() {
      axios({
        url: 'https://stg-crewpnr.jinair.com/crew/getSummaryListExcel',
        method: 'GET',
        responseType: 'blob', // 엑셀 파일은 바이너리 데이터이므로 responseType을 'blob'으로 설정
      }).then(response => {
        const url = window.URL.createObjectURL(new Blob([response.data]));
        const link = document.createElement('a');
        link.href = url;
        link.setAttribute('download', 'example.xlsx');
        document.body.appendChild(link);
        link.click();
      }).catch((error) => {
        console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
        this.showMessage('error', error);
      });
    },
  },
};
</script>