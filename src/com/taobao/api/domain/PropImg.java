package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ����ͼƬ�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 13:41:43.0
 */
public class PropImg extends TaobaoObject {

	private static final long serialVersionUID = 6753991611693641332L;

	/**
	 * ͼƬ����ʱ�� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ����ͼƬ��id������Ʒ���Ӧ
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ͼƬ���ڵڼ��ţ���ͼʱ�����ã�
	 */
	@ApiField("position")
	private Long position;

	/**
	 * ͼƬ����Ӧ��������ϵ��ַ���
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * ͼƬ���ӵ�ַ
	 */
	@ApiField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
