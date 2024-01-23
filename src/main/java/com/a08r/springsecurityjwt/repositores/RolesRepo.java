package com.a08r.springsecurityjwt.repositores;

import com.a08r.springsecurityjwt.models.roles.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
