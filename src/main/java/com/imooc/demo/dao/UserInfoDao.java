package com.imooc.demo.dao;



import com.imooc.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    /**
     * 列出区域列表
     *
     * @return userInfoList
     */
    List<UserInfo> queryUserInfo();

    /**
     * 根据Id列出具体区域
     *
     * @return userInfo
     */
    UserInfo queryUserInfoById(int userInfoId);

    /**
     * 插入区域信息
     *
     * @param userInfo
     * @return
     */
    int insertUserInfo(UserInfo userInfo);

    /**
     * 更新区域信息
     *
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 删除区域信息
     *
     * @param userInfoId
     * @return
     */
    int deleteUserInfo(int userInfoId);
}
