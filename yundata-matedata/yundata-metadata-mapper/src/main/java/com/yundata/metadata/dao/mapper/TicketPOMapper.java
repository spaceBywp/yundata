package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TicketPO;
import com.yundata.metadata.model.po.TicketPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketPOMapper {
    int countByExample(TicketPOExample example);

    int deleteByExample(TicketPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(TicketPO record);

    int insertSelective(TicketPO record);

    List<TicketPO> selectByExample(TicketPOExample example);

    TicketPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TicketPO record, @Param("example") TicketPOExample example);

    int updateByExample(@Param("record") TicketPO record, @Param("example") TicketPOExample example);

    int updateByPrimaryKeySelective(TicketPO record);

    int updateByPrimaryKey(TicketPO record);
}