package com.imooc.demo.entity;

import java.util.Date;

public class Subject {
    private Integer subjectId;
    private String  subjectName;
    private Date    subjectCreateTime;
    private Date    subjectLastEditTime;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getSubjectCreateTime() {
        return subjectCreateTime;
    }

    public void setSubjectCreateTime(Date subjectCreatTime) {
        this.subjectCreateTime = subjectCreatTime;
    }

    public Date getSubjectLastEditTime() {
        return subjectLastEditTime;
    }

    public void setSubjectLastEditTime(Date subjectLastEditTime) {
        this.subjectLastEditTime = subjectLastEditTime;
    }
}
