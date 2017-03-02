package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggPO;
import com.yundata.metadata.model.po.SbggPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggPOMapper {
    int countByExample(SbggPOExample example);

    int deleteByExample(SbggPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggPO record);

    int insertSelective(SbggPO record);

    List<SbggPO> selectByExample(SbggPOExample example);

    SbggPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggPO record, @Param("example") SbggPOExample example);

    int updateByExample(@Param("record") SbggPO record, @Param("example") SbggPOExample example);

    int updateByPrimaryKeySelective(SbggPO record);

    int updateByPrimaryKey(SbggPO record);
}