package com.demo.blog.repository;

import com.demo.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rezvani
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {


}
