package net.lianbian.tpc.bankcommon.service;

/**
 * 账户操作服务
 */
public interface AccountOperationService {

    /**
     * 冻结账户
     *
     * @param request
     * @throws FreezeAccountException
     */
    void freezeAccount(AccountFreezeRequest request) throws FreezeAccountException;

    /**
     * 解冻账户
     *
     * @param request
     * @throws UnfreezeAccountException
     */
    void unfreezeAccount(AccountUnfreezeRequest request) throws UnfreezeAccountException;

    /**
     * 存款
     *
     * @param request
     * @throws DepositException
     */
    void deposit(DepositRequest request) throws DepositException;

    /**
     * 扣款
     *
     * @param request
     * @throws DeductException
     */
    void deduct(DeductRequest request) throws DeductException;

    /**
     * 解冻账户并扣款
     *
     * @param request
     * @throws UnfreezeAndDeductException
     */
    void unfreezeAndDeduct(UnfreezeAndDeductRequest request) throws UnfreezeAndDeductException;
}
