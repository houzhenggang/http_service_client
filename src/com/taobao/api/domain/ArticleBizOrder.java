package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Ӧ�ö�����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-04-15 11:45:06.0
 */
public class ArticleBizOrder extends TaobaoObject {

	private static final long serialVersionUID = 5291875596695313117L;

	/**
	 * Ӧ���շѴ��룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ���ø�Ӧ�õ��շѴ���
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * Ӧ������
	 */
	@ApiField("article_name")
	private String articleName;

	/**
	 * ������
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * �������ͣ�1=�¶� 2=���� 3=���� 4=��̨���� 5=��̨�Զ����� 6=������˺����ɶ�����ϵ����ʱ�ò�����
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * ��������ʱ�䣨����ʱ�䣩
	 */
	@ApiField("create")
	private Date create;

	/**
	 * ԭ��
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * �շ���Ŀ���룬�Ӻ�������̨��my.open.taobao.com��-�շѹ���-�շ���Ŀ�б� �ܹ�����շ���Ŀ����
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * �շ���Ŀ����
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * �Ա���Ա��
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * ��������
	 */
	@ApiField("order_cycle")
	private String orderCycle;

	/**
	 * �������ڽ���ʱ��
	 */
	@ApiField("order_cycle_end")
	private Date orderCycleEnd;

	/**
	 * �������ڿ�ʼʱ��
	 */
	@ApiField("order_cycle_start")
	private Date orderCycleStart;

	/**
	 * �Ӷ�����
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * �Ż�
	 */
	@ApiField("prom_fee")
	private String promFee;

	/**
	 * �˿����ʱ��ϵͳ�Ὣ����ǰ�ϰ汾����ʣ�ඩ�������˻�ʣ���
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * ʵ��
	 */
	@ApiField("total_pay_fee")
	private String totalPayFee;

	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleName() {
		return this.articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Date getCreate() {
		return this.create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOrderCycle() {
		return this.orderCycle;
	}
	public void setOrderCycle(String orderCycle) {
		this.orderCycle = orderCycle;
	}

	public Date getOrderCycleEnd() {
		return this.orderCycleEnd;
	}
	public void setOrderCycleEnd(Date orderCycleEnd) {
		this.orderCycleEnd = orderCycleEnd;
	}

	public Date getOrderCycleStart() {
		return this.orderCycleStart;
	}
	public void setOrderCycleStart(Date orderCycleStart) {
		this.orderCycleStart = orderCycleStart;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPromFee() {
		return this.promFee;
	}
	public void setPromFee(String promFee) {
		this.promFee = promFee;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getTotalPayFee() {
		return this.totalPayFee;
	}
	public void setTotalPayFee(String totalPayFee) {
		this.totalPayFee = totalPayFee;
	}

}
