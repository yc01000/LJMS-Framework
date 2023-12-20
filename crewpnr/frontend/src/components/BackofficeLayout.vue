<script setup>
import { RouterView } from 'vue-router'
import Header from './Header.vue'
import Navbar from './Navbar.vue'
import Footer from './Footer.vue'

</script>

<template>
  <Header />

  <div id="container" class="container body-content">
    <Navbar />

    <div class="content_wrap">
      <RouterView />
    </div>
  </div>

  <!-- <Footer /> -->
</template>
