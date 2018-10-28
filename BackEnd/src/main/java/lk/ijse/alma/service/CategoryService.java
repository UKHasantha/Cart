package lk.ijse.alma.service;

import lk.ijse.alma.dto.AdminDTO;
import lk.ijse.alma.dto.CategoryDTO;
import lk.ijse.alma.dto.UserDTO;

import java.util.ArrayList;

public interface CategoryService {
    public ArrayList<CategoryDTO> getAllCategory();
    public CategoryDTO getCategory(CategoryDTO catid);
    public boolean saveCategory(CategoryDTO categoryDTO);
    public boolean deleteCategory(CategoryDTO categoryDTO);
    public long getTotalCategory();
    public CategoryDTO searchCategory(String catid);
}
