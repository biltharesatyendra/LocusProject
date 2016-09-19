package com.locus.com.locus.dao;


import com.locus.entities.Resource;

import java.util.HashMap;

public class ResourceDao {
    private HashMap<String, Resource> resources = new HashMap<>();
    public void addResource(Resource resource)
    {
        resources.put(resource.getId(),resource);
    }
    public Resource getResource(String id)
    {
        return  resources.get(id);
    }
}
