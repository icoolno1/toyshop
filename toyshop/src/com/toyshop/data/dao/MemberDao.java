package com.toyshop.data.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.toyshop.data.entity.Member;

@Repository
public class MemberDao extends BaseDao<Member> {
	
	public Member findByEmail(String email) {
		Query q = this.getEntityManager().createQuery("from Member where email=?");
		q.setParameter(0, email);
		return (Member) q.getSingleResult();         
	}
}
