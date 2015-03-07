package com.toyshop.data.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.toyshop.data.entity.Cart;

@Repository
public class CartDao extends BaseDao<Cart> {

	public void insert(Cart cart) {
		super.insert(cart);
	}

	public Cart get(Integer memberId) {
		return  super.get(memberId);
	}

	public Cart findByUserId(Integer memberId) {
		Query q = this.getEntityManager().createQuery(
				"from Cart c where c.member.id=?");
		q.setParameter(0, memberId);
		return (Cart) q.getSingleResult();
	}

}
