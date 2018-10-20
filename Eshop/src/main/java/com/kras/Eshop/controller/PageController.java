package com.kras.Eshop.controller;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index" })
	
	public ModelAndView index () {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("index", "Spring MVC");
		return mv;
	}
}

