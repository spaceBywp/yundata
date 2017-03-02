package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SysCitysPO;
import com.yundata.metadata.model.po.SysCitysPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCitysPOMapper {
    int countByExample(SysCitysPOExample example);

    int deleteByExample(SysCitysPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysCitysPO record);

    int insertSelective(SysCitysPO record);

    List<SysCitysPO> selectByExample(SysCitysPOExample example);

    SysCitysPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysCitysPO record, @Param("example") SysCitysPOExample example);

    int updateByExample(@Param("record") SysCitysPO record, @Param("example") SysCitysPOExample example);

    int updateByPrimaryKeySelective(SysCitysPO record);

    int updateByPrimaryKey(SysCitysPO record);
}