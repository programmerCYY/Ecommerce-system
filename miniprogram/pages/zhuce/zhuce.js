// pages/zhuce/zhuce.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    account: '',
    password: '',
  },

  AccountInput: function (e) {
    this.setData({ account: e.detail.value })
  },
  PasswordInput: function (e) {
    this.setData({ password: e.detail.value })
  },

  onClickzhuce:function(){
    let self = this;
    wx.request({
      url: '',
      data:{
        useid:self.data.account,
        usepassword:self.data.password
      },
      method: 'POST',
      dataType: 'json',
      success: function(res) {},
      fail: function(res) {},
      complete: function(res) {},
    })
    wx.showToast({
      title: '注册成功',
      icon: 'success',
    });
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