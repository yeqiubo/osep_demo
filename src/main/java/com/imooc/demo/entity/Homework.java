package com.imooc.demo.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 作业信息
 */
public class Homework {
    private BigInteger homeworkId;
    private Integer subjectId;
    private Integer classGradeId;
    private String  content;
    private String  homeworkImg;
    private Date    homeworkCreateDate;
    private Date    homeworkLastEditTime;

    public BigInteger getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(BigInteger homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getClassGradeId() {
        return classGradeId;
    }

    public void setClassGradeId(Integer classGradeId) {
        this.classGradeId = classGradeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHomeworkImg() {
        return homeworkImg;
    }

    public void setHomeworkImg(String homeworkImg) {
        this.homeworkImg = homeworkImg;
    }

    public Date getHomeworkCreateDate() {
        return homeworkCreateDate;
    }

    public void setHomeworkCreateDate(Date homeworkCreateDate) {
        this.homeworkCreateDate = homeworkCreateDate;
    }

    public Date getHomeworkLastEditTime() {
        return homeworkLastEditTime;
    }

    public void setHomeworkLastEditTime(Date homeworkLastEditTime) {
        this.homeworkLastEditTime = homeworkLastEditTime;
    }
}
