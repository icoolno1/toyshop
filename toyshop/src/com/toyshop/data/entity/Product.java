package com.toyshop.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

@Entity
@Indexed
public class Product {

	private String thumbnail;
	@Transient
	private int amount;	
	@ManyToOne
	private Brand brand;
	@Transient
	private Category category;
	@Transient
	private int color;
	@Transient
	private String comment;
	@Transient
	private String description;
	@Transient
	private float exspresscharge;
	@Id
	@GeneratedValue
	private Integer id;
	@Transient
	private String images;
	@Transient
	private Float price;
	@Transient
	private Date produced;
	@Transient
	private int saledAmount;
	@Transient
	private String size;
	@Transient
	private String specify;
	@Transient
	private String supplyer;
	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	private String title;
	private String subTitle;
	@Transient
	private String video;
	@Transient
	private float weight;

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
