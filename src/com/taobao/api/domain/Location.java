package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �û���ַ
 *
 * @author auto create
 * @since 1.0, 2010-07-01 14:12:59.0
 */
public class Location extends TaobaoObject {

	private static final long serialVersionUID = 7338782855195275789L;

	/**
	 * ��ϸ��ַ�����256���ֽڣ�128�����ģ�
	 */
	@ApiField("address")
	private String address;

	/**
	 * ���ڳ��У��������ƣ�
	 */
	@ApiField("city")
	private String city;

	/**
	 * ��������
	 */
	@ApiField("country")
	private String country;

	/**
	 * ��/�أ�ֻ����������API��
	 */
	@ApiField("district")
	private String district;

	/**
	 * ����ʡ�ݣ��������ƣ�
	 */
	@ApiField("state")
	private String state;

	/**
	 * ��������
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
