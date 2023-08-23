package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(){
		
		System.out.println("hello Welcome to Home controller");
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about(){
		System.out.println("index2 page");
		return "index2";
		
	}
	
	

}
