package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ż�ȯ��ϸ��Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-07-08 10:20:30.0
 */
public class CouponDetail extends TaobaoObject {

	private static final long serialVersionUID = 3338713141544564843L;

	/**
	 * ��ҵ��ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * �Ż�ȯ�ķ���������������rewardforgifts�������ͣ�marketingMessage��Ӫ����Ϣ��activityofget�����ȡ��createActivity���������ISV
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * Ŀǰ�Ż�ȯ���
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	/**
	 * �Ż�ȯʹ�����Unused��δʹ��using��ʹ����used����ʹ��
	 */
	@ApiField("state")
	private String state;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
