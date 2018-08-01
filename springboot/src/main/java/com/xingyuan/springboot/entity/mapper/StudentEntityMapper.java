package com.xingyuan.springboot.entity.mapper;

import com.xingyuan.springboot.entity.po.StudentEntity;

/**
 * The interface Student entity mapper.
 */
public interface StudentEntityMapper {
    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(StudentEntity record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(StudentEntity record);

    /**
     * Select by primary key student entity.
     *
     * @param id the id
     * @return the student entity
     */
    StudentEntity selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(StudentEntity record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(StudentEntity record);
}