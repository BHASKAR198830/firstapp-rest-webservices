package com.firstapp.rest.webservices.firstapprestwebservices;

import com.firstapp.rest.webservices.firstapprestwebservices.User;
import com.firstapp.rest.webservices.firstapprestwebservices.UserDaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@RestController
public class UserResources {
    private UserDaoService service;

    public UserResources(UserDaoService service)
    {
        this.service=service;
    }
    @GetMapping("/Users")
    public List<User> retrieveAllUsers()
    {
       return  service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveOne(@PathVariable int id)
    {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> CreateUser(@RequestBody User user)
    {
        service.saveUser(user);
       return ResponseEntity.created(null).build();
    }

}
