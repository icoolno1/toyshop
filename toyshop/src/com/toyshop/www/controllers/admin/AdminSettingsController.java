package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/settings")
public class AdminSettingsController extends BaseAdminController {
	@RequestMapping("")
	public String list(){
		return "admin/settings/index";
	}
}
