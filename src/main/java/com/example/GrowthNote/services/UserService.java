package com.example.GrowthNote.services;

import com.example.GrowthNote.data.UserData;
import com.example.GrowthNote.entities.User;
import com.example.GrowthNote.repositories.UserRepository;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public Boolean getUserByNameAndPassword(String name, String password) {
        String passwordMD5 = DigestUtils.md5DigestAsHex(password.getBytes());
        return userRepository.getUserByNameAndPassword(name, passwordMD5);
    }

    public List<User> addUserNameAndPassword(String name, String password) {
        String id = UUID.randomUUID().toString();
        String passwordMD5 = DigestUtils.md5DigestAsHex(password.getBytes());
        return userRepository.addUserNameAndPassword(id, name, passwordMD5);
    }
}
