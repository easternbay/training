package com.easternbay.springbootdemo.service;

import com.easternbay.springbootdemo.dao.UserRepository;
import com.easternbay.springbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public void addUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }
}
