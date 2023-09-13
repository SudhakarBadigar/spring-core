package com.miniProject;

	import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.mvc.userDao.UserService;

	

	@Controller
	public class ContactController {

		@Autowired
		private UserService userService;
		
		@ModelAttribute
		public void commonData(Model model) {
			model.addAttribute("Heading", "Provide your Details");
			model.addAttribute("para", "This will be stored in database");
		}
		
		
		
		//using@modelattribute
		@RequestMapping("/win")
		public String contact() {
			System.out.println("project refreshed");
			return "signup";
		}
		
		//2nd way
		@RequestMapping(path="/process",method = RequestMethod.POST)
		public String handleFormData(@ModelAttribute User user,Model model) {
			
			System.out.println(user);
			model.addAttribute("u",user.getUserName());
			model.addAttribute("e", user.getUserEmail());
			model.addAttribute("p", user.getUserPassword());
			
			return "success";
		}
		
		
		

		
		
		//1st way
//		@RequestMapping(path="/process",method = RequestMethod.POST) 
//		public String handleFormData(@ModelAttribute User user) {
//			System.out.println(user);
//			
//			return "success";
//		}


	}

//	     //	view to controller using @RequestParam
//		//process controller
//		@RequestMapping("/contact")
//		public String contact(){
//			
//			return "signup";
//		}
	//
//		/* in case of servlet we used":- getparameter("name of the field");
//		@RequestMapping(path = "/process", method = RequestMethod.POST)
//		public String handleFormData( HttpServletRequest req) {
//			String pass = req.getParameter("userPassword");
//			System.out.println("password is  " + pass);
//			return "success";
//		}*/
	//	
//		//Handler controller which will specify the final destination of signup.jsp
//		@RequestMapping(path = "/process", method = RequestMethod.POST)
//		public String handleFormData(
//				@RequestParam("userName") String name,
//				@RequestParam("userPassword") String pass,
//				@RequestParam("userEmail") String email,
//				Model model) {
//			System.out.println("username is " + name);
//			System.out.println("useremail is " + email);
//			System.out.println("userpassword is " + pass);
//			
//			model.addAttribute("un",name);
//			model.addAttribute("ue", email);
//			model.addAttribute("up", pass);
//			
//			return "success";
//		} 
	//
	//}




