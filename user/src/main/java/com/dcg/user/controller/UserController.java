package com.dcg.user.controller;

import com.dcg.user.model.User;
import com.dcg.user.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Setter
    @Autowired
    private UserService userService;

    @PostMapping(value = "adduser")
    @CrossOrigin(origins = "http://localhost:4200")
    public void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }


    @GetMapping(value = "getuser")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User>getUserList(){
        return userService.getUserList();
    }
}
