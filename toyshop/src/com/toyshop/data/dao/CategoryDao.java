package com.toyshop.data.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.toyshop.data.entity.Category;
@Repository
public class CategoryDao extends BaseDao<Category> {
	

	public List<Category> listRoot() {
		Query q = this.getEntityManager().createQuery("from Category");
		return q.getResultList();
	}
}
