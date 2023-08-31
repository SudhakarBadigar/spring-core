package com.mvc.viewToController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUp {

	@RequestMapping("/contact")
	public String contact(){
		
		return "signup";
	}
}
