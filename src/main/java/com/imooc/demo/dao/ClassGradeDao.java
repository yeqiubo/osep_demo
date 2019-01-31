package com.imooc.demo.dao;

import com.imooc.demo.entity.ClassGrade;

import java.util.List;

public interface ClassGradeDao {

    /**
     * 列出区域列表
     *
     * @return classGradeList
     */
    List<ClassGrade> queryClassGrade();

    /**
     * 根据Id列出具体区域
     *
     * @return classGrade
     */
    ClassGrade queryClassGradeById(int classGradeId);

    /**
     * 插入区域信息
     *
     * @param classGrade
     * @return
     */
    int insertClassGrade(ClassGrade classGrade);

    /**
     * 更新区域信息
     *
     * @param classGrade
     * @return
     */
    int updateArea(ClassGrade classGrade);

    /**
     * 删除区域信息
     *
     * @param classGradeId
     * @return
     */
    int deleteClassGrade(int classGradeId);
}
