package com.toyshop.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController extends BaseController {
	@RequestMapping("order")
	public String order() {
		return "order";
	}
}
