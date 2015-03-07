package com.toyshop.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pay")
public class PayController extends BaseController {
	@RequestMapping("")
	public String pay(){
		return "pay";
	}
	
	public String alipay() {
		return "pay/alipay";
	}
	
	@RequestMapping("alipay/notify")
	public String result(){
		return "";
	}
}
