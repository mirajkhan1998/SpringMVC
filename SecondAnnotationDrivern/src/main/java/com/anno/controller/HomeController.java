package com.anno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home.action")
public class HomeController {

	@GetMapping
	public String getViewName() {
		return "home";
	}

}
