package lk.ijse.alma.controller;

import lk.ijse.alma.dto.ItemDTO;
import lk.ijse.alma.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveitem(ItemDTO itemDTO){
        return itemService.saveItem(itemDTO);
    }
    @DeleteMapping(value = "/{itemcode}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteitem(@PathVariable("itemcode") String itemcode){
        return itemService.deleteItem(itemcode);
    }

}
