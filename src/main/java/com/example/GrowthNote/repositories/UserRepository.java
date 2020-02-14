package com.example.GrowthNote.repositories;

import com.example.GrowthNote.data.UserData;
import com.example.GrowthNote.entities.User;

import java.util.List;

public class UserRepository {
    public Boolean getUserByNameAndPassword(String name, String password) {
        List<User> users = UserData.userLists;
        for (User user : users) {
            if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public List<User> addUserNameAndPassword(String id, String name, String password) {
        List<User> users = UserData.userLists;
        users.add(new User(id,name,password));
        return users;
    }
}
