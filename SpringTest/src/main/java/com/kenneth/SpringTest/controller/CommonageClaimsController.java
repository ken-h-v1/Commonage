package com.kenneth.SpringTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonageClaimsController {
	
	@GetMapping("CommonageClaimsSearch")
	public String getPage()
	{
		return "lists/CommonageClaimsSearch";
	}

}