package com.yin4learn.springproject.FarmUpApplication.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class FarmUpLazyBeanConfig {

	@Bean
	public LocalDate localDate() {
		return LocalDate.now();
	}
	
	@Bean
	public String webmaster() {
		return "yin4learn@notanemail.com";
	}
}
