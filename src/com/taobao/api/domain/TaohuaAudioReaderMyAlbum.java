package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ҹ������������ר��
 *
 * @author auto create
 * @since 1.0, 2011-06-13 13:04:52.0
 */
public class TaohuaAudioReaderMyAlbum extends TaobaoObject {

	private static final long serialVersionUID = 5363165975976616183L;

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
	 * ר�����ѹ���ĵ�������
	 */
	@ApiField("my_track_count")
	private Long myTrackCount;

	/**
	 * ר������ͼƬurl
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * ����ר��������ID
	 */
	@ApiField("serial_id")
	private Long serialId;

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
	 * ר���ڵĵ�������
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

	public Long getMyTrackCount() {
		return this.myTrackCount;
	}
	public void setMyTrackCount(Long myTrackCount) {
		this.myTrackCount = myTrackCount;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getSerialId() {
		return this.serialId;
	}
	public void setSerialId(Long serialId) {
		this.serialId = serialId;
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
