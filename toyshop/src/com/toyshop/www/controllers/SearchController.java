package com.toyshop.www.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.data.entity.Product;

@Controller
public class SearchController extends BaseController {
	@RequestMapping("{category}")
	public String list(Model model,@PathVariable String category) {
		model.addAttribute("c1", category);
		
		List<Product> ps = new ArrayList<Product>();
		Product p=new Product();
		p.setTitle("经典熊");
		p.setId(1);
		ps.add(p);
		p=new Product();
		p.setTitle("围巾熊");
		p.setId(1);
		ps.add(p);
		model.addAttribute("products", ps);

		return "category";
	}
	
	@RequestMapping("{category}/{subCategory}")
	public String listSub(Model model,@PathVariable String category,@PathVariable String subCategory) {
		model.addAttribute("c1", category);
		model.addAttribute("c2", subCategory);
		return "category";
	}
}
