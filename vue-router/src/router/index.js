import VueRouter from "vue-router";
import Vue from "vue";
import Discover from "@/components/Discover.vue";
import Friends from "@/components/Friends.vue";
import MyMusic from "@/components/MyMusic.vue";
import TopList from "@/components/TopList.vue";
import PlayList from "@/components/PlayList.vue";
import Product from "@/components/Product.vue";



Vue.use(VueRouter)

const router = new VueRouter({
     routes: [
         {path: '/', redirect:"/discover"},
         {path: '/discover', component: Discover,
            // children中的path没有/
            children:[
                {path: 'top-list', component:TopList},
                {path: 'play-list', component:PlayList}
            ]},
         {path: '/friends', component: Friends},
         {path: '/my', component: MyMusic,
         children: [
             // 动态路由
             // {path: ':id', component:Product}
             // 以属性的方式传参
             {path: ':id', component:Product, props: true}
         ]
         }
     ]
})

// 导出router
export default router