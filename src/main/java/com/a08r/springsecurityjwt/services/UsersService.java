package com.a08r.springsecurityjwt.services;

import com.a08r.springsecurityjwt.models.roles.Role;
import com.a08r.springsecurityjwt.models.users.Users;

import java.util.List;

public interface UsersService {
    Users saveUser(Users user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    Users getUser(String username);
    List<Users> getUsers();
}
