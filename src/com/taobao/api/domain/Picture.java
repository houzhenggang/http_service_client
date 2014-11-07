package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ͼƬ
 *
 * @author auto create
 * @since 1.0, 2010-08-23 19:47:26.0
 */
public class Picture extends TaobaoObject {

	private static final long serialVersionUID = 8712191396861661921L;

	/**
	 * ͼƬ�Ĵ���ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ͼƬ�Ƿ�ɾ���ı��
	 */
	@ApiField("deleted")
	private String deleted;

	/**
	 * �ϴ�ʱ��
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * ͼƬ���޸�ʱ��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ͼƬ����ID
	 */
	@ApiField("picture_category_id")
	private Long pictureCategoryId;

	/**
	 * ͼƬID
	 */
	@ApiField("picture_id")
	private Long pictureId;

	/**
	 * ���ص��Ǿ���·���磺http://img07.taobaocdn.com/imgextra/i7/22670458/T2dD0kXb4cXXXXXXXX_!!22670458.jpg
	 */
	@ApiField("picture_path")
	private String picturePath;

	/**
	 * ͼƬ����,��ʽ:��x����450x150
	 */
	@ApiField("pixel")
	private String pixel;

	/**
	 * ͼƬ��С,bite��λ
	 */
	@ApiField("sizes")
	private Long sizes;

	/**
	 * ͼƬ״̬,unfroze����û�б����ᣬfroze��������,pass�����Ų�ͨ��
	 */
	@ApiField("status")
	private String status;

	/**
	 * �Ƿ�ɾ��
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * ͼƬ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * ����ID
	 */
	@ApiField("uid")
	private Long uid;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDeleted() {
		return this.deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicturePath() {
		return this.picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getPixel() {
		return this.pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public Long getSizes() {
		return this.sizes;
	}
	public void setSizes(Long sizes) {
		this.sizes = sizes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUid() {
		return this.uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}

}
