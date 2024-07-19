package com.aahar.Controller;

import com.aahar.Entity.User;
import com.aahar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public User CreateUser(@RequestBody User user) throws Exception {
        return userService.CreateUser(user);
    }
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAllUser();
    }
    @PutMapping("/user/{Id}")
    public User updateUser(@PathVariable Long Id, @RequestBody User user) throws Exception {
        return userService.updateUser(Id,user);
    }
    @DeleteMapping("/user/{Id}")
    public String deleteUser(@PathVariable Long Id) throws Exception {
        return userService.deleteUser(Id);
    }
}
