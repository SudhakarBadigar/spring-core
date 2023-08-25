package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerToView {
	
	@RequestMapping("/front")
	public String front(Model model){
		model.addAttribute("name","RamaKrishna");
		model.addAttribute("id", 11);
		
		List<String> friend=new ArrayList<String>();
		friend.add("Rama");
		friend.add("Hanumantha");
		friend.add("narayana");
		friend.add("vamana");
		
		model.addAttribute("f", friend);
		
		System.out.println("controller to view data tranferring");
		return "front";
	}

}
