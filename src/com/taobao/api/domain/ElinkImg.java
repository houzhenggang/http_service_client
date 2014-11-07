package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * E��ͨ��ƷͼƬ���ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-06-09 09:55:05.0
 */
public class ElinkImg extends TaobaoObject {

	private static final long serialVersionUID = 5431667839334948794L;

	/**
	 * ͼƬ����ʱ�� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��ƷͼƬ��id������Ʒ���Ӧ
	 */
	@ApiField("itemimg_id")
	private Long itemimgId;

	/**
	 * ͼƬ���ڵڼ���
	 */
	@ApiField("position")
	private Long position;

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

	public Long getItemimgId() {
		return this.itemimgId;
	}
	public void setItemimgId(Long itemimgId) {
		this.itemimgId = itemimgId;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
