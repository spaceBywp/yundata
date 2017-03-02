package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.AuthInfoPO;
import com.yundata.metadata.model.po.AuthInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthInfoPOMapper {
    int countByExample(AuthInfoPOExample example);

    int deleteByExample(AuthInfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthInfoPO record);

    int insertSelective(AuthInfoPO record);

    List<AuthInfoPO> selectByExample(AuthInfoPOExample example);

    AuthInfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthInfoPO record, @Param("example") AuthInfoPOExample example);

    int updateByExample(@Param("record") AuthInfoPO record, @Param("example") AuthInfoPOExample example);

    int updateByPrimaryKeySelective(AuthInfoPO record);

    int updateByPrimaryKey(AuthInfoPO record);
}