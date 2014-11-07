package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsListGetResponse;

/**
 * TOP API: taobao.items.list.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class ItemsListGetRequest implements TaobaoRequest<ItemsListGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��Item��Ʒ�ṹ���������ֶξ��ɷ���(ע��Ŀǰ���ܷ���props_name)������ֶ��á�,���ָ�������뷵�������Ӷ������ֶ�Ϊitemimg��������뷵���Ӷ���������ֶΣ����ֶ�Ϊitemimg.url��
	 */
	private String fields;

	/** 
	* ��Ʒ����id�б����num_iid�ö��Ÿ�����һ�β�����20����
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
		return "taobao.items.list.get";
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

	public Class<ItemsListGetResponse> getResponseClass() {
		return ItemsListGetResponse.class;
	}
}
