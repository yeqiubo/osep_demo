package com.imooc.demo.dao;


import com.imooc.demo.entity.Homework;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;
import java.util.List;

public interface HomeworkDao {


    /**
     * 列出区域列表
     *
     * @return homeworkList
     */
    List<Homework> queryHomework();

    /**
     * 根据Id列出具体区域
     *
     * @return classGrade
     */
    Homework queryHomeworkById(BigInteger homeworkId);

    /**
     * 插入区域信息
     *
     * @param homework
     * @return
     */
    int insertHomework(Homework homework);

    /**
     * 更新区域信息
     *
     * @param homework
     * @return
     */
    int updateHomework(Homework homework);

    /**
     * 删除区域信息
     *
     * @param homeworkId
     * @return
     */
    int deleteHomework(BigInteger homeworkId);
}
