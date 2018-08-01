package com.xingyuan.springboot.api;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xingyuan.springboot.entity.mapper.StudentEntityMapper;
import com.xingyuan.springboot.entity.po.StudentEntity;

/**
 * The type Student controller.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    /**
     * The Logger.
     */
    Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private StudentEntityMapper studentEntityMapper;

    /**
     * Find name student entity.
     *
     * @param id the id
     * @return the student entity
     */
    @RequestMapping("/findName")
    public StudentEntity findName(int id) {

        logger.debug("输入参数=" + id);

        return studentEntityMapper.selectByPrimaryKey(id);

    }
}
