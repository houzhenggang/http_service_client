package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���Ҷ����ķ���
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:45:59.0
 */
public class WlbSellerSubscription extends TaobaoObject {

	private static final long serialVersionUID = 6698874761561885212L;

	/**
	 * ������Ч��������
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * ����ʱ��
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * ����ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ������ID
��ͨ�����ֶ�����֮�������¼���ϵ��
�������˲ִ�����������TMS����
���ֶα���ִ�����ID��
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * ������ID
	 */
	@ApiField("provider_user_id")
	private Long providerUserId;

	/**
	 * ��ע
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * �������
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * ����ID
	 */
	@ApiField("service_id")
	private Long serviceId;

	/**
	 * ������
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * �������ͣ�
STORE 1-�ִ���
TMS 2-TMS��
PACKAGE 3-��װ����
SUPPLIER 4-����
INSTALL 5-��װ
COMPLEX_SERVICE 100-�ۺϷ���
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * ������Ч��ʼ����
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * ״̬
AUDITING 1-�����
CANCEL 2-����
CHECKED 3-���ͨ��
FAILED 4-���δͨ��
SYNCHRONIZING 5-ͬ����
	 */
	@ApiField("status")
	private String status;

	/**
	 * �����û�ID
	 */
	@ApiField("subscriber_user_id")
	private Long subscriberUserId;

	/**
	 * �����û�NICK
	 */
	@ApiField("subscriber_user_nick")
	private String subscriberUserNick;

	/**
	 * ��ϵ�˵�ַ��Ϣ
	 */
	@ApiField("wlb_partner_address")
	private WlbPartnerAddress wlbPartnerAddress;

	/**
	 * ��ϵ����ϵ����
	 */
	@ApiField("wlb_partner_contact")
	private WlbPartnerContact wlbPartnerContact;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getProviderUserId() {
		return this.providerUserId;
	}
	public void setProviderUserId(Long providerUserId) {
		this.providerUserId = providerUserId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Long getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSubscriberUserId() {
		return this.subscriberUserId;
	}
	public void setSubscriberUserId(Long subscriberUserId) {
		this.subscriberUserId = subscriberUserId;
	}

	public String getSubscriberUserNick() {
		return this.subscriberUserNick;
	}
	public void setSubscriberUserNick(String subscriberUserNick) {
		this.subscriberUserNick = subscriberUserNick;
	}

	public WlbPartnerAddress getWlbPartnerAddress() {
		return this.wlbPartnerAddress;
	}
	public void setWlbPartnerAddress(WlbPartnerAddress wlbPartnerAddress) {
		this.wlbPartnerAddress = wlbPartnerAddress;
	}

	public WlbPartnerContact getWlbPartnerContact() {
		return this.wlbPartnerContact;
	}
	public void setWlbPartnerContact(WlbPartnerContact wlbPartnerContact) {
		this.wlbPartnerContact = wlbPartnerContact;
	}

}
