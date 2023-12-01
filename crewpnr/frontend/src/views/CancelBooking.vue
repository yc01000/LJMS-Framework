<template>
    <div>
        <div v-if="loading" class="modal-overlay"><img src="/images/bo/loading.gif" /></div>
        <div v-else class="modal-overlay">
            <div class="modal" @click.self="preventModalClose">
                <div class="modal-content">
                    <div class="header_util" style="text-align: left;">
                        <h2 class="sub_title">예약(일부) 취소</h2>
                    </div>
                    <h2 style="text-align: left; color: #009fda;font-weight: normal;">{{ pnrInfo }}</h2>
                    <br>
                    <table class="table_style">
                        <thead>
                            <tr>
                                <th>Select</th>
                                <th>Given Name</th>
                                <th>Surname</th>
                                <th>Middle Name</th>
                                <th>Name Prefix</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(item, index) in items" :key="index">
                                <td><input type="checkbox" v-model="item.selected" /></td>
                                <td>{{ item.givenName }}</td>
                                <td>{{ item.surName }}</td>
                                <td>{{ item.middleName }}</td>
                                <td>{{ item.namePrefix }}</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="btn_wrap">
                        <button class="btnTypeD" @click="SelectedSubmit">취소</button>&nbsp;
                        <!-- 모달을 닫는 이벤트를 처리하는 closePopup 메소드를 호출합니다 -->
                        <button class="btnTypeE" @click="closeModal">Close</button>
                    </div>
                </div>
            </div>
        </div>
        <div>
            <MessageBox ref="msg_box" @postAction="onPostMessageBox" />
        </div>
    </div>
</template>

<script>
import MessageBox from '@/components/MessageBox.vue';
import { ref, onMounted, getCurrentInstance } from 'vue';
import requests from '../functions/requests';

export default {
    setup() {
        const myInstance = ref(null);
        onMounted(() => {
            myInstance.value = getCurrentInstance();
        });
        return {
            myInstance
        };
    },
    components: {
        MessageBox,
    },
    props: {
        Pnr: Object,     // 모달 내용을 받아오는 프로퍼티
    },
    data() {
        return {
            items: [
                // { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "500", "guestId": "237139270", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640515", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "501", "guestId": "237139271", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640514", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "502", "guestId": "237139272", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640513", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "503", "guestId": "237139273", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640512", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "504", "guestId": "237139274", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640511", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }
            ],
            loading: false, // 레이어가 새로 그려지기 때문에 vue 생성주기에 문제가 생기므로 이벤트시 코딩처리 해줘야 함.
            pnrInfo: '',
        };
    },
    methods: {
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
        async SelectedSubmit() {
            let guestIdList = [];
            for (let item of this.items.filter(item => item.selected)) {
                guestIdList.push(item.guestId);
            }
            if (guestIdList.length === 0) {
                this.showMessage('Warning', '선택된 승객이 없습니다.');
                return;
            }
            // 1명만 있는 PNR은 부분취소가 아닌 PNR자체를 취소해야 함.
            if(guestIdList.length === this.items.length){
                this.$emit('cancelAll', this.Pnr.pnrnumber);
                return;
            }

            const jsonData = {
                pnrNumber: this.Pnr.pnrnumber,
                guestId: guestIdList,
            };

            this.loading = true;
            try {
                const response = await requests.post('/crew/splitPnr', {
                    headers: { 'Content-Type': 'application/json' },
                    body: jsonData
                });
                this.loading = false;
                if (response.result === 'SUCCESS') {
                    this.showMessage('Inform', '처리가 완료되었습니다.', {
                        actionName: 'closeModal',
                        params: true,
                    });
                } else {
                    this.showMessage('Error', JSON.stringify(response, null, 2));
                }
            } catch (error) {
                this.loading = false;
                console.error('전송 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error);
            }
        },
        // 자신 CancelBooking 컴포넌트 모달을 닫는 메소드. isSubmit는 그냥 닫는지 작업 처리 후 닫는지 체크.
        closeModal(isSubmit = false) {
            this.$emit('close', isSubmit);
        },
        preventModalClose(event) {
            // 모달 내부를 클릭해도 모달이 닫히지 않도록 이벤트 전파를 막습니다
            event.stopPropagation();
        },
        async search() {
            try {
                const response = await requests.get(`/crew/retrieveBooking?pnrNumber=${this.Pnr.pnrnumber}`);
                this.items = response.result;
                console.log(this.items);
            } catch (error) {
                console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error, 'closeModal');
            }
        },
    },
    mounted() {
        this.pnrInfo = `PNR : ${this.Pnr.pnrnumber}  /  여정 : ${this.Pnr.depDate}, ${this.Pnr.stnfrCode}-${this.Pnr.stntoCode}, ${this.Pnr.fltnum}`;
        this.search();
    }
};
</script>

<style scoped>
.modal-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    display: flex;
    justify-content: center;
    align-items: center;
}

.modal {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
    width: 50%;
}

.modal-content {
    margin-bottom: 20px;
}
</style>
