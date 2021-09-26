package com.ym.dao;

import com.ym.bean.Euser;
import com.ym.bean.EuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EuserMapper {
    long countByExample(EuserExample example);

    int deleteByExample(EuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Euser record);

    int insertSelective(Euser record);

    List<Euser> selectByExample(EuserExample example);

    Euser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByExample(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByPrimaryKeySelective(Euser record);

    int updateByPrimaryKey(Euser record);
}