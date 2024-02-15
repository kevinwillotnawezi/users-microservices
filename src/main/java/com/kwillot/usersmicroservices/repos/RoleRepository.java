package com.kwillot.usersmicroservices.repos;

import com.kwillot.usersmicroservices.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
