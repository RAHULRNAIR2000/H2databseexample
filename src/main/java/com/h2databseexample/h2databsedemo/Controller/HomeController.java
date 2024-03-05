package com.h2databseexample.h2databsedemo.Controller;


import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        return "home";
    }
}
