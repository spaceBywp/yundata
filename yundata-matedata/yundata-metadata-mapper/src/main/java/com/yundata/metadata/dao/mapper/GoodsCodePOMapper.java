package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.GoodsCodePO;
import com.yundata.metadata.model.po.GoodsCodePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCodePOMapper {
    int countByExample(GoodsCodePOExample example);

    int deleteByExample(GoodsCodePOExample example);

    int deleteByPrimaryKey(Double id);

    int insert(GoodsCodePO record);

    int insertSelective(GoodsCodePO record);

    List<GoodsCodePO> selectByExample(GoodsCodePOExample example);

    GoodsCodePO selectByPrimaryKey(Double id);

    int updateByExampleSelective(@Param("record") GoodsCodePO record, @Param("example") GoodsCodePOExample example);

    int updateByExample(@Param("record") GoodsCodePO record, @Param("example") GoodsCodePOExample example);

    int updateByPrimaryKeySelective(GoodsCodePO record);

    int updateByPrimaryKey(GoodsCodePO record);
}