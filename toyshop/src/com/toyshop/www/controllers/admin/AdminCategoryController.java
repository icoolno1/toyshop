package com.toyshop.www.controllers.admin;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toyshop.data.entity.Category;
import com.toyshop.service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class AdminCategoryController extends BaseAdminController {
	@Autowired
	private CategoryService service;

	@RequestMapping("")
	public String list(Model model) {
		model.addAttribute("categorys", service.listRootCategorys());
		return "admin/category/list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addView() {
		return "admin/category/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(String name) {
		Category c = new Category();
		c.setName(name);
		service.add(c);
		return "admin/category/add";
	}

	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public String editView(@PathVariable Integer id) {
		return "admin/category/edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(@PathVariable Integer id) {
		return "admin/category/edit/{id}";
	}

	@RequestMapping("delete/{id}")
	public void delete(@PathVariable Integer id, HttpServletResponse response) {
		service.delete(id);
		
	}
}
