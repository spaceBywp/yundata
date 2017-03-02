package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoOtherinfoPO;
import com.yundata.metadata.model.po.BrandInfoOtherinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoOtherinfoPOMapper {
    int countByExample(BrandInfoOtherinfoPOExample example);

    int deleteByExample(BrandInfoOtherinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoOtherinfoPO record);

    int insertSelective(BrandInfoOtherinfoPO record);

    List<BrandInfoOtherinfoPO> selectByExample(BrandInfoOtherinfoPOExample example);

    BrandInfoOtherinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoOtherinfoPO record, @Param("example") BrandInfoOtherinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoOtherinfoPO record, @Param("example") BrandInfoOtherinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoOtherinfoPO record);

    int updateByPrimaryKey(BrandInfoOtherinfoPO record);
}