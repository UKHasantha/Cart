package lk.ijse.alma.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FeedBack {
    @Id
    private String fdmsg;
    private String fddate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Item item;

    public FeedBack() {
    }

    public FeedBack(String fdmsg, String fddate) {
        this.fdmsg = fdmsg;
        this.fddate = fddate;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "fdmsg='" + fdmsg + '\'' +
                ", fddate='" + fddate + '\'' +
                ", item=" + item +
                '}';
    }
}
