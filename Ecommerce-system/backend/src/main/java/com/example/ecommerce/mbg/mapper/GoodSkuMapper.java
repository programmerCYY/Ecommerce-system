package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.GoodSku;
import com.example.ecommerce.mbg.model.GoodSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodSkuMapper {
    long countByExample(GoodSkuExample example);

    int deleteByExample(GoodSkuExample example);

    int deleteByPrimaryKey(Integer skuid);

    int insert(GoodSku record);

    int insertSelective(GoodSku record);

    List<GoodSku> selectByExample(GoodSkuExample example);

    GoodSku selectByPrimaryKey(Integer skuid);

    int updateByExampleSelective(@Param("record") GoodSku record, @Param("example") GoodSkuExample example);

    int updateByExample(@Param("record") GoodSku record, @Param("example") GoodSkuExample example);

    int updateByPrimaryKeySelective(GoodSku record);

    int updateByPrimaryKey(GoodSku record);
}