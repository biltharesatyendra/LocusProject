package com.locus.dao;


import com.locus.entities.Resource;

import java.util.HashMap;

public class ResourceDao {
    private HashMap<String, Resource> resources = new HashMap<>();
    private static ResourceDao resourceDao;
    public static ResourceDao getInstance()
    {
        if(resourceDao==null)
        {
            resourceDao = new ResourceDao();
        }
        return resourceDao;
    }
    public void addResource(Resource resource)
    {
        resources.put(resource.getId(),resource);
    }
    public Resource getResource(String id)
    {
        return  resources.get(id);
    }
}
