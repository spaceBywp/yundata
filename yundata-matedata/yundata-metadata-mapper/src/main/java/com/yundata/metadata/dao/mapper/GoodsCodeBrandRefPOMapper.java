package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.GoodsCodeBrandRefPO;
import com.yundata.metadata.model.po.GoodsCodeBrandRefPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCodeBrandRefPOMapper {
    int countByExample(GoodsCodeBrandRefPOExample example);

    int deleteByExample(GoodsCodeBrandRefPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsCodeBrandRefPO record);

    int insertSelective(GoodsCodeBrandRefPO record);

    List<GoodsCodeBrandRefPO> selectByExample(GoodsCodeBrandRefPOExample example);

    GoodsCodeBrandRefPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsCodeBrandRefPO record, @Param("example") GoodsCodeBrandRefPOExample example);

    int updateByExample(@Param("record") GoodsCodeBrandRefPO record, @Param("example") GoodsCodeBrandRefPOExample example);

    int updateByPrimaryKeySelective(GoodsCodeBrandRefPO record);

    int updateByPrimaryKey(GoodsCodeBrandRefPO record);
}