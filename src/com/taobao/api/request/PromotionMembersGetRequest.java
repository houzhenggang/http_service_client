package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMembersGetResponse;

/**
 * TOP API: taobao.promotion.members.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class PromotionMembersGetRequest implements TaobaoRequest<PromotionMembersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ա�ǳ�
	 */
	private String buyerNick;

	/** 
	* Ҫ��ѯ�ڼ�ҳ
	 */
	private Long currentPage;

	/** 
	* ��һ�Ա���� general����ͨ��Ա senior ���߼���Ա vip��VIP��Ա king������VIP
	 */
	private String grade;

	/** 
	* ����׶�÷ֱ�ʾ
	 */
	private Long maxTradeAmoun;

	/** 
	* �������
	 */
	private Long maxTradeCount;

	/** 
	* ��С���׶�÷ֱ�ʾ
	 */
	private Long minTradeAmount;

	/** 
	* ��С������
	 */
	private Long minTradeCount;

	/** 
	* ÿҳ����
	 */
	private Long pageSize;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}

	public void setMaxTradeAmoun(Long maxTradeAmoun) {
		this.maxTradeAmoun = maxTradeAmoun;
	}
	public Long getMaxTradeAmoun() {
		return this.maxTradeAmoun;
	}

	public void setMaxTradeCount(Long maxTradeCount) {
		this.maxTradeCount = maxTradeCount;
	}
	public Long getMaxTradeCount() {
		return this.maxTradeCount;
	}

	public void setMinTradeAmount(Long minTradeAmount) {
		this.minTradeAmount = minTradeAmount;
	}
	public Long getMinTradeAmount() {
		return this.minTradeAmount;
	}

	public void setMinTradeCount(Long minTradeCount) {
		this.minTradeCount = minTradeCount;
	}
	public Long getMinTradeCount() {
		return this.minTradeCount;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.members.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("grade", this.grade);
		txtParams.put("max_trade_amoun", this.maxTradeAmoun);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_trade_amount", this.minTradeAmount);
		txtParams.put("min_trade_count", this.minTradeCount);
		txtParams.put("page_size", this.pageSize);
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

	public Class<PromotionMembersGetResponse> getResponseClass() {
		return PromotionMembersGetResponse.class;
	}
}
