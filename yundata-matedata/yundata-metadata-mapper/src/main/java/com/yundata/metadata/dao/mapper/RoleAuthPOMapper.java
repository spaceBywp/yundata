package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.RoleAuthPO;
import com.yundata.metadata.model.po.RoleAuthPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthPOMapper {
    int countByExample(RoleAuthPOExample example);

    int deleteByExample(RoleAuthPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleAuthPO record);

    int insertSelective(RoleAuthPO record);

    List<RoleAuthPO> selectByExample(RoleAuthPOExample example);

    RoleAuthPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleAuthPO record, @Param("example") RoleAuthPOExample example);

    int updateByExample(@Param("record") RoleAuthPO record, @Param("example") RoleAuthPOExample example);

    int updateByPrimaryKeySelective(RoleAuthPO record);

    int updateByPrimaryKey(RoleAuthPO record);
}