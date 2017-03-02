package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoGonggaoinfoPO;
import com.yundata.metadata.model.po.BrandInfoGonggaoinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoGonggaoinfoPOMapper {
    int countByExample(BrandInfoGonggaoinfoPOExample example);

    int deleteByExample(BrandInfoGonggaoinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoGonggaoinfoPO record);

    int insertSelective(BrandInfoGonggaoinfoPO record);

    List<BrandInfoGonggaoinfoPO> selectByExample(BrandInfoGonggaoinfoPOExample example);

    BrandInfoGonggaoinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoGonggaoinfoPO record, @Param("example") BrandInfoGonggaoinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoGonggaoinfoPO record, @Param("example") BrandInfoGonggaoinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoGonggaoinfoPO record);

    int updateByPrimaryKey(BrandInfoGonggaoinfoPO record);
}