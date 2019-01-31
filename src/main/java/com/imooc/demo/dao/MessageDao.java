package com.imooc.demo.dao;



import com.imooc.demo.entity.Message;

import java.util.List;

public interface MessageDao {
    /**
     * 列出区域列表
     *
     * @return messageList
     */
    List<Message> queryMessage();

    /**
     * 根据Id列出具体区域
     *
     * @return message
     */
    Message queryMessageById(int messageId);

    /**
     * 插入区域信息
     *
     * @param message
     * @return
     */
    int insertMessage(Message message);

    /**
     * 更新区域信息
     *
     * @param message
     * @return
     */
    int updateMessage(Message message);

    /**
     * 删除区域信息
     *
     * @param messageId
     * @return
     */
    int deleteMessage(int messageId);
}
