package net.lianbian.tpc.transactionmanager.handle;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import net.lianbian.tpc.protocol.domian.*;
import net.lianbian.tpc.protocol.handler.Handler;
import net.lianbian.tpc.protocol.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionRequestHandler implements Handler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private static String command = Constants.TRANSACTION_REQ_COMMAND;

    @Autowired
    private DefaultCoordinator defaultCoordinator;

    public TransactionRequestHandler() {

    }

    @Override
    public String command() {
        return command;
    }

    @Override
    public String handle(String data) {
        if (Strings.isNullOrEmpty(data)) {
            final TransReqResult transReqResult = new TransReqResult(null, Decision.Abort, "输入不能为空!");
            return JSON.toJSONString(transReqResult);
        }
        logger.info("data={}", data);
        DistributedTransactionImpl transaction;
        try {
            transaction = JSON.parseObject(data, DistributedTransactionImpl.class);
        } catch (Exception e) {
            final TransReqResult transReqResult = new TransReqResult(null, Decision.Abort, "解析DistributedTransaction失败!");
            logger.error("解析DistributedTransaction失败: {}", data, e);
            return JSON.toJSONString(transReqResult);
        }
        final Decision decision = defaultCoordinator.handleTransaction(transaction);
        final TransReqResult transReqResult = new TransReqResult(transaction.id(), decision, buildFailureMessage(transaction));
        return JSON.toJSONString(transReqResult);
    }

    private String buildFailureMessage(DistributedTransaction transaction) {
        StringBuilder builder = new StringBuilder();
        for (VoteResult voteResult : transaction.voteResults()) {
            if (voteResult.result().equals(Vote.No)) {
                builder.append(voteResult.voterName()).append("处理失败. 返回消息: ").append(voteResult.getDescription()).append("\n");
            }
        }
        return builder.toString();
    }
}
