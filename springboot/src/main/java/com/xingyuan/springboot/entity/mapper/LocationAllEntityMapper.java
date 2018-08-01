package com.xingyuan.springboot.entity.mapper;

import com.xingyuan.springboot.entity.po.LocationAllEntity;
import com.xingyuan.springboot.entity.po.LocationAllEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Location all entity mapper.
 */
public interface LocationAllEntityMapper {
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(LocationAllEntityExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(LocationAllEntityExample example);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(LocationAllEntity record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(LocationAllEntity record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<LocationAllEntity> selectByExample(LocationAllEntityExample example);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") LocationAllEntity record, @Param("example") LocationAllEntityExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") LocationAllEntity record, @Param("example") LocationAllEntityExample example);
}