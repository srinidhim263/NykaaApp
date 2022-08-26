package com.nseit.NykaaApp.controller;

import com.nseit.NykaaApp.model.Category;
import com.nseit.NykaaApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    public void viewCategory(){

    }
    public void updateCategory(){

    }
    public void deleteCategory(){

    }
}
