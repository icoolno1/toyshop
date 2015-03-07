package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminIndexController extends BaseAdminController {
	@RequestMapping("")
	public String index() {
		return "admin/index";
	}
}
