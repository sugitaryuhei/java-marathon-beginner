package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class calcController {
	
	@RequestMapping("")
	public String index() {
		return "inputvalue";
	}
	
	@Autowired
	private HttpSession session;

	@RequestMapping("/output")
	public String output(String num1,String num2) {
		int answer = Integer.parseInt(num1) * 
				     Integer.parseInt(num2);
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "outputvalue";
	}
	
	@RequestMapping("/output2")
	public String output2() {
		return "outputvalue2";
	}

}
