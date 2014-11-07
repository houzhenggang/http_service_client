package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ͼƬ����
 *
 * @author auto create
 * @since 1.0, 2011-01-11 17:50:31.0
 */
public class PictureCategory extends TaobaoObject {

	private static final long serialVersionUID = 3813685851543553991L;

	/**
	 * ͼƬ��Ŀ�Ĵ���ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ͼƬ������޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * һ�������parent_idΪ0
�����������Ϊ�丸�����picture_category_id
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * ͼƬ����ID
	 */
	@ApiField("picture_category_id")
	private Long pictureCategoryId;

	/**
	 * ͼƬ������
	 */
	@ApiField("picture_category_name")
	private String pictureCategoryName;

	/**
	 * ͼƬ��������
	 */
	@ApiField("position")
	private Long position;

	/**
	 * �����µ�ͼƬ��
	 */
	@ApiField("total")
	private Long total;

	/**
	 * ͼƬ�����ͱ�sys-fixture�������װ�޷���(ϵͳ����)��sys-auction������ͼƬ����(ϵͳ����)��user-define�����û��Զ������
	 */
	@ApiField("type")
	private String type;

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

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public String getPictureCategoryName() {
		return this.pictureCategoryName;
	}
	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
