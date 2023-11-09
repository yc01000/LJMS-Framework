<script setup>
import { RouterView } from 'vue-router'
import Header from './components/Header.vue'
import Navbar from './components/Navbar.vue'
import Footer from './components/Footer.vue'
</script>

<template>
  <Header />

  <div id="container" class="container body-content">
    <Navbar />

    <div class="content_wrap">
      <RouterView />
    </div>
  </div>

  <Footer />
</template>
