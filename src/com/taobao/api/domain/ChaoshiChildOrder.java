package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �̳��Ӷ�����Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-01 10:40:20.0
 */
public class ChaoshiChildOrder extends TaobaoObject {

	private static final long serialVersionUID = 4451393285173267682L;

	/**
	 * �����޸ļ۸�ʱ�Ե���Ʒ�ļ۸����
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * ����itemId
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * ��������
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * ��������
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * �������
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * ��������
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * �Ӷ������͵Ļ�����
	 */
	@ApiField("buyer_obtain_point")
	private Long buyerObtainPoint;

	/**
	 * ����Ʒ��ϵͳ�ۿۣ������ۿ�ȯ
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * ���׽���ʱ��
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * ҵ��ʧ��ԭ��
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * ����޸�ʱ��
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * �����������Ķ����š�
����µ�ʱֻ��һ���Ӷ�������ô������Idֵ���Ӷ���Idֵ��ͬ
	 */
	@ApiField("parent_order_id")
	private Long parentOrderId;

	/**
	 * ������ʡ����ص����ֱ�ʾǧ��֮�����緵��20����ʾ���������0.2%
	 */
	@ApiField("point_rate")
	private Long pointRate;

	/**
	 * �˿���
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * SKU��Ϣ����
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getAuctionId() {
		return this.auctionId;
	}
	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionPrice() {
		return this.auctionPrice;
	}
	public void setAuctionPrice(String auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public String getAuctionTitle() {
		return this.auctionTitle;
	}
	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Long getBuyerObtainPoint() {
		return this.buyerObtainPoint;
	}
	public void setBuyerObtainPoint(Long buyerObtainPoint) {
		this.buyerObtainPoint = buyerObtainPoint;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Long getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getPointRate() {
		return this.pointRate;
	}
	public void setPointRate(Long pointRate) {
		this.pointRate = pointRate;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

}
