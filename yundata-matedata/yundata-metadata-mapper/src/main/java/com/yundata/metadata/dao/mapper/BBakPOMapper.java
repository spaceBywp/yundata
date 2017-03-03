package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BBakPO;
import com.yundata.metadata.model.po.BBakPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BBakPOMapper {
    int countByExample(BBakPOExample example);

    int deleteByExample(BBakPOExample example);

    int insert(BBakPO record);

    int insertSelective(BBakPO record);

    List<BBakPO> selectByExample(BBakPOExample example);

    int updateByExampleSelective(@Param("record") BBakPO record, @Param("example") BBakPOExample example);

    int updateByExample(@Param("record") BBakPO record, @Param("example") BBakPOExample example);
}