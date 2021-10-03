package net.lianbian.tpc.bankcommon.service;

/**
 * 账户冻结参数
 */
public class AccountFreezeRequest {
    private String userName;
    private int accountId;
    private long freezeAmount;
    private String transactionId;

    public AccountFreezeRequest(String userName, int accountId, long freezeAmount, String transactionId) {
        this.accountId = accountId;
        this.freezeAmount = freezeAmount;
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

    public long getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(long freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "AccountFreezeRequest{" +
                "userName='" + userName + '\'' +
                ", accountId=" + accountId +
                ", freezeAmount=" + freezeAmount +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
