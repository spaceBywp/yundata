package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSbggLcPO;
import com.yundata.metadata.model.po.BrandInfoSbggLcPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSbggLcPOMapper {
    int countByExample(BrandInfoSbggLcPOExample example);

    int deleteByExample(BrandInfoSbggLcPOExample example);

    int insert(BrandInfoSbggLcPO record);

    int insertSelective(BrandInfoSbggLcPO record);

    List<BrandInfoSbggLcPO> selectByExample(BrandInfoSbggLcPOExample example);

    int updateByExampleSelective(@Param("record") BrandInfoSbggLcPO record, @Param("example") BrandInfoSbggLcPOExample example);

    int updateByExample(@Param("record") BrandInfoSbggLcPO record, @Param("example") BrandInfoSbggLcPOExample example);
}