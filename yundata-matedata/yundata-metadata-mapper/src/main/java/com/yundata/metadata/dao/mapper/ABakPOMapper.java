package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ABakPO;
import com.yundata.metadata.model.po.ABakPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ABakPOMapper {
    int countByExample(ABakPOExample example);

    int deleteByExample(ABakPOExample example);

    int insert(ABakPO record);

    int insertSelective(ABakPO record);

    List<ABakPO> selectByExample(ABakPOExample example);

    int updateByExampleSelective(@Param("record") ABakPO record, @Param("example") ABakPOExample example);

    int updateByExample(@Param("record") ABakPO record, @Param("example") ABakPOExample example);
}