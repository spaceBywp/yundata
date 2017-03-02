package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.BrandInfoDlrmcinfoPO;
import com.yundata.metadata.model.po.BrandInfoDlrmcinfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoDlrmcinfoPOMapper {
    int countByExample(BrandInfoDlrmcinfoPOExample example);

    int deleteByExample(BrandInfoDlrmcinfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandInfoDlrmcinfoPO record);

    int insertSelective(BrandInfoDlrmcinfoPO record);

    List<BrandInfoDlrmcinfoPO> selectByExample(BrandInfoDlrmcinfoPOExample example);

    BrandInfoDlrmcinfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandInfoDlrmcinfoPO record, @Param("example") BrandInfoDlrmcinfoPOExample example);

    int updateByExample(@Param("record") BrandInfoDlrmcinfoPO record, @Param("example") BrandInfoDlrmcinfoPOExample example);

    int updateByPrimaryKeySelective(BrandInfoDlrmcinfoPO record);

    int updateByPrimaryKey(BrandInfoDlrmcinfoPO record);
}