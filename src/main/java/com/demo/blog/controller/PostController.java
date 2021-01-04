package com.demo.blog.controller;

import com.demo.blog.model.Post;
import com.demo.blog.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rezvani
 */
@RestController
//@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService postService;

//    @RequestMapping(value = {"","/"} , method = RequestMethod.POST )
    @PostMapping("/post")
    public Post registerPost(@RequestBody Post post){
        return postService.registerPost(post);
    }

//    @RequestMapping(value = {"/",""} , method = RequestMethod.GET)
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
