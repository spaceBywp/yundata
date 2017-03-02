package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.AddressManagerPO;
import com.yundata.metadata.model.po.AddressManagerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressManagerPOMapper {
    int countByExample(AddressManagerPOExample example);

    int deleteByExample(AddressManagerPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(AddressManagerPO record);

    int insertSelective(AddressManagerPO record);

    List<AddressManagerPO> selectByExample(AddressManagerPOExample example);

    AddressManagerPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AddressManagerPO record, @Param("example") AddressManagerPOExample example);

    int updateByExample(@Param("record") AddressManagerPO record, @Param("example") AddressManagerPOExample example);

    int updateByPrimaryKeySelective(AddressManagerPO record);

    int updateByPrimaryKey(AddressManagerPO record);
}