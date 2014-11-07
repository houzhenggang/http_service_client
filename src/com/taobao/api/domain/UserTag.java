package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ⱥ��ǩ
 *
 * @author auto create
 * @since 1.0, 2010-10-19 15:54:39.0
 */
public class UserTag extends TaobaoObject {

	private static final long serialVersionUID = 2261225441361215724L;

	/**
	 * ����ʱ��
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * ��ǩ����
	 */
	@ApiField("description")
	private String description;

	/**
	 * ��ǩID
	 */
	@ApiField("tag_id")
	private Long tagId;

	/**
	 * ��ǩ����
	 */
	@ApiField("tag_name")
	private String tagName;

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTagId() {
		return this.tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
