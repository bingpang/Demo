package com.test;

import java.util.List;

public class Page<E> {

	// �����
	private List<E> list;
	// ��ѯ��¼��
	private int totalRecords;
	// ÿҳ����������
	private int pageSize;
	// �ڼ�ҳ
	private int pageNo;

	/**
	 * ȡ����ҳ
	 * 
	 * @return
	 */
	public int getTopPage() {
		return 1;
	}

	/**
	 * ȡ��βҳ
	 * 
	 * @return
	 */
	public int getBottomPageNo() {
		return getTotalPages();
	}

	/**
	 * ȡ����һҳ
	 * 
	 * @return
	 */
	public int getPreviousPageNo() {
		if (pageNo <= 1) {
			return 1;
		} else {
			return pageNo - 1;
		}
	}

	/**
	 * ȡ����һҳ
	 * 
	 * @return
	 */
	public int getNextPageNo() {
		if (pageNo >= getBottomPageNo()) {
			return getBottomPageNo();
		} else {
			return pageNo + 1;
		}
	}

	/**
	 * �õ��ܵ�ҳ��
	 * 
	 * @return
	 */
	public int getTotalPages() {
		return (totalRecords + pageSize - 1) / 2;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
