package com.JuanP.spingboot.service;

import com.JuanP.spingboot.model.User;
import com.JuanP.spingboot.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);
}
