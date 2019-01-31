package com.imooc.demo.entity;

import java.util.Date;

public class RemarkType {
    private Integer remarkTypeId;
    private String  remarkTypeName;
    private Date    remarkTypeCreateTime;
    private Date    remarkTypeLastEditTime;

    public Integer getRemarkTypeId() {
        return remarkTypeId;
    }

    public void setRemarkTypeId(Integer remarkTypeId) {
        this.remarkTypeId = remarkTypeId;
    }

    public String getRemarkTypeName() {
        return remarkTypeName;
    }

    public void setRemarkTypeName(String remarkTypeName) {
        this.remarkTypeName = remarkTypeName;
    }

    public Date getRemarkTypeCreateTime() {
        return remarkTypeCreateTime;
    }

    public void setRemarkTypeCreateTime(Date remarkTypeCreateTime) {
        this.remarkTypeCreateTime = remarkTypeCreateTime;
    }

    public Date getRemarkTypeLastEditTime() {
        return remarkTypeLastEditTime;
    }

    public void setRemarkTypeLastEditTime(Date remarkTypeLastEditTime) {
        this.remarkTypeLastEditTime = remarkTypeLastEditTime;
    }
}
