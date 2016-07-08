package com.ecom.controller;

import com.ecom.document.Category;
import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/category/{id}/{designation}")
    public Category showCategory(@PathVariable String id, @PathVariable String designation) {
        return categoryRepository.findBySubCategory(id, designation);
    }

    @RequestMapping("/category/add")
    public Category addCategory() {
        Category category = new Category("i1000", "informatiques");
        Category subCategory = new Category("i1100", "imprimantes");
        category.setSubCategory(subCategory);
        return categoryRepository.save(category);
    }
}
