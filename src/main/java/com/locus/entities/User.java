package com.locus.entities;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String id;
    private String name;
    private Set<Role> userRoles;
    private Set<RoleType> userRoleTypes;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Set<Role> getUserRoles() {
        if(userRoles==null)userRoles = new HashSet<>();
        return userRoles;
    }
    public void addRoleType(RoleType roleType)
    {
        if(userRoleTypes==null)userRoleTypes = new HashSet<>();
        userRoleTypes.add(roleType);
    }
    public Set<RoleType> getRoleTypes()
    {
        if(userRoleTypes==null)userRoleTypes = new HashSet<>();
        return userRoleTypes;
    }
    public void removeRoleType(RoleType roleType)
    {
        userRoleTypes.remove(roleType);
    }
    public void addRole(Role role)
    {
        System.out.println("user " + this + " is assigned role " + role);
        if(userRoles==null)userRoles = new HashSet<>();
        userRoles.add(role);
    }
    public void removeRole(Role role)
    {
        System.out.println("user " + this + " has been removed from " + role);
        System.out.println("current roles are " + role);
        userRoles.remove(role);
        System.out.println("changes roles should be " + role);
    }
    public void setUserRoles(Set<Role> userRoles) {
        this.userRoles = userRoles;
    }

    public Set<RoleType> getUserRoleTypes() {
        return userRoleTypes;
    }

    public void setUserRoleTypes(Set<RoleType> userRoleTypes) {
        this.userRoleTypes = userRoleTypes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userRoles=" + userRoles +
                ", userRoleTypes=" + userRoleTypes +
                '}';
    }
}
