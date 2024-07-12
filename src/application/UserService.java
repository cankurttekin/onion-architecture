package com.cankurttekin.onion_crud.application;

import com.cankurttekin.onion_crud.core.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}
