package park.sangeun.codestudy.technic.model;

import org.springframework.web.bind.annotation.ModelAttribute;

public class TransactionReq {
    private String requestDh = "";
    private String cardId = "";
    private String amount = "";
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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
                ", amount='" + amount + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
