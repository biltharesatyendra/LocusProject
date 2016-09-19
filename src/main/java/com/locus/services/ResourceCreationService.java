package com.locus.services;

import com.locus.dao.ResourceDao;
import com.locus.entities.Resource;
import com.locus.utils.GenerateIdUtility;

public class ResourceCreationService {
    private ResourceDao resourceDao = ResourceDao.getInstance();
    public void createResource(String url)
    {
        Resource resource = new Resource();
        resource.setId(GenerateIdUtility.generateRandomId());
        resource.setUrl(url);
        resourceDao.addResource(resource);
    }
}
