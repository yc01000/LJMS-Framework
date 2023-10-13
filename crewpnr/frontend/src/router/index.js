import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import FailHistoriesView from '../views/FailHistoriesView.vue'
import Test from '../views/Test.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/index.html',
      name: 'home',
      component: HomeView
    },
    {
      path: '/reservations.html',
      name: 'reservations',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/ReservationsView.vue')
    },
    {
      path: '/failhistories.html',
      name: 'failhistories',
      component: FailHistoriesView
    },
    {
      path: '/test.html',
      name: 'test',
      component: Test
    }
  ]
})

export default router
