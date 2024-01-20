package com.buyerguide.sbg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping("/process-homepage")
	public String viewResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "result-homepage";
	}

}
