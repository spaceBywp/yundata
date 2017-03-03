package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoSimplePO;
import com.yundata.metadata.model.po.BrandInfoSimplePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoSimplePOMapper {
    int countByExample(BrandInfoSimplePOExample example);

    int deleteByExample(BrandInfoSimplePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoSimplePO record);

    int insertSelective(BrandInfoSimplePO record);

    List<BrandInfoSimplePO> selectByExample(BrandInfoSimplePOExample example);

    BrandInfoSimplePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoSimplePO record, @Param("example") BrandInfoSimplePOExample example);

    int updateByExample(@Param("record") BrandInfoSimplePO record, @Param("example") BrandInfoSimplePOExample example);

    int updateByPrimaryKeySelective(BrandInfoSimplePO record);

    int updateByPrimaryKey(BrandInfoSimplePO record);
}