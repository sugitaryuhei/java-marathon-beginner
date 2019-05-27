package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dmain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/user-info")
public class UserInfoController {
	
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	
	@RequestMapping("/output")
	public String output(UserForm userForm,Model model) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		model.addAttribute("user",user);
		return "outputuserinfo";
	}

}
