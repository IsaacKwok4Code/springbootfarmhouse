package com.yin4learn.springproject.FarmUpApplication.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.yin4learn.springproject.FarmUpApplication.model.Harvest;

@Configuration
public class FarmUpBeanConfig {

	@Bean
	public String projectName() {
		return "FarmUp Harvester";
	}
	
	@Lazy
	@Bean
	public String tabName() {
		return "FarmUp";
	}
	
	@Bean
	public List<Harvest> dbHarvest(){
		return new ArrayList<>();
	}

}
