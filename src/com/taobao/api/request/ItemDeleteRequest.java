package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemDeleteResponse;

/**
 * TOP API: taobao.item.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class ItemDeleteRequest implements TaobaoRequest<ItemDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ʒ����ID���ò�������
	 */
	private Long numIid;

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
		return "taobao.item.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<ItemDeleteResponse> getResponseClass() {
		return ItemDeleteResponse.class;
	}
}
