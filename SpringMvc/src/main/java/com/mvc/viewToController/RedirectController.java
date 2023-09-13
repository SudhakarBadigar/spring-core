package com.mvc.viewToController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public RedirectView methodOne() {
		RedirectView rv = new RedirectView();
		String url = "https://spring.io/projects/spring-boot"; 
		rv.setUrl(url);
		System.out.println("method one");
		return rv;
	}
	
	
	@RequestMapping("/two")
	public String methodTwo() {
		System.out.println("method two");
		return "signup";
	}
	
/*	@RequestMapping("/one")
	public String methodOne() {
		System.out.println("method one");
		return "redirect:/two";
	}
	
	
	@RequestMapping("/two")
	public String methodTwo() {
		System.out.println("method two");
		return "signup";
	}*/
}
