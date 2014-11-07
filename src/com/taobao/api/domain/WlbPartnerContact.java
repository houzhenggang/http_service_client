package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ϵ����ϵ����
 *
 * @author auto create
 * @since 1.0, 2011-03-24 16:26:51.0
 */
public class WlbPartnerContact extends TaobaoObject {

	private static final long serialVersionUID = 1373346144959251289L;

	/**
	 * �ֿ���ϵ������
	 */
	@ApiField("name")
	private String name;

	/**
	 * ��ϵ�绰
	 */
	@ApiField("phone")
	private String phone;

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

}
