package com.demo.blog.controller;

import com.demo.blog.model.User;
import com.demo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
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
        return userService.findAllUsers();
     }

     @RequestMapping(value = {"/",""} , method =RequestMethod.POST)
     public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
     }
}
