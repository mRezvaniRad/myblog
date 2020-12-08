package com.demo.blog.controller;

import com.demo.blog.model.Post;
import com.demo.blog.service.PostService;
import javafx.geometry.Pos;
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
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = {"","/"} , method = RequestMethod.POST )
    public Post registerPost(@RequestBody Post post){
        return postService.registerPost(post);
    }

    @RequestMapping(value = {"/",""} , method = RequestMethod.GET)
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
