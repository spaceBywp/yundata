package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.LooktmMenuPO;
import com.yundata.metadata.model.po.LooktmMenuPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LooktmMenuPOMapper {
    int countByExample(LooktmMenuPOExample example);

    int deleteByExample(LooktmMenuPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(LooktmMenuPO record);

    int insertSelective(LooktmMenuPO record);

    List<LooktmMenuPO> selectByExample(LooktmMenuPOExample example);

    LooktmMenuPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LooktmMenuPO record, @Param("example") LooktmMenuPOExample example);

    int updateByExample(@Param("record") LooktmMenuPO record, @Param("example") LooktmMenuPOExample example);

    int updateByPrimaryKeySelective(LooktmMenuPO record);

    int updateByPrimaryKey(LooktmMenuPO record);
}