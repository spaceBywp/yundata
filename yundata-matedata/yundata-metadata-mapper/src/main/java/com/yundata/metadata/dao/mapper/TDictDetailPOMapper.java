package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.TDictDetailPO;
import com.yundata.metadata.model.po.TDictDetailPOExample;
import com.yundata.metadata.model.po.TDictDetailPOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictDetailPOMapper {
    int countByExample(TDictDetailPOExample example);

    int deleteByExample(TDictDetailPOExample example);

    int deleteByPrimaryKey(String dictDetailId);

    int insert(TDictDetailPOWithBLOBs record);

    int insertSelective(TDictDetailPOWithBLOBs record);

    List<TDictDetailPOWithBLOBs> selectByExampleWithBLOBs(TDictDetailPOExample example);

    List<TDictDetailPO> selectByExample(TDictDetailPOExample example);

    TDictDetailPOWithBLOBs selectByPrimaryKey(String dictDetailId);

    int updateByExampleSelective(@Param("record") TDictDetailPOWithBLOBs record, @Param("example") TDictDetailPOExample example);

    int updateByExampleWithBLOBs(@Param("record") TDictDetailPOWithBLOBs record, @Param("example") TDictDetailPOExample example);

    int updateByExample(@Param("record") TDictDetailPO record, @Param("example") TDictDetailPOExample example);

    int updateByPrimaryKeySelective(TDictDetailPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TDictDetailPOWithBLOBs record);

    int updateByPrimaryKey(TDictDetailPO record);
}