package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSqrinfoPO;
import com.yundata.metadata.model.po.BrandInfoSqrinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSqrinfoPOMapper {
    int countByExample(BrandInfoSqrinfoPOExample example);

    int deleteByExample(BrandInfoSqrinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoSqrinfoPO record);

    int insertSelective(BrandInfoSqrinfoPO record);

    List<BrandInfoSqrinfoPO> selectByExample(BrandInfoSqrinfoPOExample example);

    BrandInfoSqrinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoSqrinfoPO record, @Param("example") BrandInfoSqrinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoSqrinfoPO record, @Param("example") BrandInfoSqrinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoSqrinfoPO record);

    int updateByPrimaryKey(BrandInfoSqrinfoPO record);
}