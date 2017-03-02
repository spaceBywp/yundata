package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggCategoryStatisticsPO;
import com.yundata.metadata.model.po.SbggCategoryStatisticsPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggCategoryStatisticsPOMapper {
    int countByExample(SbggCategoryStatisticsPOExample example);

    int deleteByExample(SbggCategoryStatisticsPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggCategoryStatisticsPO record);

    int insertSelective(SbggCategoryStatisticsPO record);

    List<SbggCategoryStatisticsPO> selectByExample(SbggCategoryStatisticsPOExample example);

    SbggCategoryStatisticsPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggCategoryStatisticsPO record, @Param("example") SbggCategoryStatisticsPOExample example);

    int updateByExample(@Param("record") SbggCategoryStatisticsPO record, @Param("example") SbggCategoryStatisticsPOExample example);

    int updateByPrimaryKeySelective(SbggCategoryStatisticsPO record);

    int updateByPrimaryKey(SbggCategoryStatisticsPO record);
}