package com.imooc.demo.dao;



import com.imooc.demo.entity.School;

import java.util.List;

public interface SchoolDao {
    /**
     * 列出区域列表
     *
     * @return schoolList
     */
    List<School> querySchool();

    /**
     * 根据Id列出具体区域
     *
     * @return school
     */
    School querySchoolById(int schoolId);

    /**
     * 插入区域信息
     *
     * @param school
     * @return
     */
    int insertSchool(School school);

    /**
     * 更新区域信息
     *
     * @param school updateSchool
     * @return
     */
    int updateSchool(School school);

    /**
     * 删除区域信息
     *
     * @param schoolId
     * @return
     */
    int deleteSchool(int schoolId);

}
