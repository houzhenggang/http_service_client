package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��ʾ��Ա��ϵ�Ļ�����Ϣ�ֶΣ����ڻ�Ա�б�Ļ�����ѯ
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:06.0
 */
public class BasicMember extends TaobaoObject {

	private static final long serialVersionUID = 6748496227378125119L;

	/**
	 * ���һ�ν��׵Ķ�����
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * ��Ա�ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ���׹رս��
	 */
	@ApiField("close_trade_amount")
	private String closeTradeAmount;

	/**
	 * ���׹رյı���
	 */
	@ApiField("close_trade_count")
	private Long closeTradeCount;

	/**
	 * ��Ա�ȼ���1����ͨ�ͻ���2���߼���Ա��3���߼���Ա�� 4������vip
	 */
	@ApiField("grade")
	private Long grade;

	/**
	 * �����id�����ַ���
	 */
	@ApiField("group_ids")
	private String groupIds;

	/**
	 * ����ı�������
	 */
	@ApiField("item_num")
	private Long itemNum;

	/**
	 * ����׵�����
	 */
	@ApiField("last_trade_time")
	private Date lastTradeTime;

	/**
	 * ��ϵ��Դ��1���׳ɹ���2δ����
	 */
	@ApiField("relation_source")
	private Long relationSource;

	/**
	 * ��ʾ��Ա��״̬��normal������delete�����ɾ����blacklist������
	 */
	@ApiField("status")
	private String status;

	/**
	 * ���׵Ľ��
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * ���׳ɹ��Ĵ���
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getCloseTradeAmount() {
		return this.closeTradeAmount;
	}
	public void setCloseTradeAmount(String closeTradeAmount) {
		this.closeTradeAmount = closeTradeAmount;
	}

	public Long getCloseTradeCount() {
		return this.closeTradeCount;
	}
	public void setCloseTradeCount(Long closeTradeCount) {
		this.closeTradeCount = closeTradeCount;
	}

	public Long getGrade() {
		return this.grade;
	}
	public void setGrade(Long grade) {
		this.grade = grade;
	}

	public String getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}

	public Long getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public Date getLastTradeTime() {
		return this.lastTradeTime;
	}
	public void setLastTradeTime(Date lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

	public Long getRelationSource() {
		return this.relationSource;
	}
	public void setRelationSource(Long relationSource) {
		this.relationSource = relationSource;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Long getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}

}
