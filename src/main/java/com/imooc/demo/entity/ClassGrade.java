package com.imooc.demo.entity;

import java.util.Date;

/**
 * 班级信息
 */
public class ClassGrade {
//    主键
    private Integer classGradeId;
//    所属学校ID
    private Integer schoolId;
//    第几年级
    private Integer gradeNO;
//    第几班
    private Integer classNO;
//    班级名
    private String  classGradeName;
//    班主任老师ID
    private Integer headTeacherId;
//    任课老师列表
    private String  teachers;
//    学生列表
    private String  students;
//    家长列表
    private String  parents;
//    班级描述备注
    private String  classGradeRemarks;
//    班级状态，0：未启用；1：启用；2：结业。默认为0
    private Integer classGradeStatus;
//    班级创建时间
    private Date    classGradeCreateTime;
//    班级最后修改时间
    private Date    classGradeLastEditTime;

    public Integer getClassGradeId() {
        return classGradeId;
    }

    public void setClassGradeId(Integer classGradeId) {
        this.classGradeId = classGradeId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getGradeNO() {
        return gradeNO;
    }

    public void setGradeNO(Integer gradeNO) {
        this.gradeNO = gradeNO;
    }

    public Integer getClassNO() {
        return classNO;
    }

    public void setClassNO(Integer classNO) {
        this.classNO = classNO;
    }

    public String getClassGradeName() {
        return classGradeName;
    }

    public void setClassGradeName(String classGradeName) {
        this.classGradeName = classGradeName;
    }

    public Integer getHeadTeacherId() {
        return headTeacherId;
    }

    public void setHeadTeacherId(Integer headTeacherId) {
        this.headTeacherId = headTeacherId;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public String getClassGradeRemarks() {
        return classGradeRemarks;
    }

    public void setClassGradeRemarks(String classGradeRemarks) {
        this.classGradeRemarks = classGradeRemarks;
    }

    public Integer getClassGradeStatus() {
        return classGradeStatus;
    }

    public void setClassGradeStatus(Integer classGradeStatus) {
        this.classGradeStatus = classGradeStatus;
    }

    public Date getClassGradeCreateTime() {
        return classGradeCreateTime;
    }

    public void setClassGradeCreateTime(Date classGradeCreateTime) {
        this.classGradeCreateTime = classGradeCreateTime;
    }

    public Date getClassGradeLastEditTime() {
        return classGradeLastEditTime;
    }

    public void setClassGradeLastEditTime(Date classGradeLastEditTime) {
        this.classGradeLastEditTime = classGradeLastEditTime;
    }
}
