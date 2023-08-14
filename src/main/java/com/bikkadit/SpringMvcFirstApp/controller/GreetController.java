package com.bikkadit.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		String msg="hello ramakant how r u";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("key", msg);
		modelAndView.setViewName("greet");
		return modelAndView;
		
	}
	
	@GetMapping("/greet1")
	public String greetMsg1(Model model) {
		String msg="good morning ramakant";
		model.addAttribute("greetmsg1", msg);
		return "greet";
		
	}
}
