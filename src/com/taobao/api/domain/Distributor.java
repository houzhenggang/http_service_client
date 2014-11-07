package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ����API�������ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-06-09 14:12:58.0
 */
public class Distributor extends TaobaoObject {

	private static final long serialVersionUID = 7846691457273584853L;

	/**
	 * �����̵�֧�����ʻ�
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * �����̵��Ա���������
	 */
	@ApiField("appraise")
	private Long appraise;

	/**
	 * �����̵�����Ӫ��Ŀ
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * ��ϵ��
	 */
	@ApiField("contact_person")
	private String contactPerson;

	/**
	 * �����̴���ʱ�� ʱ���ʽ��yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ������Id
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * ����������
	 */
	@ApiField("distributor_name")
	private String distributorName;

	/**
	 * �����̵�email
	 */
	@ApiField("email")
	private String email;

	/**
	 * �����̵���ʵ��������֤����
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * ���̵ȼ�
	 */
	@ApiField("level")
	private Long level;

	/**
	 * �����̵��ֻ���
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * �����̵ĵ绰
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * �����̵���������
	 */
	@ApiField("shop_web_link")
	private String shopWebLink;

	/**
	 * ���������ҵĿ���ʱ��
	 */
	@ApiField("starts")
	private Date starts;

	/**
	 * ������ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public Long getAppraise() {
		return this.appraise;
	}
	public void setAppraise(Long appraise) {
		this.appraise = appraise;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return this.distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopWebLink() {
		return this.shopWebLink;
	}
	public void setShopWebLink(String shopWebLink) {
		this.shopWebLink = shopWebLink;
	}

	public Date getStarts() {
		return this.starts;
	}
	public void setStarts(Date starts) {
		this.starts = starts;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
