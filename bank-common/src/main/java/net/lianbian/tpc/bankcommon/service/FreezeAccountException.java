package net.lianbian.tpc.bankcommon.service;

/**
 * 冻结账户异常
 */
public class FreezeAccountException extends RuntimeException {

    public FreezeAccountException() {
    }

    public FreezeAccountException(String message) {
        super(message);
    }

    public FreezeAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public FreezeAccountException(Throwable cause) {
        super(cause);
    }

    public FreezeAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
