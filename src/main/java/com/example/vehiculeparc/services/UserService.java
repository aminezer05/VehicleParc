package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.User;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    User updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    Optional<User> getUserById(Long id);

    List<User> getUsers();
    Page<User> getAllUsersByPage(int page , int size);
}
