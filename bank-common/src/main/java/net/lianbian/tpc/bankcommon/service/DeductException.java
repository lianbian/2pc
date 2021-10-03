package net.lianbian.tpc.bankcommon.service;

/**
 * 扣款异常
 */
public class DeductException extends RuntimeException {
    public DeductException() {
    }

    public DeductException(String message) {
        super(message);
    }

    public DeductException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeductException(Throwable cause) {
        super(cause);
    }

    public DeductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
