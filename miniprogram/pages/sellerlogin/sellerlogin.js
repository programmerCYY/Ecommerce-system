Page({

  /**
   * 页面的初始数据
   */
  data: {
    username: '',
    password: '',
    sellernum:"123"
  },
  AccountInput: function (e) {
    this.setData({ username: e.detail.value })
  },
  PasswordInput: function (e) {
    this.setData({ password: e.detail.value })
  },


  login: function () {
    let self = this;
    wx.request({
      url: 'http://47.105.66.104:8080/ecommerce/Shop/Sellerlogin',
      data: {
        username: this.data.username,
        password: this.data.password
      },
      method: 'GET',
      header: { "Content-Type": "application/x-www-form-urlencoded" },
      success(res) {
        if (res.data.code == 200) {
          wx.showToast({
            title: '登陆成功',
            icon: 'success',
          });
          let sellerno = self.data.sellernum;
          wx.navigateTo({
            url: '/pages/seller/seller?sellerno=' + sellerno,
          })
        }
        else
          wx.showToast({
            title: '账号密码错误',
            icon: 'none',
          });
        console.log(res.data)
      }
    })


  },

  zhuce:function(){
    wx.navigateTo({
      url: '/pages/sellerzhuce/sellerzhuce',
    })
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