package net.lianbian.tpc.protocol.domian;

/**
 * 参与者
 */
public interface Participant extends Node {
    /**
     * 投票
     * @param transaction
     * @return
     */
    VoteResult vote(DistributedTransaction transaction);

    /**
     * 提交
     * @param transaction
     */
    void commit(DistributedTransaction transaction);

    /**
     * 中止
     * @param transaction
     */
    void abort(DistributedTransaction transaction);

    /**
     * 恢复
     */
    void recover();

    /**
     *
     * @param transaction
     * @return
     */
    Decision resolveDecisionByCTP(DistributedTransaction transaction);
}
