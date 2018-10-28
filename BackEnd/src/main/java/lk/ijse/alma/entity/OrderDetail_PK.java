package lk.ijse.alma.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetail_PK  implements Serializable {

    private int itemcode;
    private int orderid;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int itemcode, int orderid) {
        this.itemcode = itemcode;
        this.orderid = orderid;
    }

    public int getItemcode() {
        return itemcode;
    }

    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
}