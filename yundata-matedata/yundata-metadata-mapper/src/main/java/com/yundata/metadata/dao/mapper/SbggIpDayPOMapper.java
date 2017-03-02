package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggIpDayPO;
import com.yundata.metadata.model.po.SbggIpDayPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggIpDayPOMapper {
    int countByExample(SbggIpDayPOExample example);

    int deleteByExample(SbggIpDayPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggIpDayPO record);

    int insertSelective(SbggIpDayPO record);

    List<SbggIpDayPO> selectByExample(SbggIpDayPOExample example);

    SbggIpDayPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggIpDayPO record, @Param("example") SbggIpDayPOExample example);

    int updateByExample(@Param("record") SbggIpDayPO record, @Param("example") SbggIpDayPOExample example);

    int updateByPrimaryKeySelective(SbggIpDayPO record);

    int updateByPrimaryKey(SbggIpDayPO record);
}