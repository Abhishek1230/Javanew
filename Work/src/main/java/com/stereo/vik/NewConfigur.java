package com.stereo.vik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.demon")
public class NewConfigur 
{
	 	@Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(Initialize.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	 
	        return viewResolver;
	    }

}
