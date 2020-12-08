package com.demo.blog.controller;

import com.demo.blog.model.Category;
import com.demo.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rezvani
 */

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public Category registerCategory(@RequestBody Category category) {
        return categoryService.registerCategory(category);
    }

    @RequestMapping(value = {"","/"} , method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
