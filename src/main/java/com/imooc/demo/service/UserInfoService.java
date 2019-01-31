package com.imooc.demo.service;

import com.imooc.demo.dto.UserInfoExecution;
import com.imooc.demo.entity.UserInfo;

import java.io.File;

public interface UserInfoService {
    UserInfoExecution addUser(UserInfo userInfo, File userImg);
}
