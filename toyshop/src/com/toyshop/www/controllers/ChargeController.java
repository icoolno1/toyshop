package com.toyshop.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChargeController {
	@RequestMapping("charge.aspx")
	public String charge() {
		return "charge";
	}
}
