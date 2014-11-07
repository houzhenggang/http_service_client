package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �̳����������е��Ӷ�����Ϣ�б�
ÿ���Ӷ�����Ϣ�������������ơ�SKU��Ϣ��״̬�����ۡ������������Ӷ����š�����ID��
 *
 * @author auto create
 * @since 1.0, 2011-08-01 10:41:30.0
 */
public class ChaoshiOrderItemDetail extends TaobaoObject {

	private static final long serialVersionUID = 1786911229633929186L;

	/**
	 * ÿ��������ItemId
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * ��������
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * ��Ʒ����
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * ÿ���Ӷ���Id��
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * ÿ�������Ĺ�������
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * �Ӷ����˻���������������
	 */
	@ApiField("refund_logistics_id")
	private String refundLogisticsId;

	/**
	 * ÿ���Ӷ����ı���SKU
	 */
	@ApiField("sku_string")
	private String skuString;

	/**
	 * ÿ���Ӷ����ĵ�ǰ״̬
	 */
	@ApiField("status")
	private String status;

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

	public String getRefundLogisticsId() {
		return this.refundLogisticsId;
	}
	public void setRefundLogisticsId(String refundLogisticsId) {
		this.refundLogisticsId = refundLogisticsId;
	}

	public String getSkuString() {
		return this.skuString;
	}
	public void setSkuString(String skuString) {
		this.skuString = skuString;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
