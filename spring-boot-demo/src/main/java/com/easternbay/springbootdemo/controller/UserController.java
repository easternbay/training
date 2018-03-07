package com.easternbay.springbootdemo.controller;

import com.easternbay.springbootdemo.entity.User;
import com.easternbay.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(path = "/")
    public String listUsers(ModelMap modelMap) {
        Iterable<User> users = userService.findAll();
        modelMap.put("users", users);
        return "users";
    }

    @GetMapping(path = "/add")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        userService.addUser(name, email);
        return "redirect:/users/";
    }
}
