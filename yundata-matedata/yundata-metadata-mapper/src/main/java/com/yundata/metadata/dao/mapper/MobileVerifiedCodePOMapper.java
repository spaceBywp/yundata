package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.MobileVerifiedCodePO;
import com.yundata.metadata.model.po.MobileVerifiedCodePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileVerifiedCodePOMapper {
    int countByExample(MobileVerifiedCodePOExample example);

    int deleteByExample(MobileVerifiedCodePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(MobileVerifiedCodePO record);

    int insertSelective(MobileVerifiedCodePO record);

    List<MobileVerifiedCodePO> selectByExample(MobileVerifiedCodePOExample example);

    MobileVerifiedCodePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MobileVerifiedCodePO record, @Param("example") MobileVerifiedCodePOExample example);

    int updateByExample(@Param("record") MobileVerifiedCodePO record, @Param("example") MobileVerifiedCodePOExample example);

    int updateByPrimaryKeySelective(MobileVerifiedCodePO record);

    int updateByPrimaryKey(MobileVerifiedCodePO record);
}