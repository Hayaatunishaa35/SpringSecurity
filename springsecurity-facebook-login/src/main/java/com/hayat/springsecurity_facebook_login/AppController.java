package com.hayat.springsecurity_facebook_login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home(){
        return "Home, no authentication needed";
    }

    @GetMapping("/profile")
    public String profile(){
        return "Profile. Successfully logged in.";
    }
}
