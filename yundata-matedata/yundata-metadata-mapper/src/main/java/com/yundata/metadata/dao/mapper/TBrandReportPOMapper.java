package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TBrandReportPO;
import com.yundata.metadata.model.po.TBrandReportPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBrandReportPOMapper {
    int countByExample(TBrandReportPOExample example);

    int deleteByExample(TBrandReportPOExample example);

    int insert(TBrandReportPO record);

    int insertSelective(TBrandReportPO record);

    List<TBrandReportPO> selectByExample(TBrandReportPOExample example);

    int updateByExampleSelective(@Param("record") TBrandReportPO record, @Param("example") TBrandReportPOExample example);

    int updateByExample(@Param("record") TBrandReportPO record, @Param("example") TBrandReportPOExample example);
}