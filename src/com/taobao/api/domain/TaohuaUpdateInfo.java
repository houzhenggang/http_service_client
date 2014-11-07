package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ի��ն�����汾������Ϣ�ӿ�
 *
 * @author auto create
 * @since 1.0, 2011-01-21 12:47:22.0
 */
public class TaohuaUpdateInfo extends TaobaoObject {

	private static final long serialVersionUID = 6452491966926158223L;

	/**
	 * ��ʾ��Ϣ
	 */
	@ApiField("message")
	private String message;

	/**
	 * �������ص�ַ
	 */
	@ApiField("url")
	private String url;

	/**
	 * �汾��
	 */
	@ApiField("version")
	private String version;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
