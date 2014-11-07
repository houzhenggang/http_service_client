package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ϵ�˵�ַ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-03-28 13:57:39.0
 */
public class WlbPartnerAddress extends TaobaoObject {

	private static final long serialVersionUID = 1784122982432629344L;

	/**
	 * ��ϸ��ַ
	 */
	@ApiField("address")
	private String address;

	/**
	 * ��
	 */
	@ApiField("borough")
	private String borough;

	/**
	 * ��
	 */
	@ApiField("city")
	private String city;

	/**
	 * ʡ
	 */
	@ApiField("province")
	private String province;

	/**
	 * �ʱ�
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBorough() {
		return this.borough;
	}
	public void setBorough(String borough) {
		this.borough = borough;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
