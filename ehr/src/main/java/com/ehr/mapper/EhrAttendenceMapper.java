package com.ehr.mapper;

import com.ehr.pojo.EhrAttendence;
import com.ehr.pojo.EhrAttendenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrAttendenceMapper {
    int countByExample(EhrAttendenceExample example);

    int deleteByExample(EhrAttendenceExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrAttendence record);

    int insertSelective(EhrAttendence record);

    List<EhrAttendence> selectByExample(EhrAttendenceExample example);

    EhrAttendence selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrAttendence record, @Param("example") EhrAttendenceExample example);

    int updateByExample(@Param("record") EhrAttendence record, @Param("example") EhrAttendenceExample example);

    int updateByPrimaryKeySelective(EhrAttendence record);

    int updateByPrimaryKey(EhrAttendence record);
}