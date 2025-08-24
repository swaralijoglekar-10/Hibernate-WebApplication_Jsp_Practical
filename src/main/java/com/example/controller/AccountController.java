package com.example.controller;

import com.example.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @GetMapping("/accountForm")
    public String showForm(Model model) {
        model.addAttribute("account", new Account());
        return "accountForm";
    }

    @PostMapping("/displayDetails")
    public String displayDetails(@ModelAttribute Account account, Model model) {
        model.addAttribute("account", account);
        return "displayDetails";
    }
}

