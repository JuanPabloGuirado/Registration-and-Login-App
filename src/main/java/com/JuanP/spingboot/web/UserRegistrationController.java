package com.JuanP.spingboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JuanP.spingboot.service.UserService;
import com.JuanP.spingboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	public UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		//returning the 'view'
		return "redirect:/registration?success";
	}

}
