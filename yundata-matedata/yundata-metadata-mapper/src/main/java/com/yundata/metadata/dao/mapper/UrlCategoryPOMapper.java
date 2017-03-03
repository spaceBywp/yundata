package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.UrlCategoryPO;
import com.yundata.metadata.model.po.UrlCategoryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrlCategoryPOMapper {
    int countByExample(UrlCategoryPOExample example);

    int deleteByExample(UrlCategoryPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UrlCategoryPO record);

    int insertSelective(UrlCategoryPO record);

    List<UrlCategoryPO> selectByExample(UrlCategoryPOExample example);

    UrlCategoryPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UrlCategoryPO record, @Param("example") UrlCategoryPOExample example);

    int updateByExample(@Param("record") UrlCategoryPO record, @Param("example") UrlCategoryPOExample example);

    int updateByPrimaryKeySelective(UrlCategoryPO record);

    int updateByPrimaryKey(UrlCategoryPO record);
}