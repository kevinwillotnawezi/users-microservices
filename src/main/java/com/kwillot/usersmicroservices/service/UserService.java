package com.kwillot.usersmicroservices.service;

import com.kwillot.usersmicroservices.entities.Role;
import com.kwillot.usersmicroservices.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}
