package com.toyshop.www.views;

import java.util.ArrayList;
import java.util.List;

import com.toyshop.data.PageInfo;
import com.toyshop.data.entity.Product;

public class SearchView {
	private PageInfo pageInfo = new PageInfo();
	private String keyword=null;
	private String orderBy = "addtime";
	private Integer currentPage = 1;

	private List<Product> results = new ArrayList<Product>();

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Product> getResults() {
		return results;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setResults(List<Product> results) {
		this.results = results;
	}

}
