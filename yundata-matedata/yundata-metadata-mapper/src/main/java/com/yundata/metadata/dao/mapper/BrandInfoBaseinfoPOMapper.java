package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoBaseinfoPO;
import com.yundata.metadata.model.po.BrandInfoBaseinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoBaseinfoPOMapper {
    int countByExample(BrandInfoBaseinfoPOExample example);

    int deleteByExample(BrandInfoBaseinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoBaseinfoPO record);

    int insertSelective(BrandInfoBaseinfoPO record);

    List<BrandInfoBaseinfoPO> selectByExample(BrandInfoBaseinfoPOExample example);

    BrandInfoBaseinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoBaseinfoPO record, @Param("example") BrandInfoBaseinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoBaseinfoPO record, @Param("example") BrandInfoBaseinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoBaseinfoPO record);

    int updateByPrimaryKey(BrandInfoBaseinfoPO record);
}