package com.toyshop.www.controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.www.controllers.BaseController;

@Controller
@RequestMapping("/member")
public class MemberFavoriteController extends MemberController {
	@RequestMapping("favorite.aspx")
	public String favorite() {
		return "member/favorite";
	}
}
