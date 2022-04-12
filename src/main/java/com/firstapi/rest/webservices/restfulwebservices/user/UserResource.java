package com.firstapi.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// We will have REST methods here
@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;
    @GetMapping("/users")
    public List<User> retreiveAllUsers(){
        return service.findAll();
    }
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
       User savedUser = service.save(user);

    }

}
