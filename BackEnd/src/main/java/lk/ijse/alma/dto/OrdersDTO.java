package lk.ijse.alma.dto;

public class OrdersDTO {
    private String orderid;
    private String orderdate;
    private String orderqty;
    private String orderprice;
    private UserDTO user;

    public OrdersDTO() {
    }

    public OrdersDTO(String orderid, String orderdate, String orderqty, String orderprice, UserDTO userDTO) {
        this.setOrderid(orderid);
        this.setOrderdate(orderdate);
        this.setOrderqty(orderqty);
        this.setOrderprice(orderprice);
        this.setUserDTO(userDTO);
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderqty() {
        return orderqty;
    }

    public void setOrderqty(String orderqty) {
        this.orderqty = orderqty;
    }

    public String getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice;
    }

    public UserDTO getUserDTO() {
        return user;
    }


    public void setUserDTO(UserDTO userDTO) {
        this.user = userDTO;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "orderid='" + orderid + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", orderqty='" + orderqty + '\'' +
                ", orderprice='" + orderprice + '\'' +
                ", userDTO=" + user +
                '}';
    }
}
