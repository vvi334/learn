package edu.hubu.learn.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import edu.hubu.learn.entity.User;

public interface UserDao extends CrudRepository<User,Long>{     
    public User findByUsernameAndPassword(String username,String password);
 }
