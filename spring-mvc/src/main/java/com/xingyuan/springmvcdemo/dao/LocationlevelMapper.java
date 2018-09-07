package com.xingyuan.springmvcdemo.dao;

import com.xingyuan.springmvcdemo.domain.entity.Locationlevel;
import com.xingyuan.springmvcdemo.domain.entity.LocationlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationlevelMapper {
    long countByExample(LocationlevelExample example);

    int deleteByExample(LocationlevelExample example);

    int insert(Locationlevel record);

    int insertSelective(Locationlevel record);

    List<Locationlevel> selectByExample(LocationlevelExample example);

    int updateByExampleSelective(@Param("record") Locationlevel record, @Param("example") LocationlevelExample example);

    int updateByExample(@Param("record") Locationlevel record, @Param("example") LocationlevelExample example);
}