package com.imooc.demo.dao;

import com.imooc.demo.entity.UserInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoDaoTest {
    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    @Ignore
    public void userInfoSchool() {
        List<UserInfo> userInfoList=userInfoDao.queryUserInfo();
        assertEquals(2,userInfoList.size());
    }

    @Test
    public void queryUserInfoById() {
        UserInfo userInfo=userInfoDao.queryUserInfoById(1);
        assertEquals("宝贝熊",userInfo.getUserNickname());
    }

    @Test
    @Ignore
    public void insertUserInfo() {
        UserInfo userInfo=new UserInfo();
        UserInfo userInfo1;
        userInfo.setUserName("赵霞");
        userInfo.setUserCellphone("13399889797");
        userInfo.setUserNickname("抱抱熊");
        userInfo.setUserPassword("123456");
        userInfo.setUserType(1);
        int n=userInfoDao.insertUserInfo(userInfo);
        assertEquals(1,n);
        userInfo1=userInfoDao.queryUserInfoById(3);
        assertEquals("抱抱熊",userInfo1.getUserNickname());




    }

    @Test
    @Ignore
    public void updateUserInfo() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserId(2);
        userInfo.setUserName("猪猪侠");
        int n=userInfoDao.updateUserInfo(userInfo);
        assertEquals(1,n);
        UserInfo userInfo1=userInfoDao.queryUserInfoById(2);
        assertEquals("猪猪侠",userInfo1.getUserName());
    }

    @Test
//    @Ignore
    public void deleteUserInfo() {
        int n=userInfoDao.deleteUserInfo(3);
        assertEquals(1,n);
    }
}