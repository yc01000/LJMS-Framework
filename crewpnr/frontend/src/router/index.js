import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import ReservationsView from '../views/ReservationsView.vue'
import FailHistoriesView from '../views/FailHistoriesView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/index.html',
      name: 'home',
      component: HomeView
    },
    {
      path: '/reservations',
      name: 'reservations',
      component: ReservationsView
    },
    {
      path: '/failhistories',
      name: 'failhistories',
      component: FailHistoriesView
    }
  ]
})

export default router
