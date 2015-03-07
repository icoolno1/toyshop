package com.toyshop.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toyshop.data.PageInfo;
import com.toyshop.data.dao.ProductDao;
import com.toyshop.data.entity.Product;
import com.toyshop.www.views.ProductData;

@Service
public class ProductService {
	@Resource
	ProductDao dao;

	public void add(Product product) {
		dao.insert(product);
	}

	public List<Product> search(String keyword) {
		return dao.search(keyword);
	}

	public Product findById(Integer id) {
		return dao.get(id);
	}

	public List<ProductData> list(PageInfo pageInfo, String order) {
		List<Product> ls = dao.list(pageInfo);

		List<ProductData> data = new ArrayList<ProductData>();
		for (Product p : ls) {
			ProductData d=new ProductData();
			d.setId(p.getId());
			d.setTitle(p.getTitle());
			data.add(d);
		}
		return data;
	}
}
