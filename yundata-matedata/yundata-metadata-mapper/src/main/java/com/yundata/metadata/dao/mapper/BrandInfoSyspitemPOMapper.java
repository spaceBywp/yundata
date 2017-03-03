package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSyspitemPO;
import com.yundata.metadata.model.po.BrandInfoSyspitemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSyspitemPOMapper {
    int countByExample(BrandInfoSyspitemPOExample example);

    int deleteByExample(BrandInfoSyspitemPOExample example);

    int insert(BrandInfoSyspitemPO record);

    int insertSelective(BrandInfoSyspitemPO record);

    List<BrandInfoSyspitemPO> selectByExampleWithBLOBs(BrandInfoSyspitemPOExample example);

    List<BrandInfoSyspitemPO> selectByExample(BrandInfoSyspitemPOExample example);

    int updateByExampleSelective(@Param("record") BrandInfoSyspitemPO record, @Param("example") BrandInfoSyspitemPOExample example);

    int updateByExampleWithBLOBs(@Param("record") BrandInfoSyspitemPO record, @Param("example") BrandInfoSyspitemPOExample example);

    int updateByExample(@Param("record") BrandInfoSyspitemPO record, @Param("example") BrandInfoSyspitemPOExample example);
}