package com.buyerguide.sbg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String processUSerRegistration(@Valid @ModelAttribute("userRegistrationInfo") UserRegistrationDTO userRegistrationDTO, BindingResult result) {
		
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError eacherror: allErrors ) {
				System.out.println(eacherror);
			}
			return "user-registration";
		}
		
		return "registration-sucess";
	}
}
