package net.lianbian.tpc.bankcommon.service;

/**
 * 存款请求类
 */
public class DepositRequest {
    private String userName;
    private int accountId;
    private long amount;
    private String transactionId;

    public DepositRequest(String userName, int accountId, long amount, String transactionId) {
        this.accountId = accountId;
        this.amount = amount;
        this.transactionId = transactionId;
    }

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
        return "DepositRequest{" +
                "userName='" + userName + '\'' +
                ", accountId=" + accountId +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
