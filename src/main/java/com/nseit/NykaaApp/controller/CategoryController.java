package com.nseit.NykaaApp.controller;

import com.nseit.NykaaApp.model.Category;
import com.nseit.NykaaApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    @GetMapping("/all")
    public List<Category> viewCategory(@PathVariable int id){
            return categoryService.viewCategory();
    }
    @PutMapping
    public void updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
    }
    @DeleteMapping
    public void deleteCategory(@PathVariable int id){
        categoryService.deleteCategory(id);
    }
}

