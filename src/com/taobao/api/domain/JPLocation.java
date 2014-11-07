package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ʊ�����û���ַ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-10-28 18:07:53.0
 */
public class JPLocation extends TaobaoObject {

	private static final long serialVersionUID = 5547962748699592812L;

	/**
	 * ��Ʊ�����������͵�ַ��Ϣ
	 */
	@ApiField("city")
	private String city;

	/**
	 * ��Ʊ�����������ͣ���ַ��Ϣ�ʱ�
	 */
	@ApiField("zip")
	private String zip;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
