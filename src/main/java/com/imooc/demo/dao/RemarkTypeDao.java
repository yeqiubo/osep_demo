package com.imooc.demo.dao;

import com.imooc.demo.entity.RemarkType;

import java.util.List;

public interface RemarkTypeDao {
    /**
     * 列出区域列表
     *
     * @return remarkTypeList
     */
    List<RemarkType> queryRemarkType();

    /**
     * 根据Id列出具体区域
     *
     * @return remarkType
     */
    RemarkType queryRemarkTypeById(int remarkTypeId);

    /**
     * 插入区域信息
     *
     * @param remarkType
     * @return
     */
    int insertRemarkType(RemarkType remarkType);

    /**
     * 更新区域信息
     *
     * @param remarkType
     * @return
     */
    int updateRemarkType(RemarkType remarkType);

    /**
     * 删除区域信息
     *
     * @param remarkTypeId
     * @return
     */
    int deleteRemarkType(int remarkTypeId);
}
