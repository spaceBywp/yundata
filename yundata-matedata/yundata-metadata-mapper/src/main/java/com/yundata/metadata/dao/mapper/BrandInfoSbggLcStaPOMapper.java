package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSbggLcStaPO;
import com.yundata.metadata.model.po.BrandInfoSbggLcStaPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSbggLcStaPOMapper {
    int countByExample(BrandInfoSbggLcStaPOExample example);

    int deleteByExample(BrandInfoSbggLcStaPOExample example);

    int insert(BrandInfoSbggLcStaPO record);

    int insertSelective(BrandInfoSbggLcStaPO record);

    List<BrandInfoSbggLcStaPO> selectByExample(BrandInfoSbggLcStaPOExample example);

    int updateByExampleSelective(@Param("record") BrandInfoSbggLcStaPO record, @Param("example") BrandInfoSbggLcStaPOExample example);

    int updateByExample(@Param("record") BrandInfoSbggLcStaPO record, @Param("example") BrandInfoSbggLcStaPOExample example);
}