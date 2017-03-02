package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.AuthCountPO;
import com.yundata.metadata.model.po.AuthCountPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthCountPOMapper {
    int countByExample(AuthCountPOExample example);

    int deleteByExample(AuthCountPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthCountPO record);

    int insertSelective(AuthCountPO record);

    List<AuthCountPO> selectByExample(AuthCountPOExample example);

    AuthCountPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthCountPO record, @Param("example") AuthCountPOExample example);

    int updateByExample(@Param("record") AuthCountPO record, @Param("example") AuthCountPOExample example);

    int updateByPrimaryKeySelective(AuthCountPO record);

    int updateByPrimaryKey(AuthCountPO record);
}