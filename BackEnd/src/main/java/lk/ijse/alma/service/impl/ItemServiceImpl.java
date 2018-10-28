package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.ItemDTO;
import lk.ijse.alma.entity.Category;
import lk.ijse.alma.entity.Item;
import lk.ijse.alma.repository.CategoryRepository;
import lk.ijse.alma.repository.ItemRepository;
import lk.ijse.alma.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public ArrayList<ItemDTO> getAllItems() {
        ArrayList<ItemDTO> allitems=new ArrayList<>();
        Category category=new Category();
        category.setCatid(category.getCatid());
        List<Item> items=itemRepository.findAll();
        for (Item item:items) {
            ItemDTO itemDTO=new ItemDTO(item.getItemcode()+"",item.getItemimage(),item.getItemname(),
                    item.getItemdesc(),item.getItemmanudate(),item.getItemexdate(),
                    item.getItemprice());
            allitems.add(itemDTO);
        }
        return allitems;
    }

    @Override
    public ItemDTO getItem(ItemDTO itemcode) {
        return itemcode;
    }

    @Override
    public boolean saveItem(ItemDTO itemDTO) {
        Category category=new Category();
        category.setCatid(itemDTO.getCatid());
//        Item item=new Item(itemDTO.getItemcode()+"",itemDTO.getItemimage(),itemDTO.getItemname(),
//                itemDTO.getItemdesc(),itemDTO.getItemmanudate(),itemDTO.getItemexdate(),
//                itemDTO.getItemprice());
//        itemRepository.save(item);
        return true;
    }

    @Override
    public boolean deleteItem(String itemcode) {
        return false;
    }

    @Override
    public long getTotalItem() {
        return 0;
    }

    @Override
    public ItemDTO searchAdmin(String itemid) {
        return null;
    }
}
