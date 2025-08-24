package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/auth")
public class RegisterController {

    @Autowired
    private UserService userService;

    // Display the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // Process the registration form submission
    @PostMapping("/register")
    public String registerUser(User user, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "register";
        }
        // Save user to database logic (e.g., userService.save(user));
        status.setComplete();
        userService.registerUser(user);
        return "redirect:/auth/login";
    }

    // Display the login form
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}