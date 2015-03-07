package com.toyshop.www.controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.www.controllers.BaseController;

@Controller
@RequestMapping("/member")
public class MemberAddressController extends MemberController {
	@RequestMapping("address.aspx")
	public String favorite() {
		return "member/address";
	}
}
