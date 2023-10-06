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
          <label for="fil01">DEP DATE<span class="fontTypeA normal">(*)</span></label>

          <input class="btn_calendar hasDatepicker" id="qModel_datefr" name="qModel.datefr" type="text"
            value="2023-09-12"> ~
          <input class="btn_calendar hasDatepicker" id="qModel_dateto" name="qModel.dateto" type="text"
            value="2023-09-12">
          <input class="hsortfield" id="qModel_SortField" name="qModel.SortField" type="hidden" value="STD">
          <input class="hsortdir" id="qModel_SortDirection" name="qModel.SortDirection" type="hidden" value="ASC">
        </li>
        <li>
          <label for="fil02">TIMEZONE<span class="fontTypeA normal">(*)</span></label>
          <select id="qModel_type" name="qModel.type" style="width:160px;">
            <option selected="selected" value="UTC">UTC</option>
            <option value="LOCAL">LOCAL</option>
          </select>
        </li>
        <li>
          <label for="fil03">DEP/ARR</label>
          <input class="inputPort" id="qModel_stnfr" maxlength="3" name="qModel.stnfr" placeholder="GMP" type="text"
            value=""> &nbsp;&nbsp;&nbsp;
          <input class="inputPort" id="qModel_stnto" maxlength="3" name="qModel.stnto" placeholder="CJU" type="text"
            value="">
        </li>
        <li>
          <label for="fil04">DOM/INT</label>
          <select id="qModel_intdom" name="qModel.intdom" style="width:160px;">
            <option value="INT">INT</option>
            <option selected="selected" value="DOM">DOM</option>
          </select>
        </li>
        <li>
          <label for="fil05">FLT</label>
          <span style="margin:0 4px 0 -20px;">LJ</span>
          <input id="qModel_fltnum" maxlength="4" name="qModel.fltnum" placeholder="301" type="text" value="">
        </li>
        <li>
          <label for="fil06">Reg No.</label>
          <span style="margin:0 4px 0 -20px;">HL</span>
          <input class="inputnumber" id="qModel_regno" maxlength="4" name="qModel.regno" placeholder="8012"
            type="text" value="">
        </li>
      </ul>
    </div>
    <div class="btn_wrap">
      <a href="javascript://" class="btnTypeD" @click="search">조회</a>
    </div>

    <table class="table_style">
      <thead>
        <tr>
          <th>USER ID</th>
          <th>ID</th>
          <th>TITLE</th>
          <th>COMPLETED</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in items" :key="item.id">
          <td>{{item.userId}}</td>
          <td>{{item.id}}</td>
          <td>{{item.title}}</td>
          <td>{{item.completed}}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      items: [],
    };
  },
  
  mounted() {
  },

  methods: {
    search() {
      fetch('https://jsonplaceholder.typicode.com/todos')
        .then((response) => response.json())
        .then((data) => {
          this.items = data;
        })
        .catch((error) => {
          console.error('데이터를 불러오는 중 오류가 발생했습니다.', error);
        });
    }
  }
};
</script>
