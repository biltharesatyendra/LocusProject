package com.locus.services;

import com.locus.dao.UserDao;
import com.locus.entities.User;
import com.locus.utils.GenerateIdUtility;

public class UserCreationService {
    private UserDao userDao = UserDao.getInstance();
    public void createUser(String name)
    {
        User user = new User();
        user.setName(name);
        user.setId(GenerateIdUtility.generateRandomId());
        userDao.addUser(user);
    }
}
