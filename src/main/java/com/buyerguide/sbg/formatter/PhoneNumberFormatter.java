package com.buyerguide.sbg.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.buyerguide.sbg.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		return object.getCountryCode()+object.getMobileNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phone = new Phone();

		String countCode = text.substring(0, 3);
		String mobileNumber = text.substring(3);
		
		phone.setCountryCode(countCode);
		phone.setMobileNumber(mobileNumber);

		return phone;
	}

	
}
