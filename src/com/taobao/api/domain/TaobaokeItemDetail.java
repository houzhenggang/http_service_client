package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ա�����Ʒ����
 *
 * @author auto create
 * @since 1.0, 2010-05-31 11:22:34.0
 */
public class TaobaokeItemDetail extends TaobaoObject {

	private static final long serialVersionUID = 6326746363768469227L;

	/**
	 * ��Ʒ�ƹ�URL
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * ��Ʒ��ϸ��Ϣ. fields����Ҫ����Item�µ��ֶ�,������:iid,detail_url��; ֻ����item_detail,�򲻷��ص�Item�µ�������Ϣ.
	 */
	@ApiField("item")
	private Item item;

	/**
	 * ��Ʒ�������ҵ����õȼ�
	 */
	@ApiField("seller_credit_score")
	private Long sellerCreditScore;

	/**
	 * ��Ʒ���ڵĵ��̵��ƹ�URL
	 */
	@ApiField("shop_click_url")
	private String shopClickUrl;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public Item getItem() {
		return this.item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	public Long getSellerCreditScore() {
		return this.sellerCreditScore;
	}
	public void setSellerCreditScore(Long sellerCreditScore) {
		this.sellerCreditScore = sellerCreditScore;
	}

	public String getShopClickUrl() {
		return this.shopClickUrl;
	}
	public void setShopClickUrl(String shopClickUrl) {
		this.shopClickUrl = shopClickUrl;
	}

}
