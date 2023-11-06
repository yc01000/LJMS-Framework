<template>
    <div>
        <div v-if="loading" class="loading-overlay" tabindex="-1"><img src="/images/bo/loading.gif" tabindex="-1" /></div>
        <div v-else>
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
                            <div style="display: flex; justify-content: left; align-items: center;">
                                <label>DEP DATE<span class="fontTypeA normal">(*)</span></label>
                                <Datepicker id="qModel_datefr" class="btn_calendar hasDatepicker" v-model="selectedDate1"
                                    format="yyyy-MM-dd">
                                </Datepicker>
                                <span style="margin: 10px">~</span>
                                <Datepicker id="qModel_dateto" class="btn_calendar hasDatepicker" v-model="selectedDate2"
                                    format="yyyy-MM-dd">
                                </Datepicker>
                            </div>
                        </li>
                        <li>
                            <label>DEP/ARR<span class="fontTypeA normal">(*)</span></label>
                            <input class="inputPort" id="qModel_stnfr" maxlength="3" v-model="stnfr" placeholder="GMP"
                                type="text" /> &nbsp;&nbsp;&nbsp;
                            <input class="inputPort" id="qModel_stnto" maxlength="3" v-model="stnto" placeholder="CJU"
                                type="text" />
                        </li>

                        <!-- <li>
                            <div style="display: flex; justify-content: left; align-items: center;">
                                <label>예약상태</label>
                                <Dropdown :options="statusOptions" :bindedOptions="selectedStatus"
                                    @select="handleSelection" />
                            </div>
                        </li>
                        <li>
                            <label>Class</label>
                            <select v-model="classOption">
                                <option value="">All (Select an option)</option>
                                <option v-for="option in classOptions" :key="option" :value="option">
                                    {{ option }}</option>
                            </select>
                            <span style="margin: 10px">좌석수</span>
                            <select v-model="paxCntOption" style="width:90pt">
                                <option value="">All (Select an option)</option>
                                <option v-for="option in paxCntOptions" :key="option" :value="option">
                                    {{ option }}</option>
                            </select>
                        </li> -->

                    </ul>
                </div>
                <div class="btn_wrap">
                    <button class="btnTypeD" @click="search">조회</button>&nbsp;
                    <download-excel class="btnTypeC" :data="this.items" worksheet="My Worksheet" name="filename.xls">엑셀로
                        내보내기</download-excel>
                </div>
                <div class="btn_wrap">
                    <!-- Modal 컴포넌트를 사용하고 isVisible, title, content 프로퍼티를 전달합니다 -->
                    <CancelBooking v-if="modalVisible" :is-visible="modalVisible" :strItin="selectedItin"
                        :strPnr="selectedPNR" @close="closeModal" />
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
                            <th><select v-model="classOption">
                                    <option value="">Class(All)</option>
                                    <option v-for="option in classOptions" :key="option" :value="option">
                                        {{ option }}</option>
                                </select></th>
                            <th><select v-model="paxCntOption" style="width:90pt">
                                    <option value="">좌석수(All)</option>
                                    <option v-for="option in paxCntOptions" :key="option" :value="option">
                                        {{ option }}</option>
                                </select></th>
                            <th>PNR</th>
                            <th>Segment STS</th>
                            <th>
                                <div style="display: flex; justify-content: center; align-items: center;">
                                    <Dropdown :options="statusOptions" :bindedOptions="selectedStatus"
                                        @select="handleSelection">예약상태</Dropdown>
                                </div>
                            </th>
                            <th>선택 <input type="checkbox" v-model="selectAll" @change="selectAllItems" /></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="item in filteredRows" :key="item.id" @click="handleRowClick(item)"
                            @mouseover="handleMouseOver(item.id)" @mouseout="handleMouseOut(item.id)"
                            :class="{ active: highlightedRowId === item.id, 'cancel-row': 'CANCELLED' === item.status, 'click-row': isExcept(item.status) === false }">
                            <td>{{ item.id }}</td>
                            <td>{{ item.fltnum }}</td>
                            <td>{{ item.depDate }}</td>
                            <td>{{ item.stnfrCode }}</td>
                            <td>{{ item.stntoCode }}</td>
                            <td>{{ item.departureDateTime }}</td>
                            <td>{{ item.arrivalDateTime }}</td>
                            <td>{{ item.fareClass }}</td>
                            <td>{{ item.paxCount }}</td>
                            <td v-if="item.status === 'CANCELLED'">{{ item.pnrnumber }}</td>
                            <td v-else :style="{ color: isExcept(item.status) ? 'red' : '' }">{{ item.pnrnumber }}</td>
                            <td>{{ item.segmentStatus }}</td>
                            <td>{{ statusTitle(item.status) }}</td>
                            <td v-if="item.status === 'CANCELLED'" onclick="event.cancelBubble=true"></td>
                            <td v-else-if="isExcept(item.status) === false" onclick="event.cancelBubble=true"><input
                                    type="checkbox" v-model="selectedItems" :value="item" /></td>
                            <td v-else onclick="event.cancelBubble=true"><button
                                    @click="acceptSchedule(item.pnrnumber)">Accept</button></td>
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
        </div>
    </div>
</template>

<script>
import CancelBooking from './CancelBooking.vue'; // Modal 컴포넌트를 임포트합니다
import Datepicker from 'vue3-datepicker';
import { ref } from 'vue';
import JsonExcel from "vue-json-excel3";
import MessageBox from '@/components/MessageBox.vue';
import DropdownWithCheck from '@/components/DropdownWithCheck.vue';

export default {
    components: {
        CancelBooking, // 부모 컴포넌트에서 Modal 컴포넌트를 등록합니다
        Datepicker,
        downloadExcel: JsonExcel,
        MessageBox,
        Dropdown: DropdownWithCheck,
    },
    data() {
        return {
            items: [
                // {"fltnum":"LJ305","depDate":"2023-08-03(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":2,"pnrStatus":"ACTIVE","status":"CONFIRMED","statusDisplay":"완료","segmentStatus":"CONFIRMED","pnrnumber":"J36AP3"},{"fltnum":"LJ305","depDate":"2023-08-03(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":4,"pnrStatus":"ACTIVE","status":"WAITLISTED_HL","segmentStatus":"WAITLISTED","pnrnumber":"FC63NA"},{"fltnum":"LJ305","depDate":"2023-08-03(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":4,"pnrStatus":"ACTIVE","status":"WAITLISTED_HL","segmentStatus":"WAITLISTED","pnrnumber":"Q627NA"},{"fltnum":"LJ305","depDate":"2023-08-03(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"A7AP47"},{"fltnum":"LJ305","depDate":"2023-08-03(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"ZAANFA"},{"fltnum":"LJ305","depDate":"2023-08-04(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":1,"pnrStatus":"ACTIVE","status":"CONFIRMED","statusDisplay":"완료","segmentStatus":"CONFIRMED","pnrnumber":"ET6A3T"},{"fltnum":"LJ305","depDate":"2023-08-04(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"RW422E"},{"fltnum":"LJ305","depDate":"2023-08-04(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"RQ872E"},{"fltnum":"LJ305","depDate":"2023-08-04(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"Q4L975"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":1,"pnrStatus":"ACTIVE","status":"CONFIRMED","statusDisplay":"완료","segmentStatus":"CONFIRMED","pnrnumber":"Q4G595"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":1,"pnrStatus":"ACTIVE","status":"CONFIRMED","statusDisplay":"완료","segmentStatus":"CONFIRMED","pnrnumber":"V2E77U"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"D23U6W"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"N23U6Y"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"N2E77P"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":5,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"S38986"},{"fltnum":"LJ305","depDate":"2023-09-10(일)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":5,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"MM7Q23"},{"fltnum":"LJ301","depDate":"2023-09-15(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"AAANJN"},{"fltnum":"LJ301","depDate":"2023-09-15(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"B2E76Z"},{"fltnum":"LJ301","depDate":"2023-09-15(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"T22PRT"},{"fltnum":"LJ301","depDate":"2023-09-15(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"SB452E"},{"fltnum":"LJ301","depDate":"2023-09-15(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":5,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"A282T7"},{"fltnum":"LJ305","depDate":"2023-10-03(화)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":2,"pnrStatus":"ACTIVE","status":"NO_OP","statusDisplay":"비운항","segmentStatus":"WAS_WAITLISTED","pnrnumber":"R2E74Z"},{"fltnum":"LJ305","depDate":"2023-10-03(화)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","fareClass":"U1","paxCount":4,"pnrStatus":"ACTIVE","status":"NO_OP","statusDisplay":"비운항","segmentStatus":"WAS_CONFIRMED","pnrnumber":"T2E75Y"},{"fltnum":"LJ305","depDate":"2023-10-03(화)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"GAANJP"},{"fltnum":"LJ305","depDate":"2023-10-03(화)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"1:30","arrivalDateTime":"2:45","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"L24AP4"},{"fltnum":"LJ311","depDate":"2023-10-05(목)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"6:00","arrivalDateTime":"7:10","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"P5267J"},{"fltnum":"LJ303","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:15","arrivalDateTime":"22:25","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"BL3TC2"},{"fltnum":"LJ301","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"FD93BA"},{"fltnum":"LJ303","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:15","arrivalDateTime":"22:25","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"Q4S975"},{"fltnum":"LJ303","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:15","arrivalDateTime":"22:25","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"E23U7L"},{"fltnum":"LJ301","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"BL3MR2"},{"fltnum":"LJ301","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"QLA3Z6"},{"fltnum":"LJ303","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:15","arrivalDateTime":"22:25","paxCount":4,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"MP23S7"},{"fltnum":"LJ301","depDate":"2023-10-20(금)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:05","arrivalDateTime":"22:20","paxCount":2,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"EWA3Z7"},{"fltnum":"LJ303","depDate":"2023-10-25(수)","stnfrCode":"GMP","stntoCode":"CJU","departureDateTime":"21:10","arrivalDateTime":"22:20","paxCount":1,"pnrStatus":"CANCELLED","status":"CANCELLED","statusDisplay":"취소","segmentStatus":"CANCELLED","pnrnumber":"BL2RW2"}
            ],
            modalVisible: false, // 모달의 표시 여부를 저장하는 데이터 속성
            selectedPNR: "",
            selectedItin: "",
            highlightedRowId: null,
            selectedDate1: ref(new Date()),
            selectedDate2: ref(new Date()),
            stnfr: "",
            stnto: "",
            selectedStatus: [], //예약상태 statusOptions의 선택값
            statusOptions: [
                { value: "CONFIRMED", label: "완료" },
                { value: "WAITLISTED_HL", label: "대기(HL)" },
                { value: "WAITLISTED_KL", label: "대기(KL)" },
                { value: "NO_OP", label: "비운항" },
                { value: "SCHEDULE_CHANGE", label: "여정 변경" },
                { value: "TIME_CHANGE", label: "시간 변경" },
                { value: "CANCELLED", label: "취소" }
            ],
            classOption: '', // 클래스 선택값
            classOptions: ['U0', 'U1', 'C', 'U3'],
            paxCntOption: '', // 승객수 선택값
            paxCntOptions: [1, 2, 3, 4, 5, 6, 7, 8, 9],
            selectAll: false, //전체선택을 위한 변수
            selectedItems: [], //선택된 리스트
            loading: false, // 레이어가 새로 그려지기 때문에 vue 생성주기에 문제가 생기므로 이벤트시 코딩처리 해줘야 함.
        };
    },
    setup() {

    },
    mounted() {

    },
    computed: {
        // 조회조건 AND 형태로 필터링하는 기능. 예약상태, 클래스, 승객수
        filteredRows() {
            this.selectAll = false; //조건이 바뀌므로 전체선택 초기화
            this.selectedItems = []; //조건이 바뀌므로 선택 초기화
            let selStatusValues = this.selectedStatus.map(item => item.value); //예약상태 필터

            return this.items.filter(row => {
                let result = true;
                if (selStatusValues.length != 0) {
                    if (selStatusValues.includes(row.status) == false) {
                        return false;
                    }
                }
                if ((this.classOption == "" || row.fareClass == this.classOption) == false) {
                    return false;
                }
                if ((this.paxCntOption == "" || row.paxCount == this.paxCntOption) == false) {
                    return false;
                }
                return result;
            });
        }
    },
    methods: {
        // 전체 선택시, 버튼과 취소 PNR은 제외시켜야 함.
        selectAllItems() {
            if (this.selectAll) {
                this.selectedItems = [...this.filteredRows];
                this.selectedItems = this.selectedItems.filter(row => {
                    if (this.isExcept(row.status)) {
                        return false;
                    }
                    else {
                        return true;
                    }
                });
            } else {
                this.selectedItems = [];
            }
        },
        showMessage(title, msg) {
            console.log('refs.msg_box:', this.$refs.msg_box);
            this.$refs.msg_box.showPopup(title, msg);
        },
        handleSelection(selectedOptions) { //검색조건의 예약상태 리스트. 조회시, 콤보박스 컴포넌트 체크내용과 화면에서 동일하게 유지 하기위해..,
            this.selectedStatus = selectedOptions;
        },
        //Accept버튼 처리.
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
        // PNR 취소 버튼 클릭. 선택된 PNR 처리.
        pnrCancel() {
            let errMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            let successMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            if (this.selectedItems.length == 0) {
                this.showMessage('Warning', '선택된 예약이 없습니다.');
                return;
            }
            if (this.selectedItems.length > 20) {
                this.showMessage('Warning', '선택된 예약은 20개 미만이어야 합니다.');
                return;
            }
            if(confirm("선택한 PNR을 일괄 취소 하시겠습니까?") == false){
                return;
            }
            const jsonData = {
                pnrNumber: this.selectedItems.map(item => item.pnrnumber),
            };
            let inputJson = JSON.stringify(jsonData, null, 2);
            console.log("inputJson:", inputJson);

            this.loading = true;
            fetch('https://stg-crewpnr.jinair.com/crew/cancelReservation', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json' // JSON 데이터를 전송한다고 서버에 알림
                },
                body: inputJson // JSON 데이터를 문자열로 변환하여 바디에 넣음
            })
                .then((response) => response.json())
                .then((data) => {
                    this.loading = false;
                    console.log("cancelReservation result: ", data);
                    successMsg = '처리가 완료되었습니다.\n' + data.all.result;
                })
                .catch((error) => {
                    this.loading = false;
                    console.error('전송 중 오류가 발생했습니다.', error);
                    errMsg = error;
                })
                .finally(() => {
                    if (errMsg !== "") {
                        this.showMessage('Error', errMsg);
                    }
                    if (successMsg !== "") {
                        //this.showMessage('Inform', successMsg);
                        alert(successMsg);
                        this.search();
                    }
                });
        },
        statusTitle(sts) {
            let strSts = this.statusOptions.find((el) => { return el.value === sts });
            return (strSts == null || strSts == "undefined" ? 'undefined' : strSts.label);
        },
        //체크박스(PNR취소)가 필요없는 상태 들..
        isExcept(sts) { 
            if (sts == 'TIME_CHANGE' || sts == 'SCHEDULE_CHANGE' || sts == 'CANCELLED') {
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

            let errMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            let inputJson = this.generateInputJson();
            console.log("inputJson:", inputJson);
            this.loading = true;
            fetch('https://stg-crewpnr.jinair.com/crew/getReservationSummary', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json' // JSON 데이터를 전송한다고 서버에 알림
                },
                body: inputJson // JSON 데이터를 문자열로 변환하여 바디에 넣음
            })
                .then((response) => response.json())
                .then((data) => {
                    this.loading = false;
                    console.log("response:", data)
                    if (data.all.Error !== undefined) {
                        this.items = [];
                        errMsg = data.all.Error;
                    }
                    else {
                        // 순번을 추가한 JSON 데이터
                        const itemsWithIndex = data.all.summaryResult.map((item, index) => {
                            return {
                                id: index + 1, // 순번을 1부터 시작하려면 index + 1을 사용
                                ...item,
                            };
                        });
                        this.items = itemsWithIndex;
                    }
                })
                .catch((error) => {
                    this.loading = false;
                    console.log('데이터를 불러오는 중 오류가 발생했습니다.', error);
                    errMsg = error;
                })
                .finally(() => {
                    if (errMsg !== "") {
                        this.showMessage('Error', errMsg);
                    }
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
            if (this.isExcept(item.status)) {
                return;
            }
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
                // depStartDate: this.selectedDate1.format("yyyy-MM-dd"),
                // depEndDate: this.selectedDate2.format("yyyy-MM-dd"),
                // stnfrCode: this.stnfr.toUpperCase(),
                // stntoCode: this.stnfr.toUpperCase(),
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

.cancel-row {
    /* PNR 취소된 row 회색처리 */
    color: lightgray;
}

.click-row {
    /* PNR 취소 대상만 row 클릭가능 */
    cursor: pointer;
}

.loading-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}</style>
