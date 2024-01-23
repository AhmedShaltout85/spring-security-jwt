package com.a08r.springsecurityjwt.repositores;

import com.a08r.springsecurityjwt.models.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
}
