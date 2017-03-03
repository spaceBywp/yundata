package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggInfoPO;
import com.yundata.metadata.model.po.SbggInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggInfoPOMapper {
    int countByExample(SbggInfoPOExample example);

    int deleteByExample(SbggInfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggInfoPO record);

    int insertSelective(SbggInfoPO record);

    List<SbggInfoPO> selectByExample(SbggInfoPOExample example);

    SbggInfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggInfoPO record, @Param("example") SbggInfoPOExample example);

    int updateByExample(@Param("record") SbggInfoPO record, @Param("example") SbggInfoPOExample example);

    int updateByPrimaryKeySelective(SbggInfoPO record);

    int updateByPrimaryKey(SbggInfoPO record);
}