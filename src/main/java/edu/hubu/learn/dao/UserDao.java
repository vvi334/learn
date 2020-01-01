package edu.hubu.learn.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
    
    Optional<User> getByUserName(String userName);
        
}