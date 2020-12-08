package com.demo.blog.service;

import com.demo.blog.model.Category;
import com.demo.blog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rezvani
 */

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category registerCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

}
