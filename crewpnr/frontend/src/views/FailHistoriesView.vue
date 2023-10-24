<template>
  <div class="header_util">
    <p class="sub_title">예약 생성 실패 이력 조회</p>
    <ul class="cont">
      <li><a href="#" class="ico_home">home</a></li>
      <li><a href="#" class="ico_bul">승무원 예약</a></li>
      <li class="select"><a href="#" class="ico_bul">예약 생성 실패 이력 조회</a></li>
    </ul>
  </div>

  <div>
    <div class="filter search_form_box">
      <ul>
        <li>
          <div style="display: flex; justify-content: center; align-items: center;">
            <label>DEP DATE<span class="fontTypeA normal">(*)</span></label>
            <Datepicker id="qModel_datefr" class="btn_calendar hasDatepicker" v-model="selectedDate1" format="yyyy-MM-dd">
            </Datepicker>
            <span style="margin: 10px">~</span>
            <Datepicker id="qModel_dateto" class="btn_calendar hasDatepicker" v-model="selectedDate2" format="yyyy-MM-dd">
            </Datepicker>
          </div>
        </li>
        <li>
          <label>DEP/ARR<span class="fontTypeA normal">(*)</span></label>
          <input class="inputPort" id="qModel_stnfr" maxlength="3" name="qModel.stnfr" placeholder="GMP" type="text"
            value="" /> &nbsp;&nbsp;&nbsp;
          <input class="inputPort" id="qModel_stnto" maxlength="3" name="qModel.stnto" placeholder="CJU" type="text"
            value="" />
        </li>
        <li>
          <div style="display: flex; align-items: center;">
            <label>Fare Class</label>
            <input id="qModel_fareclass" maxlength="4" name="qModel.fareclass" placeholder="U1" type="text" value="">
          </div>
        </li>
        <li>
          <label>Passenger Count</label>
          <input class="inputnumber" id="qModel_paxcnt" maxlength="4" name="qModel.paxcnt" placeholder="" type="text"
            value="">
        </li>
      </ul>
    </div>
    <div class="btn_wrap">
      <a href="javascript://" class="btnTypeD" @click="search">조회</a>&nbsp;
      <download-excel class="btnTypeC" :data="this.items" worksheet="My Worksheet" name="filename.xls">엑셀로
        내보내기</download-excel>
    </div>

    <table class="table_style">
      <thead>
        <tr>
          <th>Seq</th>
          <th>Departure Date</th>
          <th>Flight Number</th>
          <th>Origin Station</th>
          <th>Destination Station</th>
          <th>Fare Class</th>
          <th>Passenger Count</th>
          <th>Error Value</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in items" :key="item.seq">
          <td>{{ item.seq }}</td>
          <td>{{ item.depDate }}</td>
          <td>{{ item.fltNum }}</td>
          <td>{{ item.stnfrCode }}</td>
          <td>{{ item.stntoCode }}</td>
          <td>{{ item.fareClass }}</td>
          <td>{{ item.paxCnt }}</td>
          <td>{{ item.errorValue }}</td>
        </tr>
      </tbody>
    </table>
  </div>
  <div>
    <MessageBox ref="msg_box" />
  </div>
</template>

<script>
import Datepicker from 'vue3-datepicker';
import { ref } from 'vue';
import JsonExcel from "vue-json-excel3";
import MessageBox from './MessageBox.vue';

export default {
  components: {
    Datepicker,
    downloadExcel: JsonExcel,
    MessageBox,
  },
  data() {
    return {
      items: [
        // { "seq": 0, "depDate": "20230904", "fltNum": "LJ305", "stnfrCode": "GMP", "stntoCode": "CJU", "fareClass": "U1", "paxCnt": 5, "errorValue": "cmm.msg.alert.error" }, { "seq": 0, "depDate": "20230904", "fltNum": "LJ305", "stnfrCode": "GMP", "stntoCode": "CJU", "fareClass": "U1", "paxCnt": 5, "errorValue": "AVAILABILITY_8001; Availability cannot be searched for past dates." }
      ],
      selectedDate1: ref(new Date()),
      selectedDate2: ref(new Date()),
    };
  },

  mounted() {
  },

  methods: {
    showMessage(title, msg) {
      this.$refs.msg_box.showPopup(title, msg);
    },
    search() {
      if (this.fieldValidation() == false) {
        this.showMessage('Warning', "도시코드는 필수 입니다.");
        return;
      }

      let inputJson = this.generateInputJson();
      console.log("inputJson:", inputJson);

      fetch('https://stg-crewpnr.jinair.com/crew/getCreateBookingFailLog', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json' // JSON 데이터를 전송한다고 서버에 알림
        },
        body: inputJson // JSON 데이터를 문자열로 변환하여 바디에 넣음
      })
        .then((response) => response.json())
        .then((data) => {
          if(data.list.length == 0){
            this.showMessage('warnning', '조회된 데이터가 없습니다.');
          }
          this.items = data.list;
          console.log("response data:", data)
        })
        .catch((error) => {
          console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
          this.showMessage('Error', error);
        });
    },
    generateInputJson() {
      const jsonData = {
        brdStrtDt: document.getElementById('qModel_datefr').value.replaceAll('-', ''),
        brdEndDt: document.getElementById('qModel_dateto').value.replaceAll('-', ''),
        stnfrCode: document.getElementById('qModel_stnfr').value.toUpperCase(),
        stntoCode: document.getElementById('qModel_stnto').value.toUpperCase(),
        fareClass: document.getElementById('qModel_fareclass').value,
        paxCount: document.getElementById('qModel_paxcnt').value,
      };
      // 생성된 JSON 데이터를 문자열로 변환하여 데이터 속성에 저장

      return JSON.stringify(jsonData, null, 2);
    },
    fieldValidation() {
      if (document.getElementById('qModel_stnfr').value == "" || document.getElementById('qModel_stnto').value == "")
        return false;
      else
        return true;
    },
  }
};
</script>
