package com.xingyuan.springboot.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * car_type
 *
 * @author
 */
public class CarType implements Serializable {
    /**
     * 车源类型编号
     */
    private Integer carTypeId;

    /**
     * 车源类型名称
     */
    private String carTypeName;

    /**
     * 车源类型全路径
     */
    private String carTypeFullPath;

    /**
     * 父类型ID
     */
    private Integer parentCarTypeId;

    /**
     * 类型描述信息
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getCarTypeFullPath() {
        return carTypeFullPath;
    }

    public void setCarTypeFullPath(String carTypeFullPath) {
        this.carTypeFullPath = carTypeFullPath;
    }

    public Integer getParentCarTypeId() {
        return parentCarTypeId;
    }

    public void setParentCarTypeId(Integer parentCarTypeId) {
        this.parentCarTypeId = parentCarTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CarType other = (CarType) that;
        return (this.getCarTypeId() == null ? other.getCarTypeId() == null : this.getCarTypeId().equals(other.getCarTypeId()))
                && (this.getCarTypeName() == null ? other.getCarTypeName() == null : this.getCarTypeName().equals(other.getCarTypeName()))
                && (this.getCarTypeFullPath() == null ? other.getCarTypeFullPath() == null : this.getCarTypeFullPath().equals(other.getCarTypeFullPath()))
                && (this.getParentCarTypeId() == null ? other.getParentCarTypeId() == null : this.getParentCarTypeId().equals(other.getParentCarTypeId()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarTypeId() == null) ? 0 : getCarTypeId().hashCode());
        result = prime * result + ((getCarTypeName() == null) ? 0 : getCarTypeName().hashCode());
        result = prime * result + ((getCarTypeFullPath() == null) ? 0 : getCarTypeFullPath().hashCode());
        result = prime * result + ((getParentCarTypeId() == null) ? 0 : getParentCarTypeId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carTypeId=").append(carTypeId);
        sb.append(", carTypeName=").append(carTypeName);
        sb.append(", carTypeFullPath=").append(carTypeFullPath);
        sb.append(", parentCarTypeId=").append(parentCarTypeId);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}