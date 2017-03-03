package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SchedulerConfigInfoPO;
import com.yundata.metadata.model.po.SchedulerConfigInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulerConfigInfoPOMapper {
    int countByExample(SchedulerConfigInfoPOExample example);

    int deleteByExample(SchedulerConfigInfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchedulerConfigInfoPO record);

    int insertSelective(SchedulerConfigInfoPO record);

    List<SchedulerConfigInfoPO> selectByExample(SchedulerConfigInfoPOExample example);

    SchedulerConfigInfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SchedulerConfigInfoPO record, @Param("example") SchedulerConfigInfoPOExample example);

    int updateByExample(@Param("record") SchedulerConfigInfoPO record, @Param("example") SchedulerConfigInfoPOExample example);

    int updateByPrimaryKeySelective(SchedulerConfigInfoPO record);

    int updateByPrimaryKey(SchedulerConfigInfoPO record);
}