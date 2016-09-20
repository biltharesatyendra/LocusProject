package com.locus.dao;

import com.locus.entities.*;

import java.util.*;

public class UserDao {
    private HashMap<String, User> users = new HashMap<>();
    private static  UserDao userDao;
    public static UserDao getInstance()
    {
        if(userDao==null)
        {
            userDao = new UserDao();
        }
        return  userDao;
    }
    public User getUser(String id)
    {
        return users.get(id);
    }
    public void addUser(User user)
    {
        users.put(user.getId(), user);
    }
    public List<User> getAllUsers()
    {
        ArrayList<User> result = new ArrayList<>();
       // users.keySet();
        for(Map.Entry<String, User> entry : users.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
    }

    public  Set<RoleType> getRoleTypes(String userId)
    {
        Set<RoleType> result = new HashSet<>();
        if(users.get(userId)!=null)
            result = users.get(userId).getRoleTypes();
        return result;
    }
    public void addRoleType(String userId, RoleType roleType)
    {
        if(users.get(userId)==null)return;
        User user = users.get(userId);
        Role role;
        if(roleType== RoleType.ROOT)
            role = new RootRole();
        else
            role = new UserRole();
        user.addRole(role);
        user.addRoleType(roleType);
        System.out.println("added role is user " + user);
        users.put(userId, user);
    }

    public void removeRoleType(String userId, RoleType roleType)
    {
        if(users.get(userId)==null)return;
        Role role;
        if(roleType== RoleType.ROOT)
            role = new RootRole();
        else
            role = new UserRole();
        User user = users.get(userId);
        user.removeRole(role);
        user.removeRoleType(roleType);
        System.out.println("changed user is " + user);
        users.put(userId, user);
    }
    public Set<Role> getAllRoles(String userId)
    {
        Set<Role> roles = new HashSet<>();
        if(users.get(userId) !=null) roles = users.get(userId).getUserRoles();
        return roles;
    }
    public boolean isActionAllowed(String userId, ActionType action)
    {

        User user = users.get(userId);
        if(user==null)return false;
        Set<Role> roles = user.getUserRoles();
        for(Role role : roles)
        {
            if(role.isActionAllowed(action))return true;
        }
        return false;
    }
}
