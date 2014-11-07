package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ý���б�
 *
 * @author auto create
 * @since 1.0, 2010-04-26 17:20:05.0
 */
public class Media extends TaobaoObject {

	private static final long serialVersionUID = 4453241421855525483L;

	/**
	 * media��url
	 */
	@ApiField("media")
	private String media;

	/**
	 * media_desc����
	 */
	@ApiField("media_desc")
	private String mediaDesc;

	/**
	 * media_link
	 */
	@ApiField("media_link")
	private String mediaLink;

	/**
	 * ��ý������
	 */
	@ApiField("media_name")
	private String mediaName;

	/**
	 * media_type
	 */
	@ApiField("media_type")
	private Long mediaType;

	public String getMedia() {
		return this.media;
	}
	public void setMedia(String media) {
		this.media = media;
	}

	public String getMediaDesc() {
		return this.mediaDesc;
	}
	public void setMediaDesc(String mediaDesc) {
		this.mediaDesc = mediaDesc;
	}

	public String getMediaLink() {
		return this.mediaLink;
	}
	public void setMediaLink(String mediaLink) {
		this.mediaLink = mediaLink;
	}

	public String getMediaName() {
		return this.mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public Long getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(Long mediaType) {
		this.mediaType = mediaType;
	}

}
