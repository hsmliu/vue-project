<template>
  <div>
    <h1>我的音乐</h1>
<!--    <router-link to="/my/1">商品1</router-link>-->
<!--    <router-link to="/my/2">商品2</router-link>-->
<!--    <router-link to="/my/3">商品3</router-link>-->

    <router-link v-for="data in datas" :to="'/my/' + data.id" :key="data.id">商品{{data.id}}</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  data(){
    return{
      datas: []
    }
  },

  created() {
    this.$http.get("/api/users")
        .then((response)=>{
          console.log(response)
          if (response.data.code === 200){
            this.datas = response.data.data;
          }
        })
  }
}

</script>

<style scoped>

</style>
<script setup>
</script>