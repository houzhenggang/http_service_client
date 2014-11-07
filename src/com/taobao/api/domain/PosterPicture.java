package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����ͼƬ�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-21 17:28:33.0
 */
public class PosterPicture extends TaobaoObject {

	private static final long serialVersionUID = 6423171919474243687L;

	/**
	 * ����ʱ�䡣
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ���˵����
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * ͼƬID��
	 */
	@ApiField("id")
	private String id;

	/**
	 * �޸�ʱ�䡣
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ����ID��
	 */
	@ApiField("poster_id")
	private String posterId;

	/**
	 * ͼƬ��ַ��
	 */
	@ApiField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getPosterId() {
		return this.posterId;
	}
	public void setPosterId(String posterId) {
		this.posterId = posterId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
