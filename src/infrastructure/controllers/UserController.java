package com.cankurttekin.onion_crud.infrastructure.controllers;

import com.cankurttekin.onion_crud.core.domain.User;
import com.cankurttekin.onion_crud.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        User myUser = userService.createUser(user);
        //return ResponseEntity.status(HttpStatus.CREATED).body(myUser);
        return myUser;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "user deleted: " + id;
    }

}
