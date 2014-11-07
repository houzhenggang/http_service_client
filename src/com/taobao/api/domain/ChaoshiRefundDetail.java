package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �̳����˿
 *
 * @author auto create
 * @since 1.0, 2011-07-26 14:54:50.0
 */
public class ChaoshiRefundDetail extends TaobaoObject {

	private static final long serialVersionUID = 2792371914984448767L;

	/**
	 * ��˽����0δ��� 1����ͬ���˻� 2���Ҿܾ��˻���
	 */
	@ApiField("audit_result")
	private Long auditResult;

	/**
	 * ��������
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * �Ƿ���Ҫ����ȡ����1 ��Ҫ��0 ����Ҫ��
	 */
	@ApiField("delivery_required")
	private Long deliveryRequired;

	/**
	 * ���ͨ��ʱ��
	 */
	@ApiField("gmt_approved")
	private Date gmtApproved;

	/**
	 * ����ʱ��
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * �޸�ʱ��
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * �˿��Ӧ���Ӷ������
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * ���۳��ⵥ��
	 */
	@ApiField("out_logistics_id")
	private String outLogisticsId;

	/**
	 * �������˻�����
	 */
	@ApiField("out_refund_logistics_id")
	private String outRefundLogisticsId;

	/**
	 * �˿��Ӧ�����������
	 */
	@ApiField("parent_order_id")
	private Long parentOrderId;

	/**
	 * ���˿���
	 */
	@ApiField("parent_refund_id")
	private Long parentRefundId;

	/**
	 * �˻�ԭ��1���˻���� 2δ��ʱ�յ��� 3���װ�� 4�յ��Ļ�Ʒ���� 5��Ʒ�������� 6�ۿۡ���Ʒ����Ʊ���� 7������
	 */
	@ApiField("reason")
	private Long reason;

	/**
	 * �˻�����
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * �˿���
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * �˿���
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * �˿�״̬��0δ�˿1�˿�ɹ���2�˿�ʧ�ܣ�
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	/**
	 * �˿�ʱ��
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * �˻�˵��
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * Э��״̬
1. �˿�Э��ȴ�����ȷ��
2. �˿�Э���Ѿ���ɣ��ȴ�����˻���
3.������˻����ȴ�����ȷ���ջ�
4. �˿�ر�
	 */
	@ApiField("status")
	private Long status;

	/**
	 * �������
	 */
	@ApiField("subtotal")
	private String subtotal;

	public Long getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(Long auditResult) {
		this.auditResult = auditResult;
	}

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Long getDeliveryRequired() {
		return this.deliveryRequired;
	}
	public void setDeliveryRequired(Long deliveryRequired) {
		this.deliveryRequired = deliveryRequired;
	}

	public Date getGmtApproved() {
		return this.gmtApproved;
	}
	public void setGmtApproved(Date gmtApproved) {
		this.gmtApproved = gmtApproved;
	}

	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOutLogisticsId() {
		return this.outLogisticsId;
	}
	public void setOutLogisticsId(String outLogisticsId) {
		this.outLogisticsId = outLogisticsId;
	}

	public String getOutRefundLogisticsId() {
		return this.outRefundLogisticsId;
	}
	public void setOutRefundLogisticsId(String outRefundLogisticsId) {
		this.outRefundLogisticsId = outRefundLogisticsId;
	}

	public Long getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getParentRefundId() {
		return this.parentRefundId;
	}
	public void setParentRefundId(Long parentRefundId) {
		this.parentRefundId = parentRefundId;
	}

	public Long getReason() {
		return this.reason;
	}
	public void setReason(Long reason) {
		this.reason = reason;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSubtotal() {
		return this.subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

}
