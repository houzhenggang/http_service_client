package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsTradeAccountreportGetResponse;

/**
 * TOP API: taobao.topats.trade.accountreport.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class TopatsTradeAccountreportGetRequest implements TaobaoRequest<TopatsTradeAccountreportGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �������ڲ�ѯ����ʱ�䡣��ѯ����ʱ�������ڲ�ѯ��ʼʱ�䣬����ʱ���Ȳ��ܳ���3���¡�
	 */
	private Date endCreated;

	/** 
	* ������Ϣ�������ֶΣ��������TradeAccountDetail�ṹ��˵��
	 */
	private String fields;

	/** 
	* �������ڿ�ʼʱ�䣬ʱ��������2010-06-10 00:00:00
	 */
	private Date startCreated;

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public Date getStartCreated() {
		return this.startCreated;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.topats.trade.accountreport.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("start_created", this.startCreated);
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

	public Class<TopatsTradeAccountreportGetResponse> getResponseClass() {
		return TopatsTradeAccountreportGetResponse.class;
	}
}
