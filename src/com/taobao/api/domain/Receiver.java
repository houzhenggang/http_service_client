package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ջ�����ϸ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-03 15:48:57.0
 */
public class Receiver extends TaobaoObject {

	private static final long serialVersionUID = 4793375799537823856L;

	/**
	 * �ջ��˵���ϸ��ַ��Ϣ
	 */
	@ApiField("address")
	private String address;

	/**
	 * �ջ��˵ĳ���
	 */
	@ApiField("city")
	private String city;

	/**
	 * ��/��
	 */
	@ApiField("district")
	private String district;

	/**
	 * �ƶ��绰��
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * �ջ���ȫ����
	 */
	@ApiField("name")
	private String name;

	/**
	 * �̶��绰��
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * �ջ�������ʡ��
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

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
