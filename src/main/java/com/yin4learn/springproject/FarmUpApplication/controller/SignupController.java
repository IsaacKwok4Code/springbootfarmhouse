package com.yin4learn.springproject.FarmUpApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/farm/signup")
public class SignupController {

	// using Thymeleaf view engine
	@GetMapping
	public String initForm() {
		return "th_signup";
	}
	
	
	@PostMapping
	public RedirectView submitForm() {
		return new RedirectView("/farm/login/auth");
	}
}
