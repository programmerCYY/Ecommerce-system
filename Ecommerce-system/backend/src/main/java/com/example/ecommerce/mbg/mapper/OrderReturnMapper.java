package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.OrderReturn;
import com.example.ecommerce.mbg.model.OrderReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReturnMapper {
    long countByExample(OrderReturnExample example);

    int deleteByExample(OrderReturnExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(OrderReturn record);

    int insertSelective(OrderReturn record);

    List<OrderReturn> selectByExampleWithBLOBs(OrderReturnExample example);

    List<OrderReturn> selectByExample(OrderReturnExample example);

    OrderReturn selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByExample(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByPrimaryKeySelective(OrderReturn record);

    int updateByPrimaryKeyWithBLOBs(OrderReturn record);

    int updateByPrimaryKey(OrderReturn record);
}