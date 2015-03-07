package com.toyshop.www.controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.www.controllers.BaseController;

@Controller
@RequestMapping("/member")
public class MemberIndexController extends MemberController {
	@RequestMapping("")
	public String index() {
		return "member/index";
	}
}
