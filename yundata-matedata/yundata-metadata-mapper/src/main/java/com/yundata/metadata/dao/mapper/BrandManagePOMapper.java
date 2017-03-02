package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandManagePO;
import com.yundata.metadata.model.po.BrandManagePOExample;
import com.yundata.metadata.model.po.BrandManagePOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandManagePOMapper {
    int countByExample(BrandManagePOExample example);

    int deleteByExample(BrandManagePOExample example);

    int deleteByPrimaryKey(BrandManagePOKey key);

    int insert(BrandManagePO record);

    int insertSelective(BrandManagePO record);

    List<BrandManagePO> selectByExample(BrandManagePOExample example);

    BrandManagePO selectByPrimaryKey(BrandManagePOKey key);

    int updateByExampleSelective(@Param("record") BrandManagePO record, @Param("example") BrandManagePOExample example);

    int updateByExample(@Param("record") BrandManagePO record, @Param("example") BrandManagePOExample example);

    int updateByPrimaryKeySelective(BrandManagePO record);

    int updateByPrimaryKey(BrandManagePO record);
}