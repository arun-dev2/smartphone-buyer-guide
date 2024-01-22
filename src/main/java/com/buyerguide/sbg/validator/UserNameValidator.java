package com.buyerguide.sbg.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.buyerguide.sbg.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	// check the validator supports given object
	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// to check if the field is null
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "* User name cannot be empty.");
		
		// string should contain a _
		String userName = ((UserRegistrationDTO)target).getUserName();
		
		if (!userName.contains("_")) {
			errors.rejectValue("userName", "userName._missing", "* Username must contain Underscore '_'");
		}


	}

}
