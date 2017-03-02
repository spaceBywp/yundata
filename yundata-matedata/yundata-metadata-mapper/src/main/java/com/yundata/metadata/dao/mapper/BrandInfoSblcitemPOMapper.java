package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSblcitemPO;
import com.yundata.metadata.model.po.BrandInfoSblcitemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSblcitemPOMapper {
    int countByExample(BrandInfoSblcitemPOExample example);

    int deleteByExample(BrandInfoSblcitemPOExample example);

    int insert(BrandInfoSblcitemPO record);

    int insertSelective(BrandInfoSblcitemPO record);

    List<BrandInfoSblcitemPO> selectByExample(BrandInfoSblcitemPOExample example);

    int updateByExampleSelective(@Param("record") BrandInfoSblcitemPO record, @Param("example") BrandInfoSblcitemPOExample example);

    int updateByExample(@Param("record") BrandInfoSblcitemPO record, @Param("example") BrandInfoSblcitemPOExample example);
}