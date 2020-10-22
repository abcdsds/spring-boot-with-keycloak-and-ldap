package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller
public class TestController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        System.out.println("principal = " + principal);
        System.out.println(" 접속 ");
        return "hello";
    }

}
