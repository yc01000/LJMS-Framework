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
                        <th>좌석수</th>
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
            <a href="javascript://" class="btnTypeD" @click="search">조회</a>&nbsp;
            <button class="btnTypeD" @click="initialize">초기화</button>
        </div>
        <table class="table_style">
            <thead>
                <tr>
                    <th v-for="(key, value) in failTableHeaders" :key="key">{{ value }}</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in items" :key="item.seq">
                    <td v-for="(field, key) in failTableHeaders" :key="key">{{ item[field] }}</td>
                </tr>
            </tbody>
        </table>
        <div class="btn_wrap right">
            <download-excel class="btnTypeC" :fields="this.failTableHeaders" :data="this.items" worksheet="My Worksheet"
            :name="this.excelName" :before-generate = "beforeDownload">엑셀
                다운로드</download-excel>
        </div>
    </div>
    <div>
        <MessageBox ref="msg_box" />
    </div>
</template>

<script>
import Datepicker from 'vue3-datepicker';
import { ref } from 'vue';
import JsonExcel from "vue-json-excel3";
import MessageBox from '@/components/MessageBox.vue';
import { ycObject, ycUtils } from '@/components/YcUtils.js';
//import axios from 'axios';
import requests from '../functions/requests';

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
            stnfr: '',
            stnto: '',
            flightNumber: "",
            classOption: '', // 선택된 옵션 값을 저장할 변수
            classOptions: ycObject.classOptions,
            paxCntOption: '', // 선택된 옵션 값을 저장할 변수
            paxCntOptions: ycObject.paxCntOptions,
            failTableHeaders: ycObject.failTableHeaders,
            excelName: '',
            userinfo: Object,

        };
    },
    async mounted() {
        this.userinfo = await this.$getUserinfo();
        console.log('userinfo', this.userinfo);
    },
    methods: {
        //엑셀다운로드 버튼 처리.
        beforeDownload() {
            const stn = `${this.stnfr.toUpperCase()}${this.stnto.toUpperCase()}`;
            this.excelName = ycUtils.getDownloadExcelName(this.userinfo.position, this.selectedDate1, this.selectedDate2, stn, this.flightNumber);
        },        
        showMessage(title, msg) {
            this.$refs.msg_box.showPopup(title, msg);
        },
        initialize() {
            this.selectedDate1 = ref(new Date());
            this.selectedDate2 = ref(new Date());
            this.stnfr = '';
            this.stnto = '';
            this.flightNumber = '';
            this.classOption = '';
            this.paxCntOption = '';
            this.items = [];
        },
        async search() {
            if (this.fieldValidation() == false) {
                this.showMessage('Warning', "출도착지 또는 항공편명은 필수 입니다.");
                return;
            }
            const jsonData = {
                brdStrtDt: document.getElementById('required_datefr').value.replaceAll('-', ''),
                brdEndDt: document.getElementById('required_dateto').value.replaceAll('-', ''),
                stnfrCode: document.getElementById('required_stnfr').value.toUpperCase(),
                stntoCode: document.getElementById('required_stnto').value.toUpperCase(),
                fltNum: this.flightNumber,
                cabinClass: this.classOption,
                paxCount: this.paxCntOption,
            };
            try {
                const response = await requests.post('/crew/getCreateBookingFailLog', {
                    headers: {'Content-Type': 'application/json'},
                    body: jsonData
                });
                if (!!response.error) {
                    this.showMessage('Error', response.error);
                    return;
                }

                if (response.result.length == 0) {
                    this.showMessage('Warnning', '조회된 데이터가 없습니다.');
                }
                this.items = response.result.map(item => ({
                    ...item,
                    depDate: ycUtils.krFormatDate(item.depDate)
                }));
                console.log("response this.items:", this.items)
            } catch (error) {
                console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
                this.showMessage('Error', error);
            }
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
