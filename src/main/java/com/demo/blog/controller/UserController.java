package com.demo.blog.controller;

import com.demo.blog.exception.RecordNotFoundException;
import com.demo.blog.model.User;
import com.demo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/**
 * @author Rezvani
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService userService;

    @Autowired
     public UserController(UserService userService){
         this.userService=userService;
     }

     @RequestMapping(value = {"/",""} ,method = RequestMethod.GET)
     public List<User> getUser(){
         if (userService.findAllUsers() == null || userService.findAllUsers().isEmpty()) {
             throw new RecordNotFoundException("Not exist any users");
         }
         return userService.findAllUsers();
     }

     @RequestMapping(value = {"/",""} , method =RequestMethod.POST)
     public ResponseEntity<Object> registerUser(@Valid @RequestBody User user){
         User registerUser = userService.registerUser(user);
         URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(registerUser.getId()).toUri();
         return ResponseEntity.created(location).build();

     }
}
