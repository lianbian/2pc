package net.lianbian.tpc.protocol.domian;

public enum TransactionStatus {
    Start2PC,
    Abort,
    Commit,
    Yes,
    No;

    public static boolean isFinalStatus(TransactionStatus status) {
        return status.equals(Abort) || status.equals(Commit);
    }
}
