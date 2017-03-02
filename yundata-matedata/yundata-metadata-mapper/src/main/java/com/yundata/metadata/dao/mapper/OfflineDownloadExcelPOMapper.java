package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.OfflineDownloadExcelPO;
import com.yundata.metadata.model.po.OfflineDownloadExcelPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineDownloadExcelPOMapper {
    int countByExample(OfflineDownloadExcelPOExample example);

    int deleteByExample(OfflineDownloadExcelPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(OfflineDownloadExcelPO record);

    int insertSelective(OfflineDownloadExcelPO record);

    List<OfflineDownloadExcelPO> selectByExampleWithBLOBs(OfflineDownloadExcelPOExample example);

    List<OfflineDownloadExcelPO> selectByExample(OfflineDownloadExcelPOExample example);

    OfflineDownloadExcelPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OfflineDownloadExcelPO record, @Param("example") OfflineDownloadExcelPOExample example);

    int updateByExampleWithBLOBs(@Param("record") OfflineDownloadExcelPO record, @Param("example") OfflineDownloadExcelPOExample example);

    int updateByExample(@Param("record") OfflineDownloadExcelPO record, @Param("example") OfflineDownloadExcelPOExample example);

    int updateByPrimaryKeySelective(OfflineDownloadExcelPO record);

    int updateByPrimaryKeyWithBLOBs(OfflineDownloadExcelPO record);

    int updateByPrimaryKey(OfflineDownloadExcelPO record);
}