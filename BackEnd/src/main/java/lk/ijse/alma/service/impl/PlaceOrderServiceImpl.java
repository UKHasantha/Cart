package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.*;
import lk.ijse.alma.entity.*;
import lk.ijse.alma.repository.ItemRepository;
import lk.ijse.alma.repository.OrderDetailRepository;
import lk.ijse.alma.repository.OrderRepository;
import lk.ijse.alma.service.PlaceOrderService;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public boolean placeOrder(PlaceOrderDTO placeOrderDTO) {
        OrdersDTO ordersDTO=placeOrderDTO.getOrderDTO();
        UserDTO userDTO=placeOrderDTO.getOrderDTO().getUserDTO();

        User user=new User();
        user.setUserID(userDTO.getUserID());
        user.setUserfname(userDTO.getUserfname());
        user.setUseremail(userDTO.getUseremail());
        user.setUseraddress(userDTO.getUseraddress());

        Order order =new Order();
        order.setOrderid(Integer.parseInt(ordersDTO.getOrderid()));
        order.setOrderdate(ordersDTO.getOrderdate());
        order.setOrderqty(ordersDTO.getOrderqty());
        order.setOrderprice((placeOrderDTO.getItemsDTO().getItemprice()));

        orderRepository.save(order);
        List<OrderDetailsDTO> orderDetailsDTOS=placeOrderDTO.getOrderDetailDTOS();
         for (OrderDetailsDTO orderDetailsDTO:orderDetailsDTOS) {

             ItemDTO itemDTO=placeOrderDTO.getItemsDTO();
             Item item=new Item();
             item.setItemcode(itemDTO.getItemcode());
             item.setItemprice(itemDTO.getItemprice());
             item.setItemdesc(itemDTO.getItemdesc());

             OrderDetail_PK orderDetail_pk=new OrderDetail_PK();
             orderDetail_pk.setItemcode(Integer.parseInt(itemDTO.getItemcode()));
             orderDetail_pk.setOrderid(Integer.parseInt(ordersDTO.getOrderid()));

             OrderDetails orderDetails=new OrderDetails();
             orderDetails.setQuantity(orderDetails.getQuantity());
             orderDetails.setUnitprice(orderDetails.getUnitprice());
             orderDetails.setOrder(orderDetails.getOrder());
             orderDetails.setItem(orderDetails.getItem());
             orderDetails.setOrderDetail_pk(orderDetail_pk);

             orderDetailRepository.save(orderDetails);

        }
        return true;
    }

    @Override
    public ArrayList<OrdersDTO> getAllOders() {
        return null;
    }

    @Override
    public long getTotalOrders() {
        return 0;
    }
}
