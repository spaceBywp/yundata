package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserJsBrandMessagePO;
import com.yundata.metadata.model.po.UserJsBrandMessagePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserJsBrandMessagePOMapper {
    int countByExample(UserJsBrandMessagePOExample example);

    int deleteByExample(UserJsBrandMessagePOExample example);

    int deleteByPrimaryKey(String jsMsgId);

    int insert(UserJsBrandMessagePO record);

    int insertSelective(UserJsBrandMessagePO record);

    List<UserJsBrandMessagePO> selectByExampleWithBLOBs(UserJsBrandMessagePOExample example);

    List<UserJsBrandMessagePO> selectByExample(UserJsBrandMessagePOExample example);

    UserJsBrandMessagePO selectByPrimaryKey(String jsMsgId);

    int updateByExampleSelective(@Param("record") UserJsBrandMessagePO record, @Param("example") UserJsBrandMessagePOExample example);

    int updateByExampleWithBLOBs(@Param("record") UserJsBrandMessagePO record, @Param("example") UserJsBrandMessagePOExample example);

    int updateByExample(@Param("record") UserJsBrandMessagePO record, @Param("example") UserJsBrandMessagePOExample example);

    int updateByPrimaryKeySelective(UserJsBrandMessagePO record);

    int updateByPrimaryKeyWithBLOBs(UserJsBrandMessagePO record);

    int updateByPrimaryKey(UserJsBrandMessagePO record);
}