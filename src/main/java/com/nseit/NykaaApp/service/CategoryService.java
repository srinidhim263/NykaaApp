package com.nseit.NykaaApp.service;

import com.nseit.NykaaApp.model.Category;
import com.nseit.NykaaApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> viewCategory() {

        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(int categoryId) {

        categoryRepository.deleteById(categoryId);
    }

}
