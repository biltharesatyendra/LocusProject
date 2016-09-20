package com.locus.dao;


import com.locus.entities.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Resource> getAllResources()
    {
        ArrayList<Resource> result = new ArrayList<>();
        for(Map.Entry<String,Resource> entry : resources.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
    }
}
