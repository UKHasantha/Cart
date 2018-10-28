package lk.ijse.alma.dto;

public class OrderDetail_PKDTO {
    private String itemcode;
    private String orderid;

    public OrderDetail_PKDTO() {
    }

    public OrderDetail_PKDTO(String itemcode, String orderid) {
        this.setItemcode(itemcode);
        this.setOrderid(orderid);
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
