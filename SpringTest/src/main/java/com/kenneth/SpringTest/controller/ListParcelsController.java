package com.kenneth.SpringTest.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kenneth.model.Owner;

@Controller
public class ListParcelsController {

	@GetMapping("ListParcels")
	public String getPage(@RequestParam(name="commonage_id", required=false, defaultValue="World") String commonage_id, Model model) {
        model.addAttribute("commonage_id", commonage_id);
        model.addAttribute("hello", "how are you");
        
        ArrayList<Owner> prods = new ArrayList<>();
        
        prods.add(new Owner(1, "ken"));
        prods.add(new Owner(2, "joe"));
        prods.add(new Owner(3, "sally"));
        
        model.addAttribute(prods);
        
		return "lists/ListParcels";
	}
	
	@GetMapping("ListParcels?commonage_id=22")
	public void doSomething(Model model)
	{
		model.addAttribute("hello", "IT WORKED");
		
		//return "list/Parcels";
	}
	
}
