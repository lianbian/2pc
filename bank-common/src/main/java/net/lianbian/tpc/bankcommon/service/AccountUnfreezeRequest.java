package net.lianbian.tpc.bankcommon.service;

public class AccountUnfreezeRequest {
    private int freezeRecordId;

    public AccountUnfreezeRequest(int freezeRecordId) {
        this.freezeRecordId = freezeRecordId;
    }

    public int getFreezeRecordId() {
        return freezeRecordId;
    }

    public void setFreezeRecordId(int freezeRecordId) {
        this.freezeRecordId = freezeRecordId;
    }

    @Override
    public String toString() {
        return "AccountUnfreezeRequest{" +
                "freezeRecordId=" + freezeRecordId +
                '}';
    }
}
