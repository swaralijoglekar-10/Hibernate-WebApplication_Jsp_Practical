package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class StudentController {
    @GetMapping("/studform")
    public String showForm() {
        return "studform"; // Displays form.jsp
    }

    @PostMapping("/submitForm")
    public String handleFormSubmission(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("gender") String gender,
            @RequestParam("country") String country,
            @RequestParam(value = "interests", required = false) String[] interests,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("gender", gender);
        model.addAttribute("country", country);
        model.addAttribute("interests", interests);

        return "stdresult";
    }

}
