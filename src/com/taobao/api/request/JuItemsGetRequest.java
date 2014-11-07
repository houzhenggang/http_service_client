package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuItemsGetResponse;

/**
 * TOP API: taobao.ju.items.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class JuItemsGetRequest implements TaobaoRequest<JuItemsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ������Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��ItemData��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ���","�ָ������fieldsΪ�գ����߲����ò�������Ĭ�ϻ�����е��ֶ�
	 */
	private String fields;

	/** 
	* ��ƷID�б�id�б���6��Ҳֻ����ǰ6������Ʒ
	 */
	private String ids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getIds() {
		return this.ids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("ids", this.ids);
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

	public Class<JuItemsGetResponse> getResponseClass() {
		return JuItemsGetResponse.class;
	}
}
