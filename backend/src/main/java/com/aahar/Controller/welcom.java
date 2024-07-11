package com.aahar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcom {
    @GetMapping("/hello")
    String hello(){
        return "Hello World !";
    }
}
