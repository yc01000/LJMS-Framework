<template>
  <div v-if="isVisible" class="modal-overlay">
    <div @click.self="preventModalClose">
      <div>
        <!-- 팝업 레이어 -->
        <div class="popup">
          <h2 style="text-align: left; color: #6e2c00;">{{ this.title }}</h2>
          <div style="font-size:16px; padding:30px 0 10px 0;">
            <p>{{ this.msg }}</p>
          </div>
          <br>
          <!-- 팝업을 닫는 이벤트를 처리하는 closePopup 메소드를 호출합니다 -->
          <button @click="closePopup" class="btnTypeD">Close</button>
        </div>
      </div>
    </div>
  </div>
</template>
  
<script>
export default {
  data() {
    return {
      isVisible: false, // 팝업 레이어의 표시 여부를 저장하는 데이터 속성
      title: Object,
      msg: Object
    };
  },
  props: {
  },
  mounted() {

  },
  methods: {
    showPopup(strTitle, strMsg) {
      this.title = strTitle;
      this.msg = strMsg;
      // 팝업 레이어를 표시하는 메소드
      this.isVisible = true;
    },
    closePopup() {
      // 팝업 레이어를 닫는 메소드
      this.isVisible = false;
    },
  },
};
</script>
  
<style scoped>
.popup {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: #ffffff;
  padding: 20px;
  box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
  z-index: 1000;
}

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
</style>
  