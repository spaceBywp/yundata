package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggOcrPO;
import com.yundata.metadata.model.po.SbggOcrPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggOcrPOMapper {
    int countByExample(SbggOcrPOExample example);

    int deleteByExample(SbggOcrPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggOcrPO record);

    int insertSelective(SbggOcrPO record);

    List<SbggOcrPO> selectByExample(SbggOcrPOExample example);

    SbggOcrPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggOcrPO record, @Param("example") SbggOcrPOExample example);

    int updateByExample(@Param("record") SbggOcrPO record, @Param("example") SbggOcrPOExample example);

    int updateByPrimaryKeySelective(SbggOcrPO record);

    int updateByPrimaryKey(SbggOcrPO record);
}