package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������Ŀ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 13:32:00.0
 */
public class ShopCat extends TaobaoObject {

	private static final long serialVersionUID = 6531523916777231196L;

	/**
	 * ��Ŀ���
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ����Ŀ�Ƿ�Ϊ����Ŀ����������Ŀ�Ƿ�������Ŀ
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * ��Ŀ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����Ŀ��ţ�ע������Ŀָǰ̨��Ŀ��ֵ����0����ʾ����ĿΪһ����Ŀ��ֵ������0����ʾ����Ŀ�и���Ŀ
	 */
	@ApiField("parent_cid")
	private Long parentCid;

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

}
