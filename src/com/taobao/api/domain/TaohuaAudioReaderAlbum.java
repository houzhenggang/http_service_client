package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������ר����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-05-30 13:12:25.0
 */
public class TaohuaAudioReaderAlbum extends TaobaoObject {

	private static final long serialVersionUID = 3388471568429163432L;

	/**
	 * ����Ա����
	 */
	@ApiField("artist_name")
	private String artistName;

	/**
	 * ����
	 */
	@ApiField("bit_rate")
	private String bitRate;

	/**
	 * ��Ȩ����
	 */
	@ApiField("copyright")
	private String copyright;

	/**
	 * ר�����
	 */
	@ApiField("description")
	private String description;

	/**
	 * ʱ��
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * ��ʽ
	 */
	@ApiField("format")
	private String format;

	/**
	 * ר��ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ר������������
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
	 * ר��״̬
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

	public String getArtistName() {
		return this.artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getBitRate() {
		return this.bitRate;
	}
	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	public String getCopyright() {
		return this.copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
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
