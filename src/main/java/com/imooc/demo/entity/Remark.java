package com.imooc.demo.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 评语实体
 */
public class Remark {

    private BigInteger  remarkId;
    private Integer     toUserId;
    private Integer     fromUserId;
    private String      remarkName;
    private String      remarkContent;
    private Integer     remarkTypeId;
    private Date        remarkCreateDate;
    private Date        remarkLastEditTime;

    public BigInteger getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(BigInteger remarkId) {
        this.remarkId = remarkId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    public Integer getRemarkTypeId() {
        return remarkTypeId;
    }

    public void setRemarkTypeId(Integer remarkTypeId) {
        this.remarkTypeId = remarkTypeId;
    }

    public Date getRemarkCreateDate() {
        return remarkCreateDate;
    }

    public void setRemarkCreateDate(Date remarkCreateDate) {
        this.remarkCreateDate = remarkCreateDate;
    }

    public Date getRemarkLastEditTime() {
        return remarkLastEditTime;
    }

    public void setRemarkLastEditTime(Date remarkLastEditTime) {
        this.remarkLastEditTime = remarkLastEditTime;
    }
}
