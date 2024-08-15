package com.practice.spring_boot_restfull_practice.repository;

import com.practice.spring_boot_restfull_practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
