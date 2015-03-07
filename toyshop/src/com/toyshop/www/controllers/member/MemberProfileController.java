package com.toyshop.www.controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.www.controllers.BaseController;

@Controller
@RequestMapping("/member")
public class MemberProfileController extends MemberController {
	@RequestMapping("profile.aspx")
	public String profile() {
		return "member/profile";
	}
}
