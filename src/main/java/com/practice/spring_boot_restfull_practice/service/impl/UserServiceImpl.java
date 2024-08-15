package com.practice.spring_boot_restfull_practice.service.impl;

import com.practice.spring_boot_restfull_practice.entity.User;
import com.practice.spring_boot_restfull_practice.repository.UserRepository;
import com.practice.spring_boot_restfull_practice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }
    }

