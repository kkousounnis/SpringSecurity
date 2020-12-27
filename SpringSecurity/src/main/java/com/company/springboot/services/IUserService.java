package com.company.springboot.services;

import com.company.springboot.entities.User;
import com.company.springboot.entities.dto.UserRegistrationDto;

public interface IUserService {
    public  User save(UserRegistrationDto registrationDto);
}
