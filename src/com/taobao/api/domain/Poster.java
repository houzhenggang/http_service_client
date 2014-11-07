package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �����ṹ
 *
 * @author auto create
 * @since 1.0, 2010-04-21 17:28:05.0
 */
public class Poster extends TaobaoObject {

	private static final long serialVersionUID = 7328977778165429958L;

	/**
	 * ��������Ƶ��id��
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * ����·�����ɶ���(',')�ֿ������2��
	 */
	@ApiField("cover_urls")
	private String coverUrls;

	/**
	 * ����ʱ�䡣
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �����ĵ��������
	 */
	@ApiField("hits")
	private Long hits;

	/**
	 * ����ID��
	 */
	@ApiField("id")
	private String id;

	/**
	 * �޸�ʱ�䡣
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ͼƬ�̱��⡣
	 */
	@ApiField("short_title")
	private String shortTitle;

	/**
	 * ������ر�ǩ���ɶ���(',')�ֿ������5����
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * ͼƬ���⡣
	 */
	@ApiField("title")
	private String title;

	/**
	 * Ȩ�ء�-1 �� 10 ��10Ϊ��ߡ�
	 */
	@ApiField("weight")
	private Long weight;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCoverUrls() {
		return this.coverUrls;
	}
	public void setCoverUrls(String coverUrls) {
		this.coverUrls = coverUrls;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getHits() {
		return this.hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
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

	public String getShortTitle() {
		return this.shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
