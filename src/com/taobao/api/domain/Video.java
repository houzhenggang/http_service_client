package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʒ��Ƶ������¼
 *
 * @author auto create
 * @since 1.0, 2010-04-21 17:39:44.0
 */
public class Video extends TaobaoObject {

	private static final long serialVersionUID = 3819831998925451965L;

	/**
	 * ��Ƶ������¼����ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��Ƶ������¼��id������Ʒ���Ӧ
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ��Ƶ��¼��������Ʒ������id(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ��Ƶ������¼�޸�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ƶ��¼����������Ʒ������id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * video��url���ӵ�ַ����������Ƶ��¼����洢��url��ַ
	 */
	@ApiField("url")
	private String url;

	/**
	 * video��id����Ӧ����Ƶ������Ĵ洢��¼
	 */
	@ApiField("video_id")
	private Long videoId;

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

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

}
