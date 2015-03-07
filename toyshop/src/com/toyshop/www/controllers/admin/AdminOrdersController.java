package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/orders")
public class AdminOrdersController extends BaseAdminController {
	@RequestMapping("index.aspx")
	public String index() {
		return "admin/orders/index";
	}
}
