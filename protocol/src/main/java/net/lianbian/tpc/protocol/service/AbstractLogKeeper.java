package net.lianbian.tpc.protocol.service;

import net.lianbian.tpc.protocol.domian.DistributedTransaction;
import net.lianbian.tpc.protocol.domian.LogRecord;
import net.lianbian.tpc.protocol.domian.LogRecordImpl;
import net.lianbian.tpc.protocol.domian.TransactionStatus;

import java.util.List;

public abstract class AbstractLogKeeper implements LogKeeper {
    @Override
    public void recordMsg(DistributedTransaction transaction, TransactionStatus status) {
        saveOrUpdate(createLogRecord(transaction, status));
    }

    private LogRecord createLogRecord(DistributedTransaction transaction, TransactionStatus status) {
        return new LogRecordImpl(transaction.id(), status, null, null);
    }

    public abstract void saveOrUpdate(LogRecord logRecord);

    public abstract void saveOrUpdate(DistributedTransaction distributedTransaction);

    public abstract List<LogRecord> findUndecidedTransactions();

    public abstract DistributedTransaction findTranactionById(String Id);

    public abstract List<DistributedTransaction> findTranactionByIds(List<String> Id);
}
