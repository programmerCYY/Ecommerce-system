// pages/sellerzhuce/sellerzhuce.js
Page({
  /**
   * 页面的初始数据
   */
  data: {
    account: '',
    password: '',
    shopname: '',
    sellername:'',
    address:'',
    telephone:''
  },

  AccountInput: function (e) {
    this.setData({ account: e.detail.value })
  },
  PasswordInput: function (e) {
    this.setData({ password: e.detail.value })
  },
  ShopnameInput: function (e) {
    this.setData({ shopname: e.detail.value })
  },
  SellernameInput: function (e) {
    this.setData({ sellername: e.detail.value })
  },
  AddressInput: function (e) {
    this.setData({ address: e.detail.value })
  },
  TelephoneInput: function (e) {
    this.setData({ telephone: e.detail.value })
  },


  onClickzhuce: function () {
    let self = this;
    wx.request({
      url: 'http://47.105.66.104:8080/ecommerce/Shop/Sellerregister',
      data: {
        ShopId: self.data.account,
        password: self.data.password,
        Shopname: self.data.shopname,
        Sellername:self.data.sellername,
        address:self.data.address,
        sellertelephone:self.data.telephone
      },
      method: 'GET',
      dataType: 'json',
      header: { "Content-Type": "application/text"},
      success: function (res) {
        wx.showToast({
          title: '注册成功',
          icon: 'success',
        });
         //console.log("注册成功")
        },
      fail: function (res) { 
        wx.showToast({
          title: '注册失败',
          icon: 'none',
        });
        //console.log("注册失败") 
        },
      complete: function (res) { },
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