package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dmain.User;

@Controller
@RequestMapping("/user-info")
public class UserInfoController {
	
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	
	@RequestMapping("/output")
	public String output(User user,Model model) {
		model.addAttribute("user",user);
		return "outputuserinfo";
	}

}
