package net.lianbian.tpc.protocol.service;

import net.lianbian.tpc.protocol.domian.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, String> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    TransactionEntity findOne(String s);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    TransactionEntity save(TransactionEntity s);

    @Lock(LockModeType.PESSIMISTIC_READ)
    List<TransactionEntity> findByIdIn(List<String> ids);
}
