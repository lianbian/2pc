package net.lianbian.tpc.bankcommon.service;

import net.lianbian.tpc.bankcommon.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    Account findOne(Integer accountId);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Account save(Account s);

    @Lock(LockModeType.PESSIMISTIC_READ)
    Account findByUserId(String userId);
}
