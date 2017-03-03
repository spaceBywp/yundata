package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TMenuModulePO;
import com.yundata.metadata.model.po.TMenuModulePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuModulePOMapper {
    int countByExample(TMenuModulePOExample example);

    int deleteByExample(TMenuModulePOExample example);

    int deleteByPrimaryKey(Long moduleId);

    int insert(TMenuModulePO record);

    int insertSelective(TMenuModulePO record);

    List<TMenuModulePO> selectByExample(TMenuModulePOExample example);

    TMenuModulePO selectByPrimaryKey(Long moduleId);

    int updateByExampleSelective(@Param("record") TMenuModulePO record, @Param("example") TMenuModulePOExample example);

    int updateByExample(@Param("record") TMenuModulePO record, @Param("example") TMenuModulePOExample example);

    int updateByPrimaryKeySelective(TMenuModulePO record);

    int updateByPrimaryKey(TMenuModulePO record);
}