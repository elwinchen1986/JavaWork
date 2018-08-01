package com.xingyuan.springboot.entity.mapper;

import com.xingyuan.springboot.entity.po.CarType;
import com.xingyuan.springboot.entity.po.CarTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CarTypeMapper {
    long countByExample(CarTypeExample example);

    int deleteByExample(CarTypeExample example);

    int deleteByPrimaryKey(Integer carTypeId);

    int insert(CarType record);

    int insertSelective(CarType record);

    List<CarType> selectByExample(CarTypeExample example);

    CarType selectByPrimaryKey(Integer carTypeId);

    int updateByExampleSelective(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByExample(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}