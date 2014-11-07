package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuCityitemsGetResponse;

/**
 * TOP API: taobao.ju.cityitems.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class JuCityitemsGetRequest implements TaobaoRequest<JuCityitemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ��ȡ���������Ʒ�ĳ������ƣ����ģ�
	 */
	private String city;

	/** 
	* ������Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��ItemData��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ���","�ָ������fieldsΪ�գ����߲����ò�������Ĭ�ϻ�����е��ֶ�
	 */
	private String fields;

	/** 
	* ��ҳ��ȡ��Ʒ��Ϣҳ��ţ�����ڼ�ҳ
	 */
	private Long pageNo;

	/** 
	* ÿ�λ�ȡ��Ʒ�б������
	 */
	private Long pageSize;

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

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.cityitems.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("city", this.city);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
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

	public Class<JuCityitemsGetResponse> getResponseClass() {
		return JuCityitemsGetResponse.class;
	}
}
