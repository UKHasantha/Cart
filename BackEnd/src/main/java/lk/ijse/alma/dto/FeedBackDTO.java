package lk.ijse.alma.dto;

public class FeedBackDTO {
    private String fdmsg;
    private String fddate;
    private String itemcode;

    public FeedBackDTO() {
    }

    public FeedBackDTO(String fdmsg, String fddate) {
        this.fdmsg = fdmsg;
        this.fddate = fddate;
    }

    public FeedBackDTO(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getFdmsg() {
        return fdmsg;
    }

    public void setFdmsg(String fdmsg) {
        this.fdmsg = fdmsg;
    }

    public String getFddate() {
        return fddate;
    }

    public void setFddate(String fddate) {
        this.fddate = fddate;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    @Override
    public String toString() {
        return "FeedBackDTO{" +
                "fdmsg='" + fdmsg + '\'' +
                ", fddate='" + fddate + '\'' +
                ", itemcode='" + itemcode + '\'' +
                '}';
    }
}
