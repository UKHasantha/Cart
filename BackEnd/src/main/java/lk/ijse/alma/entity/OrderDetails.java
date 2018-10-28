package lk.ijse.alma.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetails implements Serializable {
    private int quantity;
    private double unitprice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderid",referencedColumnName = "orderid",insertable = false,updatable = false)
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemcode",referencedColumnName = "itemcode",insertable = false,updatable = false)
    private Item item;
    @EmbeddedId
    private OrderDetail_PK orderDetail_pk;

    public OrderDetails() {
    }

    public OrderDetails(int quantity, double unitprice, Order order, Item item, OrderDetail_PK orderDetail_pk) {
        this.setQuantity(quantity);
        this.setUnitprice(unitprice);
        this.setOrder(order);
        this.setItem(item);
        this.setOrderDetail_pk(orderDetail_pk);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "quantity=" + quantity +
                ", unitprice=" + unitprice +
                ", order=" + order +
                ", item=" + item +
                ", orderDetail_pk=" + orderDetail_pk +
                '}';
    }
}
