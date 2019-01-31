package com.imooc.demo.enums;

public enum UserInfoStateEnum {
    CHECK(0,"审核中"),OFFLINE(-1,"封禁用户"),SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),INNER_ERROR(-1001,"内部错误"),NULL_USERID(-1002,"用户ID为空"),
    NULL_USERINFO(-1003,"用户为空");
    private  int state;
    private  String stateInfo;

    private UserInfoStateEnum(int state, String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }

    /**
     * 依据传入的state返回相应的enume值
     * @return
     */
    public static UserInfoStateEnum stateOf(int state){
        for (UserInfoStateEnum userInfoSateEnum:values()){
            if(userInfoSateEnum.getState()==state){
                return  userInfoSateEnum;
            }
        }
        return null;
    }



    public int getState() {
        return state;
    }

//    public void setState(int state) {
//        this.state = state;
//    }

    public String getStateInfo() {
        return stateInfo;
    }

//    public void setStateInfo(String stateInfo) {
//        this.stateInfo = stateInfo;
//    }
}
