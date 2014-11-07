package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ���׶�����������Ϣ����
 *
 * @author auto create
 * @since 1.0, 2011-03-21 19:30:23.0
 */
public class TradeAmount extends TaobaoObject {

	private static final long serialVersionUID = 4744149288764231799L;

	/**
	 * ֧�������׺ţ��磺2009112081173831
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * ��һ����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("buyer_cod_fee")
	private String buyerCodFee;

	/**
	 * ��һ�û���,����Ļ��֡���ʽ:100;��λ:��
	 */
	@ApiField("buyer_obtain_point_fee")
	private Long buyerObtainPointFee;

	/**
	 * �����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("cod_fee")
	private String codFee;

	/**
	 * ����Ӷ�𡣾�ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("commission_fee")
	private String commissionFee;

	/**
	 * ���״���ʱ��
	 */
	@ApiField("created")
	private Date created;

	/**
	 * ���׳ɹ�ʱ��(���½���״̬Ϊ�ɹ���ͬʱ����)/ȷ���ջ�ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ��ݴ��տ��ȷ��2λС��;��λ:Ԫ����:212.07����ʾ:212Ԫ7��
	 */
	@ApiField("express_agency_fee")
	private String expressAgencyFee;

	/**
	 * �Ӷ����������������б�
	 */
	@ApiListField("order_amounts")
	@ApiField("order_amount")
	private List<OrderAmount> orderAmounts;

	/**
	 * ����ʱ�䡣��ʽ:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ������ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֣����㹫ʽ���£�
���������ֻ��һ���Ӷ��� payment = �Ӷ�����ʵ����� + ������������(����ǻ��������) - ��������ϵͳ���Żݣ�����������ж���Ӷ��� payment = ���Ӷ�����ʵ�����֮�� + ������������(����ǻ��������) + �ʷ� - ��������ϵͳ���Ż�
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7�֡�Ŀǰֻ�ṩ���ʽ��׵��ʷѣ��ݲ��ṩ���Ӷ������ʷ�
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * �����׶�����ϵͳ���Ż�����
	 */
	@ApiListField("promotion_details")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	/**
	 * ���һ����������ѡ���ȷ��2λС��;��λ:Ԫ����:12.07����ʾ:12Ԫ7��
	 */
	@ApiField("seller_cod_fee")
	private String sellerCodFee;

	/**
	 * �������������
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * ����������Ʒ�����Ӷ�������Ʒprice * num�ĺͣ��������κ��Ż���Ϣ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}
	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public Long getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}
	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public List<OrderAmount> getOrderAmounts() {
		return this.orderAmounts;
	}
	public void setOrderAmounts(List<OrderAmount> orderAmounts) {
		this.orderAmounts = orderAmounts;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}
	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
