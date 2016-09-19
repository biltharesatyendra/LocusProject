package com.locus.com.locus.dao;

import com.locus.entities.User;

import java.util.HashMap;

public class UserDao {
    private HashMap<String, User> users = new HashMap<>();
    public User getUser(String id)
    {
        return users.get(id);
    }
    public void addUser(User user)
    {
        users.put(user.getId(), user);
    }
}
