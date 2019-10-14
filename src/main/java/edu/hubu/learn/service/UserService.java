package edu.hubu.learn.service;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.hubu.learn.dao.UserDao;
import edu.hubu.learn.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id) {
        return userDao.findById(id).get();
    }

    public List<User> getUsers(){
        return userDao.findAll();
    }
    public User addUser(User user){
        return userDao.save(user);
    }
    public void modifyUser(User user){
         userDao.save(user);
    }
    public void deleteUser(Long id){
        userDao.deleteById(id);
   }
}