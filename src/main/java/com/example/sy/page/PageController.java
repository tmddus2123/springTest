package com.example.sy.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/")
	public String Home() {
		
		return "home";
	}
}