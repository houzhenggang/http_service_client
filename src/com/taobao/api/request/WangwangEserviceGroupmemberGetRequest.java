package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceGroupmemberGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.groupmember.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceGroupmemberGetRequest implements TaobaoRequest<WangwangEserviceGroupmemberGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ����ѯ�û������ԱID��cntaobao+�Ա�nick������cntaobaotest
	 */
	private String managerId;

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerId() {
		return this.managerId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.groupmember.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("manager_id", this.managerId);
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

	public Class<WangwangEserviceGroupmemberGetResponse> getResponseClass() {
		return WangwangEserviceGroupmemberGetResponse.class;
	}
}
