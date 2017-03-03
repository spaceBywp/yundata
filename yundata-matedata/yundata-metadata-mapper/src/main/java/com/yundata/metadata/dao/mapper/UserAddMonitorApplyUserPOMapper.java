package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UserAddMonitorApplyUserPO;
import com.yundata.metadata.model.po.UserAddMonitorApplyUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddMonitorApplyUserPOMapper {
    int countByExample(UserAddMonitorApplyUserPOExample example);

    int deleteByExample(UserAddMonitorApplyUserPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAddMonitorApplyUserPO record);

    int insertSelective(UserAddMonitorApplyUserPO record);

    List<UserAddMonitorApplyUserPO> selectByExample(UserAddMonitorApplyUserPOExample example);

    UserAddMonitorApplyUserPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAddMonitorApplyUserPO record, @Param("example") UserAddMonitorApplyUserPOExample example);

    int updateByExample(@Param("record") UserAddMonitorApplyUserPO record, @Param("example") UserAddMonitorApplyUserPOExample example);

    int updateByPrimaryKeySelective(UserAddMonitorApplyUserPO record);

    int updateByPrimaryKey(UserAddMonitorApplyUserPO record);
}