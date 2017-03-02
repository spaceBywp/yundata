package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.OrderAttachementPO;
import com.yundata.metadata.model.po.OrderAttachementPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAttachementPOMapper {
    int countByExample(OrderAttachementPOExample example);

    int deleteByExample(OrderAttachementPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderAttachementPO record);

    int insertSelective(OrderAttachementPO record);

    List<OrderAttachementPO> selectByExample(OrderAttachementPOExample example);

    OrderAttachementPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderAttachementPO record, @Param("example") OrderAttachementPOExample example);

    int updateByExample(@Param("record") OrderAttachementPO record, @Param("example") OrderAttachementPOExample example);

    int updateByPrimaryKeySelective(OrderAttachementPO record);

    int updateByPrimaryKey(OrderAttachementPO record);
}