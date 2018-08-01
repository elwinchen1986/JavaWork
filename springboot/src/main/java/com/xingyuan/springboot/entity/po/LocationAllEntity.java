package com.xingyuan.springboot.entity.po;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * The type Location all entity.
 *
 * @author
 */
@Component
public class LocationAllEntity implements Serializable {
    private Integer locationid;

    private String locationname;

    private String locationshortname;

    private String locationpath;

    private String locationspellname;

    private Integer locationbusinesstypeid;

    private Integer cid;

    private String cname;

    private String cspellname;

    private Integer pid;

    private String pname;

    private String pspellname;

    private Integer inimportant;

    private Integer locationgroupid;

    private String locationfullname;

    private Integer level;

    private static final long serialVersionUID = 1L;

    /**
     * Gets locationid.
     *
     * @return the locationid
     */
    public Integer getLocationid() {
        return locationid;
    }

    /**
     * Sets locationid.
     *
     * @param locationid the locationid
     */
    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    /**
     * Gets locationname.
     *
     * @return the locationname
     */
    public String getLocationname() {
        return locationname;
    }

    /**
     * Sets locationname.
     *
     * @param locationname the locationname
     */
    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    /**
     * Gets locationshortname.
     *
     * @return the locationshortname
     */
    public String getLocationshortname() {
        return locationshortname;
    }

    /**
     * Sets locationshortname.
     *
     * @param locationshortname the locationshortname
     */
    public void setLocationshortname(String locationshortname) {
        this.locationshortname = locationshortname;
    }

    /**
     * Gets locationpath.
     *
     * @return the locationpath
     */
    public String getLocationpath() {
        return locationpath;
    }

    /**
     * Sets locationpath.
     *
     * @param locationpath the locationpath
     */
    public void setLocationpath(String locationpath) {
        this.locationpath = locationpath;
    }

    /**
     * Gets locationspellname.
     *
     * @return the locationspellname
     */
    public String getLocationspellname() {
        return locationspellname;
    }

    /**
     * Sets locationspellname.
     *
     * @param locationspellname the locationspellname
     */
    public void setLocationspellname(String locationspellname) {
        this.locationspellname = locationspellname;
    }

    /**
     * Gets locationbusinesstypeid.
     *
     * @return the locationbusinesstypeid
     */
    public Integer getLocationbusinesstypeid() {
        return locationbusinesstypeid;
    }

    /**
     * Sets locationbusinesstypeid.
     *
     * @param locationbusinesstypeid the locationbusinesstypeid
     */
    public void setLocationbusinesstypeid(Integer locationbusinesstypeid) {
        this.locationbusinesstypeid = locationbusinesstypeid;
    }

    /**
     * Gets cid.
     *
     * @return the cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * Sets cid.
     *
     * @param cid the cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * Gets cname.
     *
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * Sets cname.
     *
     * @param cname the cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * Gets cspellname.
     *
     * @return the cspellname
     */
    public String getCspellname() {
        return cspellname;
    }

    /**
     * Sets cspellname.
     *
     * @param cspellname the cspellname
     */
    public void setCspellname(String cspellname) {
        this.cspellname = cspellname;
    }

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Gets pname.
     *
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * Sets pname.
     *
     * @param pname the pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * Gets pspellname.
     *
     * @return the pspellname
     */
    public String getPspellname() {
        return pspellname;
    }

    /**
     * Sets pspellname.
     *
     * @param pspellname the pspellname
     */
    public void setPspellname(String pspellname) {
        this.pspellname = pspellname;
    }

    /**
     * Gets inimportant.
     *
     * @return the inimportant
     */
    public Integer getInimportant() {
        return inimportant;
    }

    /**
     * Sets inimportant.
     *
     * @param inimportant the inimportant
     */
    public void setInimportant(Integer inimportant) {
        this.inimportant = inimportant;
    }

    /**
     * Gets locationgroupid.
     *
     * @return the locationgroupid
     */
    public Integer getLocationgroupid() {
        return locationgroupid;
    }

    /**
     * Sets locationgroupid.
     *
     * @param locationgroupid the locationgroupid
     */
    public void setLocationgroupid(Integer locationgroupid) {
        this.locationgroupid = locationgroupid;
    }

    /**
     * Gets locationfullname.
     *
     * @return the locationfullname
     */
    public String getLocationfullname() {
        return locationfullname;
    }

    /**
     * Sets locationfullname.
     *
     * @param locationfullname the locationfullname
     */
    public void setLocationfullname(String locationfullname) {
        this.locationfullname = locationfullname;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}