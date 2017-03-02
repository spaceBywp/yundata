package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserGlobalMessagePO;
import com.yundata.metadata.model.po.UserGlobalMessagePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGlobalMessagePOMapper {
    int countByExample(UserGlobalMessagePOExample example);

    int deleteByExample(UserGlobalMessagePOExample example);

    int deleteByPrimaryKey(String msgId);

    int insert(UserGlobalMessagePO record);

    int insertSelective(UserGlobalMessagePO record);

    List<UserGlobalMessagePO> selectByExampleWithBLOBs(UserGlobalMessagePOExample example);

    List<UserGlobalMessagePO> selectByExample(UserGlobalMessagePOExample example);

    UserGlobalMessagePO selectByPrimaryKey(String msgId);

    int updateByExampleSelective(@Param("record") UserGlobalMessagePO record, @Param("example") UserGlobalMessagePOExample example);

    int updateByExampleWithBLOBs(@Param("record") UserGlobalMessagePO record, @Param("example") UserGlobalMessagePOExample example);

    int updateByExample(@Param("record") UserGlobalMessagePO record, @Param("example") UserGlobalMessagePOExample example);

    int updateByPrimaryKeySelective(UserGlobalMessagePO record);

    int updateByPrimaryKeyWithBLOBs(UserGlobalMessagePO record);

    int updateByPrimaryKey(UserGlobalMessagePO record);
}