package com.h2databseexample.h2databsedemo.Controller;
import org.springframework.ui.Model;


//import ch.qos.logback.core.model.Model;
import com.h2databseexample.h2databsedemo.Models.Post;
import com.h2databseexample.h2databsedemo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {
 @Autowired
 private PostService postService;

    @GetMapping("/")
    public String home(Model model){
        List<Post>posts =postService.getAll();
        model.addAttribute("posts",posts);
        return "home";
    }
}
