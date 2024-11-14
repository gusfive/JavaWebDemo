import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
  {
    path: '/emp',
    name: 'emp',
    component: () => import(/* webpackChunkName: "about" */ '../views/tlias/EmpView.vue')
  },
  {
    path: '/',
    redirect: '/emp'
  },
  {
    path: '/element',
    name: 'element',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/element/ElementView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
