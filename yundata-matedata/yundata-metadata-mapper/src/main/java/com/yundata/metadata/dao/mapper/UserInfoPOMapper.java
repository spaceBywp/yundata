package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserInfoPO;
import com.yundata.metadata.model.po.UserInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoPOMapper {
    int countByExample(UserInfoPOExample example);

    int deleteByExample(UserInfoPOExample example);

    int deleteByPrimaryKey(String userInfoId);

    int insert(UserInfoPO record);

    int insertSelective(UserInfoPO record);

    List<UserInfoPO> selectByExample(UserInfoPOExample example);

    UserInfoPO selectByPrimaryKey(String userInfoId);

    int updateByExampleSelective(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByExample(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByPrimaryKeySelective(UserInfoPO record);

    int updateByPrimaryKey(UserInfoPO record);
}