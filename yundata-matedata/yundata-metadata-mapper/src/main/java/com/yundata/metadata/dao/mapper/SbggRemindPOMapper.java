package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggRemindPO;
import com.yundata.metadata.model.po.SbggRemindPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggRemindPOMapper {
    int countByExample(SbggRemindPOExample example);

    int deleteByExample(SbggRemindPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggRemindPO record);

    int insertSelective(SbggRemindPO record);

    List<SbggRemindPO> selectByExample(SbggRemindPOExample example);

    SbggRemindPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggRemindPO record, @Param("example") SbggRemindPOExample example);

    int updateByExample(@Param("record") SbggRemindPO record, @Param("example") SbggRemindPOExample example);

    int updateByPrimaryKeySelective(SbggRemindPO record);

    int updateByPrimaryKey(SbggRemindPO record);
}