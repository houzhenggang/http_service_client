package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �˻���ˮ�б�
 *
 * @author auto create
 * @since 1.0, 2010-11-26 16:33:04.0
 */
public class AccountAppJournal extends TaobaoObject {

	private static final long serialVersionUID = 2182177886823766186L;

	/**
	 * �ʲ�����
	 */
	@ApiField("balance_type")
	private Long balanceType;

	/**
	 * �������
	 */
	@ApiField("deal_amount")
	private Long dealAmount;

	/**
	 * ����ʱ��
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * ��ˮ����
	 */
	@ApiField("journal_type")
	private Long journalType;

	/**
	 * ����ʱ��
	 */
	@ApiField("response_time")
	private Date responseTime;

	/**
	 * ���׺�
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * �û�id
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getBalanceType() {
		return this.balanceType;
	}
	public void setBalanceType(Long balanceType) {
		this.balanceType = balanceType;
	}

	public Long getDealAmount() {
		return this.dealAmount;
	}
	public void setDealAmount(Long dealAmount) {
		this.dealAmount = dealAmount;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getJournalType() {
		return this.journalType;
	}
	public void setJournalType(Long journalType) {
		this.journalType = journalType;
	}

	public Date getResponseTime() {
		return this.responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
