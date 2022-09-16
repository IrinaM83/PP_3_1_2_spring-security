package com.flamexandr.spring.security.repositories;

import com.flamexandr.spring.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
