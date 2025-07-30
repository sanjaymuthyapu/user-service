package com.docker.dockuser.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping("/get")
    public List<User> getUsers() {
        return repo.findAll();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable int id) {
        return repo.findById(id).get();
    }
}