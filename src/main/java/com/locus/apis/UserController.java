package com.locus.apis;
import com.locus.entities.*;
import com.locus.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController

public class UserController {

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public String createUser(@RequestBody User data)
    {
        String id = UserService.createUser(data.getName());
        return "created user " + UserService.getUser(id);
    }
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public String getUserDetails(@RequestParam String id)
    {

        return "found user " + UserService.getUser(id);
    }
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers()
    {
        return UserService.getAllUsers();
    }
    @RequestMapping(path = "/role", method = RequestMethod.POST)
    public void addRole(@RequestBody User user)
    {
        Set<RoleType> roleTypes = user.getRoleTypes();
        System.out.println("request is " + user);
        for(RoleType roleType : roleTypes) {

            UserService.assignRole(user.getId(), roleType);
        }
    }
    @RequestMapping(path = "/role", method = RequestMethod.DELETE)
    public void removeRole(@RequestBody User user)
    {
        Set<RoleType> roleTypes = user.getRoleTypes();
        System.out.println("delete request is " + user);
        for(RoleType roleType : roleTypes) {
            UserService.removeRole(user.getId(), roleType);
        }
    }
    @RequestMapping(path = "/role", method = RequestMethod.GET)
    public Set<Role> getAllRoles(@RequestParam String userId)
    {
        String result = "";
        Set<Role> roleData =  UserService.getAllRoles(userId);
        for(Role  role :roleData )
        {
            result += role;
        }
        return roleData;
    }
}

