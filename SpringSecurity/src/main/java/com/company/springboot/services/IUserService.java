package com.company.springboot.services;

import com.company.springboot.entities.User;
import com.company.springboot.entities.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService{
    public  User save(UserRegistrationDto registrationDto);
}
