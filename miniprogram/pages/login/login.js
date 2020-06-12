Page({

  /**
   * 页面的初始数据
   */
  data: {
    username:'',
    password:''
  },
  AccountInput:function(e){
    this.setData({ username:e.detail.value})
  },
  PasswordInput:function(e){
    this.setData({password:e.detail.value})
  },
  onClickSubmit:function(){
    wx.setStorage({
      key: "userid",
      data: this.data.username
    })
    wx.request({
      url: 'http://47.105.66.104:8080/ecommerce/User/Userlogin',
      data: {
        username: this.data.username,
        password: this.data.password
      },
      method: 'POST',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        if (res.data.code==200){
          wx.showToast({
            title: '登陆成功',
            icon: 'success',
          });
          wx.navigateBack({
            delta:1
          })
        }
        else
          wx.showToast({
            title: '账号密码错误',
            icon: 'success',
          });
        console.log(res.data)
      }
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