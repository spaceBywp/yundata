package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserInfo001PO;
import com.yundata.metadata.model.po.UserInfo001POExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfo001POMapper {
    int countByExample(UserInfo001POExample example);

    int deleteByExample(UserInfo001POExample example);

    int deleteByPrimaryKey(String userInfoId);

    int insert(UserInfo001PO record);

    int insertSelective(UserInfo001PO record);

    List<UserInfo001PO> selectByExample(UserInfo001POExample example);

    UserInfo001PO selectByPrimaryKey(String userInfoId);

    int updateByExampleSelective(@Param("record") UserInfo001PO record, @Param("example") UserInfo001POExample example);

    int updateByExample(@Param("record") UserInfo001PO record, @Param("example") UserInfo001POExample example);

    int updateByPrimaryKeySelective(UserInfo001PO record);

    int updateByPrimaryKey(UserInfo001PO record);
}