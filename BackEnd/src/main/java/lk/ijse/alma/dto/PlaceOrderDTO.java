package lk.ijse.alma.dto;

import java.util.List;

public class PlaceOrderDTO {
    private ItemDTO itemsDTO;
    private OrdersDTO orderDTO;
    private List<OrderDetailsDTO> orderDetailDTOS;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(ItemDTO itemsDTO, OrdersDTO orderDTO, List<OrderDetailsDTO> orderDetailDTOS) {
        this.setItemsDTO(itemsDTO);
        this.setOrderDTO(orderDTO);
        this.setOrderDetailDTOS(orderDetailDTOS);
    }

    public ItemDTO getItemsDTO() {
        return itemsDTO;
    }

    public void setItemsDTO(ItemDTO itemsDTO) {
        this.itemsDTO = itemsDTO;
    }

    public OrdersDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrdersDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public List<OrderDetailsDTO> getOrderDetailDTOS() {
        return orderDetailDTOS;
    }

    public void setOrderDetailDTOS(List<OrderDetailsDTO> orderDetailDTOS) {
        this.orderDetailDTOS = orderDetailDTOS;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "itemsDTO=" + itemsDTO +
                ", orderDTO=" + orderDTO +
                ", orderDetailDTOS=" + orderDetailDTOS +
                '}';
    }
}
