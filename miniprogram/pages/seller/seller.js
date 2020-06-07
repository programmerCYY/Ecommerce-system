// pages/seller/seller.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    sellerId:1,
    goodData: [{
      "sellerID":"123456",
      "Id": 49,
      "ShopId": 2,
      "GoodsNo": "6780851",
      "DataStatus": 2,
      "Title": "Iphone 8x",
      "Classify": 500,
      "ClassifyName": "零食",
      "GoodsImage": "../../images/pig.jpg",
      "Stock": 10,
      "SaleAmount": 100,
      "CreateDate": "2018-11-04T18:30:21.000Z",
      "UpdateDate": "2018-11-19T08:25:32.000Z",
      "Brand": "苹果",
      "OrderNum": 0,
      "SellNum": 20,
      "attrValueList": [
        {
          "attrKey": "型号",
          "attrValue": "2"
        },
        {
          "attrKey": "颜色",
          "attrValue": "白色"
        },
      ]
    },
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options)
  },

  deletegood:function(){
    wx.navigateTo({
      url: '/pages/delete-good/delete-good',
    })
  },

  change:function(){
    wx.navigateTo({
      url: '/pages/good-change/good-change',
    })
  },

  manageorder:function(){
    console.log(this.data.goodData[0].sellerID);
    let sellerid = this.data.goodData[0].sellerID;
    wx.navigateTo({
      url: '/pages/manager-order/manager-order?sellerid='+sellerid,
    })
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