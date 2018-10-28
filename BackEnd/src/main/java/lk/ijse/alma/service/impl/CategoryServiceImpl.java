package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.CategoryDTO;
import lk.ijse.alma.entity.Category;
import lk.ijse.alma.repository.CategoryRepository;
import lk.ijse.alma.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ArrayList<CategoryDTO> getAllCategory() {
        ArrayList<CategoryDTO> allCategory=new ArrayList<>();
        List<Category> categories=categoryRepository.findAll();
        for (Category category:categories) {
            CategoryDTO categoryDTO1=new CategoryDTO(category.getCatid(),category.getCatdesc());
            allCategory.add(categoryDTO1);
        }
        return allCategory;
    }

    @Override
    public CategoryDTO getCategory(CategoryDTO catid) {
        return null;
    }

    @Override
    public boolean saveCategory(CategoryDTO categoryDTO) {
        Category category=new Category(categoryDTO.getCatid(),categoryDTO.getCatdesc());
         categoryRepository.save(category);
        return true;
    }

    @Override
    public boolean deleteCategory(CategoryDTO categoryDTO) {
        return false;
    }

    @Override
    public long getTotalCategory() {
        return 0;
    }

    @Override
    public CategoryDTO searchCategory(String catid) {
        return null;
    }
}
