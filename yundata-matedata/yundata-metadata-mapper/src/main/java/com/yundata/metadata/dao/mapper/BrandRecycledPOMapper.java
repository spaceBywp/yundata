package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandRecycledPO;
import com.yundata.metadata.model.po.BrandRecycledPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandRecycledPOMapper {
    int countByExample(BrandRecycledPOExample example);

    int deleteByExample(BrandRecycledPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandRecycledPO record);

    int insertSelective(BrandRecycledPO record);

    List<BrandRecycledPO> selectByExample(BrandRecycledPOExample example);

    BrandRecycledPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandRecycledPO record, @Param("example") BrandRecycledPOExample example);

    int updateByExample(@Param("record") BrandRecycledPO record, @Param("example") BrandRecycledPOExample example);

    int updateByPrimaryKeySelective(BrandRecycledPO record);

    int updateByPrimaryKey(BrandRecycledPO record);
}