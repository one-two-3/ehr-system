package com.ehr.mapper;

import com.ehr.pojo.EhrSsType;
import com.ehr.pojo.EhrSsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrSsTypeMapper {
    int countByExample(EhrSsTypeExample example);

    int deleteByExample(EhrSsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrSsType record);

    int insertSelective(EhrSsType record);

    List<EhrSsType> selectByExample(EhrSsTypeExample example);

    EhrSsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrSsType record, @Param("example") EhrSsTypeExample example);

    int updateByExample(@Param("record") EhrSsType record, @Param("example") EhrSsTypeExample example);

    int updateByPrimaryKeySelective(EhrSsType record);

    int updateByPrimaryKey(EhrSsType record);
}