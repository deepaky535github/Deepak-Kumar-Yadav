package com.learn.spring.services;

import com.learn.spring.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list=new ArrayList<>();

    public UserService() {
        list.add(new User("Dilip Yadav", "Dilipyadav", "dilip12@gmail.com"));
        list.add(new User("Ajit", "Ajit", "ajit9876@gmail.com"));
    }

    //get all users
    public List<User> getAllUser(){
        return this.list;
    }
    //get single user
    public User getUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);

    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
