package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderCancelResponse;

/**
 * TOP API: taobao.wlb.order.cancel request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbOrderCancelRequest implements TaobaoRequest<WlbOrderCancelResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* �������������
	 */
	private String wlbOrderCode;

	public void setWlbOrderCode(String wlbOrderCode) {
		this.wlbOrderCode = wlbOrderCode;
	}
	public String getWlbOrderCode() {
		return this.wlbOrderCode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("wlb_order_code", this.wlbOrderCode);
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

	public Class<WlbOrderCancelResponse> getResponseClass() {
		return WlbOrderCancelResponse.class;
	}
}
