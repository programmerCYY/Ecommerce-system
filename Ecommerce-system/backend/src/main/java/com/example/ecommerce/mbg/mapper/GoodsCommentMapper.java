package com.example.ecommerce.mbg.mapper;

import com.example.ecommerce.mbg.model.GoodsComment;
import com.example.ecommerce.mbg.model.GoodsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCommentMapper {
    long countByExample(GoodsCommentExample example);

    int deleteByExample(GoodsCommentExample example);

    int deleteByPrimaryKey(String commentid);

    int insert(GoodsComment record);

    int insertSelective(GoodsComment record);

    List<GoodsComment> selectByExampleWithBLOBs(GoodsCommentExample example);

    List<GoodsComment> selectByExample(GoodsCommentExample example);

    GoodsComment selectByPrimaryKey(String commentid);

    int updateByExampleSelective(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByExample(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByPrimaryKeySelective(GoodsComment record);

    int updateByPrimaryKeyWithBLOBs(GoodsComment record);

    int updateByPrimaryKey(GoodsComment record);
}