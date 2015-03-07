package com.toyshop.www.views;

import com.toyshop.data.entity.Member;

public class RegistView {
	private String error;
	private Member member=new Member();
	private String email;
	private String password;
	private String confirm;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public Member getMember() {
		member.setEmail(email);
		member.setPassword(password);
		return member;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


}
