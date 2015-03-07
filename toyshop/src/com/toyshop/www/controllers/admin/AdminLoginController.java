package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminLoginController extends BaseAdminController {
	@RequestMapping(value = "login.aspx")
	public String login() {
		return "admin/login";
	}

	@RequestMapping(value = "login.do")
	public String login(String name, String password) {
		return "admin/login";
	}
}
