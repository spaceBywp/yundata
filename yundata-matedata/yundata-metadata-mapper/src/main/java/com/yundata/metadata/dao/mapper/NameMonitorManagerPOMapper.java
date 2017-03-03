package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.NameMonitorManagerPO;
import com.yundata.metadata.model.po.NameMonitorManagerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NameMonitorManagerPOMapper {
    int countByExample(NameMonitorManagerPOExample example);

    int deleteByExample(NameMonitorManagerPOExample example);

    int deleteByPrimaryKey(String nameId);

    int insert(NameMonitorManagerPO record);

    int insertSelective(NameMonitorManagerPO record);

    List<NameMonitorManagerPO> selectByExampleWithBLOBs(NameMonitorManagerPOExample example);

    List<NameMonitorManagerPO> selectByExample(NameMonitorManagerPOExample example);

    NameMonitorManagerPO selectByPrimaryKey(String nameId);

    int updateByExampleSelective(@Param("record") NameMonitorManagerPO record, @Param("example") NameMonitorManagerPOExample example);

    int updateByExampleWithBLOBs(@Param("record") NameMonitorManagerPO record, @Param("example") NameMonitorManagerPOExample example);

    int updateByExample(@Param("record") NameMonitorManagerPO record, @Param("example") NameMonitorManagerPOExample example);

    int updateByPrimaryKeySelective(NameMonitorManagerPO record);

    int updateByPrimaryKeyWithBLOBs(NameMonitorManagerPO record);

    int updateByPrimaryKey(NameMonitorManagerPO record);
}