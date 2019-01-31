package com.imooc.demo.entity;

import java.util.Date;

public class School {
    private Integer schoolId;
    private String  schoolName;
    private String  schoolArea;
    private Integer schoolAdmin;
    private String  schoolRemarks;
    private Integer schoolStatus;
    private Date    schoolCreateTime;
    private Date    schoolLastEditTime;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolArea() {
        return schoolArea;
    }

    public void setSchoolArea(String schoolArea) {
        this.schoolArea = schoolArea;
    }

    public Integer getSchoolAdmin() {
        return schoolAdmin;
    }

    public void setSchoolAdmin(Integer schoolAdmin) {
        this.schoolAdmin = schoolAdmin;
    }

    public String getSchoolRemarks() {
        return schoolRemarks;
    }

    public void setSchoolRemarks(String schoolRemarks) {
        this.schoolRemarks = schoolRemarks;
    }

    public Integer getSchoolStatus() {
        return schoolStatus;
    }

    public void setSchoolStatus(Integer schoolStatus) {
        this.schoolStatus = schoolStatus;
    }

    public Date getSchoolCreateTime() {
        return schoolCreateTime;
    }

    public void setSchoolCreateTime(Date schoolCreateTime) {
        this.schoolCreateTime = schoolCreateTime;
    }

    public Date getSchoolLastEditTime() {
        return schoolLastEditTime;
    }

    public void setSchoolLastEditTime(Date schoolLastEditTime) {
        this.schoolLastEditTime = schoolLastEditTime;
    }
}
