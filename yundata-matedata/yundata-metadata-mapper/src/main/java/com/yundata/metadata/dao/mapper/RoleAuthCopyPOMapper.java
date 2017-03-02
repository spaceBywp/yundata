package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.RoleAuthCopyPO;
import com.yundata.metadata.model.po.RoleAuthCopyPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthCopyPOMapper {
    int countByExample(RoleAuthCopyPOExample example);

    int deleteByExample(RoleAuthCopyPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleAuthCopyPO record);

    int insertSelective(RoleAuthCopyPO record);

    List<RoleAuthCopyPO> selectByExample(RoleAuthCopyPOExample example);

    RoleAuthCopyPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleAuthCopyPO record, @Param("example") RoleAuthCopyPOExample example);

    int updateByExample(@Param("record") RoleAuthCopyPO record, @Param("example") RoleAuthCopyPOExample example);

    int updateByPrimaryKeySelective(RoleAuthCopyPO record);

    int updateByPrimaryKey(RoleAuthCopyPO record);
}