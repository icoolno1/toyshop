package com.toyshop.www.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.service.CategoryService;

@Controller
public class IndexController extends BaseController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("rootCategorys",categoryService.listRootCategorys());
		return "index";
	}
}
