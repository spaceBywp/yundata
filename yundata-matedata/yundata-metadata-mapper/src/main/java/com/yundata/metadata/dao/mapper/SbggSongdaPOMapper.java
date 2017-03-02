package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.SbggSongdaPO;
import com.yundata.metadata.model.po.SbggSongdaPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbggSongdaPOMapper {
    int countByExample(SbggSongdaPOExample example);

    int deleteByExample(SbggSongdaPOExample example);

    int insert(SbggSongdaPO record);

    int insertSelective(SbggSongdaPO record);

    List<SbggSongdaPO> selectByExample(SbggSongdaPOExample example);

    int updateByExampleSelective(@Param("record") SbggSongdaPO record, @Param("example") SbggSongdaPOExample example);

    int updateByExample(@Param("record") SbggSongdaPO record, @Param("example") SbggSongdaPOExample example);
}