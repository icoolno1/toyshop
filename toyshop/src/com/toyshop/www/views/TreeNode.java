package com.toyshop.www.views;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6850191120107849557L;

	private String id;
	private String text;
	private String state;
	private CustomAttributs attributes;
	private List<TreeNode> children = new ArrayList<TreeNode>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CustomAttributs getAttributes() {
		return attributes;
	}

	public void setAttributes(CustomAttributs attributes) {
		this.attributes = attributes;
	}
}


