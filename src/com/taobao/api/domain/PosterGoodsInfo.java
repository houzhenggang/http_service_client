package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���Ӧ�������������Ʒ����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-31 11:23:50.0
 */
public class PosterGoodsInfo extends TaobaoObject {

	private static final long serialVersionUID = 8851211246674575779L;

	/**
	 * ��Ʒ������Ϣ
	 */
	@ApiField("note")
	private String note;

	/**
	 * ��Ʒid
	 */
	@ApiField("num_id")
	private Long numId;

	/**
	 * ͼƬid
	 */
	@ApiField("pic_id")
	private Long picId;

	/**
	 * ����id
	 */
	@ApiField("poster_id")
	private Long posterId;

	/**
	 * ��Ʒ�۸�
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��Ʒ�̱���
	 */
	@ApiField("short_title")
	private String shortTitle;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * �ֻ�����Ӧ�����ַ
	 */
	@ApiField("url")
	private String url;

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public Long getNumId() {
		return this.numId;
	}
	public void setNumId(Long numId) {
		this.numId = numId;
	}

	public Long getPicId() {
		return this.picId;
	}
	public void setPicId(Long picId) {
		this.picId = picId;
	}

	public Long getPosterId() {
		return this.posterId;
	}
	public void setPosterId(Long posterId) {
		this.posterId = posterId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getShortTitle() {
		return this.shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
