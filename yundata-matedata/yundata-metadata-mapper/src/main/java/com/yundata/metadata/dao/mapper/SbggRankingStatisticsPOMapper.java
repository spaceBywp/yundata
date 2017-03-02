package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggRankingStatisticsPO;
import com.yundata.metadata.model.po.SbggRankingStatisticsPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggRankingStatisticsPOMapper {
    int countByExample(SbggRankingStatisticsPOExample example);

    int deleteByExample(SbggRankingStatisticsPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(SbggRankingStatisticsPO record);

    int insertSelective(SbggRankingStatisticsPO record);

    List<SbggRankingStatisticsPO> selectByExample(SbggRankingStatisticsPOExample example);

    SbggRankingStatisticsPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SbggRankingStatisticsPO record, @Param("example") SbggRankingStatisticsPOExample example);

    int updateByExample(@Param("record") SbggRankingStatisticsPO record, @Param("example") SbggRankingStatisticsPOExample example);

    int updateByPrimaryKeySelective(SbggRankingStatisticsPO record);

    int updateByPrimaryKey(SbggRankingStatisticsPO record);
}