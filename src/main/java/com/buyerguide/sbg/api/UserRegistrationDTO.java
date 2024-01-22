package com.buyerguide.sbg.api;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import com.buyerguide.sbg.validator.Price;

@Component
public class UserRegistrationDTO {
	
	@NotEmpty(message = "* name cannot be null / empty.")
	private String name;
	private String userName;
	private char[] password;
	private String countryName;
	private String[] requiredSpecification;
	private String chargerType;
	@Price(min = 10000 , max = 50000)
	private Integer expectedPrice;
	private ContactDTO contactDTO;

	public String getChargerType() {
		return chargerType;
	}

	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String[] getRequiredSpecification() {
		return requiredSpecification;
	}

	public void setRequiredSpecification(String[] requiredSpecification) {
		this.requiredSpecification = requiredSpecification;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ContactDTO getContactDTO() {
		return contactDTO;
	}

	public void setContactDTO(ContactDTO contactDTO) {
		this.contactDTO = contactDTO;
	}

	public Integer getExpectedPrice() {
		return expectedPrice;
	}

	public void setExpectedPrice(Integer expectedPrice) {
		this.expectedPrice = expectedPrice;
	}



}
