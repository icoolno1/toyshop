package com.toyshop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toyshop.data.dao.MemberDao;
import com.toyshop.data.entity.Member;

@Service
public class MemberService {
	@Resource
	MemberDao dao;

	public boolean reg(Member member) {
		dao.insert(member);
		return false;
	}

	public Member auth(String email, String password) {
		return dao.findByEmail(email);
	}

	public Member findMemberById(Integer memberId) {
		return dao.get(memberId);
	}
}
