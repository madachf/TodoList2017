package com.edu.elte.alkfejl.todolist.controllers;

import com.edu.elte.alkfejl.todolist.models.User;
import com.edu.elte.alkfejl.todolist.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<User> user() {
        return ResponseEntity.ok(userService.getLoggedInUser());
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        try {
            return ResponseEntity.ok(userService.login(user));
        }
        catch (UserNotValidException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/logout")
    public ResponseEntity<User> logout() {
        userService.logout();
        return ResponseEntity.ok().build();
    }
}