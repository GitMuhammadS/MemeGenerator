package com.shahbaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemeController {
		
	@GetMapping(value="/**/{path:[^\\.]*}")
	public String forward() {
		return "forward:/";
	}
}
