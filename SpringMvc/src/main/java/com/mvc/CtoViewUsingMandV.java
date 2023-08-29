package com.mvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctvController")
public class CtoViewUsingMandV {
	
	@RequestMapping(path="/window" ,method = RequestMethod.GET)
	public ModelAndView employee() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("company", "Accenture");
		
		mav.addObject("company-code", "ISO-8089");
		LocalDateTime now = LocalDateTime.now();
		
		List<String> emp=new ArrayList<String>();
		emp.add("rama");
		emp.add("krishna");
		emp.add("shiva");
		mav.addObject("date",now);
		mav.addObject("Employees", emp);
		System.out.println(now);
		System.out.println("model and view");
		mav.setViewName("front1");
		return mav;
	}

}
