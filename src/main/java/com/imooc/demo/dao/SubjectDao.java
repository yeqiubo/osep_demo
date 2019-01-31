package com.imooc.demo.dao;


import com.imooc.demo.entity.Subject;

import java.util.List;

public interface SubjectDao {
    /**
     * 列出区域列表
     *
     * @return subjectList
     */
    List<Subject> subjectSchool();

    /**
     * 根据Id列出具体区域
     *
     * @return subject
     */
    Subject querySubjectById(int schoolId);

    /**
     * 插入区域信息
     *
     * @param subject
     * @return
     */
    int insertSubject(Subject subject);

    /**
     * 更新区域信息
     *
     * @param subject
     * @return
     */
    int updateSubject(Subject subject);

    /**
     * 删除区域信息
     *
     * @param subjectId
     * @return
     */
    int deleteSubject(int subjectId);
}
