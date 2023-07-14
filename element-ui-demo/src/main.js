import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// 引入font-awesome图标
import 'font-awesome/css/font-awesome.min.css'
import axios from "axios";


// 配置请求路径
axios.defaults.baseURL = "http://127.0.0.1:9090"
// 将axios挂载到vue属性
Vue.prototype.$http = axios

Vue.config.productionTip = false
// 将axios作为全局的自定义属性   每个组件可以在内部直接访问


// 全局注册element-ui
Vue.use(ElementUI);
new Vue({
  render: h => h(App),
}).$mount('#app')
