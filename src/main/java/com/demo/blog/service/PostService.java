package com.demo.blog.service;

import com.demo.blog.model.Post;
import com.demo.blog.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rezvani
 */
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post registerPost(Post post){
        return postRepository.save(post);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }


}
