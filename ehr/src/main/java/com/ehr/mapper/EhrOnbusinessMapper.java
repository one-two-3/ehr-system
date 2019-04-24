package com.ehr.mapper;

import com.ehr.pojo.EhrOnbusiness;
import com.ehr.pojo.EhrOnbusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrOnbusinessMapper {
    int countByExample(EhrOnbusinessExample example);

    int deleteByExample(EhrOnbusinessExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrOnbusiness record);

    int insertSelective(EhrOnbusiness record);

    List<EhrOnbusiness> selectByExample(EhrOnbusinessExample example);

    EhrOnbusiness selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrOnbusiness record, @Param("example") EhrOnbusinessExample example);

    int updateByExample(@Param("record") EhrOnbusiness record, @Param("example") EhrOnbusinessExample example);

    int updateByPrimaryKeySelective(EhrOnbusiness record);

    int updateByPrimaryKey(EhrOnbusiness record);
}