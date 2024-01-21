package com.buyerguide.sbg.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class UserInfoDTO {

	// @NotBlank(message = "* your name cannot be blank.")
	// @Min(value = 3, message = "* your name should have atleat 3 characters")
	@Size(min = 3, max = 14, message = "* your name should between size of 3 to 15 char")
	private String userName;

	// @NotBlank(message = "* your name cannot be blank.")
	@Size(min = 3, max = 14, message = "* mobileName should between size of 3 to 15 char")
	private String mobileName;

	@AssertTrue(message = "* You have to agree terms and condition to continue.")
	private boolean TermsAndCondition;

	public UserInfoDTO() {
		System.out.println("user  info dto contructor called...");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	@Override
	public String toString() {
		return "userInfoDTO [userName=" + userName + ", mobileName=" + mobileName + "]";
	}

	public boolean isTermsAndCondition() {
		return TermsAndCondition;
	}

	public void setTermsAndCondition(boolean termsAndCondition) {
		TermsAndCondition = termsAndCondition;
	}

}
