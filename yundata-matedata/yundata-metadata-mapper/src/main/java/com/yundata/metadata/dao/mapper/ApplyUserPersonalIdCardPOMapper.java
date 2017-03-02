package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.ApplyUserPersonalIdCardPO;
import com.yundata.metadata.model.po.ApplyUserPersonalIdCardPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyUserPersonalIdCardPOMapper {
    int countByExample(ApplyUserPersonalIdCardPOExample example);

    int deleteByExample(ApplyUserPersonalIdCardPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplyUserPersonalIdCardPO record);

    int insertSelective(ApplyUserPersonalIdCardPO record);

    List<ApplyUserPersonalIdCardPO> selectByExample(ApplyUserPersonalIdCardPOExample example);

    ApplyUserPersonalIdCardPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplyUserPersonalIdCardPO record, @Param("example") ApplyUserPersonalIdCardPOExample example);

    int updateByExample(@Param("record") ApplyUserPersonalIdCardPO record, @Param("example") ApplyUserPersonalIdCardPOExample example);

    int updateByPrimaryKeySelective(ApplyUserPersonalIdCardPO record);

    int updateByPrimaryKey(ApplyUserPersonalIdCardPO record);
}