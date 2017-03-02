package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ImageCodePO;
import com.yundata.metadata.model.po.ImageCodePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageCodePOMapper {
    int countByExample(ImageCodePOExample example);

    int deleteByExample(ImageCodePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ImageCodePO record);

    int insertSelective(ImageCodePO record);

    List<ImageCodePO> selectByExample(ImageCodePOExample example);

    ImageCodePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ImageCodePO record, @Param("example") ImageCodePOExample example);

    int updateByExample(@Param("record") ImageCodePO record, @Param("example") ImageCodePOExample example);

    int updateByPrimaryKeySelective(ImageCodePO record);

    int updateByPrimaryKey(ImageCodePO record);
}