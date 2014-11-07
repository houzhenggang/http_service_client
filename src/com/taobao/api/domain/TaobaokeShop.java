package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ա��͵���
 *
 * @author auto create
 * @since 1.0, 2010-11-24 15:47:27.0
 */
public class TaobaokeShop extends TaobaoObject {

	private static final long serialVersionUID = 4567574159252229661L;

	/**
	 * ��������Ʒ����
	 */
	@ApiField("auction_count")
	private Long auctionCount;

	/**
	 * �����ƹ�URL
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * �Ա��͵���Ӷ�����
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * �����ƹ����õȼ�
	 */
	@ApiField("seller_credit")
	private String sellerCredit;

	/**
	 * ��������
	 */
	@ApiField("shop_title")
	private String shopTitle;

	/**
	 * �������� B=�̳����� C=��ͨ����
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * �ۼ��ƹ���
	 */
	@ApiField("total_auction")
	private String totalAuction;

	/**
	 * �����û�id
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getAuctionCount() {
		return this.auctionCount;
	}
	public void setAuctionCount(Long auctionCount) {
		this.auctionCount = auctionCount;
	}

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getSellerCredit() {
		return this.sellerCredit;
	}
	public void setSellerCredit(String sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getTotalAuction() {
		return this.totalAuction;
	}
	public void setTotalAuction(String totalAuction) {
		this.totalAuction = totalAuction;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
