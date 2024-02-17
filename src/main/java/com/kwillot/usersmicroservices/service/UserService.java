package com.kwillot.usersmicroservices.service;

import com.kwillot.usersmicroservices.entities.Role;
import com.kwillot.usersmicroservices.entities.User;
import com.kwillot.usersmicroservices.service.register.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    User registerUser(RegistrationRequest request);
    public void sendEmailUser(User u, String code);
    public User validateToken(String code);
}
