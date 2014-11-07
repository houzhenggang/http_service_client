package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationDeleteResponse;

/**
 * TOP API: taobao.wlb.item.authorization.delete request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemAuthorizationDeleteRequest implements TaobaoRequest<WlbItemAuthorizationDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ��Ȩ��ϵID
	 */
	private Long authorizeId;

	public void setAuthorizeId(Long authorizeId) {
		this.authorizeId = authorizeId;
	}
	public Long getAuthorizeId() {
		return this.authorizeId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.authorization.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("authorize_id", this.authorizeId);
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

	public Class<WlbItemAuthorizationDeleteResponse> getResponseClass() {
		return WlbItemAuthorizationDeleteResponse.class;
	}
}
