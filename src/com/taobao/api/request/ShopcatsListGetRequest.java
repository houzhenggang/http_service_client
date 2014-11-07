package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShopcatsListGetResponse;

/**
 * TOP API: taobao.shopcats.list.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class ShopcatsListGetRequest implements TaobaoRequest<ShopcatsListGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ���ص��ֶ��б���ShopCat��Ĭ�Ϸ��أ�cid,parent_cid,name,is_parent
	 */
	private String fields;

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
		return "taobao.shopcats.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<ShopcatsListGetResponse> getResponseClass() {
		return ShopcatsListGetResponse.class;
	}
}
