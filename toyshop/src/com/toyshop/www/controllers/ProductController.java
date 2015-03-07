package com.toyshop.www.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.data.entity.Product;
import com.toyshop.service.ProductService;
import com.toyshop.www.views.SearchView;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {
	@Autowired
	private ProductService service;

	@RequestMapping("{id}")
	public String detail(Model model, @PathVariable Integer id) {
		
		return "product/detail";
	}

	@RequestMapping("search")
	public String search(Model model, SearchView v) {
		if (StringUtils.isEmpty(v.getKeyword())) {
			return "product/index";
		}
		List<Product> products = service.search(v.getKeyword());
		v.setResults(products);
		model.addAttribute("view", v);
		return "product/list";
	}

}
