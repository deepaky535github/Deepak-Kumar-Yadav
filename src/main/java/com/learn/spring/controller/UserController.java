package com.learn.spring.controller;

import com.learn.spring.models.User;
import com.learn.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    //all users

    @GetMapping("/")
    public List<User> getAllUsers()
    {

        return this.userService.getAllUser();
    }

    //return single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    public User add(User user){
        return this.userService.addUser(user);
    }
}
