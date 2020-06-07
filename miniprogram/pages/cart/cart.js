// pages/test/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    address:{},
    goodData:[{
      "Id": 49,
      "ShopId": 2,
      "GoodsNo": "6780851",
      "DataStatus": 2,
      "Title": "Iphone 8x",
      "Classify": 500,
      "ClassifyName": "零食",
      "GoodsImage": "../../images/pig.jpg",
      "Stock": 10,
      "SaleAmount": 1,
      "CreateDate": "2018-11-04T18:30:21.000Z",
      "UpdateDate": "2018-11-19T08:25:32.000Z",
      "Brand": "苹果",
      "OrderNum": 1,
      "price":8,
      "checked": true
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
        "SaleAmount": 1,
        "CreateDate": "2018-11-04T18:30:38.000Z",
        "UpdateDate": "2018-11-20T10:21:37.000Z",
        "Brand": "鸭梨",
        "OrderNum": 3,
        "price":10,
        "checked": true
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
        "SaleAmount": 1,
        "CreateDate": "2018-11-04T18:30:55.000Z",
        "UpdateDate": "2018-11-19T08:36:39.000Z",
        "Brand": "葡萄",
        "OrderNum": 2,
        "price":9,
        "checked": false
      }],
      allChecked:false,
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
    //计算全选
    this.setCart(this.data.goodData);
  },

  //商品选中
  handleItemChange:function(e){
    //获取被修改的商品id
    const goodsno=e.currentTarget.dataset.id;
    //获取购物车数组
    let gooddata=this.data.goodData;
    //找到被修改的商品对象
    let index=gooddata.findIndex(v=>v.GoodsNo===goodsno);
    //选中状态取反
    gooddata[index].checked=!gooddata[index].checked;
    //设置数据回data
    this.setCart(gooddata);
    ////////////////////////////////////////////////////////////这里要有写回去后台的操作！
  },

  //商品全选功能
  handleItemAllcheck:function(){
    let gooddata=this.data.goodData;
    let allchecked=this.data.allChecked;
    //反选
    allchecked=!allchecked;
    gooddata.forEach(v=>v.checked=allchecked);
    //保存
    this.setCart(gooddata);
  },

  //商品数量编辑+-
  handleItemNumEdit:function(e){
    const oper=e.currentTarget.dataset.operation;
    const id=e.currentTarget.dataset.id;
    let gooddata=this.data.goodData;
    const index=gooddata.findIndex(v=>v.GoodsNo===id);
    //判断是否删除
    if(gooddata[index].SaleAmount=== 1&&oper===-1){
      //弹窗
      wx.showModal({
        content: '您是否要删除商品？',
        success: (result) => {
          if(result.confirm){
            gooddata.splice(index,1);
            this.setCart(gooddata);
          }
        },
        title: '提示',
      })
    }else{
      gooddata[index].SaleAmount+=oper;
      this.setCart(gooddata);
    }
  },
  handlePay:function(){
    //验证收货地址？
    //判断有没有选购商品
    const total=this.data.totalnumber;
    if(total===0){
      wx.showToast({
        title: '您还没有选购商品',
        icon:"none",
      });
      return;
    }else{//跳转到支付，或者是直接数据库操作？预计跳转到一个界面展示是否成功？
      this.data.goodData.forEach(v=>{
        if(v.checked){
          console.log(v.GoodsNo);
        }
      })
      
    }
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

  },
  //设置购物车状态同时重新计算底部工具栏数据
  setCart(gooddata){
    var i=0;
    let totalprice=0;
    let totalnumber=0;
    this.data.goodData.forEach(v=>{
      if(v.checked){
        totalprice+=v.SaleAmount*v.price;
        totalnumber+=v.SaleAmount;
        ++i;
      }else{
        this.setData({allChecked:false});
      }
    })
    if(i===this.data.goodData.length){
      this.setData({allChecked:true});
    }
    if(this.data.goodData.length===0){
      this.setData({allChecked:false});
    }
    this.setData({totalprice:totalprice});
    this.setData({totalnumber:totalnumber});
    this.setData({goodData:gooddata});
  }
})