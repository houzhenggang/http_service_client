package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 联系人联系详情
 *
 * @author auto create
 * @since 1.0, 2011-03-24 16:26:51.0
 */
public class WlbPartnerContact extends TaobaoObject {

	private static final long serialVersionUID = 1373346144959251289L;

	/**
	 * 仓库联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系电话
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
