package com.accp.dao;

import com.accp.model.Kc;
import com.accp.model.KcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcMapper {
    int countByExample(KcExample example);

    int deleteByExample(KcExample example);

    int insert(Kc record);

    int insertSelective(Kc record);

    List<Kc> selectByExample(KcExample example);
    
    List<Kc> selectbyzyid(Integer zyid);

    int updateByExampleSelective(@Param("record") Kc record, @Param("example") KcExample example);

    int updateByExample(@Param("record") Kc record, @Param("example") KcExample example);
}