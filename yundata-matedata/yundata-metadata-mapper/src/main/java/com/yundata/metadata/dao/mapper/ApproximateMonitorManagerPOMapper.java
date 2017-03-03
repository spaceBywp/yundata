package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ApproximateMonitorManagerPO;
import com.yundata.metadata.model.po.ApproximateMonitorManagerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproximateMonitorManagerPOMapper {
    int countByExample(ApproximateMonitorManagerPOExample example);

    int deleteByExample(ApproximateMonitorManagerPOExample example);

    int deleteByPrimaryKey(String approximateId);

    int insert(ApproximateMonitorManagerPO record);

    int insertSelective(ApproximateMonitorManagerPO record);

    List<ApproximateMonitorManagerPO> selectByExampleWithBLOBs(ApproximateMonitorManagerPOExample example);

    List<ApproximateMonitorManagerPO> selectByExample(ApproximateMonitorManagerPOExample example);

    ApproximateMonitorManagerPO selectByPrimaryKey(String approximateId);

    int updateByExampleSelective(@Param("record") ApproximateMonitorManagerPO record, @Param("example") ApproximateMonitorManagerPOExample example);

    int updateByExampleWithBLOBs(@Param("record") ApproximateMonitorManagerPO record, @Param("example") ApproximateMonitorManagerPOExample example);

    int updateByExample(@Param("record") ApproximateMonitorManagerPO record, @Param("example") ApproximateMonitorManagerPOExample example);

    int updateByPrimaryKeySelective(ApproximateMonitorManagerPO record);

    int updateByPrimaryKeyWithBLOBs(ApproximateMonitorManagerPO record);

    int updateByPrimaryKey(ApproximateMonitorManagerPO record);
}