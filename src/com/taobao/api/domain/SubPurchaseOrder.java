package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ӳɹ�����ϸ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-03 16:09:09.0
 */
public class SubPurchaseOrder extends TaobaoObject {

	private static final long serialVersionUID = 7787738377991376914L;

	/**
	 * ���ʵ��������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֣�
	 */
	@ApiField("buyer_payment")
	private String buyerPayment;

	/**
	 * ����ʱ�䡣��ʽ yyyy-MM-dd HH:mm:ss ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ������ʵ��������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֣�
	 */
	@ApiField("distributor_payment")
	private String distributorPayment;

	/**
	 * ����ƽ̨���Ӳɹ�������
	 */
	@ApiField("fenxiao_id")
	private Long fenxiaoId;

	/**
	 * �Ӳɹ���id���Ա������������ɹ���δ����ʱΪ0.
	 */
	@ApiField("id")
	private Long id;

	/**
	 * ����ƽ̨����Ʒid
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * ����ƽ̨����Ʒ�̼ұ��롣
	 */
	@ApiField("item_outer_id")
	private String itemOuterId;

	/**
	 * ��Ʒ����������ȡֵ��Χ:�����������
	 */
	@ApiField("num")
	private Long num;

	/**
	 * �ϵ�SKU����ֵ����: ��ɫ:��ɫ:����;����:L:����
	 */
	@ApiField("old_sku_properties")
	private String oldSkuProperties;

	/**
	 * ������Ʒ�۸񡣣���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֣�
	 */
	@ApiField("price")
	private String price;

	/**
	 * �˿���
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * ��Ʒ��SKU id��
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * SKU�̼ұ��롣
	 */
	@ApiField("sku_outer_id")
	private String skuOuterId;

	/**
	 * SKU����ֵ����: ��ɫ:��ɫ:����;����:L:����
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	/**
	 * ���յ�ַ��
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * ����״̬����ѡֵ��<br>
WAIT_BUYER_PAY(�ȴ�����)<br>
WAIT_CONFIRM(������Ϣ��ȷ��)<br>
WAIT_CONFIRM_WAIT_SEND_GOODS(������Ϣ��ȷ�ϣ�������)<br>
WAIT_CONFIRM_SEND_GOODS(������Ϣ��ȷ�ϣ��ѷ���)<br>
WAIT_CONFIRM_GOODS_CONFIRM(������Ϣ��ȷ�ϣ����ջ�)<br>
WAIT_SELLER_SEND_GOODS(�Ѹ��������)<br>
WAIT_BUYER_CONFIRM_GOODS(�Ѹ���ѷ���)<br>
CONFIRM_WAIT_SEND_GOODS(������Ϣ��ȷ�ϣ�������)<br>
CONFIRM_SEND_GOODS(������Ϣ��ȷ�ϣ��ѷ���)<br>
TRADE_REFUNDED(���˿�)<br>
TRADE_REFUNDING(�˿���)<br>
TRADE_FINISHED(���׳ɹ�)<br>
TRADE_CLOSED(���׹ر�)
	 */
	@ApiField("status")
	private String status;

	/**
	 * �Ӷ���ID(��������ʾ)
	 */
	@ApiField("sub_tc_order_id")
	private Long subTcOrderId;

	/**
	 * TC����ID
	 */
	@ApiField("tc_order_id")
	private Long tcOrderId;

	/**
	 * ��Ʒ���⡣
	 */
	@ApiField("title")
	private String title;

	/**
	 * ������Ӧ��������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֣�
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getBuyerPayment() {
		return this.buyerPayment;
	}
	public void setBuyerPayment(String buyerPayment) {
		this.buyerPayment = buyerPayment;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDistributorPayment() {
		return this.distributorPayment;
	}
	public void setDistributorPayment(String distributorPayment) {
		this.distributorPayment = distributorPayment;
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

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemOuterId() {
		return this.itemOuterId;
	}
	public void setItemOuterId(String itemOuterId) {
		this.itemOuterId = itemOuterId;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getOldSkuProperties() {
		return this.oldSkuProperties;
	}
	public void setOldSkuProperties(String oldSkuProperties) {
		this.oldSkuProperties = oldSkuProperties;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuOuterId() {
		return this.skuOuterId;
	}
	public void setSkuOuterId(String skuOuterId) {
		this.skuOuterId = skuOuterId;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
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

	public Long getSubTcOrderId() {
		return this.subTcOrderId;
	}
	public void setSubTcOrderId(Long subTcOrderId) {
		this.subTcOrderId = subTcOrderId;
	}

	public Long getTcOrderId() {
		return this.tcOrderId;
	}
	public void setTcOrderId(Long tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
