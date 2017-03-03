package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserMcBrandMessagePO;
import com.yundata.metadata.model.po.UserMcBrandMessagePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMcBrandMessagePOMapper {
    int countByExample(UserMcBrandMessagePOExample example);

    int deleteByExample(UserMcBrandMessagePOExample example);

    int deleteByPrimaryKey(String mcMsgId);

    int insert(UserMcBrandMessagePO record);

    int insertSelective(UserMcBrandMessagePO record);

    List<UserMcBrandMessagePO> selectByExampleWithBLOBs(UserMcBrandMessagePOExample example);

    List<UserMcBrandMessagePO> selectByExample(UserMcBrandMessagePOExample example);

    UserMcBrandMessagePO selectByPrimaryKey(String mcMsgId);

    int updateByExampleSelective(@Param("record") UserMcBrandMessagePO record, @Param("example") UserMcBrandMessagePOExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMcBrandMessagePO record, @Param("example") UserMcBrandMessagePOExample example);

    int updateByExample(@Param("record") UserMcBrandMessagePO record, @Param("example") UserMcBrandMessagePOExample example);

    int updateByPrimaryKeySelective(UserMcBrandMessagePO record);

    int updateByPrimaryKeyWithBLOBs(UserMcBrandMessagePO record);

    int updateByPrimaryKey(UserMcBrandMessagePO record);
}