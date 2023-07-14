import Vue from 'vue'
import App from './App.vue'
// 导入
import routes from './router/index'
import axios from "axios";



// 配置请求路径
axios.defaults.baseURL = "http://127.0.0.1:9090"
// 将axios挂载到vue属性
Vue.prototype.$http = axios


Vue.config.productionTip = false
new Vue({
  render: h => h(App),
  // 如果名称一样  可以只写 router
  router: routes
}).$mount('#app')
