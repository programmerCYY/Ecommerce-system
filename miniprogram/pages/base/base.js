// pages/base/base.js
// pages/home/home.js
var app = getApp()
Page({
  data: {
    background: ['/images/pig.jpg', '/images/pig.jpg', '/images/pig.jpg'],
    indicatorDots: true,
    vertical: false,
    autoplay: true,
    interval: 2000,
    duration: 500,
    navbar: ['全部', '手机'],
    currentTab: 0,//默认加载第0个页面
    goodData: [{
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
      "OrderNum": 0
    },
      {
        "Id": 52,
        "ShopId": 2,
        "GoodsNo": "1047032",
        "DataStatus": 2,
        "Title": "Iphone 9x",
        "Classify": 500,
        "ClassifyName": "零食",
        "GoodsImage": "../../images/pig.jpg",
        "Stock": 10,
        "SaleAmount": 99,
        "CreateDate": "2018-11-04T18:30:38.000Z",
        "UpdateDate": "2018-11-20T10:21:37.000Z",
        "Brand": "鸭梨",
        "OrderNum": 0
      },
      {
        "Id": 55,
        "ShopId": 2,
        "GoodsNo": "4752333",
        "DataStatus": 2,
        "Title": "Iphone 8x",
        "Classify": 500,
        "ClassifyName": "零食",
        "GoodsImage": "../../images/pig.jpg",
        "Stock": 10,
        "SaleAmount": 87,
        "CreateDate": "2018-11-04T18:30:55.000Z",
        "UpdateDate": "2018-11-19T08:36:39.000Z",
        "Brand": "葡萄",
        "OrderNum": 0
      }]
  },
  
  // 导航切换监听
  navbarTap: function (e) {
    console.debug(e);
    this.setData({
      currentTab: e.currentTarget.dataset.idx//把当前用户点击的Tab坐标传给currentTab。
    })
  },

  getgoodData:function()
  {
    let self=this;
    //显示加载
    wx.showLoading({
      title: '加载中',
    });
    wx.request({
      url: 'https://ys.lumingx.com/api/manage/GoodsList?pageNo=1&pageSize=10', //仅为示例，并非真实的接口地址
      data: {
        pageNo:1,
        pageSize:6
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        //隐藏加载
        wx.hideLoading();
        console.log(res.data)
        let result=res.data;
        if(result.success && result.data.length>0)//success是自己写的接口的调用成功值，这里是true
        {
          self.setData({ goodData: result.data })
         
        }
      }
    })
  },

  jumptogood:function(e)
  {
    console.log(e);
    //点击后要获取商品的数据（一般是ID）
    //在进行跳转，将goodid给商品详情页
    let goodno=e.currentTarget.dataset.goodid;
    //console.log(goodno)打印出商品号
    wx.navigateTo({
      url: '/pages/good-detail/good-detail?goodno='+goodno,
    })
  },

  onLoad:function()
  {
    this.getgoodData();
  }
})