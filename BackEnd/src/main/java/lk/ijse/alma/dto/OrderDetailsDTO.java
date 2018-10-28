package lk.ijse.alma.dto;

public class OrderDetailsDTO {
    private int quantity;
    private double unitprice;
    private OrdersDTO ordersDTO;
    private ItemDTO itemDTO;
    private OrderDetail_PKDTO orderDetail_pkdto;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(int quantity, double unitprice, OrdersDTO ordersDTO, ItemDTO itemDTO, OrderDetail_PKDTO orderDetail_pkdto) {
        this.setQuantity(quantity);
        this.setUnitprice(unitprice);
        this.setOrdersDTO(ordersDTO);
        this.setItemDTO(itemDTO);
        this.setOrderDetail_pkdto(orderDetail_pkdto);
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

    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public OrderDetail_PKDTO getOrderDetail_pkdto() {
        return orderDetail_pkdto;
    }

    public void setOrderDetail_pkdto(OrderDetail_PKDTO orderDetail_pkdto) {
        this.orderDetail_pkdto = orderDetail_pkdto;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "quantity=" + quantity +
                ", unitprice=" + unitprice +
                ", ordersDTO=" + ordersDTO +
                ", itemDTO=" + itemDTO +
                ", orderDetail_pkdto=" + orderDetail_pkdto +
                '}';
    }
}
