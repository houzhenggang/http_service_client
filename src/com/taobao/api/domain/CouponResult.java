package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���ųɹ����Ż�ȯ����Ϣ������couponNumber��buyerNick
 *
 * @author auto create
 * @since 1.0, 2011-07-08 10:19:31.0
 */
public class CouponResult extends TaobaoObject {

	private static final long serialVersionUID = 1495211926152213782L;

	/**
	 * ����
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * �Ѿ������Ż�ȯ�ı��
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

}
