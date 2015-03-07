package com.toyshop.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 通讯地址
 * 
 * @author 阿标
 *
 */
@Entity
public class Address {
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne()
	private Member member;
	
	private String street;
	private String province;
	private String city;
	private String area;
}
