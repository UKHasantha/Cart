package lk.ijse.alma.service;

import lk.ijse.alma.dto.ItemDTO;
import java.util.ArrayList;

public interface ItemService {
    public ArrayList<ItemDTO> getAllItems();
    public ItemDTO getItem(ItemDTO itemcode);
    public boolean saveItem(ItemDTO itemDTO);
    public boolean deleteItem(String itemcode);
    public long getTotalItem();
    public ItemDTO searchAdmin(String itemcode);
}
