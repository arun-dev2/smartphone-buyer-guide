package com.buyerguide.sbg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buyerguide.sbg.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(
			@ModelAttribute("userRegistrationInfo") UserRegistrationDTO userRegistrationDTO) {
		return "user-registration";
	}
	
	@RequestMapping("/registration-sucess")
	public String processUSerRegistration(@ModelAttribute("userRegistrationInfo") UserRegistrationDTO userRegistrationDTO) {
		return "registration-sucess";
	}
}
