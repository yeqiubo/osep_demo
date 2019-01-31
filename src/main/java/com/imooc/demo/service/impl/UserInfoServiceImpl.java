package com.imooc.demo.service.impl;

import com.imooc.demo.dao.UserInfoDao;
import com.imooc.demo.dto.UserInfoExecution;
import com.imooc.demo.entity.UserInfo;
import com.imooc.demo.enums.UserInfoStateEnum;
import com.imooc.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;

public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional
    @Override
    public UserInfoExecution addUser(UserInfo userInfo, File userImg) {
        //空值判断
        if(userInfo==null){
            return new UserInfoExecution(UserInfoStateEnum.NULL_USERINFO);
        }
        try{

//            给用户信息赋初始值
            userInfo.setUserCreateTime(new Date());
            userInfo.setUserLastEditTime(new Date());
            userInfo.setUserType(0);
//            添加用户信息
            int effectedNum=userInfoDao.insertUserInfo(userInfo);
            if (effectedNum<=0){
                throw new RuntimeException("添加用户失败");
            }else{
                if(userImg!=null){
//                    存储头像图片
                }
            }

        }
        catch (Exception e){
            throw  new RuntimeException("addUserInfo error:"+e.getMessage());
        }
        return null;
    }
}
