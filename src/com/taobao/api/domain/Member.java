package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ���һ�Ա��Ϣ
 *
 * @author auto create
 * @since 1.0, 2010-11-19 09:24:03.0
 */
public class Member extends TaobaoObject {

	private static final long serialVersionUID = 5854328126352967539L;

	/**
	 * �������ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * �ϴν���ʱ�䣺��Ա�ڸ����ҵ������Ľ���ʱ��
	 */
	@ApiField("laste_time")
	private Date lasteTime;

	/**
	 * ��һ�Ա���� general����ͨ��Ա senior ���߼���Ա vip��VIP��Ա king������VIP
	 */
	@ApiField("member_grade")
	private String memberGrade;

	/**
	 * ״̬��
normal������
deleted��ɾ��
blacklist ��������
	 */
	@ApiField("status")
	private String status;

	/**
	 * �ܽ��׶��÷ֱ�ʾ
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	/**
	 * �ܽ���������Ա�ڸ����ҵĽ��ױ���
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getLasteTime() {
		return this.lasteTime;
	}
	public void setLasteTime(Date lasteTime) {
		this.lasteTime = lasteTime;
	}

	public String getMemberGrade() {
		return this.memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

}
