package com.yin4learn.springproject.FarmUpApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yin4learn.springproject.FarmUpApplication.exception.EmailFormException;

@Controller
@RequestMapping("/farm/email")
public class EmailController {

	// using Grooy view engine
	
	@GetMapping
	public String initForm() {
		return "tpl_email_form";
	}
	
	@PostMapping
	@ResponseBody
	public String submitForm(@RequestBody String email) throws EmailFormException{
		if (email.length() < 50) {
			throw new EmailFormException();
		}
		return email;
	}
	
	@ExceptionHandler(value = EmailFormException.class)
	@GetMapping("/error")
	public String submitForm(Exception e) {
		return "mst_email_exception";
	}
}
