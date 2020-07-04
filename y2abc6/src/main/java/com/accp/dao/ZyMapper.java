package com.accp.dao;

import com.accp.model.Zy;
import com.accp.model.ZyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyMapper {
    int countByExample(ZyExample example);

    int deleteByExample(ZyExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Zy record);

    int insertSelective(Zy record);

    List<Zy> selectByExample(ZyExample example);

    Zy selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Zy record, @Param("example") ZyExample example);

    int updateByExample(@Param("record") Zy record, @Param("example") ZyExample example);

    int updateByPrimaryKeySelective(Zy record);

    int updateByPrimaryKey(Zy record);
}