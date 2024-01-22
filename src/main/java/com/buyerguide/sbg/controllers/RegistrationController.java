package com.buyerguide.sbg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buyerguide.sbg.api.UserRegistrationDTO;
import com.buyerguide.sbg.propertyeditor.NamePropertyEditor;
import com.buyerguide.sbg.validator.EmailValidator;
import com.buyerguide.sbg.validator.UserNameValidator;

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
	
	
	// method used to do preprocess before moving to the handler methods
	// preprocessor need to set inside binder objectk
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside init binder");
		
		//binder.setDisallowedFields("userName");
		// if white spaces is given by user
		// then it will be converted to null by StringTrimmerEditor
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEdior = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "userName", nameEdior);
		
		binder.addValidators( new UserNameValidator());
		binder.addValidators(new EmailValidator());
		
	}
}
