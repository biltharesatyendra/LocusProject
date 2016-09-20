package com.locus.services;

import com.locus.dao.UserDao;
import com.locus.entities.*;
import com.locus.utils.GenerateIdUtility;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserService {
    private static UserDao userDao = UserDao.getInstance();
    public static String createUser(String name)
    {
        User user = new User();
        user.setName(name);
        user.setId(GenerateIdUtility.generateRandomUserId());
        userDao.addUser(user);
        return user.getId();
    }
    public static User getUser(String id)
    {
        return userDao.getUser(id);
    }
    public static List<User> getAllUsers()
    {
       return userDao.getAllUsers();
    }
    public static void assignRole(String userId, RoleType roleType)
    {
        userDao.addRoleType(userId, roleType);
    }
    public static void removeRole(String userId, RoleType roleType)
    {
        System.out.println("For user " + userId + " deleting role " + roleType);
        userDao.removeRoleType(userId, roleType);
    }
    public static Set<Role> getAllRoles(String userId)
    {
        return userDao.getAllRoles(userId);
    }
}
