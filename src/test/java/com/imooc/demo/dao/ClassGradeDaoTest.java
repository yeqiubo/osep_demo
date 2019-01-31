package com.imooc.demo.dao;

import com.imooc.demo.entity.ClassGrade;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class ClassGradeDaoTest {

    @Autowired
    private ClassGradeDao classGradeDao;
    @Test
    public void queryClassGrade() {
        List<ClassGrade> classGradeList= classGradeDao.queryClassGrade();

        assertEquals(3,classGradeList.size());
    }

    @Test
    public void queryClassGradeById() {
        ClassGrade classGrade=classGradeDao.queryClassGradeById(1);
        assertEquals("一年级一班",classGrade.getClassGradeName());
    }

    @Test
    @Ignore
    public void insertClassGrade() {
    }

    @Test
    @Ignore
    public void updateArea() {
    }

    @Test
    @Ignore
    public void deleteClassGrade() {
    }
}