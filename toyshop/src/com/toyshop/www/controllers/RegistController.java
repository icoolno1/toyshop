package com.toyshop.www.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toyshop.service.MemberService;
import com.toyshop.www.views.RegistView;

@Controller
public class RegistController {
	@Autowired
	private MemberService service;

	@RequestMapping(value = "reg", method = RequestMethod.GET)
	public String regist(Model model) {
		RegistView viewData = new RegistView();
		model.addAttribute("viewData", viewData);
		return "reg";
	}

	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public String regist(Model model, RegistView viewData) {
		model.addAttribute("viewData", viewData);
		if (service.reg(viewData.getMember()))
			return "reg_sucess";
		return "reg";
	}
}
