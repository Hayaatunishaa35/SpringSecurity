package com.hayat.spring_security_jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @RequestMapping("/hello")
    public String hello(){
        return "<h1>You logged in</h1>";
    }
}
