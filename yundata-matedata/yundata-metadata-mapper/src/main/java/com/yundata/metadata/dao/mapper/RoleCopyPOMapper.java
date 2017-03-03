package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.RoleCopyPO;
import com.yundata.metadata.model.po.RoleCopyPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleCopyPOMapper {
    int countByExample(RoleCopyPOExample example);

    int deleteByExample(RoleCopyPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleCopyPO record);

    int insertSelective(RoleCopyPO record);

    List<RoleCopyPO> selectByExample(RoleCopyPOExample example);

    RoleCopyPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleCopyPO record, @Param("example") RoleCopyPOExample example);

    int updateByExample(@Param("record") RoleCopyPO record, @Param("example") RoleCopyPOExample example);

    int updateByPrimaryKeySelective(RoleCopyPO record);

    int updateByPrimaryKey(RoleCopyPO record);
}