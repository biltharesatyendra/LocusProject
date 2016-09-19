package com.locus.dao;

import com.locus.entities.Role;
import com.locus.entities.UserResourceMap;

import java.util.HashMap;

public class UserResourceRoleMapDao {
    private HashMap<UserResourceMap,Role> userResourceRole = new HashMap<>();
    public void addRole(UserResourceMap userResourceMap, Role role)
    {
        userResourceRole.put(userResourceMap, role);
    }
    public Role getRole(UserResourceMap userResourceMap)
    {
        return userResourceRole.get(userResourceMap);
    }
}
