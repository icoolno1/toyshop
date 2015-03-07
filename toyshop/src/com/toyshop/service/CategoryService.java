package com.toyshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyshop.data.dao.CategoryDao;
import com.toyshop.data.entity.Category;

@Service
public class CategoryService {
	@Autowired
	private CategoryDao dao;

	public List<Category> listRootCategorys() {
		
		return dao.listRoot();
	}
	
	public void add(Category category){
		dao.insert(category);
	}

	public void delete(Integer id) {
		Category c=new Category();
		c.setId(id);
		dao.delete(c);
	}
}
