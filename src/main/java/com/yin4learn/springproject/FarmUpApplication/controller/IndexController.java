package com.yin4learn.springproject.FarmUpApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/farm")
public class IndexController {
	
	@Autowired
	private String webmaster;

	/*
	@GetMapping
	@ResponseBody
	public String welcome() {
		return "Welcome to FarmUp!\n"
				+ "Let us manage, harvest, and enjoy our gains!";
	}
	*/
	
	@GetMapping
	public String welcome(Model model) {
		model.addAttribute("banner", "Welcome to FarmUp!\n"
				+ "Let us manage, harvest, and enjoy our gains!");
		model.addAttribute("webmaster", webmaster);
		return "th_index";
	}
}
