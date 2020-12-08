package com.demo.blog.repository;

import com.demo.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rezvani
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
