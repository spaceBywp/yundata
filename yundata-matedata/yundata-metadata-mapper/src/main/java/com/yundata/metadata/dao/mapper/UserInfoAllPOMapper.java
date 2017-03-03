package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserInfoAllPO;
import com.yundata.metadata.model.po.UserInfoAllPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoAllPOMapper {
    int countByExample(UserInfoAllPOExample example);

    int deleteByExample(UserInfoAllPOExample example);

    int deleteByPrimaryKey(String userInfoId);

    int insert(UserInfoAllPO record);

    int insertSelective(UserInfoAllPO record);

    List<UserInfoAllPO> selectByExample(UserInfoAllPOExample example);

    UserInfoAllPO selectByPrimaryKey(String userInfoId);

    int updateByExampleSelective(@Param("record") UserInfoAllPO record, @Param("example") UserInfoAllPOExample example);

    int updateByExample(@Param("record") UserInfoAllPO record, @Param("example") UserInfoAllPOExample example);

    int updateByPrimaryKeySelective(UserInfoAllPO record);

    int updateByPrimaryKey(UserInfoAllPO record);
}