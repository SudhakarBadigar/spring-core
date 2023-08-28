package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CtoViewUsingMandV {
	
	@RequestMapping("/window")
	public ModelAndView employee() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("company", "Accenture");
		
		mav.addObject("company-code", "ISO-8089");
		
		List<String> emp=new ArrayList<String>();
		emp.add("rama");
		emp.add("krishna");
		emp.add("shiva");
		
		mav.addObject("Employees", emp);
		
		
		
		System.out.println("model and view");
		mav.setViewName("front1");
		return mav;
	}

}
