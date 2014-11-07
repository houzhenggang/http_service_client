package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������ר��ժҪ
 *
 * @author auto create
 * @since 1.0, 2011-05-30 13:15:14.0
 */
public class TaohuaAudioReaderAlbumSummary extends TaobaoObject {

	private static final long serialVersionUID = 6263493487692658148L;

	/**
	 * ��Ȩ����
	 */
	@ApiField("copyright")
	private String copyright;

	/**
	 * ר��ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����������
	 */
	@ApiField("last_updated")
	private String lastUpdated;

	/**
	 * ר������ͼƬurl
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * �۸�
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��Ʒ״̬
	 */
	@ApiField("status")
	private String status;

	/**
	 * ר������
	 */
	@ApiField("title")
	private String title;

	/**
	 * ����
	 */
	@ApiField("track_count")
	private Long trackCount;

	public String getCopyright() {
		return this.copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLastUpdated() {
		return this.lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTrackCount() {
		return this.trackCount;
	}
	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}

}
