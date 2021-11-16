package com.yin4learn.springproject.FarmUpApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class FarmUpViewResolverFreemarkerConfig {

	// Freemarker ViewResolver Configuration
	@Bean(name = "ftlViewResolver")
	public ViewResolver ftlViewResolver() {
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();

		viewResolver.setCache(true);
		// target classpath
		viewResolver.setPrefix("/freemarker/");
		// file extension
		viewResolver.setSuffix(".ftl");
		// need for resolve diff view engine
		viewResolver.setOrder(0);
		viewResolver.setViewNames(new String[] { "ftl_*" });
		return viewResolver; 
	}
	
	@Bean(name = "freemarkerConfig")
	public FreeMarkerConfigurer ftlFreemarkerConfig() {  
		FreeMarkerConfigurer config = new FreeMarkerConfigurer(); 
		config.setTemplateLoaderPath("classpath:/templates");  
		return config; 
	}
}
