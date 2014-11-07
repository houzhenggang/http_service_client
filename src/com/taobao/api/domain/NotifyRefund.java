package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˿�֪ͨ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-04-22 13:34:04.0
 */
public class NotifyRefund extends TaobaoObject {

	private static final long serialVersionUID = 1154851458512151472L;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ��Ʒ�޸�ʱ�䣨��ʽ��yyyy-MM-dd HH:mm:ss��
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * �Ӷ����˿�ױ��
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * �˿���
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * �˿���
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * �˿��������Ӧ���˿�������Ϣ״̬ 
��ѡֵ�� 
RefundSuccess���˿�ɹ��� 
RefundClosed���˿�رգ� 
RefundCreated���˿���� 
RefundSellerAgreeAgreement������ͬ���˿�Э�飩 
RefundSellerRefuseAgreement�����Ҿܾ��˿�Э�飩 
RefundBuyerModifyAgreement������޸��˿�Э�飩 
RefundBuyerReturnGoods������˻������ң� 
RefundCreateMessage���������ԣ� 
RefundBlockMessage���������ԣ� 
RefundTimeoutRemind���˿ʱ���ѣ�
	 */
	@ApiField("status")
	private String status;

	/**
	 * �������˿�ױ��
	 */
	@ApiField("tid")
	private Long tid;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}
