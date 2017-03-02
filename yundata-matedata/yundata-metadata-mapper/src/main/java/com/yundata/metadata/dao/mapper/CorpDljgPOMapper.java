package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.CorpDljgPO;
import com.yundata.metadata.model.po.CorpDljgPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CorpDljgPOMapper {
    int countByExample(CorpDljgPOExample example);

    int deleteByExample(CorpDljgPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(CorpDljgPO record);

    int insertSelective(CorpDljgPO record);

    List<CorpDljgPO> selectByExample(CorpDljgPOExample example);

    CorpDljgPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CorpDljgPO record, @Param("example") CorpDljgPOExample example);

    int updateByExample(@Param("record") CorpDljgPO record, @Param("example") CorpDljgPOExample example);

    int updateByPrimaryKeySelective(CorpDljgPO record);

    int updateByPrimaryKey(CorpDljgPO record);
}