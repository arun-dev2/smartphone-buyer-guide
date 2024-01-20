package com.buyerguide.sbg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc // used to enable all spring mvc configuration
@Configuration
@ComponentScan(basePackages = "com.buyerguide.sbg.controllers")
public class SmartphoneBuyerGuideConfig {
	
	// set up view resolver
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vs = new InternalResourceViewResolver();
		vs.setPrefix("/WEB-INF/view/");
		vs.setSuffix(".jsp");
		return vs;
	}

}
