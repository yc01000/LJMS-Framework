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
                        <li>
                            <label>예약상태</label>
                            <select v-model="selectedStatus">
                                <option value="">All (Select an option)</option>
                                <option v-for="option in statusOptions" :key="option.value" :value="option.value">
                                    {{ option.label }}</option>
                            </select>
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
                        </li>

                    </ul>
                </div>
                <div class="btn_wrap">
                    <button class="btnTypeD" @click="search">조회</button>&nbsp;
                    <button class="btnTypeD" @click="initialize">초기화</button>
                </div>
                <div class="btn_wrap">
                    <!-- Modal 컴포넌트를 사용하고 selectedItin, selectedPNR 프로퍼티를 전달합니다 -->
                    <CancelBooking v-if="modalVisible" :strItin="selectedItin" :strPnr="selectedPNR" @close="closeModal" />
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
                            <!-- <th>Segment STS</th> -->
                            <th>예약상태</th>
                            <th>선택 <input type="checkbox" v-model="selectAll" @change="selectAllItems" /></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="item in filteredRows" :key="item.id" @click="handleRowClick(item)"
                            :class="{ cancelRow: item.status === 'CANCELLED', clickRow: isExcept(item.status) === false }">
                            <td>{{ item.id }}</td>
                            <td>{{ item.fltnum }}</td>
                            <td>{{ item.depDate }}</td>
                            <td>{{ item.stnfrCode }}</td>
                            <td>{{ item.stntoCode }}</td>
                            <td>{{ item.departureDateTime }}</td>
                            <td>{{ item.arrivalDateTime }}</td>
                            <td>{{ item.fareClass }}</td>
                            <td>{{ item.paxCount }}</td>
                            <td v-if="isChangeStatus(item.status) === true" style='color: red'>{{ item.pnrnumber }}</td> 
                            <td v-else>{{ item.pnrnumber }}</td> 
                            <td v-if="isChangeStatus(item.status) === true" onclick="event.cancelBubble=true"><button @click="checkAcceptSchedule(item.pnrnumber)">{{ statusTitle(item.status) }}</button></td>
                            <td v-else>{{ statusTitle(item.status) }}</td>
                            <!-- 취소일때는 그냥 빈칸 -->
                            <td v-if="item.status === 'CANCELLED'" onclick="event.cancelBubble=true"></td>
                            <td v-else onclick="event.cancelBubble=true"><input type="checkbox" v-model="selectedItems" :value="item" /></td> <!-- 체크박스 -->
                        </tr>
                    </tbody>
                </table>
                <div class="btn_wrap right">
                    <button class="btnTypeA" @click="checkPnrCancel">PNR 취소</button>&nbsp;
                    <download-excel class="btnTypeC" :data="this.items" worksheet="My Worksheet" name="filename.xls">엑셀
                        다운로드</download-excel>
                </div>

            </div>
            <div>
                <MessageBox ref="msg_box" @postAction="onPostMessageBox" />
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
            modalVisible: false, // CancelBooking 모달의 표시 여부를 저장하는 데이터 속성
            selectedPNR: "",
            selectedItin: "",
            selectedDate1: ref(new Date()),
            selectedDate2: ref(new Date()),
            stnfr: "",
            stnto: "",
            selectedStatus: '', //예약상태 statusOptions의 선택값
            statusOptions: [
                { value: "CONFIRMED", label: "완료" },
                { value: "WAITLISTED", label: "대기" },
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

            return this.items.filter(row => {
                let result = true;
                //예약상태 필터
                if ((this.selectedStatus == "" || row.status == this.selectedStatus) == false) {
                    if (row.status == null || row.status == undefined) { //서버에서 status 노드가 빠지는 경우가 간혹 있음.
                        return false;
                    }
                    // WAITLISTED_KL, WAITLISTED_HL 은 포함.
                    if (this.selectedStatus == "WAITLISTED" && row.status.indexOf("WAITLISTED") == 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                //클래스 필터
                if ((this.classOption == "" || row.fareClass == this.classOption) == false) {
                    return false;
                }
                //좌석수 필터
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
            if (action === 'search') {
                this.search();
            } else if (action === 'pnrCancel') {
                this.pnrCancel();
            } else if (action.actionName === 'acceptSchedule') {
                this.acceptSchedule(action.params);
            }
        },
        // 메시지 박스 : 타이틀, 메시지, 후속액션, 컨펌 또는 alert.
        showMessage(title, msg, action = [], isConfirmMsg = false) {
            this.$refs.msg_box.showPopup(title, msg, action, isConfirmMsg);
        },
        //검색조건의 예약상태 리스트. 조회시, 콤보박스 컴포넌트 체크내용과 화면에서 동일하게 유지 하기위해..,
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
        acceptSchedule(pnr) {
            console.log("pnr:", pnr);
            let errMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            let successMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            this.loading = true;
            fetch('https://stg-crewpnr.jinair.com/crew/acceptSchedule?pnrNumber=' + pnr)
                .then((response) => response.json())
                .then((data) => {
                    this.loading = false;
                    console.log("acceptSchedule result: ", data);
                    if (data.error === undefined) {
                        successMsg = '처리가 완료되었습니다.<br>' + data.result;
                    }
                    else {
                        errMsg = data.error;
                    }
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
                        this.showMessage('Inform', successMsg, 'search');
                    }
                });
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
        pnrCancel() {
            let errMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
            let successMsg = ""; // Promise로 인해 this.$refs.msg_box 가 null 로 찍히므로 finally에서 메시지박스 호출.
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
                    if (data.error === undefined) {
                        successMsg = '처리가 완료되었습니다.<br>' + data.result;
                    }
                    else {
                        errMsg = data.error;
                    }
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
                        this.showMessage('Inform', successMsg, 'search');
                    }
                });
        },
        statusTitle(sts) {
            // 필터된 대기 표시는 HL, KL 모두 라벨로 표시해야 함.
            let statusLabels = [
                { value: "CONFIRMED", label: "완료" },
                { value: "WAITLISTED_HL", label: "대기(HL)" },
                { value: "WAITLISTED_KL", label: "대기(KL)" },
                { value: "NO_OP", label: "비운항" },
                { value: "SCHEDULE_CHANGE", label: "여정 변경" },
                { value: "TIME_CHANGE", label: "시간 변경" },
                { value: "CANCELLED", label: "취소" }
            ];
            let strSts = statusLabels.find((el) => { return el.value === sts });
            return (strSts == null || strSts == undefined ? 'undefined' : strSts.label);
        },
        // (CancelBookin)승객부분 취소 팝업이 필요없는 상태 들..
        isExcept(sts) {
            if (sts == 'TIME_CHANGE' || sts == 'SCHEDULE_CHANGE' || sts == 'CANCELLED') {
                return true;
            } else {
                return false;
            }
        },
        // 예약변경으로 인해 Accept가 필요한 상태 들..
        isChangeStatus(sts) {
            if (sts == 'TIME_CHANGE' || sts == 'SCHEDULE_CHANGE') {
                return true;
            } else {
                return false;
            }
        },
        // 초기화 버튼
        initialize() {
            this.selectedDate1 = ref(new Date());
            this.selectedDate2 = ref(new Date());
            this.stnfr = "";
            this.stnto = "";
            this.selectedStatus = '';
            this.classOption = '';
            this.paxCntOption = '';
            this.items = [];
        },
        // 검색
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
                    if (data.error !== undefined) {
                        this.items = [];
                        errMsg = data.error;
                    }
                    else {
                        if (data.result.length >= 100) {
                            errMsg = '결과 값이 100건을 초과하였습니다.<br>검색조건을 수정하여 조회 하십시요.';
                        }
                        // 순번을 추가한 JSON 데이터
                        const itemsWithIndex = data.result.map((item, index) => {
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
                        this.showMessage('Warning', errMsg);
                    }
                });
        },
        // CancelBooking 모달페이지 오픈 
        showModal() {
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
            if (this.isExcept(item.status)) {
                return;
            }
            this.selectedPNR = item.pnrnumber;
            this.selectedItin = item.stnfrCode + "-" + item.stntoCode;
            this.showModal();
        },
        generateInputJson() {
            const jsonData = {
                depStartDate: document.getElementById('qModel_datefr').value,
                depEndDate: document.getElementById('qModel_dateto').value,
                stnfrCode: document.getElementById('qModel_stnfr').value.toUpperCase(),
                stntoCode: document.getElementById('qModel_stnto').value.toUpperCase(),
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