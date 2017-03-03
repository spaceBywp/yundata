package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserUnMonitorDissentBrandPO;
import com.yundata.metadata.model.po.UserUnMonitorDissentBrandPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserUnMonitorDissentBrandPOMapper {
    int countByExample(UserUnMonitorDissentBrandPOExample example);

    int deleteByExample(UserUnMonitorDissentBrandPOExample example);

    int deleteByPrimaryKey(String brandId);

    int insert(UserUnMonitorDissentBrandPO record);

    int insertSelective(UserUnMonitorDissentBrandPO record);

    List<UserUnMonitorDissentBrandPO> selectByExample(UserUnMonitorDissentBrandPOExample example);

    UserUnMonitorDissentBrandPO selectByPrimaryKey(String brandId);

    int updateByExampleSelective(@Param("record") UserUnMonitorDissentBrandPO record, @Param("example") UserUnMonitorDissentBrandPOExample example);

    int updateByExample(@Param("record") UserUnMonitorDissentBrandPO record, @Param("example") UserUnMonitorDissentBrandPOExample example);

    int updateByPrimaryKeySelective(UserUnMonitorDissentBrandPO record);

    int updateByPrimaryKey(UserUnMonitorDissentBrandPO record);
}