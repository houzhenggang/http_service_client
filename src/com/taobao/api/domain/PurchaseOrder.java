package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * �ɹ������Ӳɹ�����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-03 16:09:09.0
 */
public class PurchaseOrder extends TaobaoObject {

	private static final long serialVersionUID = 2154297995792154482L;

	/**
	 * ֧�������׺š�
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * ���nick����Ӧ�̲�ѯ���᷵������ǳƣ������̲�ѯ�Ż᷵�ء�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ��������ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * �ɹ�������ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ��������Դ��վ��taobao����
	 */
	@ApiField("distributor_from")
	private String distributorFrom;

	/**
	 * ������ʵ����(��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�� )
	 */
	@ApiField("distributor_payment")
	private String distributorPayment;

	/**
	 * ����������Դ��վ���ʺ�����
	 */
	@ApiField("distributor_username")
	private String distributorUsername;

	/**
	 * ������ˮ�ţ�����ƽ̨����������
	 */
	@ApiField("fenxiao_id")
	private Long fenxiaoId;

	/**
	 * �ɹ�����š�(�Ա����ױ��)
	 */
	@ApiField("id")
	private Long id;

	/**
	 * �ɹ������ԡ�
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * �����޸�ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ֧����ʽ��ALIPAY_SURETY��֧�����������ף���TRANSFER��ת�˻���PREPAY����ҵԤ����SETTLEMENT�����ڽ��㣩
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * �ɹ����ʷѡ�(��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�� )
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * �����ϸ����Ϣ��
	 */
	@ApiField("receiver")
	private Receiver receiver;

	/**
	 * ��������URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * �ɹ�������״̬����ѡֵ��<br>
WAIT_BUYER_PAY(�ȴ�����)<br>
WAIT_CONFIRM(������Ϣ��ȷ��)<br>
WAIT_CONFIRM_WAIT_SEND_GOODS(������Ϣ��ȷ�ϣ�������)<br>
WAIT_CONFIRM_SEND_GOODS(������Ϣ��ȷ�ϣ��ѷ���)<br>
WAIT_CONFIRM_GOODS_CONFIRM(������Ϣ��ȷ�ϣ����ջ�)<br>
WAIT_SELLER_SEND_GOODS(�Ѹ��������<br>
WAIT_BUYER_CONFIRM_GOODS(�Ѹ���ѷ���)<br>
CONFIRM_WAIT_SEND_GOODS(������Ϣ��ȷ�ϣ�������)<br>
CONFIRM_SEND_GOODS(������Ϣ��ȷ�ϣ��ѷ���)<br>
TRADE_FINISHED(���׳ɹ�)<br>
TRADE_CLOSED(���׹ر�)
	 */
	@ApiField("status")
	private String status;

	/**
	 * �Ӷ�������ϸ��Ϣ�б�
	 */
	@ApiListField("sub_purchase_orders")
	@ApiField("sub_purchase_order")
	private List<SubPurchaseOrder> subPurchaseOrders;

	/**
	 * ��Ӧ����Դ��վ, values: taobao, alibaba
	 */
	@ApiField("supplier_from")
	private String supplierFrom;

	/**
	 * ��Ӧ�̱�ע
	 */
	@ApiField("supplier_memo")
	private String supplierMemo;

	/**
	 * ��Ӧ������Դ��վ���ʺ�����
	 */
	@ApiField("supplier_username")
	private String supplierUsername;

	/**
	 * ������ID ����������ʾ��
	 */
	@ApiField("tc_order_id")
	private Long tcOrderId;

	/**
	 * �ɹ����ܶ�����ʷ�,��ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�� )
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * ������ʽ��AGENT����������DEALER��������
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDistributorFrom() {
		return this.distributorFrom;
	}
	public void setDistributorFrom(String distributorFrom) {
		this.distributorFrom = distributorFrom;
	}

	public String getDistributorPayment() {
		return this.distributorPayment;
	}
	public void setDistributorPayment(String distributorPayment) {
		this.distributorPayment = distributorPayment;
	}

	public String getDistributorUsername() {
		return this.distributorUsername;
	}
	public void setDistributorUsername(String distributorUsername) {
		this.distributorUsername = distributorUsername;
	}

	public Long getFenxiaoId() {
		return this.fenxiaoId;
	}
	public void setFenxiaoId(Long fenxiaoId) {
		this.fenxiaoId = fenxiaoId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Receiver getReceiver() {
		return this.receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SubPurchaseOrder> getSubPurchaseOrders() {
		return this.subPurchaseOrders;
	}
	public void setSubPurchaseOrders(List<SubPurchaseOrder> subPurchaseOrders) {
		this.subPurchaseOrders = subPurchaseOrders;
	}

	public String getSupplierFrom() {
		return this.supplierFrom;
	}
	public void setSupplierFrom(String supplierFrom) {
		this.supplierFrom = supplierFrom;
	}

	public String getSupplierMemo() {
		return this.supplierMemo;
	}
	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}

	public String getSupplierUsername() {
		return this.supplierUsername;
	}
	public void setSupplierUsername(String supplierUsername) {
		this.supplierUsername = supplierUsername;
	}

	public Long getTcOrderId() {
		return this.tcOrderId;
	}
	public void setTcOrderId(Long tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
