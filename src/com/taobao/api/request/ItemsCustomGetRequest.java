package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsCustomGetResponse;

/**
 * TOP API: taobao.items.custom.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class ItemsCustomGetRequest implements TaobaoRequest<ItemsCustomGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ��Item��Ʒ�ṹ���е������ֶΣ�����ֶ�֮���á�,���ָ�������뷵�������Ӷ������ֶ�Ϊitem_img��������뷵���Ӷ���������ֶΣ����ֶ�Ϊitem_img.url�����������ֶΣ�one_station�����Ʒ�Ƿ���1վ��Ʒ
	 */
	private String fields;

	/** 
	* ��Ʒ���ⲿ��ƷID
	 */
	private String outerId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId() {
		return this.outerId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.items.custom.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("outer_id", this.outerId);
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

	public Class<ItemsCustomGetResponse> getResponseClass() {
		return ItemsCustomGetResponse.class;
	}
}
