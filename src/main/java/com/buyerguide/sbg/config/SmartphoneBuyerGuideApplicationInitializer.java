package com.buyerguide.sbg.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SmartphoneBuyerGuideApplicationInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		/* used for xml way of configuration
		 * XmlWebApplicationContext webApplicationContext = new
		 * XmlWebApplicationContext();
		 * webApplicationContext.setConfigLocation("classpath:app-config.xml");
		 */
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SmartphoneBuyerGuideConfig.class);
		
		// created a dispatcher servlet object 
		DispatcherServlet ds = new DispatcherServlet(webApplicationContext);
		
		// registered the dispatcher servlet with the servlet context object
		// ServletRegistration.Dynamic  - dynamic interface is inside the servletregistrtaion interfcae
		ServletRegistration.Dynamic customDS = servletContext.addServlet("sbg", ds);
		
		// configuring load startup and url mapping
		customDS.setLoadOnStartup(1);
		customDS.addMapping("/buyerguide.com/*");
	}

}
