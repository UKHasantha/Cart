package lk.ijse.alma.entity;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private
    int orderid;
    private String orderdate;
    private String orderqty;
    private double orderprice;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Order() {
    }

    public Order(String orderdate, String orderqty, double orderprice, User user) {
        this.orderdate = orderdate;
        this.orderqty = orderqty;
        this.orderprice = orderprice;
        this.user = user;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
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

    public double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(double orderprice) {
        this.orderprice = orderprice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", orderdate='" + orderdate + '\'' +
                ", orderqty='" + orderqty + '\'' +
                ", orderprice=" + orderprice +
                ", user=" + user +
                '}';
    }
}
