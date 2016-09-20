package com.locus.apis;


import com.locus.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "hello world ";
    }
    @RequestMapping(path = "/details2" ,method = RequestMethod.POST)
    public  String getDetails(@RequestBody User data)
    {
        return "Satyendra" + data;
    }
}