package com.imooc.demo.dao;

import com.imooc.demo.entity.RemarkType;
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
public class RemarkTypeDaoTest {

    @Autowired
    private RemarkTypeDao remarkTypeDao;

    @Test
    @Ignore
    public void queryRemarkType() {
        List<RemarkType> remarkTypeList=remarkTypeDao.queryRemarkType();
        assertEquals(4,remarkTypeList.size());


    }

    @Test

    public void queryRemarkTypeById() {
        RemarkType remarkType=remarkTypeDao.queryRemarkTypeById(1);
        assertEquals("期末评语",remarkType.getRemarkTypeName());
    }

    @Test
    @Ignore
    public void insertRemarkType() {
        RemarkType remarkType=new RemarkType();
        remarkType.setRemarkTypeName("月度评语");
        remarkType.setRemarkTypeCreateTime(new Date());
        remarkType.setRemarkTypeLastEditTime(new Date());
        int n=remarkTypeDao.insertRemarkType(remarkType);
        assertEquals(1,n);
        List<RemarkType> remarkTypeList=remarkTypeDao.queryRemarkType();
        assertEquals(5,remarkTypeList.size());

    }

    @Test
    @Ignore
    public void updateRemarkType() {
        RemarkType remarkType=new RemarkType();
        remarkType.setRemarkTypeName("周评语");
        remarkType.setRemarkTypeId(5);
        remarkType.setRemarkTypeLastEditTime(new Date());
        int n=remarkTypeDao.updateRemarkType(remarkType);
        assertEquals(1,n);
        RemarkType remarkType1=remarkTypeDao.queryRemarkTypeById(5);
        assertEquals("周评语",remarkType1.getRemarkTypeName());
    }

    @Test
//    @Ignore
    public void deleteRemarkType() {
        int n=remarkTypeDao.deleteRemarkType(5);
        assertEquals(1,n);
    }
}