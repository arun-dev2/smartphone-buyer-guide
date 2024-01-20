package com.buyerguide.sbg.api;

import org.springframework.stereotype.Component;

@Component
public class UserInfoDTO {

	private String userName = "Mr x";
	private String mobileName = "Desired phone";
	
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

}
