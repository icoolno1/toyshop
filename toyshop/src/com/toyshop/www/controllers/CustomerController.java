package com.toyshop.www.controllers;

import javax.servlet.http.Cookie;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.toyshop.data.entity.Member;
import com.toyshop.service.MemberService;

public class CustomerController extends BaseController {
	@Autowired
	protected MemberService memberService;

	@ModelAttribute("member")
	public Member getCurrentMember() {
		Subject user = SecurityUtils.getSubject();
		Integer id = (Integer) user.getPrincipal();
		if (user.isAuthenticated()) {
			return memberService.findMemberById(id);
		}
		return null;
	}

	@ModelAttribute("login")
	public boolean isLogin() {
		Subject user = SecurityUtils.getSubject();
		return user.isAuthenticated();
	}
}
