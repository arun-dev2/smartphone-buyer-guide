package com.buyerguide.sbg.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.buyerguide.sbg.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		// to check if the field is null
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactDTO.email", "email.empty");

		// string should contain a @ and .com
		String email = ((UserRegistrationDTO) target).getContactDTO().getEmail();

		if (!email.contains("@") || !email.endsWith(".com")) {
			errors.rejectValue("contactDTO.email", "email.invalid");
		}

	}

}
