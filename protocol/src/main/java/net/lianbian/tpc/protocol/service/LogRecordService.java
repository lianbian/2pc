package net.lianbian.tpc.protocol.service;

import net.lianbian.tpc.protocol.domian.LogRecord;
import net.lianbian.tpc.protocol.domian.LogRecordEntity;
import net.lianbian.tpc.protocol.domian.LogRecordImpl;
import net.lianbian.tpc.protocol.domian.TransactionStatus;
import net.lianbian.tpc.protocol.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class LogRecordService {
    @Autowired
    private LogRecordRepository logRecordRepository;

    public void saveOrUpdate(LogRecord logRecord) {
        LogRecordEntity one = logRecordRepository.findOne(logRecord.transactionId());
        if (one == null) {
            one = new LogRecordEntity();
            one.setTransactionId(logRecord.transactionId());
            one.setStatus(logRecord.status());
            one.setCreateTime(new Timestamp(new Date().getTime()));
            one.setLastModifyTime(new Timestamp(new Date().getTime()));
        } else {
            one.setStatus(logRecord.status());
            one.setLastModifyTime(new Timestamp(new Date().getTime()));
        }
        logRecordRepository.save(one);
    }

    public LogRecord findOne(String transactionId) {
        final LogRecordEntity one = logRecordRepository.findOne(transactionId);
        return convert(one);
    }

    public LogRecord convert(LogRecordEntity entity) {
        final LogRecordImpl logRecord = new LogRecordImpl();
        logRecord.setTransactionId(entity.getTransactionId());
        logRecord.setStatus(entity.getStatus());
        logRecord.setCreateTime(entity.getCreateTime());
        logRecord.setLastModifyTime(entity.getLastModifyTime());
        return logRecord;
    }

    @Transactional
    public List<LogRecord> findUndecidedTransactions() {
        final Timestamp timestamp = new Timestamp(System.currentTimeMillis() - Constants.DEFAULT_WAIT_FOR_DECISION_TIMEOUT_SECS * 1000);
        final List<LogRecordEntity> logRecordEntities = logRecordRepository.findByStatusInAndCreateTimeLessThan(Arrays.asList(TransactionStatus.Start2PC), timestamp);
        final ArrayList<LogRecord> objects = new ArrayList<>(logRecordEntities.size());
        logRecordEntities.forEach(entity -> {
            objects.add(new LogRecordImpl(entity.getTransactionId(), entity.getStatus(), entity.getCreateTime(), entity.getLastModifyTime()));
        });
        return objects;
    }
}
