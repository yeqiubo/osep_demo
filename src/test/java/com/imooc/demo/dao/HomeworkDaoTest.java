package com.imooc.demo.dao;

import com.imooc.demo.entity.Homework;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行

public class HomeworkDaoTest {
    @Autowired
    private HomeworkDao homeworkDao;

    @Test
    @Ignore
    public void queryHomework() {
        List<Homework> homeworkList=homeworkDao.queryHomework();
        assertEquals(2,homeworkList.size());
    }

    @Test
//    @Ignore
    public void queryHomeworkById() {
        Homework homework=homeworkDao.queryHomeworkById(BigInteger.valueOf(1));
        assertEquals("作业1",homework.getContent());
    }

    @Test
//    @Ignore
    public void insertHomework() {
        Homework homework=new Homework();
        homework.setContent("插入作业1");
        homework.setClassGradeId(1);
        homework.setHomeworkCreateDate(new Date());
        homework.setHomeworkLastEditTime(new Date());
        int effectedNum=homeworkDao.insertHomework(homework);
        assertEquals(effectedNum,1);
        List<Homework> homeworkList=homeworkDao.queryHomework();
        assertEquals(3,homeworkList.size());
    }

    @Test
   @Ignore
    public void updateHomework() {
        Homework homework=new Homework();
        homework.setHomeworkId(BigInteger.valueOf(2));
        homework.setContent("插入作业修改2");
        homework.setHomeworkLastEditTime(new Date());
        int effectedNum=homeworkDao.updateHomework(homework);
        assertEquals(1,effectedNum);
        homework=homeworkDao.queryHomeworkById(BigInteger.valueOf(2));
        assertEquals("插入作业修改2",homework.getContent());
    }

    @Test
//    @Ignore
    public void deleteHomework() {
        List<Homework> homeworkList=homeworkDao.queryHomework();
        int effectedNum=homeworkList.size();
        homeworkDao.deleteHomework(BigInteger.valueOf(4));
        effectedNum=effectedNum-1;
        homeworkList=homeworkDao.queryHomework();
        assertEquals(effectedNum,homeworkList.size());

    }
}