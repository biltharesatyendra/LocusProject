package com.locus.apis;

import com.locus.dao.ResourceDao;
import com.locus.entities.Resource;
import com.locus.services.ResourceCreationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {
    @RequestMapping(path = "/resource", method = RequestMethod.POST)
    public static String createResource(@RequestBody Resource resource)
    {
        String id = ResourceCreationService.createResource(resource.getUrl());
        return "created resource Successfully" + ResourceCreationService.getResource(id);
    }
    @RequestMapping(path = "/resource", method = RequestMethod.GET)
    public static String getResourceDetails(@RequestParam String id)
    {
        return "found resource " + ResourceCreationService.getResource(id);
    }

    @RequestMapping(path = "/resources", method =  RequestMethod.GET)
    public static List<Resource> getAllResources()
    {
        return  ResourceCreationService.getAllResources();
    }
}
