package com.newFlighdemo.newFlight_Reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newFlighdemo.newFlight_Reservation_app.entity.User;
import com.newFlighdemo.newFlight_Reservation_app.repository.UserRepository;

@Controller
public class UserController {
  
	
	@Autowired
	private UserRepository  userRepo;
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		return "login/login";
	}
	
	@RequestMapping("/signuppage")
	public String signuppage() {
		return "login/signup";
	}
	
    @RequestMapping("/saveData")
    public String saveData(@ModelAttribute User user) {
    	userRepo.save(user);
    	return "login/login";
    }
    
    @RequestMapping("/verifylongin")
    public String verifylongin(@RequestParam("email") String email , @RequestParam("password") String password,
    		ModelMap modelMap) {
    	User user = userRepo.findByEmail(email);
    	if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
    		return "findflight";
    	}
    	modelMap.addAttribute("error","Invalid userName/password");
    	return "login/login" ;
    	
    }
    
}
