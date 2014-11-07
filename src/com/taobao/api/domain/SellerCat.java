package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����������Զ�����Ŀ
 *
 * @author auto create
 * @since 1.0, 2011-02-25 10:49:47.0
 */
public class SellerCat extends TaobaoObject {

	private static final long serialVersionUID = 1739411396292759196L;

	/**
	 * �����Զ�����Ŀ���
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * ����ʱ�䡣��ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �޸�ʱ�䡣��ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �����Զ�����Ŀ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * ����Ŀ��ţ�ֵ����0����ʾ����ĿΪ�����µ�һ����Ŀ��ֵ������0����ʾ����Ŀ�и���Ŀ
	 */
	@ApiField("parent_cid")
	private Long parentCid;

	/**
	 * ����ͼƬ��ַ
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ����Ŀ��ҳ���ϵ�����λ��
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * ������Ŀ���ͣ���ѡֵ��manual_type���ֶ����࣬new_type����Ʒ�ϼۣ� tree_type����������Ŀ�� ��property_type������Ҷ����Ŀ���� brand_type��Ʒ���ƹ�
	 */
	@ApiField("type")
	private String type;

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
