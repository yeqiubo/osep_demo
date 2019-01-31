package com.imooc.demo.entity;

import java.util.Date;

public class UserInfo {
    private Integer userId;
    private String  userName;
    private String  userNickname;
    private String  userCellphone;
    private String  userPassword;
    private Integer userGender;
    private String  userParents;
    private Integer userType;
    private Date    userCreateTime;
    private Date    userLastEditTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(String userCellphone) {
        this.userCellphone = userCellphone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserParents() {
        return userParents;
    }

    public void setUserParents(String userParents) {
        this.userParents = userParents;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Date getUserLastEditTime() {
        return userLastEditTime;
    }

    public void setUserLastEditTime(Date userLastEditTime) {
        this.userLastEditTime = userLastEditTime;
    }
}
