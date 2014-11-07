package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationGetResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class FenxiaoCooperationGetRequest implements TaobaoRequest<FenxiaoCooperationGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��������ʱ��yyyy-MM-dd
	 */
	private Date endDate;

	/** 
	* ҳ�루����0��������Ĭ��1��
	 */
	private Long pageNo;

	/** 
	* ÿҳ��¼����Ĭ��20�����50��
	 */
	private Long pageSize;

	/** 
	* ������ʼʱ��yyyy-MM-dd
	 */
	private Date startDate;

	/** 
	* ����״̬�� NORMAL(������)�� ENDING(��ֹ��) ��END (��ֹ)
	 */
	private String status;

	/** 
	* ������ʽ��AGENT(����) ��DEALER��������
	 */
	private String tradeType;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType() {
		return this.tradeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.cooperation.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		txtParams.put("status", this.status);
		txtParams.put("trade_type", this.tradeType);
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

	public Class<FenxiaoCooperationGetResponse> getResponseClass() {
		return FenxiaoCooperationGetResponse.class;
	}
}
