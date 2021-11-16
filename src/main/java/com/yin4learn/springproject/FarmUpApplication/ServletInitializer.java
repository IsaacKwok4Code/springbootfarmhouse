package com.yin4learn.springproject.FarmUpApplication;

/*
 * Older Servlet containers don’t have support for the ServletContextInitializer bootstrap process used in Servlet 3.0. You can still use Spring and Spring Boot in these containers but you are going to need to add a web.xml to your application and configure it to load an ApplicationContext via a DispatcherServlet.
 * 
 * Inorder to create deployable war file is to provide a SpringBootServletInitializer subclass and override its configure method. This makes use of Spring Framework’s Servlet 3.0 support and allows you to configure your application when it’s launched by the servlet container. Typically, you update your application’s main class to extend SpringBootServletInitializer.
 * */
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FarmUpApplication.class);
	}
}
