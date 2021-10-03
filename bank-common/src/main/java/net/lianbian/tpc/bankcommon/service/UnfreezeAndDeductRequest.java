package net.lianbian.tpc.bankcommon.service;

/**
 * 解冻和扣款请求类
 */
public class UnfreezeAndDeductRequest {
    private int freezeRecordId;

    public UnfreezeAndDeductRequest(int freezeRecordId) {
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
        return "UnfreezeAndDeductRequest{" +
                "freezeRecordId=" + freezeRecordId +
                '}';
    }
}
