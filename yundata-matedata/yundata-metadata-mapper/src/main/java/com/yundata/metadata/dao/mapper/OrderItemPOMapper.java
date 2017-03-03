package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.OrderItemPO;
import com.yundata.metadata.model.po.OrderItemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemPOMapper {
    int countByExample(OrderItemPOExample example);

    int deleteByExample(OrderItemPOExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    List<OrderItemPO> selectByExample(OrderItemPOExample example);

    OrderItemPO selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") OrderItemPO record, @Param("example") OrderItemPOExample example);

    int updateByExample(@Param("record") OrderItemPO record, @Param("example") OrderItemPOExample example);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);
}