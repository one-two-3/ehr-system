package com.ehr.mapper;

import com.ehr.pojo.EhrRewardPunish;
import com.ehr.pojo.EhrRewardPunishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrRewardPunishMapper {
    int countByExample(EhrRewardPunishExample example);

    int deleteByExample(EhrRewardPunishExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrRewardPunish record);

    int insertSelective(EhrRewardPunish record);

    List<EhrRewardPunish> selectByExample(EhrRewardPunishExample example);

    EhrRewardPunish selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrRewardPunish record, @Param("example") EhrRewardPunishExample example);

    int updateByExample(@Param("record") EhrRewardPunish record, @Param("example") EhrRewardPunishExample example);

    int updateByPrimaryKeySelective(EhrRewardPunish record);

    int updateByPrimaryKey(EhrRewardPunish record);
}