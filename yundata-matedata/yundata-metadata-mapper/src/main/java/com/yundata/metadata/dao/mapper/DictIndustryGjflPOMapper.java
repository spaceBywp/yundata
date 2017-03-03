package com.yundata.metadata.dao.mapper;

import com.yundata.metadata.model.po.DictIndustryGjflPO;
import com.yundata.metadata.model.po.DictIndustryGjflPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictIndustryGjflPOMapper {
    int countByExample(DictIndustryGjflPOExample example);

    int deleteByExample(DictIndustryGjflPOExample example);

    int insert(DictIndustryGjflPO record);

    int insertSelective(DictIndustryGjflPO record);

    List<DictIndustryGjflPO> selectByExample(DictIndustryGjflPOExample example);

    int updateByExampleSelective(@Param("record") DictIndustryGjflPO record, @Param("example") DictIndustryGjflPOExample example);

    int updateByExample(@Param("record") DictIndustryGjflPO record, @Param("example") DictIndustryGjflPOExample example);
}