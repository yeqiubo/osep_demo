package com.imooc.demo.dao;

import com.imooc.demo.entity.School;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolDaoTest {
    @Autowired
    private SchoolDao schoolDao;

    @Test
    @Ignore
    public void querySchool() {
        List<School> schoolList=schoolDao.querySchool();
        assertEquals(3,schoolList.size());
    }

    @Test
    public void querySchoolById() {
        School school=schoolDao.querySchoolById(1);
        assertEquals("歇台子小学",school.getSchoolName());

    }

    @Test
    @Ignore
    public void insertSchool() {
        School school=new School();
        school.setSchoolAdmin(1);
        school.setSchoolArea("新乡");
        school.setSchoolName("新乡中学");
        school.setSchoolRemarks("1234");
        school.setSchoolStatus(0);
        school.setSchoolCreateTime(new Date());
        school.setSchoolLastEditTime(new Date());
        int n=schoolDao.insertSchool(school);
        assertEquals(1,n);

    }

    @Test
    @Ignore
    public void updateSchool() {
        School school=new School();

        school.setSchoolId(4);
        school.setSchoolStatus(1);
        school.setSchoolName("xinxxx");
        school.setSchoolLastEditTime(new Date());
        int n=schoolDao.updateSchool(school);
        assertEquals(1,n);
        School school1=schoolDao.querySchoolById(4);
        assertEquals("xinxxx",school1.getSchoolName());
    }

    @Test
//    @Ignore
    public void deleteSchool() {
        int n = schoolDao.deleteSchool(4);
        assertEquals(1,n);
        List<School> schoolList=schoolDao.querySchool();
        assertEquals(3,schoolList.size());
    }
}