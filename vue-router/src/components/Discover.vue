<template>
  <div>
    <h1>发现音乐</h1>
    <!-- 子路由链接-->
    <router-link to="/discover/top-list">推荐</router-link>
    <router-link to="/discover/play-list">歌单</router-link>
    <hr/>
    <router-view></router-view>
  </div>
</template>

<style scoped>

</style>
<script setup>
</script>