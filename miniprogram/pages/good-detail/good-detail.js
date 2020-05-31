// pages/good-detail/good-detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    indicatorDots: false,
    vertical: false,
    autoplay: true,
    interval: 2000,
    duration: 500,
    current:0,
    detailInfo: {
      "Id": 44,
      "ShopId": 2,
      "GoodsNo": "8872123",
      "DataStatus": 2,
      "Title": "进口|日本michinoku|北海道红鲑鱼干80g",
      "Classify": 500,
      "Address":"这是一个商品地址",
      "ClassifyName": "零食",
      "GoodsImage":
      "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023005889114.jpg",
      "Stock": 10,
      "SaleAmount": 88,
      "CreateDate": "2018-11-04T18:30:07.000Z",
      "UpdateDate": "2018-11-19T08:21:01.000Z",
      "Brand": "日本michinoku",
      "OrderNum": 0,
      "SwiperImgList": [
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023005889114.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181119174911711201.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181114120643144118.jpg"
      ],
      "DetailImgList": [
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023609436883.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023609077672.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023609780116.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023610467126.jpg",
        "https://www.maohz.com/mhzapi/api/Common/ImageFile/goodsimgderek20181105023610170702.jpg"
      ]
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    console.log(options)
  },

  //切换事件
  swiperchange: function(e){
    let currentnum = e.detail.current;
    this.setData({ current: currentnum })
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})