package com.buyerguide.sbg.api;

import org.springframework.stereotype.Component;

@Component
public class EmailDTO {
	
	private String userEmail;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	

}
