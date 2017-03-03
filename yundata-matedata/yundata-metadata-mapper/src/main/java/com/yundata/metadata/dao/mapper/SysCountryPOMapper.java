package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SysCountryPO;
import com.yundata.metadata.model.po.SysCountryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCountryPOMapper {
    int countByExample(SysCountryPOExample example);

    int deleteByExample(SysCountryPOExample example);

    int insert(SysCountryPO record);

    int insertSelective(SysCountryPO record);

    List<SysCountryPO> selectByExample(SysCountryPOExample example);

    int updateByExampleSelective(@Param("record") SysCountryPO record, @Param("example") SysCountryPOExample example);

    int updateByExample(@Param("record") SysCountryPO record, @Param("example") SysCountryPOExample example);
}