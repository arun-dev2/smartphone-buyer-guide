package com.buyerguide.sbg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buyerguide.sbg.api.UserInfoDTO;

@Controller
public class SmartphoneBGAppController {

	@RequestMapping("/")
	public String viewHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
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
		return "result-homepage";
	}

}
