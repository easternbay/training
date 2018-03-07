package com.easternbay.springbootdemo.dao;

import com.easternbay.springbootdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
