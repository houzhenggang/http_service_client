package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��������������
 *
 * @author auto create
 * @since 1.0, 2011-04-22 14:46:49.0
 */
public class WlbOrder extends TaobaoObject {

	private static final long serialVersionUID = 6653236725796985819L;

	/**
	 * ���nick
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ����ȡ��״̬��
1-ȡ���У� 
2-ȡ��ʧ�ܣ�
3-ȡ�����
	 */
	@ApiField("cancel_order_status")
	private Long cancelOrderStatus;

	/**
	 * ȷ��״̬��
(1)����Ҫȷ�ϣ�NO_NEED_CONFIRM
(2)�ȴ�ȷ�ϣ�WAIT_CONFIRM
(3)��ȷ��:CONFIRMED
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * �ƻ��ʹ����ʱ��
	 */
	@ApiField("expect_end_time")
	private Date expectEndTime;

	/**
	 * �ƻ��ʹ￪ʼʱ��
	 */
	@ApiField("expect_start_time")
	private Date expectStartTime;

	/**
	 * ��Ʊ��Ϣ
	 */
	@ApiField("invoice_info")
	private String invoiceInfo;

	/**
	 * �����������е���Ʒ��������
	 */
	@ApiField("item_kinds_count")
	private Long itemKindsCount;

	/**
	 * ���������⣬IN��ʾ��⣬OUT��ʾ����
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * ��������
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * ��1λ:COD,2:��ʱ����,3:Ԥ��,4:��Ҫ��Ʊ,5:��Ͷ��,��6λ:�ϵ�,��7λ:�� ��8λ��EXCHANGE-������ ��9λ:VISIT-���� �� ��10λ: MODIFYTRANSPORT-�Ƿ�ɸ����ͷ�ʽ����11λ���Ƿ���������ȷ�Ϸ���
	 */
	@ApiField("order_flag")
	private Long orderFlag;

	/**
	 * ������Դ:
��������������ԭ�򣬱���:

������Դ:1:TAOBAO;2:EXT;3:ERP;4:WMS
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * ��Ӧ��������������top�ӿ��еĵ�out_biz_code�ֶΣ���Ҫ������ȥ����
	 */
	@ApiField("order_source_code")
	private String orderSourceCode;

	/**
	 * ����״̬��
�����Ѵ�����0
������ȡ��: -1
�����ر�:-3
�·���: 10
���·�: 11
���շ���ǩ :-100
�ѷ���:100
ǩ�ճɹ�:200
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * ����ȡ��,�ֿ�ȡ����ʶ
	 */
	@ApiField("order_status_reason")
	private String orderStatusReason;

	/**
	 * (1)����:    OTHER
(2)�Ա�����: TAOBAO
(3)301:����: ALLOCATION
(4)401:�̵�:CHECK
(5)501:���۲ɹ�:PRUCHASE
	 */
	@ApiField("order_sub_type")
	private String orderSubType;

	/**
	 * 1:��������: NARMAL
2:�˻�����: RETURN
3:��������: CHANGE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * ԭ��������
	 */
	@ApiField("prev_order_code")
	private String prevOrderCode;

	/**
	 * ʵ��������������
	 */
	@ApiField("real_kinds_count")
	private Long realKindsCount;

	/**
	 * Ӧ�ս��
	 */
	@ApiField("receivable_amount")
	private Long receivableAmount;

	/**
	 * �ռ��˾����ַ
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * ��������
	 */
	@ApiField("receiver_area")
	private String receiverArea;

	/**
	 * �ռ��˳���
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * �����˵�������
	 */
	@ApiField("receiver_mail")
	private String receiverMail;

	/**
	 * �������ֻ�����
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * ����������
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * �����˹̶��绰
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * �ռ���ʡ��
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * ����������
	 */
	@ApiField("receiver_wangwang")
	private String receiverWangwang;

	/**
	 * �ռ����ʱ�
	 */
	@ApiField("receiver_zip_code")
	private String receiverZipCode;

	/**
	 * ������ע
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * ��������:
(1)1 Ϊ������
(2)2 Ϊ�ڼ���
	 */
	@ApiField("schedule_day")
	private String scheduleDay;

	/**
	 * ���ͽ���ʱ��ͨ����HH:MM��ʽ
	 */
	@ApiField("schedule_end")
	private String scheduleEnd;

	/**
	 * �����ٶ�  ��
101-���մ
102-�γ��
103-���մ�
	 */
	@ApiField("schedule_speed")
	private Long scheduleSpeed;

	/**
	 * ���Ϳ�ʼʱ��ͨ����HH:MM��ʽ
	 */
	@ApiField("schedule_start")
	private String scheduleStart;

	/**
	 * �����˵�ַ
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * ������������
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * �����˳���
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * �����˵�������
	 */
	@ApiField("sender_email")
	private String senderEmail;

	/**
	 * �������ƶ��绰
	 */
	@ApiField("sender_mobile")
	private String senderMobile;

	/**
	 * ����������
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * ��������ϵ�绰
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * ����������ʡ��
	 */
	@ApiField("sender_province")
	private String senderProvince;

	/**
	 * �������ʱ�
	 */
	@ApiField("sender_zip_code")
	private String senderZipCode;

	/**
	 * cod�����
	 */
	@ApiField("service_fee")
	private Long serviceFee;

	/**
	 * �������䷽ʽ��
MAIL-ƽ��
EXPRESS-���
EMS-EMS
OTHER-����
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * �ֿ����
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * ����������˾���룬STO,YTO,EMS��
	 */
	@ApiField("tms_tp_code")
	private String tmsTpCode;

	/**
	 * �����ܼ�
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * ����ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * ����NICK
	 */
	@ApiField("user_nick")
	private String userNick;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getCancelOrderStatus() {
		return this.cancelOrderStatus;
	}
	public void setCancelOrderStatus(Long cancelOrderStatus) {
		this.cancelOrderStatus = cancelOrderStatus;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public Date getExpectEndTime() {
		return this.expectEndTime;
	}
	public void setExpectEndTime(Date expectEndTime) {
		this.expectEndTime = expectEndTime;
	}

	public Date getExpectStartTime() {
		return this.expectStartTime;
	}
	public void setExpectStartTime(Date expectStartTime) {
		this.expectStartTime = expectStartTime;
	}

	public String getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(String invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public Long getItemKindsCount() {
		return this.itemKindsCount;
	}
	public void setItemKindsCount(Long itemKindsCount) {
		this.itemKindsCount = itemKindsCount;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getOrderFlag() {
		return this.orderFlag;
	}
	public void setOrderFlag(Long orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderSourceCode() {
		return this.orderSourceCode;
	}
	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusReason() {
		return this.orderStatusReason;
	}
	public void setOrderStatusReason(String orderStatusReason) {
		this.orderStatusReason = orderStatusReason;
	}

	public String getOrderSubType() {
		return this.orderSubType;
	}
	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPrevOrderCode() {
		return this.prevOrderCode;
	}
	public void setPrevOrderCode(String prevOrderCode) {
		this.prevOrderCode = prevOrderCode;
	}

	public Long getRealKindsCount() {
		return this.realKindsCount;
	}
	public void setRealKindsCount(Long realKindsCount) {
		this.realKindsCount = realKindsCount;
	}

	public Long getReceivableAmount() {
		return this.receivableAmount;
	}
	public void setReceivableAmount(Long receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverArea() {
		return this.receiverArea;
	}
	public void setReceiverArea(String receiverArea) {
		this.receiverArea = receiverArea;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverMail() {
		return this.receiverMail;
	}
	public void setReceiverMail(String receiverMail) {
		this.receiverMail = receiverMail;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverProvince() {
		return this.receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverWangwang() {
		return this.receiverWangwang;
	}
	public void setReceiverWangwang(String receiverWangwang) {
		this.receiverWangwang = receiverWangwang;
	}

	public String getReceiverZipCode() {
		return this.receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScheduleDay() {
		return this.scheduleDay;
	}
	public void setScheduleDay(String scheduleDay) {
		this.scheduleDay = scheduleDay;
	}

	public String getScheduleEnd() {
		return this.scheduleEnd;
	}
	public void setScheduleEnd(String scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}

	public Long getScheduleSpeed() {
		return this.scheduleSpeed;
	}
	public void setScheduleSpeed(Long scheduleSpeed) {
		this.scheduleSpeed = scheduleSpeed;
	}

	public String getScheduleStart() {
		return this.scheduleStart;
	}
	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderArea() {
		return this.senderArea;
	}
	public void setSenderArea(String senderArea) {
		this.senderArea = senderArea;
	}

	public String getSenderCity() {
		return this.senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderEmail() {
		return this.senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSenderMobile() {
		return this.senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderProvince() {
		return this.senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}

	public String getSenderZipCode() {
		return this.senderZipCode;
	}
	public void setSenderZipCode(String senderZipCode) {
		this.senderZipCode = senderZipCode;
	}

	public Long getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getTmsTpCode() {
		return this.tmsTpCode;
	}
	public void setTmsTpCode(String tmsTpCode) {
		this.tmsTpCode = tmsTpCode;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
