<template>
  <el-table
      :data="tableData"
      style="width: 100%">
    <el-table-column
        prop="id"
        label="编号"
        width="100">
    </el-table-column>
    <el-table-column
        prop="createTime"
        label="日期"
        width="180">
    </el-table-column>
    <el-table-column
        prop="name"
        label="姓名"
        width="180">
    </el-table-column>
    <el-table-column
        prop="address"
        label="地址">
    </el-table-column>
  </el-table>
</template>

<script>


export default {

  data() {
    return {
      tableData: []
    }
  },
  // 生命周期函数 created,组件创建后执行
  // 一般网络请求在created里面做,在页面挂载完成之前
  created() {
    console.log("App组件被创建了")

    // 异步执行
    // axios.get("http://127.0.0.1:9090/api/users")
    //     .then(function (response){
    //       // 异步回调
    //       console.log(response)
    //       // 和created中的this对象作用域不一致   无法使用 this.tableData
    //       // this.tableData = response.data
    //     })
    this.$http.get("/api/users")
        .then((response)=>{
          console.log(response)
          if (response.data.code === 200){
            this.tableData = response.data.data;
          }
        })
  },
}
</script>

<style>

</style>