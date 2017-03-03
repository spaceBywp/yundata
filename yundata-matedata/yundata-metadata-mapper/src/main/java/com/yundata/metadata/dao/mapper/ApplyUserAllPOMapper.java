package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ApplyUserAllPO;
import com.yundata.metadata.model.po.ApplyUserAllPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyUserAllPOMapper {
    int countByExample(ApplyUserAllPOExample example);

    int deleteByExample(ApplyUserAllPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplyUserAllPO record);

    int insertSelective(ApplyUserAllPO record);

    List<ApplyUserAllPO> selectByExample(ApplyUserAllPOExample example);

    ApplyUserAllPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplyUserAllPO record, @Param("example") ApplyUserAllPOExample example);

    int updateByExample(@Param("record") ApplyUserAllPO record, @Param("example") ApplyUserAllPOExample example);

    int updateByPrimaryKeySelective(ApplyUserAllPO record);

    int updateByPrimaryKey(ApplyUserAllPO record);
}