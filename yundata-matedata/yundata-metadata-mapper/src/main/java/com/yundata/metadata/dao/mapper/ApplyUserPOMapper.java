package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ApplyUserPO;
import com.yundata.metadata.model.po.ApplyUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyUserPOMapper {
    int countByExample(ApplyUserPOExample example);

    int deleteByExample(ApplyUserPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplyUserPO record);

    int insertSelective(ApplyUserPO record);

    List<ApplyUserPO> selectByExample(ApplyUserPOExample example);

    ApplyUserPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplyUserPO record, @Param("example") ApplyUserPOExample example);

    int updateByExample(@Param("record") ApplyUserPO record, @Param("example") ApplyUserPOExample example);

    int updateByPrimaryKeySelective(ApplyUserPO record);

    int updateByPrimaryKey(ApplyUserPO record);
}