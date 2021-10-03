package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeadlinesController {
	@RequestMapping("/headlines.mvc")
	public String showHeadlinesPage() {
		return "headlines";
	}

}
