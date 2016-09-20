package com.locus.dao;

import com.locus.entities.Resource;
import com.locus.entities.UserResource;

import java.util.*;

public class UserResourceDao {
    private static UserDao userDao = UserDao.getInstance();
    private static ResourceDao resourceDao = ResourceDao.getInstance();
    private static UserResourceDao userResourceDao;
    private static Map<String, Set<Resource>> userIdResourcesMap = new HashMap<>();
    public static UserResourceDao getInstance()
    {
        if(userResourceDao ==null)
        {
            userResourceDao = new UserResourceDao();
        }
        return userResourceDao;
    }
    public static void addUserResource(String userId, String resourceId)
    {
        if(userDao.getUser(userId)==null)return;
        if(resourceDao.getResource(resourceId)==null)return;
        Set<Resource> resourceSet = userIdResourcesMap.get(userId);
        if(resourceSet==null)
        {
            resourceSet = new HashSet<>();
        }
        resourceSet.add(resourceDao.getResource(resourceId));
        userIdResourcesMap.put(userId, resourceSet);
        System.out.println("affter adding " + userId + " and " + resourceId + " map is " + userIdResourcesMap);
    }
    public static Set<Resource> getResourcesForUser(String userId)
    {
        System.out.println("key is " + userId);
        System.out.println(" and value is " + userIdResourcesMap.get(userId));
        Set<Resource> result = new HashSet<>();
        if(userIdResourcesMap.get(userId)!=null)
        result = userIdResourcesMap.get(userId);
        return result;
    }
    public static  void deleteUserResource(String userId, String resourceId)
    {
        if(userDao.getUser(userId)==null)return;
        if(resourceDao.getResource(resourceId)==null)return;
        Set<Resource> resourceSet = userIdResourcesMap.get(userId);
        if(resourceSet==null)
        {
            return;
        }
        resourceSet.remove(resourceDao.getResource(resourceId));
        userIdResourcesMap.put(userId, resourceSet);
    }
    /*
    public static Set<Resource> geAtAllResources(String userId) {
        return userIdResourcesMap.get(userId);
    }
    */
}
