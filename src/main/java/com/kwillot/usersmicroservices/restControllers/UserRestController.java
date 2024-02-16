package com.kwillot.usersmicroservices.restControllers;

import com.kwillot.usersmicroservices.entities.User;
import com.kwillot.usersmicroservices.service.UserService;
import com.kwillot.usersmicroservices.service.register.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;
    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/register")
    public User register(@RequestBody RegistrationRequest request)
    {
        return userService.registerUser(request);
    }
}