package com.ehr.mapper;

import com.ehr.pojo.EhrOnholiday;
import com.ehr.pojo.EhrOnholidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrOnholidayMapper {
    int countByExample(EhrOnholidayExample example);

    int deleteByExample(EhrOnholidayExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrOnholiday record);

    int insertSelective(EhrOnholiday record);

    List<EhrOnholiday> selectByExample(EhrOnholidayExample example);

    EhrOnholiday selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrOnholiday record, @Param("example") EhrOnholidayExample example);

    int updateByExample(@Param("record") EhrOnholiday record, @Param("example") EhrOnholidayExample example);

    int updateByPrimaryKeySelective(EhrOnholiday record);

    int updateByPrimaryKey(EhrOnholiday record);
}