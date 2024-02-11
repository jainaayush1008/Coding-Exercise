package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.User;
import com.user.service.UserService;

//UserController.java
@RestController
@RequestMapping("/users")
public class UserController {

 @Autowired
 private UserService userService;

 @GetMapping
 public List<User> listUsers(@RequestParam(required = false) String username) {
     if (username != null) {
         return userService.getUsersByUsername(username);
     }
     return userService.getAllUsers();
 }
}

