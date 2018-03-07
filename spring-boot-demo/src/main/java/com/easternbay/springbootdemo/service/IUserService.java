package com.easternbay.springbootdemo.service;

import com.easternbay.springbootdemo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    Iterable<User> findAll();
    void addUser(String name, String email);
}
