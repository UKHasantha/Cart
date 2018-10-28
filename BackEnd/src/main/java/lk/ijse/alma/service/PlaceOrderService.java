package lk.ijse.alma.service;

import lk.ijse.alma.dto.OrdersDTO;
import lk.ijse.alma.dto.PlaceOrderDTO;

import java.util.ArrayList;

public interface PlaceOrderService {

    public boolean placeOrder(PlaceOrderDTO placeOrderDTO);

    public ArrayList<OrdersDTO> getAllOders() ;

    public long getTotalOrders();
}

