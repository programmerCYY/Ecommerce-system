// pages/good-detail/good-detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    firstIndex: -1,
    //准备数据 
    //数据结构：以一组一组来进行设定 
    commodityAttr: [
      {
        priceId: 1,
        price: 35.0,
        "stock": 8,
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
      {
        priceId: 2,
        price: 35.1,
        "stock": 9,
        "attrValueList": [
          {
            "attrKey": "型号",
            "attrValue": "1"
          },
          {
            "attrKey": "颜色",
            "attrValue": "黑色"
          },
        ]
      },
      {
        priceId: 3,
        price: 35.2,
        "stock": 10,
        "attrValueList": [
          {
            "attrKey": "型号",
            "attrValue": "1"
          },
          {
            "attrKey": "颜色",
            "attrValue": "绿色"
          },
        ]
      },
      {
        priceId: 4,
        price: 35.2,
        "stock": 10,
        "attrValueList": [
          {
            "attrKey": "型号",
            "attrValue": "1"
          },
          {
            "attrKey": "颜色",
            "attrValue": "绿色"
          },
        ]
      }
    ],
    attrValueList: [],

    indicatorDots: false,
    vertical: false,
    autoplay: true,
    interval: 2000,
    duration: 500,
    current: 0,
    goodsNo: "",/*用来接收首页传来的goodno*/
    Address: "这是一个商品地址",
    detailInfo: {
      "Id": 44,
      "ShopId": 2,
      "GoodsNo": "8872123",
      "DataStatus": 2,
      "Title": "进口|日本michinoku|北海道红鲑鱼干80g",
      "Classify": 500,
      "Address": "这是一个商品地址",
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
  onLoad: function (options) {

    console.log(options)
    this.data.goodsNo = options.goodno;
    this.getdata();
  },
  //获取数据接口
  getdata: function () {
    let self = this;
    wx.request({
      url: 'https://ys.lumingx.com/api/miniapps/getWXGoodsInfo', //仅为示例，并非真实的接口地址
      data: {
        goodsNo: self.data.goodsNo || "0"
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res.data)
        let result = res.data;
        if (result && result.data) {
          self.setData({
            detailInfo: result.data
          })
        }
      },
    })
  },

  //切换事件,设置当前切换时候的底部坐标
  swiperchange: function (e) {
    let currentnum = e.detail.current;
    this.setData({ current: currentnum })
  },

  //跳转回首页
  jumptohome: function () {
    wx.switchTab({
      url: '/pages/base/base',
    })//跳转到tabbar页面并关闭其他页面
  },
  //出现选择界面,目前不会实现
  choose: function () {
    console.log("我不会")
  },
  //跳到购物车界面
  jumptocart: function () {
    wx.switchTab({
      url: '/pages/cart/cart',
    })
  },

  //加入购物车
  addtocart: function () {
    wx.getStorage({
      key: 'userid',
      success(res) {
        console.log(res.data)
      }
    })
    let self = this;
    wx.request({
      url: 'https://ys.lumingx.com/api/miniapps/addCart',
      data: {
        useid: '1234567',//用户id
        goodsid: self.data.goodsNo//商品id
      },
      method: 'POST',
      dataType: 'json',
      success: function (res) {
        console.log(res);
      },
      fail: function (res) {
        console.log(加入失败)
      },
      complete: function (res) { },
    }),
      wx.showToast({
        title: '加入成功',
        icon: 'success',
      });
  },



  onShow: function () {
    this.setData({
      includeGroup: this.data.commodityAttr
    });
    this.distachAttrValue(this.data.commodityAttr);
    // 只有一个属性组合的时候默认选中 
    // console.log(this.data.attrValueList); 
    if (this.data.commodityAttr.length == 1) {
      for (var i = 0; i < this.data.commodityAttr[0].attrValueList.length; i++) {
        this.data.attrValueList[i].selectedValue = this.data.commodityAttr[0].attrValueList[i].attrValue;
      }
      this.setData({
        attrValueList: this.data.attrValueList
      });
    }
  },
  /* 获取数据 */
  distachAttrValue: function (commodityAttr) {
    /** 
    将后台返回的数据组合成类似 
    { 
    attrKey:'型号', 
    attrValueList:['1','2','3'] 
    } 
    */
    // 把数据对象的数据（视图使用），写到局部内 
    var attrValueList = this.data.attrValueList;
    // 遍历获取的数据 
    for (var i = 0; i < commodityAttr.length; i++) {
      for (var j = 0; j < commodityAttr[i].attrValueList.length; j++) {
        var attrIndex = this.getAttrIndex(commodityAttr[i].attrValueList[j].attrKey, attrValueList);
        // console.log('属性索引', attrIndex); 
        // 如果还没有属性索引为-1，此时新增属性并设置属性值数组的第一个值；索引大于等于0，表示已存在的属性名的位置 
        if (attrIndex >= 0) {
          // 如果属性值数组中没有该值，push新值；否则不处理 
          if (!this.isValueExist(commodityAttr[i].attrValueList[j].attrValue, attrValueList[attrIndex].attrValues)) {
            attrValueList[attrIndex].attrValues.push(commodityAttr[i].attrValueList[j].attrValue);
          }
        } else {
          attrValueList.push({
            attrKey: commodityAttr[i].attrValueList[j].attrKey,
            attrValues: [commodityAttr[i].attrValueList[j].attrValue]
          });
        }
      }
    }
    // console.log('result', attrValueList) 
    for (var i = 0; i < attrValueList.length; i++) {
      for (var j = 0; j < attrValueList[i].attrValues.length; j++) {
        if (attrValueList[i].attrValueStatus) {
          attrValueList[i].attrValueStatus[j] = true;
        } else {
          attrValueList[i].attrValueStatus = [];
          attrValueList[i].attrValueStatus[j] = true;
        }
      }
    }
    this.setData({
      attrValueList: attrValueList
    });
  },
  getAttrIndex: function (attrName, attrValueList) {
    // 判断数组中的attrKey是否有该属性值 
    for (var i = 0; i < attrValueList.length; i++) {
      if (attrName == attrValueList[i].attrKey) {
        break;
      }
    }
    return i < attrValueList.length ? i : -1;
  },
  isValueExist: function (value, valueArr) {
    // 判断是否已有属性值 
    for (var i = 0; i < valueArr.length; i++) {
      if (valueArr[i] == value) {
        break;
      }
    }
    return i < valueArr.length;
  },
  /* 选择属性值事件 */
  selectAttrValue: function (e) {
    /*
    点选属性值，联动判断其他属性值是否可选 
    { 
    attrKey:'型号', 
    attrValueList:['1','2','3'], 
    selectedValue:'1', 
    attrValueStatus:[true,true,true] 
    } */
    //console.log(e.currentTarget.dataset); 
    //console.log(e);

    var attrValueList = this.data.attrValueList;
    var index = e.currentTarget.dataset.index;//属性索引 
    var key = e.currentTarget.dataset.key;
    var value = e.currentTarget.dataset.value;
    if (e.currentTarget.dataset.status || index == this.data.firstIndex) {
      if (e.currentTarget.dataset.selectedvalue == e.currentTarget.dataset.value) {
        // 取消选中 
        this.disSelectValue(attrValueList, index, key, value);
      } else {
        // 选中 
        this.selectValue(attrValueList, index, key, value);
      }

    }
  },
  /* 选中 */
  selectValue: function (attrValueList, index, key, value, unselectStatus) {
    //console.log('firstIndex', this.data.firstIndex); 
    var includeGroup = [];
    if (index == this.data.firstIndex && !unselectStatus) { // 如果是第一个选中的属性值，则该属性所有值可选 
      var commodityAttr = this.data.commodityAttr;
      // 其他选中的属性值全都置空 
      // console.log('其他选中的属性值全都置空', index, this.data.firstIndex, !unselectStatus); 
      for (var i = 0; i < attrValueList.length; i++) {
        for (var j = 0; j < attrValueList[i].attrValues.length; j++) {
          attrValueList[i].selectedValue = '';
        }
      }
    } else {
      var commodityAttr = this.data.includeGroup;
    }

    // console.log('选中', commodityAttr, index, key, value); 
    for (var i = 0; i < commodityAttr.length; i++) {
      for (var j = 0; j < commodityAttr[i].attrValueList.length; j++) {
        if (commodityAttr[i].attrValueList[j].attrKey == key && commodityAttr[i].attrValueList[j].attrValue == value) {
          includeGroup.push(commodityAttr[i]);
        }
      }
    }
    attrValueList[index].selectedValue = value;

    // 判断属性是否可选 
    for (var i = 0; i < attrValueList.length; i++) {
      for (var j = 0; j < attrValueList[i].attrValues.length; j++) {
        attrValueList[i].attrValueStatus[j] = false;
      }
    }
    for (var k = 0; k < attrValueList.length; k++) {
      for (var i = 0; i < includeGroup.length; i++) {
        for (var j = 0; j < includeGroup[i].attrValueList.length; j++) {
          if (attrValueList[k].attrKey == includeGroup[i].attrValueList[j].attrKey) {
            for (var m = 0; m < attrValueList[k].attrValues.length; m++) {
              if (attrValueList[k].attrValues[m] == includeGroup[i].attrValueList[j].attrValue) {
                attrValueList[k].attrValueStatus[m] = true;
              }
            }
          }
        }
      }
    }
    //console.log('结果', attrValueList); 
    this.setData({
      attrValueList: attrValueList,
      includeGroup: includeGroup
    });

    var count = 0;
    for (var i = 0; i < attrValueList.length; i++) {
      for (var j = 0; j < attrValueList[i].attrValues.length; j++) {
        if (attrValueList[i].selectedValue) {
          count++;
          break;
        }
      }
    }
    if (count < 2) {// 第一次选中，同属性的值都可选 
      this.setData({
        firstIndex: index
      });
    } else {
      this.setData({
        firstIndex: -1
      });
    }
  },
  /* 取消选中 */
  disSelectValue: function (attrValueList, index, key, value) {
    var commodityAttr = this.data.commodityAttr;
    attrValueList[index].selectedValue = '';

    // 判断属性是否可选 
    for (var i = 0; i < attrValueList.length; i++) {
      for (var j = 0; j < attrValueList[i].attrValues.length; j++) {
        attrValueList[i].attrValueStatus[j] = true;
      }
    }
    this.setData({
      includeGroup: commodityAttr,
      attrValueList: attrValueList
    });

    for (var i = 0; i < attrValueList.length; i++) {
      if (attrValueList[i].selectedValue) {
        this.selectValue(attrValueList, i, attrValueList[i].attrKey, attrValueList[i].selectedValue, true);
      }
    }
  },
  /* 点击确定 */
  choose: function () {
    var value = [];
    for (var i = 0; i < this.data.attrValueList.length; i++) {
      if (!this.data.attrValueList[i].selectedValue) {
        break;
      }
      value.push(this.data.attrValueList[i].selectedValue);
    }
    if (i < this.data.attrValueList.length) {
      wx.showToast({
        title: '请完善属性',
        icon: 'loading',
        duration: 1000
      })
    } else {
      console.log(value);
      wx.showToast({
        title: '选择的属性：' + value.join('-'),
        icon: 'sucess',
        duration: 1000
      })
    }
  },
})