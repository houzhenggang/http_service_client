package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmRuleAddResponse;

/**
 * TOP API: taobao.crm.rule.add request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:02.0
 */
public class CrmRuleAddRequest implements TaobaoRequest<CrmRuleAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ա�ȼ�����ѡֵΪ��1,2,3,4
	 */
	private Long grade;

	/** 
	* ����Ӧ�÷��鼯�ϣ�����������������÷��鲻�ܹҵ��ù�����
	 */
	private String groupIds;

	/** 
	* ���ƽ���͵��ۣ���λΪԪ
	 */
	private String maxAvgPrice;

	/** 
	* ����׹ر���
	 */
	private Long maxCloseTradeNum;

	/** 
	* ��󱦱�����
	 */
	private Long maxItemNum;

	/** 
	* ��ٽ���ʱ��
	 */
	private Date maxLastTradeTime;

	/** 
	* ����׽���λΪԪ
	 */
	private String maxTradeAmount;

	/** 
	* �������
	 */
	private Long maxTradeCount;

	/** 
	* ��Сƽ���͵��ۣ���λԪ
	 */
	private String minAvgPrice;

	/** 
	* ���ٽ��׹ر���
	 */
	private Long minCloseTradeNum;

	/** 
	* ���ٱ�������
	 */
	private Long minItemNum;

	/** 
	* ���罻������
	 */
	private Date minLastTradeTime;

	/** 
	* ��С���׽��,��λԪ��
	 */
	private String minTradeAmount;

	/** 
	* ��С���״���
	 */
	private Long minTradeCount;

	/** 
	* ����=1,���=2,�ӱ�ʡ=3,ɽ��ʡ=4,���ɹ�������=5,����ʡ=6,����ʡ=7,������ʡ=8,�Ϻ�=9,����ʡ=10,�㽭ʡ=11,����ʡ=12,����ʡ=13,����ʡ=14,ɽ��ʡ=15,����ʡ=16,����ʡ=17,����ʡ=18, �㶫ʡ=19,����׳��������=20,����ʡ=21,����=22,�Ĵ�ʡ=23,����ʡ=24,����ʡ=25,����������26,����ʡ=27,����ʡ=28,�ຣʡ=29,���Ļ���������=30,�½�ά���������=31,̨��ʡ=32,����ر�������=33,�����ر�������=34,����=35
	 */
	private Long province;

	/** 
	* �ͻ���ϵ��Դ,��ѡֵΪ:1,2
	 */
	private Long relationSource;

	/** 
	* ��������
	 */
	private String ruleName;

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}
	public String getGroupIds() {
		return this.groupIds;
	}

	public void setMaxAvgPrice(String maxAvgPrice) {
		this.maxAvgPrice = maxAvgPrice;
	}
	public String getMaxAvgPrice() {
		return this.maxAvgPrice;
	}

	public void setMaxCloseTradeNum(Long maxCloseTradeNum) {
		this.maxCloseTradeNum = maxCloseTradeNum;
	}
	public Long getMaxCloseTradeNum() {
		return this.maxCloseTradeNum;
	}

	public void setMaxItemNum(Long maxItemNum) {
		this.maxItemNum = maxItemNum;
	}
	public Long getMaxItemNum() {
		return this.maxItemNum;
	}

	public void setMaxLastTradeTime(Date maxLastTradeTime) {
		this.maxLastTradeTime = maxLastTradeTime;
	}
	public Date getMaxLastTradeTime() {
		return this.maxLastTradeTime;
	}

	public void setMaxTradeAmount(String maxTradeAmount) {
		this.maxTradeAmount = maxTradeAmount;
	}
	public String getMaxTradeAmount() {
		return this.maxTradeAmount;
	}

	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}
	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}

	public void setMinAvgPrice(String minAvgPrice) {
		this.minAvgPrice = minAvgPrice;
	}
	public String getMinAvgPrice() {
		return this.minAvgPrice;
	}

	public void setMinCloseTradeNum(Long minCloseTradeNum) {
		this.minCloseTradeNum = minCloseTradeNum;
	}
	public Long getMinCloseTradeNum() {
		return this.minCloseTradeNum;
	}

	public void setMinItemNum(Long minItemNum) {
		this.minItemNum = minItemNum;
	}
	public Long getMinItemNum() {
		return this.minItemNum;
	}

	public void setMinLastTradeTime(Date minLastTradeTime) {
		this.minLastTradeTime = minLastTradeTime;
	}
	public Date getMinLastTradeTime() {
		return this.minLastTradeTime;
	}

	public void setMinTradeAmount(String minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}
	public String getMinTradeAmount() {
		return this.minTradeAmount;
	}

	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}
	public Long getMinTradeCount() {
		return this.minTradeCount;
	}

	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getProvince() {
		return this.province;
	}

	public void setRelationSource(Long relationSource) {
		this.relationSource = relationSource;
	}
	public Long getRelationSource() {
		return this.relationSource;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRuleName() {
		return this.ruleName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.rule.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("grade", this.grade);
		txtParams.put("group_ids", this.groupIds);
		txtParams.put("max_avg_price", this.maxAvgPrice);
		txtParams.put("max_close_trade_num", this.maxCloseTradeNum);
		txtParams.put("max_item_num", this.maxItemNum);
		txtParams.put("max_last_trade_time", this.maxLastTradeTime);
		txtParams.put("max_trade_amount", this.maxTradeAmount);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_avg_price", this.minAvgPrice);
		txtParams.put("min_close_trade_num", this.minCloseTradeNum);
		txtParams.put("min_item_num", this.minItemNum);
		txtParams.put("min_last_trade_time", this.minLastTradeTime);
		txtParams.put("min_trade_amount", this.minTradeAmount);
		txtParams.put("min_trade_count", this.minTradeCount);
		txtParams.put("province", this.province);
		txtParams.put("relation_source", this.relationSource);
		txtParams.put("rule_name", this.ruleName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<CrmRuleAddResponse> getResponseClass() {
		return CrmRuleAddResponse.class;
	}
}
