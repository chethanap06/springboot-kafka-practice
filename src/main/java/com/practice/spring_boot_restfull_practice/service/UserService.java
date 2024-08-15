package com.practice.spring_boot_restfull_practice.service;

import com.practice.spring_boot_restfull_practice.entity.User;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);
}
