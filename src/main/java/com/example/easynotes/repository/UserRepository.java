package com.example.easynotes.repository;

import com.example.easynotes.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
 //   Page<User> findByUserId(Long userId,  Pageable pageable);
}
