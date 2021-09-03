package com.example.Registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Registration.model.User;
import com.example.Registration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}