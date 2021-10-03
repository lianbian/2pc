package net.lianbian.tpc.protocol.domian;

import java.util.List;

public interface Coordinator extends Node {

    /**
     * 获取所有participants的名字和Node映射关系
     * @return
     */
    List<Node> participants();

    void sendVoteRequest(DistributedTransaction transaction);

    Decision makeDecision(DistributedTransaction transaction);

    void notifyDecision(DistributedTransaction transaction, Decision decision);

    void recover();
}
