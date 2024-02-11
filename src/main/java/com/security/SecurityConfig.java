package com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//SecurityConfig.java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

 @SuppressWarnings("deprecation")
protected void configure(HttpSecurity http) throws Exception {
     http.authorizeRequests()
         .requestMatchers("/clients").hasRole("ADMIN")
         .anyRequest().authenticated()
         .and();
 }
}

