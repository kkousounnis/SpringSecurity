package com.company.springboot.services;

import com.company.springboot.dao.UserDao;
import com.company.springboot.entities.Role;
import com.company.springboot.entities.User;
import com.company.springboot.entities.dto.UserRegistrationDto;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    private UserDao userdao;
    
    public UserService(UserDao userdao) {
        this.userdao = userdao;
    }    
    
    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userdao.save(user);
    }
    
}
