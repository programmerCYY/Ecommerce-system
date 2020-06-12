// pages/test/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    address:{},
    goodData:[],
      totalprice:0,
      totalnumber:0,
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
    console.log(goodno)
    wx.navigateTo({
      url: '/pages/good-detail/good-detail?goodno='+goodno,
    })
  },
  onShow(){
    ////////////////////////////////////////////从后台调用this.getgoodData();
    let cart=wx.getStorageSync('goodData')||[];
    //过滤后的购物车数组
    cart= cart.filter(v=>v.checked);
    this.setData({goodData:cart});
    this.setCart(cart);
  },

  //设置购物车状态同时重新计算底部工具栏数据
  setCart(gooddata){
    let totalprice=0;
    let totalnumber=0;
    this.data.goodData.forEach(v=>{
        totalprice+=v.SaleAmount*v.price;
        totalnumber+=v.SaleAmount;
    })
    this.setData({totalprice:totalprice});
    this.setData({totalnumber:totalnumber});
    this.setData({goodData:gooddata});
  },
  handlepay:function(){
    let newcart=wx.getStorageSync('goodData');
    newcart=newcart.filter(v=>!v.checked);
    wx.setStorageSync('goodData', newcart);
    wx.navigateBack({})
  }
})