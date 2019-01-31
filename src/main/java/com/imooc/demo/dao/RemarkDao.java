package com.imooc.demo.dao;




import com.imooc.demo.entity.Remark;

import java.math.BigInteger;
import java.util.List;

public interface RemarkDao {
    /**
     * 列出区域列表
     *
     * @return remarkList
     */
    List<Remark> queryRemark();

    /**
     * 根据Id列出具体区域
     *
     * @return remark
     */
    Remark queryRemarkById(BigInteger remarkId);

    /**
     * 插入区域信息
     *
     * @param remark
     * @return
     */
    int insertRemark(Remark remark);

    /**
     * 更新区域信息
     *
     * @param remark
     * @return
     */
    int updateRemark(Remark remark);

    /**
     * 删除区域信息
     *
     * @param remarkId
     * @return
     */
    int deleteRemark(BigInteger remarkId);
}
