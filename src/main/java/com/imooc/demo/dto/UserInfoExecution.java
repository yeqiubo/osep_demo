package com.imooc.demo.dto;

import com.imooc.demo.entity.UserInfo;
import com.imooc.demo.enums.UserInfoStateEnum;

import java.util.List;

public class UserInfoExecution {
//    存储状态
    private int state;
//    状态标识
    private String  stateInfo;

//    用户信息的数量
    private int count;

//    操作的用户（用户增删改的时候用到）
    private UserInfo userInfo;

//    用户列表
    private List<UserInfo>  userInfoList;

    public UserInfoExecution(){
    }
//    用户操作失败的时候使用的构造器
    public UserInfoExecution(UserInfoStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }
//    单个用户操作成功的时候构造器
    public UserInfoExecution(UserInfoStateEnum stateEnum, UserInfo userInfo){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.userInfo=userInfo;
    }
//    多个用户操作成功的时候生成构造列表的构造器
    public UserInfoExecution(UserInfoStateEnum stateEnum, List<UserInfo> userInfoList){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.userInfoList=userInfoList;

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }
}
