package com.buyerguide.sbg.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// implemnting AbstractAnnotationConfigDispatcherServletInitializer for concise code and let the spring to autoomate the 
// dispatcher servlet initialization and configuration.
public class SbgAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class configClassArray[] = {SmartphoneBuyerGuideConfig.class};
		return configClassArray;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[] = {"/"};
		return arr;
	}

}
