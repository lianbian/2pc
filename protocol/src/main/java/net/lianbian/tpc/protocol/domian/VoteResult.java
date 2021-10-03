package net.lianbian.tpc.protocol.domian;

public interface VoteResult {
    String transactionId();

    String voterName();

    long voteTime();

    Vote result();

    public String getDescription();
}
