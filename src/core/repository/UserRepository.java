package com.cankurttekin.onion_crud.core.repository;

import com.cankurttekin.onion_crud.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //List<User> findByUsername(String username);
}
