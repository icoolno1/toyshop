package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController extends BaseAdminController {
	@RequestMapping("")
	public String list() {
		return "admin/member/index";
	}
}
