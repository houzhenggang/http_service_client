package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemGetResponse;

/**
 * TOP API: taobao.item.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class ItemGetRequest implements TaobaoRequest<ItemGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ҫ���ص���Ʒ�����ֶΡ���ѡֵ��Item��Ʒ�ṹ���������ֶξ��ɷ��أ�����ֶ��á�,���ָ�������뷵�������Ӷ������ֶ�Ϊitem_img��������뷵���Ӷ���������ֶΣ����ֶ�Ϊitem_img.url�����������ֶΣ�second_kill���Ƿ���ɱ��Ʒ����auto_fill��������Ʒ���ͣ�,props_name����Ʒ�������ƣ�
	 */
	private String fields;

	/** 
	* ��Ʒ����ID
	 */
	private Long numIid;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iid", this.numIid);
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

	public Class<ItemGetResponse> getResponseClass() {
		return ItemGetResponse.class;
	}
}
