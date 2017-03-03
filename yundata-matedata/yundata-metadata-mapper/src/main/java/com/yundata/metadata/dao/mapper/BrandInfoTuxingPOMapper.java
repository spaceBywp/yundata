package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoTuxingPO;
import com.yundata.metadata.model.po.BrandInfoTuxingPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoTuxingPOMapper {
    int countByExample(BrandInfoTuxingPOExample example);

    int deleteByExample(BrandInfoTuxingPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoTuxingPO record);

    int insertSelective(BrandInfoTuxingPO record);

    List<BrandInfoTuxingPO> selectByExample(BrandInfoTuxingPOExample example);

    BrandInfoTuxingPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoTuxingPO record, @Param("example") BrandInfoTuxingPOExample example);

    int updateByExample(@Param("record") BrandInfoTuxingPO record, @Param("example") BrandInfoTuxingPOExample example);

    int updateByPrimaryKeySelective(BrandInfoTuxingPO record);

    int updateByPrimaryKey(BrandInfoTuxingPO record);
}