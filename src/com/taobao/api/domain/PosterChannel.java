package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����Ƶ���ṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-21 13:03:52.0
 */
public class PosterChannel extends TaobaoObject {

	private static final long serialVersionUID = 8463422654295411251L;

	/**
	 * Ƶ�����������ơ�
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * Ƶ����˵����
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * Ƶ��ID�š�
	 */
	@ApiField("id")
	private String id;

	/**
	 * Ƶ�����ơ�
	 */
	@ApiField("name")
	private String name;

	/**
	 * �Ա�Ƶ�����ӵ�ַ��
	 */
	@ApiField("url")
	private String url;

	/**
	 * �ֻ�������ӦƵ��ҳ������
	 */
	@ApiField("wapurl")
	private String wapurl;

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getWapurl() {
		return this.wapurl;
	}
	public void setWapurl(String wapurl) {
		this.wapurl = wapurl;
	}

}
