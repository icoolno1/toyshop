package com.toyshop.www.controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberOrderController extends MemberController {
	@RequestMapping("order")
	public String order() {
		return "member/order";
	}
	
	@RequestMapping("order/{id}")
	public String detail(){
		return "member/orderDetail";
	}
}
