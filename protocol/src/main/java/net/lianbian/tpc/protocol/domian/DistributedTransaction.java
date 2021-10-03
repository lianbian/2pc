package net.lianbian.tpc.protocol.domian;

import java.util.List;

/**
 * 分布式事务
 */
public interface DistributedTransaction {
    /**
     * 事务ID
     * @return
     */
    String id();

    /**
     * 执行动作实体
     * @return
     */
    List<Action> requestedActions();

    /**
     * 投票结果
     * @return
     */
    List<VoteResult> voteResults();

    /**
     * 参与者
     * @return
     */
    List<Node> participants();
}
