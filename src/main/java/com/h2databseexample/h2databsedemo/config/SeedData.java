package com.h2databseexample.h2databsedemo.config;


import com.h2databseexample.h2databsedemo.Models.Post;
import com.h2databseexample.h2databsedemo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Override
    public void run(String... args) throws Exception{
        List<Post> posts = postService.getAll();
        if(posts.size() ==0){

            Post post01 = new Post();
            post01.setTitle("Post01");
            post01.setBody("Post 01 body");
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("Post02");
            post02.setBody("Post 02 body");
            postService.save(post02);
        }
    }

}
