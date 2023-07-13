<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <Movie v-for="movie in movies" key="movie.id" :title="movie.title" :rating="movie.rating"></Movie>
    <hello></hello>
    <Tab></Tab>
  </div>
</template>

<script>
import Movie from "@/components/Movie.vue";
import Hello from "@/components/Hello.vue";
import Tab from "@/components/Tab.vue";

export default {
  name: 'App',
  components: {
    Tab,
    Movie,
    Hello
  },
  data(){
    return{
      movies:[
        {id:1, title:"金刚狼", rating:9},
        {id:2, title:"指环王", rating:8.7},
        {id:3, title:"黑客帝国", rating:8},
        {id:4, title:"金刚", rating:7}
      ]
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
