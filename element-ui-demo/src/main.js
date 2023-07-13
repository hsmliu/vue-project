import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// 引入font-awesome图标
import 'font-awesome/css/font-awesome.min.css'


Vue.config.productionTip = false

// 全局注册element-ui
Vue.use(ElementUI);
new Vue({
  render: h => h(App),
}).$mount('#app')
