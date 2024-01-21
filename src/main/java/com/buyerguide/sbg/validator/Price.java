package com.buyerguide.sbg.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { PriceValidator.class })
public @interface Price {

	int min(); //default 10000;

	int max(); // default 100000;
	// direct default message mapping
	//String message() default "Price should be between {min} to {max}";
	// setting default message  in properties file
	String message() default "{invalidPriceMessage}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
