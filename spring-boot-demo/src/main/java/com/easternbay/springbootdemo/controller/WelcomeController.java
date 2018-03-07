package com.easternbay.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping(path = "/")
    public String welcome(@RequestParam(value = "name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
