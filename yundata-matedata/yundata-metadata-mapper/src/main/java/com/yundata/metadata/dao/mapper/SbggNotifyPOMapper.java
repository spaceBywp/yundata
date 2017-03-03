package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggNotifyPO;
import com.yundata.metadata.model.po.SbggNotifyPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggNotifyPOMapper {
    int countByExample(SbggNotifyPOExample example);

    int deleteByExample(SbggNotifyPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggNotifyPO record);

    int insertSelective(SbggNotifyPO record);

    List<SbggNotifyPO> selectByExample(SbggNotifyPOExample example);

    SbggNotifyPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggNotifyPO record, @Param("example") SbggNotifyPOExample example);

    int updateByExample(@Param("record") SbggNotifyPO record, @Param("example") SbggNotifyPOExample example);

    int updateByPrimaryKeySelective(SbggNotifyPO record);

    int updateByPrimaryKey(SbggNotifyPO record);
}