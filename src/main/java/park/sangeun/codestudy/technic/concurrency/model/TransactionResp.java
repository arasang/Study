package park.sangeun.codestudy.technic.concurrency.model;

public class TransactionResp {
    private String cardId = "";
    private String reqDh = "";
    private int reqAmount = 0;
    private String reqType = "";

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getReqDh() {
        return reqDh;
    }

    public void setReqDh(String reqDh) {
        this.reqDh = reqDh;
    }

    public int getReqAmount() {
        return reqAmount;
    }

    public void setReqAmount(int reqAmount) {
        this.reqAmount = reqAmount;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }
}
