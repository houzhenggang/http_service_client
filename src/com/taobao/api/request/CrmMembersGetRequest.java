package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGetResponse;

/**
 * TOP API: taobao.crm.members.get request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:46.0
 */
public class CrmMembersGetRequest implements TaobaoRequest<CrmMembersGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��ҵ��ǳ�
	 */
	private String buyerNick;

	/** 
	* ��ʾ�ڼ�ҳ�Ļ�Ա����������ҳ������ܹ���ҳ�����������ܹ�10ҳ������current_page��ֵΪ11���򷵻ؿհ�ҳ����Сҳ��Ϊ1
	 */
	private Long currentPage;

	/** 
	* ��Ա�ȼ���1����ͨ�ͻ���2���߼���Ա��3���߼���Ա�� 4������vip
	 */
	private Long grade;

	/** 
	* ����ϴν���ʱ��
	 */
	private Date maxLastTradeTime;

	/** 
	* ����׶��λΪԪ
	 */
	private String maxTradeAmount;

	/** 
	* �������
	 */
	private Long maxTradeCount;

	/** 
	* �����ϴν���ʱ��
	 */
	private Date minLastTradeTime;

	/** 
	* ��С���׶�,��λΪԪ
	 */
	private String minTradeAmount;

	/** 
	* ��С������
	 */
	private Long minTradeCount;

	/** 
	* ��ʾÿҳ��ʾ�Ļ�Ա����,page_size�����ֵ���ܳ���100��,��Сֵ���ܵ���1��
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

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
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
		return "taobao.crm.members.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("grade", this.grade);
		txtParams.put("max_last_trade_time", this.maxLastTradeTime);
		txtParams.put("max_trade_amount", this.maxTradeAmount);
		txtParams.put("max_trade_count", this.maxTradeCount);
		txtParams.put("min_last_trade_time", this.minLastTradeTime);
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

	public Class<CrmMembersGetResponse> getResponseClass() {
		return CrmMembersGetResponse.class;
	}
}
