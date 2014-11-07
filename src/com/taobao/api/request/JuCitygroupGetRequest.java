package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuCitygroupGetResponse;

/**
 * TOP API: taobao.ju.citygroup.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuCitygroupGetRequest implements TaobaoRequest<JuCitygroupGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ��ȡ���������Ʒ�ĳ������ƣ����ģ�
	 */
	private String city;

	/** 
	* ������Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��ItemData��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ��á�,���ָ������fieldsΪ�գ����߲����ò�������Ĭ�ϻ�����е��ֶ�
	 */
	private String fields;

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.citygroup.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("city", this.city);
		txtParams.put("fields", this.fields);
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

	public Class<JuCitygroupGetResponse> getResponseClass() {
		return JuCitygroupGetResponse.class;
	}
}
