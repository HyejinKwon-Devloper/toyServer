package com.toy.performanceTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Hello {
    @GetMapping("/")
    private ModelAndView welcome(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
    @GetMapping("/hello")
    private String helloWorld(){
        System.out.println("hello");
        return "hello";
    }
}
