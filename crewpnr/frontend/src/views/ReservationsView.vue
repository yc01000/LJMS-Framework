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
            <span style="font-size: 14px;">* 출발일자, 출도착지 혹은 항공편명 중 1개 조건을 필수 선택 후 조회해 주세요.<br>
            * 조회한 기간 내 예약된 PNR이 100개 이상인 경우, 일부 PNR은 LIST에 표출되지 않습니다. 조회 기간을 줄인 후 다시 조회해 주세요.</span><br><br>
            <div>
                <div class="filter search_tb">
                    <table>
                        <colgroup>
                            <col style="width:9%;">
                            <col>
                            <col style="width:9%;">
                            <col>
                            <col style="width:9%;">
                            <col style="width:20%;">
                        </colgroup>
                        <tbody>
                            <tr>
                                <th>출발일자<span class="fontTypeA normal">(*)</span></th>
                                <td>
                                    <div style="display: flex; justify-content: left; align-items: center;">
                                    <Datepicker id="required_datefr" class="btn_calendar hasDatepicker" v-model="selectedDate1"
                                        format="yyyy-MM-dd">
                                    </Datepicker>
                                    <span style="margin: 10px">~</span>
                                    <Datepicker id="required_dateto" class="btn_calendar hasDatepicker" v-model="selectedDate2"
                                        format="yyyy-MM-dd">
                                    </Datepicker>
                                </div>
                                </td>
                                <th>출도착지<span class="fontTypeA normal">(*)</span></th>
                                <td>
                                    <input class="inputPort" id="required_stnfr" maxlength="3" v-model="stnfr" placeholder="GMP"
                                        type="text" /> &nbsp;&nbsp;&nbsp;
                                    <input class="inputPort" id="required_stnto" maxlength="3" v-model="stnto" placeholder="CJU"
                                        type="text" />                            </td>
                                <th>항공편명(LJ)<span class="fontTypeA normal">(*)</span></th>
                                <td><input id="required_fltNo" maxlength="5" v-model="flightNumber" class="common_input" type="text" placeholder="001, 3~4숫자+suffix"> <!-- @input="allowOnlyNumbers"> --></td>
                            </tr>
                            <tr>
                                <th>좌석등급</th>
                                <td>
                                    <select v-model="classOption">
                                        <option value="">All (Select an option)</option>
                                        <option v-for="option in classOptions" :key="option.value" :value="option.value">
                                            {{ option.label }}</option>
                                    </select>
                                </td>
                                <th>예약상태  <img src="/images/icon/filter3.png" tabindex="-1" /></th>
                                <td>
                                    <select v-model="selectedStatus">
                                        <option value="">All (Select an option)</option>
                                        <option v-for="option in statusOptions" :key="option.value" :value="option.value">
                                            {{ option.label }}</option>
                                    </select>
                                </td>
                                <th>좌석수  <img src="/images/icon/filter3.png" tabindex="-1" /></th>
                                <td>
                                    <select v-model="paxCntOption">
                                        <option value="">All (Select an option)</option>
                                        <option v-for="option in paxCntOptions" :key="option" :value="option">
                                            {{ option }}</option>
                                    </select>
                                </td>
                            </tr>
                        </tbody>
                    </table>

                </div>
                <div class="btn_wrap">
                    <button class="btnTypeD" @click="search">조회</button>&nbsp;
                    <button class="btnTypeD" @click="initialize">초기화</button>
                </div>
                <div class="btn_wrap">
                    <!-- Modal 컴포넌트를 사용하고 selectedPNR 프로퍼티를 전달합니다 -->
                    <CancelBooking v-if="modalVisible" :Pnr="selectedPNR" @close="closeModal" @cancelAll="pnrCancel"/>
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
                            <th>예약상태</th>
                            <th>선택 <input type="checkbox" v-model="selectAll" @change="selectAllItems" /></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="item in filteredRows" :key="item.id" @click="handleRowClick(item)"
                            :class="{ cancelRow: item.status === 'CANCELLED', clickRow: isExcept.includes(item.status) === false }">
                            <td>{{ item.id }}</td>
                            <td>{{ item.fltnum }}</td>
                            <td>{{ item.depDate }}</td>
                            <td>{{ item.stnfrCode }}</td>
                            <td>{{ item.stntoCode }}</td>
                            <td>{{ item.departureDateTime }}</td>
                            <td>{{ item.arrivalDateTime }}</td>
                            <td>{{ item.fareClass }}</td>
                            <td>{{ item.paxCount }}</td>
                            <td :style="item.status.includes('CHANGE') ? 'color: red' : {}">{{ item.pnrnumber }}</td>
                            <td v-if="item.status.includes('CHANGE')"><button class='btnTypeHE'
                                    @click="checkAcceptSchedule(item.pnrnumber)">{{ statusTitle(item.status) }}</button>
                            </td>
                            <td v-else>{{ statusTitle(item.status) }}</td>
                            <td onclick="event.cancelBubble=true"><input v-if="item.status !== 'CANCELLED'" type="checkbox"
                                    v-model="selectedItems" :value="item" /></td>
                        </tr>
                    </tbody>
                </table>
                <div class="btn_wrap right">
                    <button class="btnTypeA" @click="checkPnrCancel">PNR 취소</button>&nbsp;
                    <download-excel class="btnTypeC" :fields="this.resTableHeaders" :data="this.items"
                        worksheet="My Worksheet" name="filename.xls">엑셀
                        다운로드</download-excel>
                </div>
            </div>
        </div>
        <div>
            <MessageBox ref="msg_box" @postAction="onPostMessageBox" />
        </div>
    </div>
</template>

<script>
import CancelBooking from './CancelBooking.vue'; // Modal 컴포넌트를 임포트합니다
import Datepicker from 'vue3-datepicker';
import { ref, onMounted, getCurrentInstance } from 'vue';
import JsonExcel from "vue-json-excel3";
import MessageBox from '@/components/MessageBox.vue';
import DropdownWithCheck from '@/components/DropdownWithCheck.vue';
import { ycObject, ycUtils } from '@/components/YcUtils.js';
//import axios from 'axios';
import requests from '../functions/requests';

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
            modalVisible: false, // CancelBooking 모달의 표시 여부를 저장하는 데이터 속성
            selectedPNR: [], // CancelBooking 팝업에 전달할 예약정보 1레코드(item)
            selectedDate1: ref(new Date()),
            selectedDate2: ref(new Date()),
            stnfr: "",
            stnto: "",
            flightNumber: "",
            selectedStatus: '', //예약상태 statusOptions의 선택값
            statusOptions: ycObject.statusOptions,
            classOption: '', // 클래스 선택값
            classOptions: ycObject.classOptions,
            paxCntOption: '', // 승객수 선택값
            paxCntOptions: ycObject.paxCntOptions,
            selectAll: false, //전체선택을 위한 변수
            selectedItems: [], //체크박스 선택된 리스트
            isExcept: ycObject.isExcept, // (CancelBookin)승객 부분취소 팝업이 필요없는 상태 들..
            resTableHeaders: ycObject.resTableHeaders,
            loading: false, // 레이어가 새로 그려지기 때문에 vue 생성주기에 문제가 생기므로 이벤트시 코딩처리 해줘야 함.
        };
    },
    setup() {
        // onPostMessageBox에서 파라미터 값을 메소드명으로 찾아서 바로 호출하기 위해 myIntance사용..
        const myInstance = ref(null);
        onMounted(() => {
            myInstance.value = getCurrentInstance();
        });
        return {
            myInstance
        };
    },
    mounted() {

    },
    computed: {
        // 조회조건 AND 형태로 필터링하는 기능. 예약상태, 클래스, 승객수
        filteredRows() {
            this.selectAll = false; //조건이 바뀌므로 전체선택 초기화
            this.selectedItems = []; //조건이 바뀌므로 선택 초기화
            return this.items.filter(row => {
                let result = true;
                //예약상태 필터
                if (this.selectedStatus !== "" && row.status !== this.selectedStatus) {
                    // WAITLISTED_KL, WAITLISTED_HL 은 포함.
                    if (this.selectedStatus == "WAITLISTED" && row.status.includes("WAITLISTED")) {
                        result = true;
                    }
                    else {
                        return false;
                    }
                }
                //클래스 필터 (허지은 과장 요건으로 필터에서 제외.. 좌석등급으로 대체)
                // if (this.classOption !== "" && row.fareClass !== this.classOption) {
                //     return false;
                // }
                //좌석수 필터
                if (this.paxCntOption !== "" && row.paxCount !== this.paxCntOption) {
                    return false;
                }
                return result;
            });
        }
    },
    methods: {
        // 정규식을 사용하여 숫자만 남기고 나머지 문자 제거
        allowOnlyNumbers() {
            this.flightNumber = this.flightNumber.replace(/[^0-9]/g, "");
        },        
        // 전체 선택시, 취소 PNR은 제외시켜야 함.
        selectAllItems() {
            if (this.selectAll) {
                //this.selectedItems = [...this.filteredRows];
                this.selectedItems = [...this.filteredRows].filter(row => {
                    if (row.status === 'CANCELLED') {
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
        //메시지박스 닫힌 후 이벤트 처리
        onPostMessageBox(action) {
            console.log('onPostMessageBox action:', action);
            const fnName = action.actionName === undefined ? action : action.actionName;
            if (typeof this.myInstance.ctx[fnName] === 'function') {
                this.myInstance.ctx[fnName](action.params); // 메서드 실행
            }
        },
        // 메시지 박스 : 타이틀, 메시지, 후속액션, 컨펌 또는 alert.
        showMessage(title, msg, action = [], isConfirmMsg = false) {
            this.$refs.msg_box.showPopup(title, msg, action, isConfirmMsg);
        },
        //검색조건의 예약상태 리스트. 조회시, 콤보박스 컴포넌트 체크내용과 화면에서 동일하게 유지 하기위해..,(현재 체크 콤보박스를 사용하지 않음)
        handleSelection(selectedOptions) {
            this.selectedStatus = selectedOptions;
        },
        // Accept버튼 확인 메시지
        checkAcceptSchedule(pnr) {
            const actionProp = {
                actionName: 'acceptSchedule',
                params: pnr,
            };
            this.showMessage('Confirm', '변경된 사항으로 수락 하시겠습니까?', actionProp, true);
        },
        //Accept버튼 처리.
        async acceptSchedule(pnr) {
            try {
                this.loading = true;
                /*const response = await axios.get(`https://stg-crewpnr.jinair.com/crew/acceptSchedule?pnrNumber=${pnr}`);
                this.loading = false;

                if (response.data.error === undefined) {
                    const successMsg = `처리가 완료되었습니다.<br>${response.data.result}`;
                    this.showMessage('Inform', successMsg, 'search');
                } else {
                    this.showMessage('Error', response.data.error);
                }*/
                const response = await requests.get(`/crew/acceptSchedule?pnrNumber=${pnr}`);
                this.loading = false;

                if (response.error === undefined) {
                    const successMsg = `처리가 완료되었습니다.<br>${response.result}`;
                    this.showMessage('Inform', successMsg, 'search');
                } else {
                    this.showMessage('Error', response.error);
                }
            } catch (error) {
                this.loading = false;
                console.error('전송 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error);
            }
        },
        // PNR 취소 버튼 클릭. Confirm 메시지박스 비동기처리..
        checkPnrCancel() {
            if (this.selectedItems.length == 0) {
                this.showMessage('Warning', '선택된 예약이 없습니다.');
                return;
            }
            if (this.selectedItems.length > 20) {
                this.showMessage('Warning', '선택된 예약은 20개 미만이어야 합니다.');
                return;
            }
            this.showMessage('Confirm', '선택한 PNR을 일괄 취소 하시겠습니까?', 'pnrCancel', true);
        },
        // 선택된 PNR 처리.
        async pnrCancel(onePnr) {
            let jsonData = null;
            if(onePnr !== undefined){ // CancelBooking 모달페이지에서 넘어온 PNR
                jsonData = {
                    pnrNumber: [onePnr]
                };
                this.modalVisible = false;
            }
            else{ //체크된 PNR들 처리.
                jsonData = {
                    pnrNumber: this.selectedItems.map(item => item.pnrnumber),
                };
            }
            try {
                this.loading = true;
                /*const response = await axios.post('https://stg-crewpnr.jinair.com/crew/cancelReservation', jsonData, {
                    headers: {
                        'Content-Type': 'application/json',
                    },
                });
                this.loading = false;

                if (response.data.error === undefined) {
                    const successMsg = `처리가 완료되었습니다.<br>${response.data.result}`;
                    this.showMessage('Inform', successMsg, 'search');
                } else {
                    this.showMessage('Error', response.data.error);
                }*/
                const response = await requests.post('/crew/cancelReservation', {
                    headers: {'Content-Type': 'application/json'},
                    body: jsonData
                });
                this.loading = false;

                if (response.error === undefined) {
                    const successMsg = `처리가 완료되었습니다.<br>${response.result}`;
                    this.showMessage('Inform', successMsg, 'search');
                } else {
                    this.showMessage('Error', response.error);
                }
            } catch (error) {
                this.loading = false;
                console.error('전송 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error);
            }
        },
        statusTitle(sts) {
            // 필터된 대기 표시는 HL, KL 모두 라벨로 표시해야 함.
            return ycObject.statusLabels.find(([key, value]) => key === sts)[1];
        },
        // 초기화 버튼
        initialize() {
            this.selectedDate1 = ref(new Date());
            this.selectedDate2 = ref(new Date());
            this.stnfr = '';
            this.stnto = '';
            this.flightNumber = '';
            this.selectedStatus = '';
            this.classOption = '';
            this.paxCntOption = '';
            this.items = [];
        },
        // 검색
        async search() {
            if (this.fieldValidation() == false) {
                this.showMessage('Warning', "출도착지 또는 항공편명은 필수 입니다.");
                return;
            }
            const jsonData = {
                depStartDate: document.getElementById('required_datefr').value,
                depEndDate: document.getElementById('required_dateto').value,
                stnfrCode: document.getElementById('required_stnfr').value.toUpperCase(),
                stntoCode: document.getElementById('required_stnto').value.toUpperCase(),
                fltNum: this.flightNumber,
                cabinClass: this.classOption,
            };
            try {
                this.loading = true;
                /*const response = await axios.post('https://stg-crewpnr.jinair.com/crew/getReservationSummary', jsonData, {
                    headers: {
                        'Content-Type': 'application/json',
                    },
                });
                this.loading = false;

                if (response.data.error !== undefined) {
                    this.items = [];
                    this.showMessage('Error', response.data.error);
                } else {
                    if (response.data.result.length >= 100) {
                        const errMsg = '결과 값이 100건을 초과하였습니다.<br>검색조건을 수정하여 조회 하십시요.';
                        this.showMessage('Warning', errMsg);
                    }
                    this.items = this.reformTable(response.data.result);
                }*/
                const response = await requests.post('/crew/getReservationSummary', {
                    headers: {'Content-Type': 'application/json'},
                    body: jsonData
                });
                this.loading = false;

                if (response.error !== undefined) {
                    this.items = [];
                    this.showMessage('Error', response.error);
                } else {
                    if (response.result.length >= 100) {
                        const errMsg = '결과 값이 100건을 초과하였습니다.<br>검색조건을 수정하여 조회 하십시요.';
                        this.showMessage('Warning', errMsg);
                    }
                    this.items = this.reformTable(response.result);
                }
            } catch (error) {
                this.loading = false;
                console.log('데이터를 불러오는 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error);
            }
        },
        reformTable(output) {
            // "pnrStatus"와 "segmentStatus" 제거
            return output.map((row, index) => {
                const { pnrStatus, segmentStatus, ...rest } = row;
                return {
                    id: index + 1, // 순번을 1부터 시작하려면 index + 1을 사용
                    ...rest,
                };
            });
        },
        // CancelBooking 모달페이지 오픈 
        showCancelBooking() {
            this.modalVisible = true;
        },
        // CancelBooking 모달페이지 클로즈
        closeModal(isSubmit) {
            this.modalVisible = false;
            if (isSubmit === true) { //그냥 닫지 않았고, 변경이 있었기에 재조회 필요.
                this.search();
            }
        },
        handleRowClick(item) {
            if (this.isExcept.includes(item.status)) {
                return;
            }
            this.selectedPNR = item;
            this.showCancelBooking();
        },
        fieldValidation() {
            // return ycUtils.fieldValidation(document, 'required');
            //항공편에 값만 있으면 조회 가능하도록 변경..
            if(document.getElementById('required_fltNo').value.length >= 3){
                return true;
            }
            else{
                if(document.getElementById('required_stnfr').value.length 
                    + document.getElementById('required_stnto').value.length === 6){
                    return true;
                }
                else{
                    return false;
                }
            }
        },
    }
};
</script>

<style scoped>
.table_style tr:hover {
    background-color: #ffcccb;
    /* 마우스를 올렸을 때 배경 색상 변경 */
}

tr.cancelRow {
    /* PNR 취소된 row 회색처리 */
    color: lightgray;
}

tr.clickRow {
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
}
</style>

