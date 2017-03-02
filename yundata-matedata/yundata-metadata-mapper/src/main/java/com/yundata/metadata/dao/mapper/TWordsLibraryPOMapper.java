package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TWordsLibraryPO;
import com.yundata.metadata.model.po.TWordsLibraryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWordsLibraryPOMapper {
    int countByExample(TWordsLibraryPOExample example);

    int deleteByExample(TWordsLibraryPOExample example);

    int insert(TWordsLibraryPO record);

    int insertSelective(TWordsLibraryPO record);

    List<TWordsLibraryPO> selectByExample(TWordsLibraryPOExample example);

    int updateByExampleSelective(@Param("record") TWordsLibraryPO record, @Param("example") TWordsLibraryPOExample example);

    int updateByExample(@Param("record") TWordsLibraryPO record, @Param("example") TWordsLibraryPOExample example);
}