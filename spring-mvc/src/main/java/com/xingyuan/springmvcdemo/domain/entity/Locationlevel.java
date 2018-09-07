package com.xingyuan.springmvcdemo.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * LocationLevel
 * @author 
 */
public class Locationlevel implements Serializable {
    private Integer locationID;

    private String locationName;

    private String locationLevelName;

    private Short locationLevel;

    private Date updateTime;

    private Short isActive;

    private static final long serialVersionUID = 1L;

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationLevelName() {
        return locationLevelName;
    }

    public void setLocationLevelName(String locationLevelName) {
        this.locationLevelName = locationLevelName;
    }

    public Short getLocationLevel() {
        return locationLevel;
    }

    public void setLocationLevel(Short locationLevel) {
        this.locationLevel = locationLevel;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}