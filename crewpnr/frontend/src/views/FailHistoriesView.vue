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
                    <div style="display: flex; justify-content: left; align-items: center;">
                        <label>출발일자<span class="fontTypeA normal">(*)</span></label>
                        <Datepicker id="required_datefr" class="btn_calendar hasDatepicker" v-model="selectedDate1"
                            format="yyyy-MM-dd">
                        </Datepicker>
                        <span style="margin: 10px">~</span>
                        <Datepicker id="required_dateto" class="btn_calendar hasDatepicker" v-model="selectedDate2"
                            format="yyyy-MM-dd">
                        </Datepicker>
                    </div>
                </li>
                <li>
                    <label for="required_stnfr">출도착지<span class="fontTypeA normal">(*)</span></label>
                    <input class="inputPort" id="required_stnfr" maxlength="3" name="qModel.stnfr" placeholder="GMP"
                        label="출발지" type="text" value="" /> &nbsp;&nbsp;&nbsp;
                    <input class="inputPort" id="required_stnto" maxlength="3" name="qModel.stnto" placeholder="CJU"
                        label="도착지" type="text" value="" />
                </li>
                <li>
                    <label>좌석등급</label>
                    <select v-model="classOption">
                        <option value="">All (Select an option)</option>
                        <option v-for="option in classOptions" :key="option.value" :value="option.value">
                            {{ option.label }}</option>
                    </select>
                </li>
                <li>
                    <label>항공편명(LJ)<span class="fontTypeA normal">(*)</span></label>
                    <input id="required_fltNo" maxlength="5" v-model="flightNumber" class="common_input" type="text" placeholder="001, 3~4숫자+suffix"> <!-- @input="allowOnlyNumbers"> -->
                </li>
                <li>
                    <label>좌석수</label>
                    <select v-model="paxCntOption">
                        <option value="">All (Select an option)</option>
                        <option v-for="option in paxCntOptions" :key="option" :value="option">
                            {{ option }}</option>
                    </select>
                </li>
            </ul>
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
                name="filename.xls">엑셀
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
            flightNumber: "",
            classOption: '', // 선택된 옵션 값을 저장할 변수
            classOptions: ycObject.classOptions,
            paxCntOption: '', // 선택된 옵션 값을 저장할 변수
            paxCntOptions: ycObject.paxCntOptions,
            failTableHeaders: ycObject.failTableHeaders,
        };
    },
    mounted() {
    },
    methods: {
        showMessage(title, msg) {
            this.$refs.msg_box.showPopup(title, msg);
        },
        initialize() {
            this.selectedDate1 = ref(new Date());
            this.selectedDate2 = ref(new Date());
            document.getElementById('required_stnfr').value = '';
            document.getElementById('required_stnto').value = '';
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
                // await로 데이터 가져오기
                /*const response = await axios.post('https://stg-crewpnr.jinair.com/crew/getCreateBookingFailLog', jsonData, {
                    headers: {
                        'Content-Type': 'application/json'
                    }
                });
                if (response.data.result.length == 0) {
                    this.showMessage('Warnning', '조회된 데이터가 없습니다.');
                }
                this.items = response.data.result.map(item => ({
                    ...item,
                    depDate: ycUtils.krFormatDate(item.depDate) //날짜 yyyy-MM-dd로 표시
                }));
                console.log("response this.items:", this.items)*/
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
