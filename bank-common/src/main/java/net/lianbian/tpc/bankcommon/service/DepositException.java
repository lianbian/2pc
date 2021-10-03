package net.lianbian.tpc.bankcommon.service;

/**
 * 存款异常
 */
public class DepositException extends RuntimeException {
    public DepositException() {
    }

    public DepositException(String message) {
        super(message);
    }

    public DepositException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepositException(Throwable cause) {
        super(cause);
    }

    public DepositException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
