package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �������ﵥ����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-07-01 09:53:15.0
 */
public class TaohuaAudioReaderTrack extends TaobaoObject {

	private static final long serialVersionUID = 6325446811163717117L;

	/**
	 * ����ʱ��
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * ����ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ������������
	 */
	@ApiField("last_updated")
	private String lastUpdated;

	/**
	 * �����۸�
	 */
	@ApiField("price")
	private String price;

	/**
	 * ��������
	 */
	@ApiField("title")
	private String title;

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
