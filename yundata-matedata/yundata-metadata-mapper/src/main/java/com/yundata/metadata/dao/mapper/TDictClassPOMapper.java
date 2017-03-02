package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TDictClassPO;
import com.yundata.metadata.model.po.TDictClassPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictClassPOMapper {
    int countByExample(TDictClassPOExample example);

    int deleteByExample(TDictClassPOExample example);

    int deleteByPrimaryKey(String classId);

    int insert(TDictClassPO record);

    int insertSelective(TDictClassPO record);

    List<TDictClassPO> selectByExample(TDictClassPOExample example);

    TDictClassPO selectByPrimaryKey(String classId);

    int updateByExampleSelective(@Param("record") TDictClassPO record, @Param("example") TDictClassPOExample example);

    int updateByExample(@Param("record") TDictClassPO record, @Param("example") TDictClassPOExample example);

    int updateByPrimaryKeySelective(TDictClassPO record);

    int updateByPrimaryKey(TDictClassPO record);
}