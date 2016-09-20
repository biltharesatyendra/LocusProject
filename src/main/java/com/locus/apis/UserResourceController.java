package com.locus.apis;

import com.locus.entities.Resource;
import com.locus.entities.UserResource;
import com.locus.services.UserResourceCreationService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class UserResourceController {
    @RequestMapping(path = "/userresource", method = RequestMethod.POST)
    public String addUserResource(@RequestBody UserResource userResource)
    {

        UserResourceCreationService.addUserResource(userResource.getUserId(), userResource.getResourceId());
        return "added data ffor " + userResource;
    }
    @RequestMapping(path ="/userresource", method =  RequestMethod.GET)
    public Set<Resource> getAllUserResources(@RequestParam String userId) {
        return UserResourceCreationService.getAllResources(userId);
    }

}
