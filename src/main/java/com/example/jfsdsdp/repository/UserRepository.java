package com.example.jfsdsdp.repository;

import com.example.jfsdsdp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here
	User findByEmail(String email);
}
