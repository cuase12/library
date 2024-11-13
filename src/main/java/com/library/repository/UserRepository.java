package com.library.repository;

import com.library.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    // user_id로 User 조회
    Optional<User> findByUserId(int userId);

}