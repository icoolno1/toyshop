package com.toyshop.www.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/order")
public class AdminOrderController extends BaseAdminController {
	@RequestMapping("")
	public String index() {
		return "admin/orders/index";
	}
}
