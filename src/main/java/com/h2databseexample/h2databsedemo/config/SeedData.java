package com.h2databseexample.h2databsedemo.config;


//import com.h2databseexample.h2databsedemo.Models.Account;
import com.h2databseexample.h2databsedemo.Models.Post;
//import com.h2databseexample.h2databsedemo.Service.AccountService;
import com.h2databseexample.h2databsedemo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

//    @Autowired
//    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception{

//        Account account01 = new Account();
//        Account account02 = new Account();
//
//        account01.setEmail("rahulrnair@gmail.com");
//        account01.setPassword("password");
//        account01.setFirstname("rahul");
//
//        account02.setEmail("gokulrnair@gmail.com");
//        account02.setPassword("password");
//        account02.setFirstname("gokul");

//        accountService.save(account01);
//        accountService.save(account02);

        List<Post> posts = postService.getAll();
        if(posts.size() ==0){

            Post post01 = new Post();
            post01.setTitle("Post01");
            post01.setBody("Post 01 body");
//            post01.setAccount(account01);
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("Post02");
            post02.setBody("Post 02 body");
//            post02.setAccount(account02);
            postService.save(post02);
        }
    }

}
