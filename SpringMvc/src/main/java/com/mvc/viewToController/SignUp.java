package com.mvc.viewToController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUp {
	
	//process controller
	@RequestMapping("/contact")
	public String contact(){
		
		return "signup";
	}

	/* in case of servlet we used":- getparameter("name of the field");
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handleFormData( HttpServletRequest req) {
		String pass = req.getParameter("userPassword");
		System.out.println("password is  " + pass);
		return "success";
	}*/
	
	//Handler controller which will specify the final destination of signup.jsp
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handleFormData(
			@RequestParam("userName") String name,
			@RequestParam("userPassword") String pass,
			@RequestParam("userEmail") String email,
			Model model) {
		System.out.println("username is " + name);
		System.out.println("useremail is " + email);
		System.out.println("userpassword is " + pass);
		
		model.addAttribute("un",name);
		model.addAttribute("ue", email);
		model.addAttribute("up", pass);
		
		return "success";
	}
}
