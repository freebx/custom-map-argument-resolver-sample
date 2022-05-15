package com.test.web.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Configuration 
public class CustomArgumentConfig {

	@Autowired
	private RequestMappingHandlerAdapter adapter;
	
	@PostConstruct
	public void prioritizeCustomArgumentMethodHandlers () {
	  List<HandlerMethodArgumentResolver> argumentResolvers = new ArrayList<> (adapter.getArgumentResolvers ());
	  
	  CustomArgumentResolver customResolver = new CustomArgumentResolver();
	  argumentResolvers.add(0, customResolver);
	  
	  adapter.setArgumentResolvers (argumentResolvers);
	}
}
