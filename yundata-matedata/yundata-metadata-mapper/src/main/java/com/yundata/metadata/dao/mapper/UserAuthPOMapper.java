package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserAuthPO;
import com.yundata.metadata.model.po.UserAuthPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthPOMapper {
    int countByExample(UserAuthPOExample example);

    int deleteByExample(UserAuthPOExample example);

    int deleteByPrimaryKey(String userAuthId);

    int insert(UserAuthPO record);

    int insertSelective(UserAuthPO record);

    List<UserAuthPO> selectByExample(UserAuthPOExample example);

    UserAuthPO selectByPrimaryKey(String userAuthId);

    int updateByExampleSelective(@Param("record") UserAuthPO record, @Param("example") UserAuthPOExample example);

    int updateByExample(@Param("record") UserAuthPO record, @Param("example") UserAuthPOExample example);

    int updateByPrimaryKeySelective(UserAuthPO record);

    int updateByPrimaryKey(UserAuthPO record);
}