package com.locus.services;

import com.locus.dao.UserResourceDao;
import com.locus.entities.Resource;

import java.util.Set;

public class UserResourceCreationService {
    private static UserResourceDao userResourceDao = UserResourceDao.getInstance();
    public static void addUserResource(String userId, String resourceId)
    {

        userResourceDao.addUserResource(userId, resourceId);
    }
    public static Set<Resource> getAllResources(String userId)

    {
        System.out.println("in user resource service for " + userId);
        return userResourceDao.getResourcesForUser(userId);
    }
    public static void deleteResource(String userId, String resourceId)
    {
        userResourceDao.deleteUserResource(userId, resourceId);
    }
    /*
    public static Set<Resource> getResources(String userId)
    {
        return UserResourceDao.geAtAllResources(userId);
    }*/
}
