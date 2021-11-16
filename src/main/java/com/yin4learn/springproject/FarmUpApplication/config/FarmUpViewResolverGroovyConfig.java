package com.yin4learn.springproject.FarmUpApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer;
import org.springframework.web.servlet.view.groovy.GroovyMarkupViewResolver;

@Configuration
public class FarmUpViewResolverGroovyConfig {

	// Groovy ViewResolver
    @Bean
    public GroovyMarkupConfigurer groovyMarkupConfigurer() {
        GroovyMarkupConfigurer configurer = new GroovyMarkupConfigurer();
        configurer.setResourceLoaderPath("classpath:/templates/groovy/");
        return configurer;
    }

    @Bean
    public GroovyMarkupViewResolver groovyViewResolver() {
        GroovyMarkupViewResolver viewResolver = new GroovyMarkupViewResolver();
        viewResolver.setSuffix(".tpl");
        viewResolver.setViewNames(new String[] { "tpl_*" });
        viewResolver.setOrder(3);
        return viewResolver;
    }

}
