package com.toyshop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toyshop.data.dao.CartDao;
import com.toyshop.data.entity.Cart;

@Service
public class CartService {
	@Resource
	CartDao dao;

	public Cart findCartByMemberId(Integer memberId) {
		Cart cart = dao.findByUserId(memberId);
		if (cart == null) {
			cart = new Cart();
			dao.insert(cart);
		}
		return cart;
	}
}
