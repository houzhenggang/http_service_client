package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի���Ŀ����
 *
 * @author auto create
 * @since 1.0, 2011-01-21 12:47:54.0
 */
public class TaohuaCategory extends TaobaoObject {

	private static final long serialVersionUID = 4768354756239839392L;

	/**
	 * ��ĿID
	 */
	@ApiField("cate_id")
	private Long cateId;

	/**
	 * ��Ŀ�㼶
	 */
	@ApiField("cate_level")
	private Long cateLevel;

	/**
	 * ��Ŀ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����ĿID
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * ����ֵ
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	public Long getCateId() {
		return this.cateId;
	}
	public void setCateId(Long cateId) {
		this.cateId = cateId;
	}

	public Long getCateLevel() {
		return this.cateLevel;
	}
	public void setCateLevel(Long cateLevel) {
		this.cateLevel = cateLevel;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

}
