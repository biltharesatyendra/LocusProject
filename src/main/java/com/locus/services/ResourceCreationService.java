package com.locus.services;

import com.locus.dao.ResourceDao;
import com.locus.entities.Resource;
import com.locus.utils.GenerateIdUtility;

import java.util.List;

public class ResourceCreationService {
    private static ResourceDao resourceDao = ResourceDao.getInstance();
    public static String createResource(String url)
    {
        Resource resource = new Resource();
        resource.setId(GenerateIdUtility.generateRandomResourceId());
        resource.setUrl(url);
        resourceDao.addResource(resource);
        return  resource.getId();
    }
    public static  Resource getResource(String id)
    {
        return resourceDao.getResource(id);
    }
    public static List<Resource> getAllResources()
    {
        return resourceDao.getAllResources();
    }
}
