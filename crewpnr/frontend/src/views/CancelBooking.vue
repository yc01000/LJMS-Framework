<template>
    <div>
        <div v-if="loading" class="modal-overlay"><img src="/images/bo/loading.gif" /></div>
        <div v-else>
            <div v-if="isVisible" class="modal-overlay">
                <div class="modal" @click.self="preventModalClose">
                    <div class="modal-content">
                        <div class="header_util" style="text-align: left;">
                            <h2 class="sub_title">예약(일부) 취소</h2>
                        </div>
                        <h2>PNR : {{ strPnr }} / {{ strItin }}</h2>
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
                            <button class="btnTypeC" @click="SelectedSubmit">일부 취소</button>&nbsp;
                            <!-- 모달을 닫는 이벤트를 처리하는 closePopup 메소드를 호출합니다 -->
                            <button class="btnTypeD" @click="closeModal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <div>
                <MessageBox ref="msg_box" />
            </div>
        </div>
    </div>
</template>

<script>
import MessageBox from '@/components/MessageBox.vue';

export default {
    components: {
        MessageBox,
    },
    props: {
        isVisible: Boolean, // 모달의 표시 여부를 받아오는 프로퍼티
        strPnr: String,     // 모달 내용을 받아오는 프로퍼티
        strItin: String,
    },
    data() {
        return {
            items: [
                // { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "500", "guestId": "237139270", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640515", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "501", "guestId": "237139271", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640514", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "502", "guestId": "237139272", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640513", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "503", "guestId": "237139273", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640512", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }, { "givenName": "CREW", "surName": "XXECX", "middleName": "OOA", "namePrefix": "MR", "guestType": "ADULT", "guestSubType": "CREW", "dateOfBirth": -2208988800000, "taxExemptionCodes": [], "familyId": "504", "guestId": "237139274", "guestCheckInInfo": [{ "segmentId": "500" }], "guestAmountDetails": [], "age": 123, "paxTicketDetails": [{ "ticketNumber": "7182376640511", "issueDate": 1694682990000, "isConjunction": false, "originalTicketIssueDate": 1694650590000, "endorsementAndRestrictions": ["TIMESTAMP 14-Sep-2023 09:16:30", "VALID ONLY FOR LJ FLIGHTS"], "fareString": "SEL LJ BKI 0 KRW0END ROE1.000000", "ticketingOfficeCode": "SELTI", "couponDetails": [{ "couponNumber": "1", "couponStatus": "OPENFORUSE", "notValidBefore": { "date": 1695168000000 }, "notValidAfter": { "date": 1695168000000 }, "baggageAllowance": "15 Kg", "segmentId": 500 }] }] }
            ],
            loading: false, // 레이어가 새로 그려지기 때문에 vue 생성주기에 문제가 생기므로 이벤트시 코딩처리 해줘야 함.
        };
    },
    methods: {
        showMessage(title, msg) {
            this.$refs.msg_box.showPopup(title, msg);
        },
        SelectedSubmit() {
            let guestIdList = [];
            for (let item of this.items.filter(item => item.selected)) {
                guestIdList.push(item.guestId);
            }
            if (guestIdList.length == 0) {
                this.showMessage('Warning', '선택된 승객이 없습니다.');
                return;
            }
            let inputJson = this.generateInputJson(guestIdList);
            console.log("inputJson:", inputJson);
            this.loading = true;
            fetch('https://stg-crewpnr.jinair.com/crew/splitPnr', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json' // JSON 데이터를 전송한다고 서버에 알림
                },
                body: inputJson // JSON 데이터를 문자열로 변환하여 바디에 넣음
            })
                .then((response) => response.json())
                .then((data) => {
                    console.log("splitPnr result: ", data);
                    this.loading = false;
                    // if(data.all.message == 'SUCCESS'){
                    //     alert('처리가 완료되었습니다.');
                    // }
                    alert('처리결과: ' + JSON.stringify(data, null, 2));
                })
                .catch((error) => {
                    console.error('전송 중 오류가 발생했습니다.', error);
                    this.loading = false;
                    //this.showMessage('Error', error);
                    alert('전송 중 오류가 발생했습니다.' + error);
                })
                .finally(() => {
                    this.closeModal();
                });
        },
        closeModal() {
            // 모달을 닫는 메소드
            this.$emit('close'); // 부모 컴포넌트에 이벤트를 전달하여 모달을 닫습니다
        },
        search() {
            fetch('https://stg-crewpnr.jinair.com/crew/retrieveBooking?pnrNumber=' + this.strPnr)
                .then((response) => response.json())
                .then((data) => {
                    this.items = data.all.getGuestDetails;
                    console.log(this.items);
                })
                .catch((error) => {
                    console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
                    this.showMessage('Error', error);
                });

        },
        generateInputJson(id) {
            const jsonData = {
                pnrNumber: this.strPnr,
                guestId: id,
            };
            return JSON.stringify(jsonData, null, 2);
        },
    },
    mounted() {
        console.log("mounted!!!");
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
