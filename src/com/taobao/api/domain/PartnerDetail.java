package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ������˾��ϸ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-27 16:58:27.0
 */
public class PartnerDetail extends TaobaoObject {

	private static final long serialVersionUID = 6467774385988122265L;

	/**
	 * ������˾֧�����˺�
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * ������˾����
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * ������˾id
	 */
	@ApiField("company_id")
	private Long companyId;

	/**
	 * ������˾���
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * ������˾ȫ��
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * �˵�����֤������ʽ
	 */
	@ApiField("reg_mail_no")
	private String regMailNo;

	/**
	 * ����id
	 */
	@ApiField("wangwang_id")
	private String wangwangId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Long getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRegMailNo() {
		return this.regMailNo;
	}
	public void setRegMailNo(String regMailNo) {
		this.regMailNo = regMailNo;
	}

	public String getWangwangId() {
		return this.wangwangId;
	}
	public void setWangwangId(String wangwangId) {
		this.wangwangId = wangwangId;
	}

}
