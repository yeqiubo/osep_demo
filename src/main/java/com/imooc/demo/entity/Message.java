package com.imooc.demo.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 信息实体
 */
public class Message {
    private BigInteger  messageId;
    private String      messageToUserList;
    private Integer     messageFromUserId;
    private String      messageTitle;
    private String      messageContent;
    private Date        messageCreateTime;
    private Date        messageLastEditTime;

    public BigInteger getMessageId() {
        return messageId;
    }

    public void setMessageId(BigInteger messageId) {
        this.messageId = messageId;
    }

    public String getMessageToUserList() {
        return messageToUserList;
    }

    public void setMessageToUserList(String messageToUserList) {
        this.messageToUserList = messageToUserList;
    }

    public Integer getMessageFromUserId() {
        return messageFromUserId;
    }

    public void setMessageFromUserId(Integer messageFromUserId) {
        this.messageFromUserId = messageFromUserId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Date messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public Date getMessageLastEditTime() {
        return messageLastEditTime;
    }

    public void setMessageLastEditTime(Date messageLastEditTime) {
        this.messageLastEditTime = messageLastEditTime;
    }
}
