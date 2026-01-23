package com.hayat.springsecurity_facebook_login;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfigure {

    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.authorizeHttpRequests(auth -> auth
                .requestMatchers("/home").permitAll()
                .anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());


        return httpSecurity.build();
    }
}
