package com.imooc.demo.dao;

import com.imooc.demo.entity.Remark;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RemarkDaoTest {

    @Autowired
    private RemarkDao remarkDao;

    @Test
    @Ignore
    public void queryRemark() {
        List<Remark> remarkList=remarkDao.queryRemark();
        assertEquals(2,remarkList.size());


    }

    @Test
//    @Ignore
    public void queryRemarkById() {
        Remark remark=remarkDao.queryRemarkById(BigInteger.valueOf(1));
        assertEquals("半期评语",remark.getRemarkName());
    }

    @Test
    @Ignore
    public void insertRemark() {
        Remark remark=new Remark();
        remark.setRemarkName("月度评语");
        remark.setFromUserId(1);
        remark.setToUserId(1);
        remark.setRemarkTypeId(3);
        remark.setRemarkContent("干得不错，还行");
        remark.setRemarkCreateDate(new Date());
        remark.setRemarkLastEditTime(new Date());
        int n=remarkDao.insertRemark(remark);
        assertEquals(1,n);
        Remark remark1=remarkDao.queryRemarkById(BigInteger.valueOf(3));
        assertEquals("月度评语",remark1.getRemarkName());

    }

    @Test
    @Ignore
    public void updateRemark() {
        Remark remark=new Remark();
        remark.setRemarkId(BigInteger.valueOf(3));
        remark.setRemarkName("周评语");
        remark.setRemarkContent("干");
        remarkDao.updateRemark(remark);
        Remark remark1=remarkDao.queryRemarkById(BigInteger.valueOf(3));
        assertEquals("周评语",remark1.getRemarkName());



    }

    @Test
//    @Ignore
    public void deleteRemark() {
        int n=remarkDao.deleteRemark(BigInteger.valueOf(3));
        assertEquals(1,n);
    }
}