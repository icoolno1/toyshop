package com.toyshop.www.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toyshop.data.PageInfo;
import com.toyshop.data.entity.Product;
import com.toyshop.service.ProductService;
import com.toyshop.www.views.ProductData;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController extends BaseAdminController {
	@Autowired
	private ProductService service;

	@RequestMapping(value = "add.aspx", method = RequestMethod.GET)
	public String add() {

		return "admin/product/add";
	}

	@RequestMapping(value = "add.do", method = RequestMethod.POST)
	public String add(Model model, Product product) {

		return "redirect:view.aspx";
	}

	@RequestMapping(value = "edit_{id}.aspx", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable Integer id) {
		return "admin/product/add";
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list() {
		return "admin/product/list";
	}

	@RequestMapping(value = "view_{id}.aspx", method = RequestMethod.GET)
	public String view(Model model, @PathVariable Integer id) {

		return "admin/product/view";
	}

	@RequestMapping("getProducts.aspx")
	@ResponseBody
	public List<ProductData> getProducts(PageInfo pageInfo, String order) {
		return service.list(pageInfo, order);
	}
}
