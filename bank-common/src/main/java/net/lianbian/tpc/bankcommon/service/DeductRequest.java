package net.lianbian.tpc.bankcommon.service;

public class DeductRequest {
    private String userName;
    private int accountId;
    private long amount;
    private String transactionId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "DeductRequest{" +
                "accountId=" + accountId +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
