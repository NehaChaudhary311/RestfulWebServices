package com.firstapi.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

// We will have REST methods here
@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retreiveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id: " + id);
        }
        return user;
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);
        if (user == null) {
            throw new UserNotFoundException("id: " + id);
        }
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        // This will return 201 Created response status and location of the URI will also be sent into the headers
        // path method helps in appending something to the URI
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").
                        buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
