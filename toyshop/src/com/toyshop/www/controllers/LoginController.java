package com.toyshop.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController extends BaseController {
	@RequestMapping("login")
	public String login() {
		return "login";
	}

}
