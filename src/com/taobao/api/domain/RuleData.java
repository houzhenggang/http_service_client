package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ���������Ϣ
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:54.0
 */
public class RuleData extends TaobaoObject {

	private static final long serialVersionUID = 4233699127586295569L;

	/**
	 * ���׽���ʱ��
	 */
	@ApiField("end_trade_time")
	private Date endTradeTime;

	/**
	 * ��Ա�ȼ�
	 */
	@ApiField("grade")
	private Long grade;

	/**
	 * ������Ϣ����������id���������
	 */
	@ApiListField("grouplist")
	@ApiField("group_domain")
	private List<GroupDomain> grouplist;

	/**
	 * ���ƽ���͵���
	 */
	@ApiField("max_avg_price")
	private String maxAvgPrice;

	/**
	 * ����׹رմ���
	 */
	@ApiField("max_close_trade_count")
	private Long maxCloseTradeCount;

	/**
	 * ��󱦱�����
	 */
	@ApiField("max_item_count")
	private Long maxItemCount;

	/**
	 * ����׶�
	 */
	@ApiField("max_trade_amount")
	private String maxTradeAmount;

	/**
	 * ����ױ���
	 */
	@ApiField("max_trade_count")
	private Long maxTradeCount;

	/**
	 * ��Сƽ���͵���
	 */
	@ApiField("min_avg_price")
	private String minAvgPrice;

	/**
	 * ��С���׹رմ���
	 */
	@ApiField("min_close_trade_count")
	private Long minCloseTradeCount;

	/**
	 * ���ٱ�������
	 */
	@ApiField("min_item_count")
	private Long minItemCount;

	/**
	 * ��С���׶�
	 */
	@ApiField("min_trade_amount")
	private String minTradeAmount;

	/**
	 * ��С���ױ���
	 */
	@ApiField("min_trade_count")
	private Long minTradeCount;

	/**
	 * ʡ�ݵĴ��룬����=1,���=2,�ӱ�ʡ=3,ɽ��ʡ=4,���ɹ�������=5,����ʡ=6,����ʡ=7,������ʡ=8,�Ϻ�=9,����ʡ=10,�㽭ʡ=11,����ʡ=12,����ʡ=13,����ʡ=14,ɽ��ʡ=15,����ʡ=16,����ʡ=17,����ʡ=18, �㶫ʡ=19,����׳��������=20,����ʡ=21,����=22,�Ĵ�ʡ=23,����ʡ=24,����ʡ=25,����������26,����ʡ=27,����ʡ=28,�ຣʡ=29,���Ļ���������=30,�½�ά���������=31,̨��ʡ=32,����ر�������=33,�����ر�������=34,����=35
	 */
	@ApiField("province")
	private Long province;

	/**
	 * �ͻ���ϵ��Դ
	 */
	@ApiField("relation_source")
	private Long relationSource;

	/**
	 * ����ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	/**
	 * ��������
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * ����ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * ���׵Ŀ�ʼʱ��
	 */
	@ApiField("start_trade_time")
	private Date startTradeTime;

	public Date getEndTradeTime() {
		return this.endTradeTime;
	}
	public void setEndTradeTime(Date endTradeTime) {
		this.endTradeTime = endTradeTime;
	}

	public Long getGrade() {
		return this.grade;
	}
	public void setGrade(Long grade) {
		this.grade = grade;
	}

	public List<GroupDomain> getGrouplist() {
		return this.grouplist;
	}
	public void setGrouplist(List<GroupDomain> grouplist) {
		this.grouplist = grouplist;
	}

	public String getMaxAvgPrice() {
		return this.maxAvgPrice;
	}
	public void setMaxAvgPrice(String maxAvgPrice) {
		this.maxAvgPrice = maxAvgPrice;
	}

	public Long getMaxCloseTradeCount() {
		return this.maxCloseTradeCount;
	}
	public void setMaxCloseTradeCount(Long maxCloseTradeCount) {
		this.maxCloseTradeCount = maxCloseTradeCount;
	}

	public Long getMaxItemCount() {
		return this.maxItemCount;
	}
	public void setMaxItemCount(Long maxItemCount) {
		this.maxItemCount = maxItemCount;
	}

	public String getMaxTradeAmount() {
		return this.maxTradeAmount;
	}
	public void setMaxTradeAmount(String maxTradeAmount) {
		this.maxTradeAmount = maxTradeAmount;
	}

	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}
	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}

	public String getMinAvgPrice() {
		return this.minAvgPrice;
	}
	public void setMinAvgPrice(String minAvgPrice) {
		this.minAvgPrice = minAvgPrice;
	}

	public Long getMinCloseTradeCount() {
		return this.minCloseTradeCount;
	}
	public void setMinCloseTradeCount(Long minCloseTradeCount) {
		this.minCloseTradeCount = minCloseTradeCount;
	}

	public Long getMinItemCount() {
		return this.minItemCount;
	}
	public void setMinItemCount(Long minItemCount) {
		this.minItemCount = minItemCount;
	}

	public String getMinTradeAmount() {
		return this.minTradeAmount;
	}
	public void setMinTradeAmount(String minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}

	public Long getMinTradeCount() {
		return this.minTradeCount;
	}
	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
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

	public Long getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Date getStartTradeTime() {
		return this.startTradeTime;
	}
	public void setStartTradeTime(Date startTradeTime) {
		this.startTradeTime = startTradeTime;
	}

}
