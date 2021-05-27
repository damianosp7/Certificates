package com.example.demo.service;

import com.example.demo.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    String save(UserRegistrationDto registrationDto);


    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
