package net.lianbian.tpc.protocol.service;

import net.lianbian.tpc.protocol.domian.LogRecordEntity;
import net.lianbian.tpc.protocol.domian.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface LogRecordRepository extends JpaRepository<LogRecordEntity, String> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    LogRecordEntity findOne(String transactionId);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    LogRecordEntity save(LogRecordEntity s);

    @Lock(LockModeType.PESSIMISTIC_READ)
    List<LogRecordEntity> findByStatusInAndCreateTimeLessThan(List<TransactionStatus> status, Timestamp timestamp);
}
