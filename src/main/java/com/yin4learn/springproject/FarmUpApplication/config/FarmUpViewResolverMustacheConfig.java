package com.yin4learn.springproject.FarmUpApplication.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class FarmUpViewResolverMustacheConfig {

	// Mustache ViewResolver Configuration
    @Bean
    public ViewResolver mstViewResolver(ResourceLoader resourceLoader) {
        MustacheViewResolver mustacheViewResolver
          = new MustacheViewResolver();
        mustacheViewResolver.setPrefix("classpath:/templates/mustache/");
        mustacheViewResolver.setSuffix(".mustache");
        mustacheViewResolver.setViewNames(new String[] { "mst_*" });
        mustacheViewResolver.setOrder(2);
        return mustacheViewResolver;
    }
}
