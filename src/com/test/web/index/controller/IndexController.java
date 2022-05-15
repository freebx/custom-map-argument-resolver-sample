package com.test.web.index.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("index")
	public ModelAndView index(Map<String, Object> dto){
		return new ModelAndView("index", dto);
	}
}
