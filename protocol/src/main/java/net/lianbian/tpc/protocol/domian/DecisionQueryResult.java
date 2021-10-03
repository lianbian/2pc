package net.lianbian.tpc.protocol.domian;

public class DecisionQueryResult {
    private String transactionId;
    private Decision decision;
    private String description;

    public DecisionQueryResult() {
    }

    public DecisionQueryResult(String transactionId, Decision decision, String description) {
        this.transactionId = transactionId;
        this.decision = decision;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
