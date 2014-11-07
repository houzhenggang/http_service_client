package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������˾�������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-04-27 16:57:43.0
 */
public class LogisticsCompany extends TaobaoObject {

	private static final long serialVersionUID = 7443727747341117672L;

	/**
	 * ������˾����
	 */
	@ApiField("code")
	private String code;

	/**
	 * ������˾��ʶ
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ������˾���
	 */
	@ApiField("name")
	private String name;

	/**
	 * �˵�����֤������ʽ
	 */
	@ApiField("reg_mail_no")
	private String regMailNo;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRegMailNo() {
		return this.regMailNo;
	}
	public void setRegMailNo(String regMailNo) {
		this.regMailNo = regMailNo;
	}

}
