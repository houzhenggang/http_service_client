package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �Ż�ȯ���ݽṹ
 *
 * @author auto create
 * @since 1.0, 2011-03-28 11:58:44.0
 */
public class Coupon extends TaobaoObject {

	private static final long serialVersionUID = 4255899113384672571L;

	/**
	 * ���������ٷֲ���������Ż�ȯ��501������501����ʹ�á�ע�⣺���ص��ǡ��֡������ǡ�Ԫ��
	 */
	@ApiField("condition")
	private Long condition;

	/**
	 * �Ż�ȯID
	 */
	@ApiField("coupon_id")
	private Long couponId;

	/**
	 * �Ż�ȯ����ʱ��
	 */
	@ApiField("creat_time")
	private Date creatTime;

	/**
	 * �Ż�ȯ�Ĵ����������Լ�����/���˴���
	 */
	@ApiField("create_channel")
	private String createChannel;

	/**
	 * �Ż�ȯ����ֵ�����ص��ǡ��֡������ǡ�Ԫ����500����500���൱��5Ԫ
	 */
	@ApiField("denominations")
	private Long denominations;

	/**
	 * �Ż�ȯ�Ľ�ֹ����
	 */
	@ApiField("end_time")
	private Date endTime;

	public Long getCondition() {
		return this.condition;
	}
	public void setCondition(Long condition) {
		this.condition = condition;
	}

	public Long getCouponId() {
		return this.couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getCreateChannel() {
		return this.createChannel;
	}
	public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}

	public Long getDenominations() {
		return this.denominations;
	}
	public void setDenominations(Long denominations) {
		this.denominations = denominations;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
