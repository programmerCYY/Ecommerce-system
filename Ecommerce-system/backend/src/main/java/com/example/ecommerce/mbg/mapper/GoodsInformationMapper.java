package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.GoodsInformation;
import com.example.ecommerce.mbg.model.GoodsInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInformationMapper {
    long countByExample(GoodsInformationExample example);

    int deleteByExample(GoodsInformationExample example);

    int deleteByPrimaryKey(String goodid);

    int insert(GoodsInformation record);

    int insertSelective(GoodsInformation record);

    List<GoodsInformation> selectByExampleWithBLOBs(GoodsInformationExample example);

    List<GoodsInformation> selectByExample(GoodsInformationExample example);

    GoodsInformation selectByPrimaryKey(String goodid);

    int updateByExampleSelective(@Param("record") GoodsInformation record, @Param("example") GoodsInformationExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsInformation record, @Param("example") GoodsInformationExample example);

    int updateByExample(@Param("record") GoodsInformation record, @Param("example") GoodsInformationExample example);

    int updateByPrimaryKeySelective(GoodsInformation record);

    int updateByPrimaryKeyWithBLOBs(GoodsInformation record);

    int updateByPrimaryKey(GoodsInformation record);
}