package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.GoodsForm;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@RequestMapping("")
	public String index() {
		return "buygoods";
	}

	@Autowired
	private ServletContext application;

	@RequestMapping("/result")
	public String result(GoodsForm form) {
		int totalPriceExcludeTax = form.getGoods1() + form.getGoods2() + form.getGoods3();
		int totalPriceIncludeTax = (int) (totalPriceExcludeTax * 1.08);
		application.setAttribute("totalPriceExcludeTax", totalPriceExcludeTax);
		application.setAttribute("totalPriceIncludeTax", totalPriceIncludeTax);
		return "totalprice";
	}

}
