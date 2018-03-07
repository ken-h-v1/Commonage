package com.kenneth.SpringTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListHerdsController {
	
	@GetMapping("ListHerds")
	public String getPage() {
		return "lists/ListHerds";
	}
	
	/*@RequestMapping(value="/test", method=RequestMethod.GET)
    public String handlePost(@RequestParam String action, Model m) {
        if( action.equals("View") ){
            return "hello";
         }
        m.addAttribute("name", "change");
        return "lists/ByTownland";
    }
	
	public double doCalc(double x, double y)
	{
		return x * y;
	}

	
	

	    @RequestMapping(path="/{name}/{age}")
	    public String getMessage(@PathVariable("name") String name, 
	            @PathVariable("age") String age) {
	        
	        String msg = String.format("%s is %s years old", name, age);
	        
	        return msg;
	    }
	    
	    @RequestMapping(path="/{name}/{age}/{year}")
	    public String getMessage2(@PathVariable("name") String name, 
	            @PathVariable("age") String age, @PathVariable("year") String year) {
	        
	        String msg = String.format("%s is %s koplo old", name, age, year);
	        
	        return msg;
	    }*/
	
}
