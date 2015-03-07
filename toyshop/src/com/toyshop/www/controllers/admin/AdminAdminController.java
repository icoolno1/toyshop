package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/employee")
public class AdminAdminController extends BaseAdminController {

	public String add(){
		request.getServletPath();
		return "admin/admin/add";
	}
	
	public String edit(){
		return "admin/adin/edit";
	}
	
	@RequestMapping("")
	public String list(){
		return "admin/employee/index";
	}
}
