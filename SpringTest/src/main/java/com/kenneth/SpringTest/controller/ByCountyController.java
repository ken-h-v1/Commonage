package com.kenneth.SpringTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ByCountyController {
	
	@GetMapping("ByCounty")
	public String GetPage(@RequestParam(name = "county", required = false, defaultValue = "Dublin") String county,
			Model model) {
		model.addAttribute("county", county);
		return "lists/ListCommonagesByCounty";
	}


}
