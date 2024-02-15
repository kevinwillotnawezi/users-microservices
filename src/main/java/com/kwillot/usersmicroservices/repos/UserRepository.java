package com.kwillot.usersmicroservices.repos;

import com.kwillot.usersmicroservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
