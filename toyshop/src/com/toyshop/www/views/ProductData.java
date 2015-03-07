package com.toyshop.www.views;

import java.io.Serializable;
import java.util.Date;

public class ProductData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 596104392994466489L;
	private Integer id;
	private Date publishTime;
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
