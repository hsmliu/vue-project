<template>
  <div>
    <!--  通过模板语法拿到id-->
    <h3>商品{{$route.params.id}}</h3>
    <hr/>
      <h3>商品</h3>
    <!--  通过属性的方式传值-->
      <p>{{id}}</p>
  </div>
</template>

<script>
export default {
  // 以属性的方式传递值
  props: ["id"]
}
</script>

<style scoped>

</style>