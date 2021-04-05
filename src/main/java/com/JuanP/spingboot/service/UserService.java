package com.JuanP.spingboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.JuanP.spingboot.model.User;
import com.JuanP.spingboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
}
