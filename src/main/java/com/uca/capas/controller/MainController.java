package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class MainController {
	@GetMapping("/login")
	public String sendForm(User user) {
		return "login";
	}
	
	@PostMapping("/validation")
	public String processForm(User user) {
		String userR = "korona";
		String passR = "vairas";
		
		if(user.getName().equals(userR) && user.getPass().equals(passR)) {
			return "showMessageT"; 
		} else {
			return "showMessageF";
		}
	}
	
}
