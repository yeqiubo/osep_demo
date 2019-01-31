package com.imooc.demo.dao;

import com.imooc.demo.entity.Message;
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
public class MessageDaoTest {
    @Autowired
    private MessageDao messageDao;
    @Ignore
    @Test
    public void queryMessage() {
        List<Message> messageList=messageDao.queryMessage();
        assertEquals(2,messageList.size());

    }

    @Test


    public void queryMessageById() {
        Message message=messageDao.queryMessageById(1);
        assertEquals("测试消息修改插入内容1",message.getMessageContent());
    }

    @Test
    @Ignore
    public void insertMessage() {
        Message message=new Message();

        message.setMessageTitle("插入测试消息1");
        message.setMessageContent("测试消息插入内容1");
        message.setMessageToUserList("123456");
        message.setMessageFromUserId(1);
        message.setMessageCreateTime(new Date());
        message.setMessageLastEditTime(new Date());
        messageDao.insertMessage(message);
        List<Message> messageList = messageDao.queryMessage();
        assertEquals(3,messageList.size());
        Message message1=messageDao.queryMessageById(3);
        assertEquals("插入测试消息1",message1.getMessageTitle());
    }

    @Test
    @Ignore
    public void updateMessage() {
        Message message=new Message();

        message.setMessageId(BigInteger.valueOf(1));
        message.setMessageTitle("插入修改消息1");
        message.setMessageContent("测试消息修改插入内容1");

        messageDao.updateMessage(message);

        Message message1=messageDao.queryMessageById(1);
        assertEquals("测试消息修改插入内容1",message1.getMessageContent());

    }

    @Test
    @Ignore
    public void deleteMessage() {
        List<Message> messageList=messageDao.queryMessage();
        int n=messageList.size();
        messageDao.deleteMessage(3);
        n=n-1;
        messageList=messageDao.queryMessage();
        assertEquals(n,messageList.size());
    }
}