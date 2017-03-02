package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggCategoryPO;
import com.yundata.metadata.model.po.SbggCategoryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggCategoryPOMapper {
    int countByExample(SbggCategoryPOExample example);

    int deleteByExample(SbggCategoryPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggCategoryPO record);

    int insertSelective(SbggCategoryPO record);

    List<SbggCategoryPO> selectByExample(SbggCategoryPOExample example);

    SbggCategoryPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggCategoryPO record, @Param("example") SbggCategoryPOExample example);

    int updateByExample(@Param("record") SbggCategoryPO record, @Param("example") SbggCategoryPOExample example);

    int updateByPrimaryKeySelective(SbggCategoryPO record);

    int updateByPrimaryKey(SbggCategoryPO record);
}