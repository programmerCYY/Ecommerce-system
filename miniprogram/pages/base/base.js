// pages/base/base.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    msg:'Hello world',
    img:'/images/pig.jpg',
    arr:['a','b','c','d'],
    list:[
      {
        name:'lili',
        age:18
      },
      {
        name:'momo',
        age:19
      },
      {
        name:'lover',
        age:20
      }
    ],
    islogin:true,
    count:0
  },


  ontaphandler:function()
  {
    this.setData({count: this.data.count+1});
  },

  ontapboxhandler:function(){
    console.log('box 点击');
  },

  ontapchildhandler:function()
  {
    console.log('child 点击');
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})