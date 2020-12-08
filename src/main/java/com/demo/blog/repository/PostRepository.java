package com.demo.blog.repository;

import com.demo.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rezvani
 */
public interface PostRepository extends JpaRepository<Post,Long> {
}
