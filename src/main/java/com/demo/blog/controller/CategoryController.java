package com.demo.blog.controller;

import com.demo.blog.model.Category;
import com.demo.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Rezvani
 */

@RestController
//@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

//    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    @PostMapping(value = "/category")
    public Category registerCategory(@Valid @RequestBody Category category) {
        return categoryService.registerCategory(category);
    }

//    @RequestMapping(value = {"","/"} , method = RequestMethod.GET)
    @GetMapping(value ="/categories" )
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
