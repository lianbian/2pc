package net.lianbian.tpc.transactionmanager.service;

import net.lianbian.tpc.protocol.domian.DistributedTransaction;
import net.lianbian.tpc.protocol.domian.LogRecord;
import net.lianbian.tpc.protocol.service.AbstractLogKeeper;
import net.lianbian.tpc.protocol.service.LogRecordService;
import net.lianbian.tpc.protocol.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionManagerLogKeeper extends AbstractLogKeeper {
    @Autowired
    private LogRecordService logRecordService;
    @Autowired
    private TransactionService transactionService;

    @Override
    public void saveOrUpdate(LogRecord logRecord) {
        logRecordService.saveOrUpdate(logRecord);
    }

    @Override
    public void saveOrUpdate(DistributedTransaction distributedTransaction) {
        transactionService.saveOrUpdate(distributedTransaction);
    }

    @Override
    public List<LogRecord> findUndecidedTransactions() {
        return logRecordService.findUndecidedTransactions();
    }

    @Override
    public DistributedTransaction findTranactionById(String Id) {
        return transactionService.findTranactionById(Id);
    }

    @Override
    public List<DistributedTransaction> findTranactionByIds(List<String> Id) {
        return transactionService.findTranactionByIds(Id);
    }
}
