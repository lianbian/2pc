package net.lianbian.tpc.bankcommon.service;

/**
 * 解冻账户异常
 */
public class UnfreezeAccountException extends RuntimeException{
    public UnfreezeAccountException() {
        super();
    }

    public UnfreezeAccountException(String message) {
        super(message);
    }

    public UnfreezeAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnfreezeAccountException(Throwable cause) {
        super(cause);
    }

    protected UnfreezeAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
