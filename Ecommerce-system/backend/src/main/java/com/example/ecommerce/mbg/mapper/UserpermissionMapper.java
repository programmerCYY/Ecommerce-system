package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.Userpermission;
import com.example.ecommerce.mbg.model.UserpermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserpermissionMapper {
    long countByExample(UserpermissionExample example);

    int deleteByExample(UserpermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userpermission record);

    int insertSelective(Userpermission record);

    List<Userpermission> selectByExample(UserpermissionExample example);

    Userpermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userpermission record, @Param("example") UserpermissionExample example);

    int updateByExample(@Param("record") Userpermission record, @Param("example") UserpermissionExample example);

    int updateByPrimaryKeySelective(Userpermission record);

    int updateByPrimaryKey(Userpermission record);
}