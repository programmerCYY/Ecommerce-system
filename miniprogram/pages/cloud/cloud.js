const db=wx.cloud.database();
//初始化数据库

 
// pages/cloud/cloud.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    images: [] 
  },

  insert:function(){
    db.collection('user').add({
      data:{
        name:'jerry',
        age:20
      },
      success: res=>{
        console.log(res);
      },
      fail:err=>{
        console.log(err);
      }

    });

    db.collection('user').add({
      data:{
        name:'jack',
        age:21
      }
    }).then(res=>{console.log(res);}).catch(err=>{console.log(err);})
  },


  updata:function(){
    db.collection('user').doc("e30d61715e4d014800f4ec775276b45d"
).update({
  data:{
    age:25
  }
}).then(res=>{console.log(res);}).catch(err=>{console.log(err);});

  },

  search:function(){
    db.collection('user').where({name:'jerry'}).get().then(res=>{console.log(res);}).catch(err=>{console.log(err);});
  },

  delete:function(){
    db.collection('user').doc("e30d61715e4d014800f4ec775276b45d").remove().then(res => { console.log(res); }).catch(err => { console.log(err); });
  },

  sum:function(){
    wx.cloud.callFunction({
      name:'sum',
      data:{
        a:2 ,
        b:3
      }
    }).then(res => { console.log(res); }).catch(err => { console.log(err); });
  },

  openid:function()
  {
    wx.cloud.callFunction({
      name:'login'
    }).then(res => { console.log(res); }).catch(err => { console.log(err); });
  },

  batchdelete:function(){
    wx.cloud.callFunction({
      name:'batchdelete'
    }).then(res => { console.log(res); }).catch(err => { console.log(err); });
  },

  upload:function(){
    wx.chooseImage({
      count: 1,
      sizeType: ['original', 'compressed'],
      sourceType: ['album', 'camera'],
      success(res) {
        // tempFilePath可以作为img标签的src属性显示图片
        const tempFilePaths = res.tempFilePaths
        console.log(tempFilePaths);
    
        wx.cloud.uploadFile({
          // 指定上传到的云路径
          cloudPath: 'my-photo.png',
          // 指定要上传的文件的小程序临时文件路径
          filePath: tempFilePaths[0],
          // 成功回调
          success: res => {
            console.log('上传成功', res.fileid)
            db.collection('Image').add({
              data:{
                fileid:res.fileid
              }
            }).then(res=>{console.log(res);}).catch(err=>{console.error(err);})
            } 
           })
        }
    })
  },

  getfile:function(){
    wx.cloud.callFunction({
      name:'login',
    }).then(res=>{
      db.collection('Image').where({
        _openid: res.result._openid
      }).get().then(res=>{
        console.log(res);
        this.setData({
          images: res.data
        });
      })
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