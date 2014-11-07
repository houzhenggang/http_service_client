package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkusGetResponse;

/**
 * TOP API: taobao.item.skus.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ItemSkusGetRequest implements TaobaoRequest<ItemSkusGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �践�ص��ֶ��б���ѡֵ��Sku�ṹ���е������ֶΣ��ֶ�֮���á�,���ָ���
	 */
	private String fields;

	/** 
	* sku������Ʒ����id����ѡ��num_iid�������ܳ���40��
	 */
	private String numIids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public String getNumIids() {
		return this.numIids;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.skus.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iids", this.numIids);
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

	public Class<ItemSkusGetResponse> getResponseClass() {
		return ItemSkusGetResponse.class;
	}
}
