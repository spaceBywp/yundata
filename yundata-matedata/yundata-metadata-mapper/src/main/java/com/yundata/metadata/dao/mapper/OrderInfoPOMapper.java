package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.OrderInfoPO;
import com.yundata.metadata.model.po.OrderInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoPOMapper {
    int countByExample(OrderInfoPOExample example);

    int deleteByExample(OrderInfoPOExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderInfoPO record);

    int insertSelective(OrderInfoPO record);

    List<OrderInfoPO> selectByExample(OrderInfoPOExample example);

    OrderInfoPO selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderInfoPO record, @Param("example") OrderInfoPOExample example);

    int updateByExample(@Param("record") OrderInfoPO record, @Param("example") OrderInfoPOExample example);

    int updateByPrimaryKeySelective(OrderInfoPO record);

    int updateByPrimaryKey(OrderInfoPO record);
}