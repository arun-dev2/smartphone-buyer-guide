package com.buyerguide.sbg.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.buyerguide.sbg.formatter.PhoneNumberFormatter;

@EnableWebMvc // used to enable all spring mvc configuration
@Configuration
@ComponentScan(basePackages = "com.buyerguide.sbg.controllers")
public class SmartphoneBuyerGuideConfig implements WebMvcConfigurer {

	// set up view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vs = new InternalResourceViewResolver();
		vs.setPrefix("/WEB-INF/view/");
		vs.setSuffix(".jsp");
		return vs;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PhoneNumberFormatter());

	}

	// we need to tell spring this bean is for validation for that same config class
	// we need to create a validator bean we need to configure the validator bean
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		ms.setBasename("messages");
		return ms;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean lfb = new LocalValidatorFactoryBean();
		lfb.setValidationMessageSource(messageSource());
		return lfb;
	}

	@Bean
	public Validator getValidator() {
		return validator();
	}

}
