package com.ecom.repository;

import com.ecom.document.Category;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

public interface CategoryRepository extends CrudRepository<Category, String> {
    List<Category> findByDesignation(String designation);

    @Query("{}")
    Stream<Category> findAllCategories();

    @Query("{_id: {$regex: '.', $options: 'i'}}")
    Category findId(String id);
}
