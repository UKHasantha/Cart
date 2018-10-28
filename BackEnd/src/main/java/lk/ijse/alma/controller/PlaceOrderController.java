package lk.ijse.alma.controller;

import lk.ijse.alma.dto.PlaceOrderDTO;
import lk.ijse.alma.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("api/v1/placeorders")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;

    @PostMapping(MediaType.APPLICATION_JSON_VALUE)
    public boolean savePlaceOrder(PlaceOrderDTO placeorder){
        return placeOrderService.placeOrder(placeorder);
    }
}
