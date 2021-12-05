package com.example.demo1.controller;

import com.example.demo1.domain.entity.User;
import com.example.demo1.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;


    @GetMapping
    public String testUsers() {
        System.out.println("users ");
        return "test";
    }

    @GetMapping("/{userId}")
    public User findUserById(@PathVariable Long userId) {
        return userService.findUser(userId);
    }
}