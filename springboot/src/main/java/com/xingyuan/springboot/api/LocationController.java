package com.xingyuan.springboot.api;

import com.xingyuan.springboot.entity.mapper.LocationAllEntityMapper;
import com.xingyuan.springboot.entity.po.LocationAllEntity;
import com.xingyuan.springboot.entity.po.LocationAllEntityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Location controller.
 */
@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationAllEntityMapper locationAllEntityMapper;


    @Autowired
    private LocationAllEntityExample locationAllEntityExample;


    /**
     * 查找单个城市数据集合
     *
     * @param cityId
     * @return LocationAllEntity 集合
     */
    @RequestMapping("/getcity")
    protected List<LocationAllEntity> getCity(int cityId) {

        locationAllEntityExample.clear();
        LocationAllEntityExample.Criteria criteria = locationAllEntityExample.createCriteria();


        criteria.andCidEqualTo(cityId);
        locationAllEntityExample.setDistinct(true);
        locationAllEntityExample.setOffset(0);
        locationAllEntityExample.setLimit(10);

        return locationAllEntityMapper.selectByExample(locationAllEntityExample);


    }


}
