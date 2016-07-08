package com.ecom.repository;

import com.ecom.document.Category;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CategoryRepository extends CrudRepository<Category, String> {
    List<Category> findByDesignation(String designation);

    @Query("{}")
    Stream<Category> findAllCategories();

    @Query("{subCategory._id: {$regex: '.', $options: 'i'}, subCategory.cat: {$regex: '.', $options: 'i'}}")
    Category findBySubCategory(String id, String designation);
}
