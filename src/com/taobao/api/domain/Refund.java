package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˿�ṹ
 *
 * @author auto create
 * @since 1.0, 2010-07-14 14:28:03.0
 */
public class Refund extends TaobaoObject {

	private static final long serialVersionUID = 4853374361136332569L;

	/**
	 * �����ջ���ַ
	 */
	@ApiField("address")
	private String address;

	/**
	 * ֧�������׺�
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ������˾����
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * �˿�����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * �˿�˵��
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * �˻�ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("good_return_time")
	private Date goodReturnTime;

	/**
	 * ����״̬����ѡֵ
BUYER_NOT_RECEIVED (���δ�յ���) 
BUYER_RECEIVED (������յ���) 
BUYER_RETURNED_GOODS (������˻�)
	 */
	@ApiField("good_status")
	private String goodStatus;

	/**
	 * ����Ƿ���Ҫ�˻�����ѡֵ:true(��),false(��)
	 */
	@ApiField("has_good_return")
	private Boolean hasGoodReturn;

	/**
	 * �����˿����Ʒ�ַ������(ע�⣺iid���ڼ�������������num_iid����)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ��Ʒ��������
	 */
	@ApiField("num")
	private Long num;

	/**
	 * �����˿����Ʒ���ֱ��
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * �Ӷ����š�����ǵ��ʽ���oid�����tid
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * �˿��Ӧ�Ķ�������״̬��
��ѡֵ
TRADE_NO_CREATE_PAY(û�д���֧��������) 
WAIT_BUYER_PAY(�ȴ���Ҹ���) 
WAIT_SELLER_SEND_GOODS(�ȴ����ҷ���,��:����Ѹ���) 
WAIT_BUYER_CONFIRM_GOODS(�ȴ����ȷ���ջ�,��:�����ѷ���) 
TRADE_BUYER_SIGNED(�����ǩ��,��������ר��) 
TRADE_FINISHED(���׳ɹ�) 
TRADE_CLOSED(���׹ر�) 
TRADE_CLOSED_BY_TAOBAO(���ױ��Ա��ر�) 
ALL_WAIT_PAY(������WAIT_BUYER_PAY��TRADE_NO_CREATE_PAY) 
ALL_CLOSED(������TRADE_CLOSED��TRADE_CLOSED_BY_TAOBAO) 
ȡ��"http://open.taobao.com/dev/index.php/%E4%BA%A4%E6%98%93%E7%8A%B6%E6%80%81"
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * ֧�������ҵĽ��(�����ܽ��-�˻�����ҵĽ��)����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * ��Ʒ�۸񡣾�ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("price")
	private String price;

	/**
	 * �˿�ԭ��
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * �˻����(�˻�����ҵĽ��)����ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * �˿��
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * �˿ʱ�ṹRefundRemindTimeout
	 */
	@ApiField("refund_remind_timeout")
	private RefundRemindTimeout refundRemindTimeout;

	/**
	 * �����ǳ�
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * ������ʽ.��ѡֵ:free(���Ұ���),post(ƽ��),express(���),ems(EMS).
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * �˻��˵���
	 */
	@ApiField("sid")
	private String sid;

	/**
	 * �˿�״̬��
��ѡֵ
WAIT_SELLER_AGREE(����Ѿ������˿�ȴ�����ͬ��) 
WAIT_BUYER_RETURN_GOODS(�����Ѿ�ͬ���˿�ȴ�����˻�) 
WAIT_SELLER_CONFIRM_GOODS(����Ѿ��˻����ȴ�����ȷ���ջ�) 
SELLER_REFUSE_BUYER(���Ҿܾ��˿�) 
CLOSED(�˿�ر�) 
SUCCESS(�˿�ɹ�)
	 */
	@ApiField("status")
	private String status;

	/**
	 * �Ա����׵���
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ��Ʒ����
	 */
	@ApiField("title")
	private String title;

	/**
	 * �����ܽ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

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

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getGoodReturnTime() {
		return this.goodReturnTime;
	}
	public void setGoodReturnTime(Date goodReturnTime) {
		this.goodReturnTime = goodReturnTime;
	}

	public String getGoodStatus() {
		return this.goodStatus;
	}
	public void setGoodStatus(String goodStatus) {
		this.goodStatus = goodStatus;
	}

	public Boolean getHasGoodReturn() {
		return this.hasGoodReturn;
	}
	public void setHasGoodReturn(Boolean hasGoodReturn) {
		this.hasGoodReturn = hasGoodReturn;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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

	public RefundRemindTimeout getRefundRemindTimeout() {
		return this.refundRemindTimeout;
	}
	public void setRefundRemindTimeout(RefundRemindTimeout refundRemindTimeout) {
		this.refundRemindTimeout = refundRemindTimeout;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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
