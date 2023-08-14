package com.bikkadit.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		String msg = " hello ramakant ";
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("MESSAGE", msg);
		mav.setViewName("welcome"); 
		return mav;
		
	}
	@GetMapping("/welcome")
	public String welcomeMsg(@RequestParam String name) {
		String msg = "hii "+name+" welcome to bikkad it";
		System.out.println(msg);
		return "welcome1";
	}
}
