package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbztMonitorManagerPO;
import com.yundata.metadata.model.po.SbztMonitorManagerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbztMonitorManagerPOMapper {
    int countByExample(SbztMonitorManagerPOExample example);

    int deleteByExample(SbztMonitorManagerPOExample example);

    int deleteByPrimaryKey(String sbztId);

    int insert(SbztMonitorManagerPO record);

    int insertSelective(SbztMonitorManagerPO record);

    List<SbztMonitorManagerPO> selectByExampleWithBLOBs(SbztMonitorManagerPOExample example);

    List<SbztMonitorManagerPO> selectByExample(SbztMonitorManagerPOExample example);

    SbztMonitorManagerPO selectByPrimaryKey(String sbztId);

    int updateByExampleSelective(@Param("record") SbztMonitorManagerPO record, @Param("example") SbztMonitorManagerPOExample example);

    int updateByExampleWithBLOBs(@Param("record") SbztMonitorManagerPO record, @Param("example") SbztMonitorManagerPOExample example);

    int updateByExample(@Param("record") SbztMonitorManagerPO record, @Param("example") SbztMonitorManagerPOExample example);

    int updateByPrimaryKeySelective(SbztMonitorManagerPO record);

    int updateByPrimaryKeyWithBLOBs(SbztMonitorManagerPO record);

    int updateByPrimaryKey(SbztMonitorManagerPO record);
}