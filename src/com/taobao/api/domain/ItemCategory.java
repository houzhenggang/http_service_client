package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ��ѯ������
 *
 * @author auto create
 * @since 1.0, 2011-07-13 11:22:21.0
 */
public class ItemCategory extends TaobaoObject {

	private static final long serialVersionUID = 1842917627974764134L;

	/**
	 * ����ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ��Ʒ����
	 */
	@ApiField("count")
	private Long count;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
