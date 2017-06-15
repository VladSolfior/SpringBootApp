package com.vlad.springboot.controller;

import com.vlad.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
	String home(ModelMap model) {
		model.addAttribute("title", "Dear Learner");
		model.addAttribute("message", "Welcome to SpringBoot");
		return "index";
	}

	@GetMapping("/users")
	String users(ModelMap model) {
        model.addAttribute("message", "You are In!");
        return "users";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
