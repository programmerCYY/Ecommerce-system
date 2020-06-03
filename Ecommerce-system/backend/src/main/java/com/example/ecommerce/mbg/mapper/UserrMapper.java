package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.Userr;
import com.example.ecommerce.mbg.model.UserrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrMapper {
    long countByExample(UserrExample example);

    int deleteByExample(UserrExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Userr record);

    int insertSelective(Userr record);

    List<Userr> selectByExample(UserrExample example);

    Userr selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Userr record, @Param("example") UserrExample example);

    int updateByExample(@Param("record") Userr record, @Param("example") UserrExample example);

    int updateByPrimaryKeySelective(Userr record);

    int updateByPrimaryKey(Userr record);
}