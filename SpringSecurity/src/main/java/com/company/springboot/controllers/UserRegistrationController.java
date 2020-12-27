package com.company.springboot.controllers;

import com.company.springboot.entities.dto.UserRegistrationDto;
import com.company.springboot.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }
    
    @ModelAttribute("user")
    public UserRegistrationDto userRegistratioDto(){
        return new UserRegistrationDto();
    }
    
    @GetMapping
    public String showRegistrationForm(){
        return "registration";  
    }
    
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration?success";    
    }
}
