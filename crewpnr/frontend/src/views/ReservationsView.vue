<template>
  <div class="header_util">
    <p class="sub_title">예약 조회</p>
    <ul class="cont">
      <li><a href="#" class="ico_home">home</a></li>
      <li><a href="#" class="ico_bul">승무원 예약</a></li>
      <li class="select"><a href="#" class="ico_bul">예약 조회</a></li>
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
      </ul>
    </div>
    <div class="btn_wrap">
      <button class="btnTypeD" @click="search">조회</button>&nbsp;
      <download-excel class="btnTypeC" :data="this.items" worksheet="My Worksheet" name="filename.xls">엑셀로
        내보내기</download-excel>
    </div>
    <div class="btn_wrap">
      <!-- Modal 컴포넌트를 사용하고 isVisible, title, content 프로퍼티를 전달합니다 -->
      <CancelBooking v-if="modalVisible" :is-visible="modalVisible" :strItin="selectedItin" :strPnr="selectedPNR"
        @close="closeModal" />
    </div>
    <table class="table_style">
      <thead>
        <tr>
          <th>No</th>
          <th>항공편</th>
          <th>출발일자</th>
          <th>출발지</th>
          <th>도착지</th>
          <th>출발시간</th>
          <th>도착시간</th>
          <th>Class</th>
          <th>좌석수</th>
          <th>PNR</th>
          <th>Segment STS</th>
          <th>예약상태</th>
          <th>선택</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in items" :key="item.id" @click="handleRowClick(item)" @mouseover="handleMouseOver(item.id)"

          @mouseout="handleMouseOut(item.id)"
          :class="{ active: highlightedRowId === item.id, 'inactive-row': item.segmentStatus === 'CANCELED' }">

          <td>{{ item.id }}</td>
          <td>{{ item.fltnum }}</td>
          <td>{{ item.depDate }}</td>
          <td>{{ item.stnfrCode }}</td>
          <td>{{ item.stntoCode }}</td>
          <td>{{ item.departureDateTime }}</td>
          <td>{{ item.arrivalDateTime }}</td>
          <td>{{ item.fareClass }}</td>
          <td>{{ item.paxCount }}</td>

          <td :style="{ color: item.segmentStatus === isReaction(item.segmentStatus) ? 'red' : '' }">{{ item.pnrnumber }}</td>
          <td>{{ item.segmentStatus }}</td>

          <td v-if="isReaction(item.segmentStatus) !== true" onclick="event.cancelBubble=true">{{actionStatus(item.segmentStatus) }}</td>
          <td v-else onclick="event.cancelBubble=true"><button @click="acceptSchedule(item.pnrnumber)">확인</button></td>

          <td onclick="event.cancelBubble=true"><input v-if="item.segmentStatus !== 'CANCELED'" type="checkbox" v-model="selectedItems[item.pnrnumber]" /></td>
        </tr>
      </tbody>
    </table>
    <div class="btn_wrap">
      <button class="btnTypeA" @click="pnrCancel">PNR 취소</button>&nbsp;
    </div>
  </div>
  <div>
    <MessageBox ref="msg_box" />
  </div>
  <div>
    <MessageBox ref="msg_box" />
  </div>
</template>

<script>
import CancelBooking from './CancelBooking.vue'; // Modal 컴포넌트를 임포트합니다
import Datepicker from 'vue3-datepicker';
import { ref } from 'vue';
import JsonExcel from "vue-json-excel3";
import MessageBox from './MessageBox.vue';

export default {
  components: {
    CancelBooking, // 부모 컴포넌트에서 Modal 컴포넌트를 등록합니다
    Datepicker,
    downloadExcel: JsonExcel,
    MessageBox,
  },
  data() {
    return {
      items: [
        // { "fltnum": "LJ311", "depDate": "2023-10-05(목)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "6:00", "arrivalDateTime": "7:10", "fareClass": "U1", "paxCount": 1, "segmentStatus": "CONFIRMED", "pnrnumber": "P5267J" }, { "fltnum": "LJ301", "depDate": "2023-09-15(금)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "21:05", "arrivalDateTime": "22:20", "fareClass": "U1", "paxCount": 2, "segmentStatus": "CONFIRMED", "pnrnumber": "AAANJN" }, { "fltnum": "LJ61", "depDate": "2023-09-20(수)", "stnfrCode": "ICN", "stntoCode": "BKI", "departureDateTime": "8:15", "arrivalDateTime": "13:35", "fareClass": "YC", "paxCount": 5, "segmentStatus": "CONFIRMED", "pnrnumber": "DX9A3T" }, { "fltnum": "LJ61", "depDate": "2023-09-20(수)", "stnfrCode": "ICN", "stntoCode": "BKI", "departureDateTime": "8:15", "arrivalDateTime": "13:35", "fareClass": "YC", "paxCount": 5, "segmentStatus": "CONFIRMED", "pnrnumber": "Q625QA" }, { "fltnum": "LJ305", "depDate": "2023-09-10(일)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U0", "paxCount": 5, "segmentStatus": "CONFIRMED", "pnrnumber": "S38986" }, { "fltnum": "LJ305", "depDate": "2023-09-10(일)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 5, "segmentStatus": "CONFIRMED", "pnrnumber": "MM7Q23" }, { "fltnum": "LJ305", "depDate": "2023-09-10(일)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 5, "segmentStatus": "CONFIRMED", "pnrnumber": "Q4G595" }, { "fltnum": "LJ305", "depDate": "2023-10-03(화)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "WAS_WAITLISTED", "pnrnumber": "R2E74Z" }, { "fltnum": "LJ305", "depDate": "2023-10-03(화)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "WAS_CONFIRMED", "pnrnumber": "T2E75Y" }, { "fltnum": "LJ305", "depDate": "2023-08-03(목)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "WAITLISTED", "pnrnumber": "FC63NA" }, { "fltnum": "LJ305", "depDate": "2023-08-04(금)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "CONFIRMED", "pnrnumber": "ET6A3T" }, { "fltnum": "LJ305", "depDate": "2023-08-03(목)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "WAITLISTED", "pnrnumber": "Q627NA" }, { "fltnum": "LJ211", "depDate": "2023-07-05(수)", "stnfrCode": "ICN", "stntoCode": "KIX", "departureDateTime": "22:40", "arrivalDateTime": "0:30", "fareClass": "YI", "paxCount": 2, "segmentStatus": "WAITLISTED", "pnrnumber": "DAANGN" }, { "fltnum": "LJ211", "depDate": "2023-07-05(수)", "stnfrCode": "ICN", "stntoCode": "KIX", "departureDateTime": "22:40", "arrivalDateTime": "0:30", "fareClass": "YI", "paxCount": 2, "segmentStatus": "CONFIRMED", "pnrnumber": "A3N4XA" }, { "fltnum": "LJ211", "depDate": "2023-07-05(수)", "stnfrCode": "ICN", "stntoCode": "KIX", "departureDateTime": "22:40", "arrivalDateTime": "0:30", "fareClass": "YI", "paxCount": 2, "segmentStatus": "CONFIRMED", "pnrnumber": "T88H28" }, { "fltnum": "LJ305", "depDate": "2023-08-03(목)", "stnfrCode": "GMP", "stntoCode": "CJU", "departureDateTime": "1:30", "arrivalDateTime": "2:45", "fareClass": "U1", "paxCount": 4, "segmentStatus": "CONFIRMED", "pnrnumber": "J36AP3" }, { "fltnum": "LJ211", "depDate": "2023-07-05(수)", "stnfrCode": "ICN", "stntoCode": "KIX", "departureDateTime": "22:40", "arrivalDateTime": "0:30", "fareClass": "YI", "paxCount": 1, "segmentStatus": "CONFIRMED", "pnrnumber": "APDTR2" }
      ],
      modalVisible: false, // 모달의 표시 여부를 저장하는 데이터 속성
      selectedPNR: "",
      selectedItin: "",
      highlightedRowId: null,
      selectedDate1: ref(new Date()),
      selectedDate2: ref(new Date()),
      inputJSON: "",
      selectedItems: [], // 체크박스 선택 여부를 저장하는 배열
      highlightedRowId: null,
      selectedDate1: ref(new Date()),
      selectedDate2: ref(new Date()),
    };
  },
  setup() {
    // const picked = ref(new Date());
  },
  mounted() {

  },

  methods: {
    showMessage(title, msg) {
      this.$refs.msg_box.showPopup(title, msg);
    },

    acceptSchedule(pnr) {
      console.log("pnr:", pnr);
      fetch('https://stg-crewpnr.jinair.com/crew/acceptSchedule?pnrNumber=' + pnr)
        .then((response) => response.json())
        .then((data) => {
          console.log("acceptSchedule result: ", data);
          this.showMessage('Inform', '처리가 완료되었습니다.');
        })
        .catch((error) => {
          console.error('전송 중 오류가 발생했습니다.', error);
          this.showMessage('Error', error);
        });
    },
    pnrCancel() {
      console.log("selectedItems: ", this.selectedItems);
      if (this.selectedItems.length == 0) {
        this.showMessage('Warnning', '선택된 예약이 없습니다.');
        return;
      }
      for (let pnr in this.selectedItems) {
        console.log("selectedItems pnr: ", pnr);
        fetch('https://stg-crewpnr.jinair.com/crew/cancelReservation?pnrNumber=' + pnr)
          .then((response) => response.json())
          .then((data) => {
            console.log("cancelReservation result: ", data);
          })
          .catch((error) => {
            console.error('전송 중 오류가 발생했습니다.', error);
            this.showMessage('Error', error);
          });
      }
    },
    actionStatus(sts) {
      if (sts == 'CONFIRMED') {
        return '완료';
      } else if (sts == 'WAITLISTED') {
        return '대기';
      } else if (sts == 'WAS_CONFIRMED' || sts == 'WAS_WAITLISTED') {
        return '비운항';
      } else if (sts == 'CANCELED') {
        return '취소';
      } else {
        return 'Unknown';
      }
    },
    isReaction(sts) {
      if (sts == 'CONFIRMED_FROM_WAITLIST' || sts == 'TIME_CHANGE' || sts == 'SCHEDULE_CHANGE') {
        return true;
      } else {
        return false;
      }
    },
    search() {
      if (this.fieldValidation() == false) {
        this.showMessage('Warning', "도시코드는 필수 입니다.");
        return;
      }

      let inputJson = this.generateInputJson();
      console.log("inputJson:", inputJson);

      fetch('https://stg-crewpnr.jinair.com/crew/getReservationSummary', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json' // JSON 데이터를 전송한다고 서버에 알림
        },
        body: inputJson // JSON 데이터를 문자열로 변환하여 바디에 넣음
      })
        .then((response) => response.json())
        .then((data) => {
          console.log("response:", data)
          if (data.all.Error !== undefined) {
            this.items = [];
            this.showMessage('Warning', data.all.Error);
            return;
          }
          // 순번을 추가한 JSON 데이터
          const itemsWithIndex = data.all.summaryResult.map((item, index) => {
            return {
              id: index + 1, // 순번을 1부터 시작하려면 index + 1을 사용
              ...item,
            };
          });
          this.items = itemsWithIndex;
          console.log("itemsWithIndex:", itemsWithIndex);

        })
        .catch((error) => {
          console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
          this.showMessage('Error', error);
        });

    },
    showModal() {
      // 모달을 열기 위해 modalVisible 값을 true로 설정합니다
      this.modalVisible = true;
    },
    closeModal() {
      // 모달을 닫기 위해 modalVisible 값을 false로 설정합니다
      this.modalVisible = false;
    },
    handleRowClick(item) {
      this.selectedPNR = item.pnrnumber;
      this.selectedItin = item.stnfrCode + "-" + item.stntoCode;
      this.showModal();
    },
    handleMouseOver(id) {
      this.highlightedRowId = id;
    },
    handleMouseOut(id) {
      this.highlightedRowId = null;
    },
    generateInputJson() {
      const jsonData = {
        depStartDate: document.getElementById('qModel_datefr').value,
        depEndDate: document.getElementById('qModel_dateto').value,
        stnfrCode: document.getElementById('qModel_stnfr').value.toUpperCase(),
        stntoCode: document.getElementById('qModel_stnto').value.toUpperCase(),
        // DepStartDate: this.$refs.qModel_datefr?.value,
        // DepEndDate: this.$refs.qModel_dateto?.value,
        // StnfrCode: this.$refs.qModel_stnfr?.value,
        // StntoCode: this.$refs.qModel_stnto?.value,
      };
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

<style scoped>
tr:hover {
  background-color: #f5f5f5;
  /* 마우스를 올렸을 때 배경 색상 변경 */
}

tr.active {
  background-color: #ffcccb;
  /* 선택된 행의 배경 색상 변경 */
}

.inactive-row {
  color: lightgray;
}

.table_style {
  cursor: pointer;
}</style>
