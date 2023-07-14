<template>
  <div>
<!--    图标用法 <i class="fa iconName"></i>-->
    <i class="fa fa-file-movie-o"></i>
    <span style="font-size: large; margin-left: 1em">{{ title }}</span>
    <span style="font-size: large; margin-left: 1em">{{ rating }}</span>
    <button style="margin-left: 2ex" @click="fun">点击收藏</button>
    <br/><br/>
  </div>
</template>

<style scoped>

</style>

<script>
// 导出
export default {
  // 可以加组件属性, 组件导入处可以使用这些属性
  // 父组件可以使用这些属性,但是兄弟组件无法使用[Hello]
  name: 'Movie',

  // 自定义属性
  props: ["title", "rating"],
  data(){
    return{
    }
  },
  methods:{
    fun(){
      alert("收藏成功")
    }
  },
  created() {
    console.log("Movie组件被创建了")
  }
}
</script>