package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TCurrencyWordPO;
import com.yundata.metadata.model.po.TCurrencyWordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCurrencyWordPOMapper {
    int countByExample(TCurrencyWordPOExample example);

    int deleteByExample(TCurrencyWordPOExample example);

    int insert(TCurrencyWordPO record);

    int insertSelective(TCurrencyWordPO record);

    List<TCurrencyWordPO> selectByExample(TCurrencyWordPOExample example);

    int updateByExampleSelective(@Param("record") TCurrencyWordPO record, @Param("example") TCurrencyWordPOExample example);

    int updateByExample(@Param("record") TCurrencyWordPO record, @Param("example") TCurrencyWordPOExample example);
}