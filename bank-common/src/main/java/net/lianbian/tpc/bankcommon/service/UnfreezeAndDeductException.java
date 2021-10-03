package net.lianbian.tpc.bankcommon.service;

/**
 * 解冻账户和扣款异常
 */
public class UnfreezeAndDeductException extends RuntimeException {
    public UnfreezeAndDeductException() {
    }

    public UnfreezeAndDeductException(String message) {
        super(message);
    }

    public UnfreezeAndDeductException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnfreezeAndDeductException(Throwable cause) {
        super(cause);
    }

    public UnfreezeAndDeductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
