package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserInfo002PO;
import com.yundata.metadata.model.po.UserInfo002POExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfo002POMapper {
    int countByExample(UserInfo002POExample example);

    int deleteByExample(UserInfo002POExample example);

    int deleteByPrimaryKey(String userInfoId);

    int insert(UserInfo002PO record);

    int insertSelective(UserInfo002PO record);

    List<UserInfo002PO> selectByExample(UserInfo002POExample example);

    UserInfo002PO selectByPrimaryKey(String userInfoId);

    int updateByExampleSelective(@Param("record") UserInfo002PO record, @Param("example") UserInfo002POExample example);

    int updateByExample(@Param("record") UserInfo002PO record, @Param("example") UserInfo002POExample example);

    int updateByPrimaryKeySelective(UserInfo002PO record);

    int updateByPrimaryKey(UserInfo002PO record);
}