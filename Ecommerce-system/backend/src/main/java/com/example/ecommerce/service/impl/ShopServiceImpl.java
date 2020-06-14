package com.example.ecommerce.service.impl;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.common.utils.JwtTokenUtil;
import com.example.ecommerce.common.utils.TranslateToToken;
import com.example.ecommerce.component.OverTimeCancelSender;
import com.example.ecommerce.component.ShopRegisterSender;
import com.example.ecommerce.mbg.mapper.GoodsMapper;
import com.example.ecommerce.mbg.mapper.ShopMapper;
import com.example.ecommerce.mbg.mapper.UserpermissionMapper;
import com.example.ecommerce.mbg.model.Goods;
import com.example.ecommerce.mbg.model.Shop;
import com.example.ecommerce.mbg.model.ShopExample;
import com.example.ecommerce.mbg.model.Userpermission;
import com.example.ecommerce.service.ManagerService;
import com.example.ecommerce.service.ShopService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/4 21:48
 * @description:
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired(required = false)
    private ShopMapper shopMapper;

    @Autowired(required = false)
    private UserpermissionMapper userpermissionMapper;

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ShopService shopService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private OverTimeCancelSender overTimeCancelSender;


    @Override
    public CommonResult SellerRegister(String password, String Shopname,String Sellername,String address,String sellertelephone) {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andSellernameEqualTo(Sellername);
        List<Shop> shopList = shopMapper.selectByExample(shopExample);
        if(shopList.size()>0)
        {
            return CommonResult.failed("用户名已经注册");
        }

        String p=passwordEncoder.encode(password);
        String ShopId = TranslateToToken.GetGUID();

        Shop shop = new Shop();
        shop.setSellername(Sellername);
        shop.setRegisterstate(0);
        shop.setSellerpassword(p);
        shop.setShopaddress(address);
        shop.setShopname(Shopname);
        shop.setTotalsales(0);
        shop.setShopid(ShopId);
        shop.setSellertelephone(sellertelephone);


        shopMapper.insert(shop);

        shopService.SendDelayMessageOverTime(ShopId);
        return CommonResult.success(Sellername,"注册请求已提交，等待审核");
    }

    @Override
    public String SellerLogin(String Sellername, String Sellerpassword) {
        String token=null;
        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(Sellername);
            if(!passwordEncoder.matches(Sellerpassword,userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken token1 = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(token1);
            token=jwtTokenUtil.generateToken(userDetails);
        }catch (AuthenticationException e){
        }
        return token;
    }

    @Override
    public CommonResult ApplyGoodsUp(String ShopId,String Goodname, String Goodpicture, String introduction, int number, int isPackage, String Frontpicture, String categoryId) {
        if(ShopId.length()==0)
        {
            return CommonResult.failed("商家ID不能为空啊");
        }

        String GoodId = TranslateToToken.GetGUID();
        Goods good = new Goods();
        good.setGoodid(GoodId);
        good.setUpdownstate(0);
        good.setCheckstate(0);
        good.setAllsellnumber(0);
        good.setCategoryid(categoryId);
        good.setDeletestate(0);
        good.setGoodpicture(Goodpicture);
        good.setFrontpicture(Frontpicture);
        good.setIntroduction(introduction);
        good.setIspackage(isPackage);
        good.setNumber(number);
        good.setShangtime(new Date());
        good.setShopid(ShopId);
        good.setGoodname(Goodname);

        goodsMapper.insert(good);


        return CommonResult.success(Goodname,"商品上架申请已经提交，请等待12h审核");
    }

    @Override
    public void SendDelayMessageOverTime(String ShopId) {
        long delaytimes = 60*60*1000*12;
       overTimeCancelSender.sendMessage(ShopId,delaytimes);
    }

    @Override
    public CommonResult CancelRegister(String ShopId) {
        if(shopMapper.selectByPrimaryKey(ShopId)!=null) {
            if (shopMapper.selectByPrimaryKey(ShopId).getRegisterstate() != 0) {
                return CommonResult.success("该商家的注册已被审核，可直接登陆");
            }
            managerService.sendEmail(ShopId, "超时未审核，请重新注册");
            shopMapper.deleteByPrimaryKey(ShopId);
            return CommonResult.success("成功删除");
        }else{
              return CommonResult.success("该账号不存在");
            }
        }

}
