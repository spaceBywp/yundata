package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SysProvincePO;
import com.yundata.metadata.model.po.SysProvincePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProvincePOMapper {
    int countByExample(SysProvincePOExample example);

    int deleteByExample(SysProvincePOExample example);

    int deleteByPrimaryKey(String code);

    int insert(SysProvincePO record);

    int insertSelective(SysProvincePO record);

    List<SysProvincePO> selectByExample(SysProvincePOExample example);

    SysProvincePO selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") SysProvincePO record, @Param("example") SysProvincePOExample example);

    int updateByExample(@Param("record") SysProvincePO record, @Param("example") SysProvincePOExample example);

    int updateByPrimaryKeySelective(SysProvincePO record);

    int updateByPrimaryKey(SysProvincePO record);
}