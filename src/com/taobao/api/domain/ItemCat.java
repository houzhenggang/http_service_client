package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ��Ŀ�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 14:10:52.0
 */
public class ItemCat extends TaobaoObject {

	private static final long serialVersionUID = 8291282257819926396L;

	/**
	 * ��Ʒ������ĿID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ����Ŀ�Ƿ�Ϊ����Ŀ(��������Ŀ�Ƿ�������Ŀ)
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * ��Ŀ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����ĿID=0ʱ���������һ������Ŀ
	 */
	@ApiField("parent_cid")
	private Long parentCid;

	/**
	 * ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * ״̬����ѡֵ:normal(����),deleted(ɾ��)
	 */
	@ApiField("status")
	private String status;

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentCid() {
		return this.parentCid;
	}
	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
