package com.buyerguide.sbg.api;

import org.springframework.stereotype.Component;

@Component
public class Phone {
	private String countryCode;
	private String mobileNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Phone [countryCode= " + countryCode + ", mobileNumber= " + mobileNumber + "]";
	}

}
