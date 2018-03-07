package com.kenneth.SpringTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHomePage()
	{
		return "lists/ListHerds";
	}
	
	@GetMapping("Exit")
	public String getExitPage()
	{
		return "lists/Exit";
	}

}
