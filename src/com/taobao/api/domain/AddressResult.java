package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ַ�ⷵ��������Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-28 17:37:32.0
 */
public class AddressResult extends TaobaoObject {

	private static final long serialVersionUID = 5414381121526669415L;

	/**
	 * ��ϸ�ֵ���ַ������Ҫ�ظ���дʡ/��/��
	 */
	@ApiField("addr")
	private String addr;

	/**
	 * ����ID
	 */
	@ApiField("area_id")
	private Long areaId;

	/**
	 * �Ƿ�Ĭ���˻���ַ
	 */
	@ApiField("cancel_def")
	private Boolean cancelDef;

	/**
	 * ��
	 */
	@ApiField("city")
	private String city;

	/**
	 * ��ַ��ID
	 */
	@ApiField("contact_id")
	private Long contactId;

	/**
	 * ��ϵ������
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * ������
	 */
	@ApiField("country")
	private String country;

	/**
	 * �Ƿ�Ĭ��ȡ����ַ
	 */
	@ApiField("get_def")
	private Boolean getDef;

	/**
	 * ��ע
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * �ֻ����룬�ֻ���绰������һ�� 
�ֻ����벻�ܳ���20λ
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * �޸�����ʱ��
	 */
	@ApiField("modify_date")
	private Date modifyDate;

	/**
	 * �绰����,�ֻ���绰������һ��
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * ʡ
	 */
	@ApiField("province")
	private String province;

	/**
	 * ��˾����,
	 */
	@ApiField("seller_company")
	private String sellerCompany;

	/**
	 * �Ƿ�Ĭ�Ϸ�����ַ
	 */
	@ApiField("send_def")
	private Boolean sendDef;

	/**
	 * ������������
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getAreaId() {
		return this.areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Boolean getCancelDef() {
		return this.cancelDef;
	}
	public void setCancelDef(Boolean cancelDef) {
		this.cancelDef = cancelDef;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getContactId() {
		return this.contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getGetDef() {
		return this.getDef;
	}
	public void setGetDef(Boolean getDef) {
		this.getDef = getDef;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSellerCompany() {
		return this.sellerCompany;
	}
	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}

	public Boolean getSendDef() {
		return this.sendDef;
	}
	public void setSendDef(Boolean sendDef) {
		this.sendDef = sendDef;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
