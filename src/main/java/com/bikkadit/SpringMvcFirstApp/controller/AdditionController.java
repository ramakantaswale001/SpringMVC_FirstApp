package com.bikkadit.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdditionController {

	@GetMapping("/printvalue/{a}")
	public String printValue(@PathVariable int a, Model model) {
		String msg = "the enter value is :- "+(a);
		System.out.println(a);
		model.addAttribute("MSG", msg);
		return "print";
		
	}
	
	@GetMapping("/printadd")
	public String printValue(@RequestParam int a,@RequestParam int b, Model model) {
		String msg = "the enter value is :- "+(a+b);
		System.out.println(a+b);
		model.addAttribute("MSG", msg);
		return "print";
		
	}
}
