package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ��Ա��Ϣ����
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:27.0
 */
public class CrmMember extends TaobaoObject {

	private static final long serialVersionUID = 1493337445821955647L;

	/**
	 * ƽ���͵���.
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * ���һ�ν��׵Ķ�����
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * ����ǳ�
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * ����
	 */
	@ApiField("city")
	private String city;

	/**
	 * ���׹رյĽ��
	 */
	@ApiField("close_trade_amount")
	private String closeTradeAmount;

	/**
	 * ���׹رյĵı���
	 */
	@ApiField("close_trade_count")
	private Long closeTradeCount;

	/**
	 * ��Ա�ȼ���1����ͨ��Ա��2���߼���Ա��3��vip��Ա��4������vip
	 */
	@ApiField("grade")
	private Long grade;

	/**
	 * ��Աӵ�е����з���
	 */
	@ApiField("group_ids")
	private String groupIds;

	/**
	 * ���׹رյı�������
	 */
	@ApiField("item_close_count")
	private Long itemCloseCount;

	/**
	 * ����ı�������
	 */
	@ApiField("item_num")
	private Long itemNum;

	/**
	 * �����ʱ��
	 */
	@ApiField("last_trade_time")
	private Date lastTradeTime;

	/**
	 * ����=1,���=2,�ӱ�ʡ=3,ɽ��ʡ=4,���ɹ�������=5,����ʡ=6,����ʡ=7,������ʡ=8,�Ϻ�=9,����ʡ=10,�㽭ʡ=11,����ʡ=12,����ʡ=13,����ʡ=14,ɽ��ʡ=15,����ʡ=16,����ʡ=17,����ʡ=18, �㶫ʡ=19,����׳��������=20,����ʡ=21,����=22,�Ĵ�ʡ=23,����ʡ=24,����ʡ=25,����������26,����ʡ=27,����ʡ=28,�ຣʡ=29,���Ļ���������=30,�½�ά���������=31,̨��ʡ=32,����ر�������=33,�����ر�������=34,����=35
	 */
	@ApiField("province")
	private Long province;

	/**
	 * ��ϵ��Դ��1���׳ɹ���2δ�ɽ�
	 */
	@ApiField("relation_source")
	private Long relationSource;

	/**
	 * ��ʾ��Ա��״̬��normal������delete�����ɾ����blacklist������
	 */
	@ApiField("status")
	private String status;

	/**
	 * ���׳ɹ��Ľ��
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * ���׳ɹ�����
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public String getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

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

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
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

	public Long getItemCloseCount() {
		return this.itemCloseCount;
	}
	public void setItemCloseCount(Long itemCloseCount) {
		this.itemCloseCount = itemCloseCount;
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

	public Long getProvince() {
		return this.province;
	}
	public void setProvince(Long province) {
		this.province = province;
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
