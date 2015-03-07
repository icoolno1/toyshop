package com.toyshop.www.controllers.admin;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.toyshop.www.controllers.BaseController;

public class BaseAdminController extends BaseController {
	@ModelAttribute("adminCtxPath")
	public String getAdminCtxPath() {
		return request.getContextPath() + "/admin";
	}
}
