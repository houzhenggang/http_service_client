package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemMapGetByExtentityResponse;

/**
 * TOP API: taobao.wlb.item.map.get.by.extentity request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemMapGetByExtentityRequest implements TaobaoRequest<WlbItemMapGetByExtentityResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �ⲿʵ�����Ͷ�Ӧ����Ʒid
	 */
	private Long extEntityId;

	/** 
	* �ⲿʵ�����ͣ� IC_ITEM--ic��Ʒ IC_SKU--ic���۵�Ԫ
	 */
	private String extEntityType;

	public void setExtEntityId(Long extEntityId) {
		this.extEntityId = extEntityId;
	}
	public Long getExtEntityId() {
		return this.extEntityId;
	}

	public void setExtEntityType(String extEntityType) {
		this.extEntityType = extEntityType;
	}
	public String getExtEntityType() {
		return this.extEntityType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.map.get.by.extentity";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ext_entity_id", this.extEntityId);
		txtParams.put("ext_entity_type", this.extEntityType);
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

	public Class<WlbItemMapGetByExtentityResponse> getResponseClass() {
		return WlbItemMapGetByExtentityResponse.class;
	}
}
