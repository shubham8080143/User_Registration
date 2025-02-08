package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.entity.User;
import com.api.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;  // Service layer should handle logic

    @GetMapping("/")
    public String register(Model model) {
        model.addAttribute("user", new User());  // Create a new User object
        return "Register";  // This should map to "register.html" or "register.jsp"
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {  // ✅ Correct annotation
    	
    	String result="error";
    	System.out.println(user);
    	if(user.getPassword().equals(user.getCpassword())) {
	  try {
		  userService.register(user); 
		  result= "Home";		  
		  
	  }catch(Exception e) {
		  result="error";
	  }
	   
   }
        return result;
         // Call service layer to save the user
         // This should map to "Home.html" or "Home.jsp"
    }
}
