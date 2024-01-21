package com.buyerguide.sbg.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<Price, Integer> {

	private int min;
	private int max;

	@Override
	public void initialize(Price price) {
		// used to write post construct work right here
		this.min = price.min();
		this.max = price.max();
	}

	@Override
	public boolean isValid(Integer price, ConstraintValidatorContext context) {

		if (price == null)
			return false;
		
		if (price >= min && price <= max)
			return true;
		
		return false;
	}

}
