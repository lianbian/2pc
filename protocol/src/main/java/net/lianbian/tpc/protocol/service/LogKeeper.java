package net.lianbian.tpc.protocol.service;

import net.lianbian.tpc.protocol.domian.DistributedTransaction;
import net.lianbian.tpc.protocol.domian.TransactionStatus;

/**
 * 日志监听
 */
public interface LogKeeper {

    /**
     * 记录消息
     * @param transaction
     * @param status
     */
    void recordMsg(DistributedTransaction transaction, TransactionStatus status);
}
