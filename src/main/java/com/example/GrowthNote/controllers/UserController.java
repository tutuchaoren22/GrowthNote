package com.example.GrowthNote.controllers;

import com.example.GrowthNote.entities.User;
import com.example.GrowthNote.services.UserService;

import java.util.List;

public class UserController {
    private UserService userService = new UserService();

    public Boolean getUserByNameAndPassword(String name, String password) {
        return userService.getUserByNameAndPassword(name, password);
    }
    public List<User> addUserNameAndPassword(String name, String password) {
        return userService.addUserNameAndPassword(name,password);
    }
}
