package net.lianbian.tpc.bankcommon.service;

import net.lianbian.tpc.bankcommon.domain.AccountFreezingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

@Repository
public interface AccountFreezingRecordRepository extends JpaRepository<AccountFreezingRecord, Integer> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    AccountFreezingRecord findOne(Integer integer);

    @Lock(LockModeType.PESSIMISTIC_READ)
    AccountFreezingRecord findByAccountId(Integer accountId);

    @Lock(LockModeType.PESSIMISTIC_READ)
    AccountFreezingRecord findByTransactionId(String transactionId);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    void deleteByTransactionId(String transactionId);

}
