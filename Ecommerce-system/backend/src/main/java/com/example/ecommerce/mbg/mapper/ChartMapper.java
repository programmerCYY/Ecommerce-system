package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.Chart;
import com.example.ecommerce.mbg.model.ChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartMapper {
    long countByExample(ChartExample example);

    int deleteByExample(ChartExample example);

    int deleteByPrimaryKey(Integer chartid);

    int insert(Chart record);

    int insertSelective(Chart record);

    List<Chart> selectByExample(ChartExample example);

    Chart selectByPrimaryKey(Integer chartid);

    int updateByExampleSelective(@Param("record") Chart record, @Param("example") ChartExample example);

    int updateByExample(@Param("record") Chart record, @Param("example") ChartExample example);

    int updateByPrimaryKeySelective(Chart record);

    int updateByPrimaryKey(Chart record);
}