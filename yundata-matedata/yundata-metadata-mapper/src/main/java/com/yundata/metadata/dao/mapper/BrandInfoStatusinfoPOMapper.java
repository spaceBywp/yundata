package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoStatusinfoPO;
import com.yundata.metadata.model.po.BrandInfoStatusinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoStatusinfoPOMapper {
    int countByExample(BrandInfoStatusinfoPOExample example);

    int deleteByExample(BrandInfoStatusinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoStatusinfoPO record);

    int insertSelective(BrandInfoStatusinfoPO record);

    List<BrandInfoStatusinfoPO> selectByExample(BrandInfoStatusinfoPOExample example);

    BrandInfoStatusinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoStatusinfoPO record, @Param("example") BrandInfoStatusinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoStatusinfoPO record, @Param("example") BrandInfoStatusinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoStatusinfoPO record);

    int updateByPrimaryKey(BrandInfoStatusinfoPO record);
}