package park.sangeun.codestudy.technic.concurrency.model;

import java.io.Serializable;

public class TransactionReq implements Serializable {
    private String requestDh = "";
    private String cardId = "";
    private int amount = 0;
    private String transactionType = "";

    public String getRequestDh() {
        return requestDh;
    }

    public void setRequestDh(String requestDh) {
        this.requestDh = requestDh;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "TransactionReq{" +
                "requestDh='" + requestDh + '\'' +
                ", cardId='" + cardId + '\'' +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
