package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsCompaniesGetResponse;

/**
 * TOP API: taobao.logistics.companies.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:30.0
 */
public class LogisticsCompaniesGetRequest implements TaobaoRequest<LogisticsCompaniesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ:LogisticCompany �ṹ�е������ֶ�;����ֶμ���","���Ÿ���.
��:id,code,name,reg_mail_no
<br><font color='red'>˵����</font>
<br>id��������˾ID
<br>code��������˾code
<br>name��������˾����
<br>reg_mail_no��������˾��Ӧ���˵�����
	 */
	private String fields;

	/** 
	* �Ƿ��ѯ�Ƽ�������˾.��ѡֵ:true,false.������ṩ�˲���,���᷵������֧�ֵ绰��ϵ��������˾.
	 */
	private Boolean isRecommended;

	/** 
	* �Ƽ�������˾���µ���ʽ.��ѡֵ:offline(�绰��ϵ/�Լ���ϵ),online(�����µ�),all(���绰��ϵ�������µ�). �˲�����������is_recommended Ϊtureʱ������˵�����Ƽ�������˾�ſ���.�����ѡ��˲������᷵���Ƽ�������֧�ֵ绰��ϵ��������˾.
	 */
	private String orderMode;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
	}
	public Boolean getIsRecommended() {
		return this.isRecommended;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderMode() {
		return this.orderMode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.companies.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("is_recommended", this.isRecommended);
		txtParams.put("order_mode", this.orderMode);
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

	public Class<LogisticsCompaniesGetResponse> getResponseClass() {
		return LogisticsCompaniesGetResponse.class;
	}
}
