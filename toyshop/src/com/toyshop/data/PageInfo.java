package com.toyshop.data;

/**
 * 分页补助类
 * @author Administrator
 *
 */
public class PageInfo {
	private Integer pageSize = 20;
	private Integer pageCount = 0;
	private Integer currentPage = 1;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
}
