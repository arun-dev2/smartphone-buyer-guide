package com.buyerguide.sbg.controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.buyerguide.sbg.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfo") //only modelattribue objects can be created inside session attribute.
public class SmartphoneBGAppController {

	@RequestMapping("/")
	public String viewHomePage( Model model) {
		
		/*
		 * Cookie[] cookies = request.getCookies(); for (Cookie cookie : cookies) {
		 * 
		 * if ("SBG.APP.userName".equals(cookie.getName())) { String myUserName =
		 * cookie.getValue(); userInfoDTO.setUserName(myUserName);
		 * 
		 * }
		 * 
		 * }
		 */
		model.addAttribute("userInfo", new UserInfoDTO() );
		return "home-page";
	}

	/*
	 * using request param and setting it in Model class to parse it to next page of
	 * site
	 * 
	 * @RequestMapping("/process-homepage") public String
	 * viewResultPage(@RequestParam("userName") String personName, @RequestParam
	 * String mobileName, Model model) {
	 * 
	 * model.addAttribute("personName", personName);
	 * model.addAttribute("mobileName", mobileName); return "result-homepage"; }
	 */
	
	// @Valid annotation is used to trigger the bean level validation it should be before model attribute
	// binding result should after dto
	@RequestMapping("/process-homepage")
	public String viewResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO , BindingResult result) {
		
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError eacherror: allErrors ) {
				System.out.println(eacherror);
			}
			return "home-page";
		}
		
		// create cookie for the user name
		/*
		 * Cookie cookie = new Cookie("SBG.APP.userName", userInfoDTO.getUserName());
		 * cookie.setMaxAge(60*69*60); response.addCookie(cookie);
		 */
		
		
		// below method is used to create and managing cookie internally
		// if its a new user create new session
		// if already exist then get the earlier session
		
		return "result-homepage";
	}
	


}
